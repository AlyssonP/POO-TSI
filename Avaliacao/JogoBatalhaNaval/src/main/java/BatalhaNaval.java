public class BatalhaNaval {
    // Atributos
    private Jogador jogador01;
    private Jogador jogador02;
    private boolean isArmasAdicionada;

    // Construtor
    public BatalhaNaval(Jogador jogador01, Jogador jogador02) {
        this.jogador01 = jogador01;
        this.jogador02 = jogador02;
        isArmasAdicionada = false;
    }

    // Métodos Especiais
    public void adicionarArmas() {
        System.out.println("-------------------------------------");
        System.out.println("  Informando as posições das armas.");
        System.out.println("-------------------------------------");
        jogador01.adicionarArmas();
        jogador02.adicionarArmas();
        isArmasAdicionada = true;
        System.out.println("Armas adicionadas.");
    }

    public void jogo() {
        if (!isArmasAdicionada) {
            System.out.println("É preciso adicionar as armas para poder jogar.");
            jogador01.adicionarArmas();
            jogador02.adicionarArmas();
            System.out.println("Armas adicionadas.");
        }

        int rodada = 1;
        int acertosJogador01 = 0, acertosJogador02 = 0;
        System.out.println("Batalha Naval – Versão Light");
        System.out.println("Gooo!");
        while (true) {
            // Vez do Jogador 01
            System.out.printf("Rodada %d >> Vez do jogador %s\n",rodada,jogador01.getNome());
            System.out.println("***Tabuleiro do Oponente***");
            jogador01.tabuleiro(jogador01.getTabuleiroOponente());
            for(int i = 0; i < 2; i++) {
                boolean acerto = jogador01.atirar(jogador02);
                if (acerto) {
                    acertosJogador01++;
                }
            }
            if (acertosJogador01 >= 6) {
                System.out.printf("O jogador %s ganhou a batalha.\n",jogador01.getNome());
                System.out.println("Tabulheiro do oponente:");
                jogador01.tabuleiro(jogador01.getTabuleiroOponente());
                break;
            }

            // Vez do Jogador 02
            System.out.printf("Rodada %d >> Vez do jogador %s\n",rodada,jogador02.getNome());
            jogador02.tabuleiro(jogador02.getTabuleiroOponente());
            for(int i = 0; i < 2; i++) {
                boolean acerto = jogador02.atirar(jogador01);
                if (acerto) {
                    acertosJogador02++;
                }
            }
            if (acertosJogador02 >= 6) {
                System.out.printf("O jogador %s ganhou a batalha.\n", jogador02.getNome());
                System.out.println("Tabulheiro do oponente:");
                jogador02.tabuleiro(jogador02.getTabuleiroOponente());
                break;
            }
        }
    }

    // Métodos Especiais
    public Jogador getJogador01() {
        return jogador01;
    }

    public Jogador getJogador02() {
        return jogador02;
    }

    public boolean getIsArmasAdicionadas() {
        return isArmasAdicionada;
    }

    // ToString
    public String toString() {
        return String.format("Nome do Jogador 01: %S; Nome do Jogador 02: %S; As armas já estão adicionadas? %b;", jogador01.getNome(), jogador02.getNome(), isArmasAdicionada);
    }

}
