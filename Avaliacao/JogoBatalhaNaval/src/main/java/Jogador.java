import java.util.Scanner;
public class Jogador {
    // Atributos
    private Scanner ent = new Scanner(System.in);
    private String nome;
    private String[][] meuTabuleiro;
    private String[][] tabuleiroOponente;

    // Construtor
    public Jogador(String nome) {
        this.nome = nome;
        meuTabuleiro = new String[8][8];
        tabuleiroOponente = new String[8][8];
    }

    // Métodos Espeiciais
    public void tabuleiro(String[][] tabuleiro) {
        System.out.println("    1   2   3   4   5   6   7   8");
        for (int i = 0; i < 8; i++) {
            //System.out.println("  ---------------------------------");
            System.out.print((i+1)+" |");
            for (int j = 0; j < 8; j++) {
                if(tabuleiro[i][j] != null) {
                    System.out.print(" "+tabuleiro[i][j] +" |");
                } else {
                    System.out.print("   |");
                }
            }
            System.out.println();
        }
        //System.out.println("  ---------------------------------");
    }

    // Tabuleiro Vazio
    public void tabuleiro() {
        System.out.println("    1   2   3   4   5   6   7   8");
        for (int i = 0; i < 8; i++) {
            //System.out.println("  ---------------------------------");
            System.out.print((i+1)+" |");
            for (int j = 0; j < 8; j++) {
                System.out.print("   |");
            }
            System.out.println();
        }
        //System.out.println("  ---------------------------------");
    }
    public void adicionarArmas() {
        int s = 3;
        int c = 2;
        int p = 1;
        System.out.printf("=-=-=-= Adicionando armas ao tabuleiro de %s. =-=-=-=\n",nome);
        System.out.println("Opções de armas:");
        System.out.println(s+" Submarinos = s");
        System.out.println(c+" Cruzadores = c");
        System.out.println(p+" Porta-aviões = p");

        System.out.println("TABULEIRO DA BATALHA NAVAL");
        tabuleiro();

        int[] posicoes = new int[2];
        String arma;
        int i = 0;
        while(i < 3) {
            System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
            System.out.print("Informe a arma: ");
            arma = ent.nextLine();

            System.out.print("Posição Ex 1:1: ");
            String[] pos = ent.nextLine().split(":");
            posicoes[0] = Integer.parseInt(pos[0]);
            posicoes[1] = Integer.parseInt(pos[1]);

            if(arma.equals("s") && s > 0) {
                meuTabuleiro[posicoes[0]-1][posicoes[1]-1] = arma;
                s--;
                i++;
            } else if(arma.equals("c") && c > 0) {
                meuTabuleiro[posicoes[0]-1][posicoes[1]-1] = arma;
                c--;
                i++;
            } else if (arma.equals("p") && p > 0) {
                meuTabuleiro[posicoes[0]-1][posicoes[1]-1] = arma;
                p--;
                i++;
            } else {
                System.out.println("Houve algum problema ao informar.");
            }
        }

        System.out.println("Armas adicionadas com sucesso!");
        System.out.println("Tabuleiro com armas adicionadas.");
        tabuleiro(this.meuTabuleiro);

    }
    public boolean atirar(Jogador oponente) {
        System.out.printf("%s: Informe a posição onde vai atirar: ",nome);
        String[] p = ent.nextLine().split(":");
        int[] posicoes = {Integer.parseInt(p[0])-1,Integer.parseInt(p[1])-1};

        boolean acertou = this.verificarSeAcertou(posicoes,oponente.getMeuTabuleiro());
        this.registrarTiro(posicoes, oponente.getMeuTabuleiro(), acertou);

        if (acertou) {
            System.out.println("Tiro bem sucedido!!");
            return true;
        } else {
            System.out.println("O acertou o mar");
            return false;
        }
    }

    public boolean verificarSeAcertou(int[] posicoes, String[][] tabuleiroOponente) {
        if(tabuleiroOponente[posicoes[0]][posicoes[1]] != null) {
            return true;
        } else {
            return false;
        }
    }

    public void registrarTiro(int[] posicoes, String[][] tabuleiroOponente, boolean acertou) {
        if(acertou) {
            this.tabuleiroOponente[posicoes[0]][posicoes[1]] = tabuleiroOponente[posicoes[0]][posicoes[1]];
        } else {
            this.tabuleiroOponente[posicoes[0]][posicoes[1]] = "X";
        }
    }

    // Métodos Get e Set
    public String getNome() {
        return nome;
    }
    public String[][] getMeuTabuleiro() {
        return meuTabuleiro;
    }

    public String[][] getTabuleiroOponente() {
        return tabuleiroOponente;
    }
}
