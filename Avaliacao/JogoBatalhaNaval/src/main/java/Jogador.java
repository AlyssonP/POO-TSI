import java.util.Scanner;
public class Jogador {
    // Atributos
    private Scanner ent = new Scanner(System.in);
    private String nome;
    private char[][] meuTabuleiro;
    private char[][] tabuleiroOponente;

    // Construtor
    public Jogador(String nome) {
        this.nome = nome;
        meuTabuleiro = new char[8][8];
        tabuleiroOponente = new char[8][8];
    }

    // Métodos Espeiciais
    public void tabuleiro(char[][] tabuleiro) {
        System.out.println("    1   2   3   4   5   6   7   8");
        for (int i = 0; i < 8; i++) {
            //System.out.println("  ---------------------------------");
            System.out.print((i+1)+" |");
            for (int j = 0; j < 8; j++) {
                if(tabuleiro[i][j] != 0) {
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
    public boolean podeRegistrarArma(char[][] tabuleiro, int qtdEspaco, int l , int c) {
        // Verificando se cabe no tabuleiro a partir da coluna informada.
        if(c+qtdEspaco-1 <= tabuleiro.length-1) {
            // Verificando se existe espaço de um quadrado na frente e atrás
            if(c != 0 && c != (tabuleiro.length-1-qtdEspaco)) {
                // Caso a arma ocupa mais de um espaço
                if( qtdEspaco != 1 && (tabuleiro[l][c-1] != 0 || tabuleiro[l][c+qtdEspaco-1] != 0)) {
                    return false;
                }
                // Caso ele apenas culpa um espaço
                else if(qtdEspaco == 1 && (tabuleiro[l][c-1] != 0 || tabuleiro[l][c+qtdEspaco] != 0)) {
                    return false;
                }
            }

            // Verificar se tem arma no espaço
            for(int i = 0; i < qtdEspaco; i++) {
                if(tabuleiro[l][c+i] != 0) {
                    return false;
                }
            }

            return true;
        }
        return false;
    }

    public boolean registrarArma(char arma, int qtdEspaco, int l , int c) {
        boolean isAutorizado = podeRegistrarArma(this.meuTabuleiro, qtdEspaco, l, c);
        if(isAutorizado) {
            for(int i = 0; i < qtdEspaco; i++) {
                this.meuTabuleiro[l][c++] = arma;
            }
            return true;
        } return false;
    }

//    public boolean registrarArma(int arma, int qtdEspaco, int l , int c) {
//
//    }
    public void adicionarArmas() {
        System.out.printf("=-=-=-= Adicionando armas ao tabuleiro de %s. =-=-=-=\n",nome);
        System.out.println("Opções de armas:");
        System.out.println("Submarinos -> s");
        System.out.println("Cruzadores -> c");
        System.out.println("Porta-aviões -> p");

        System.out.println("TABULEIRO DA BATALHA NAVAL");
        tabuleiro();

        int[] posicoes;
        boolean isRegistrados;

        // Vetores de Indetificações
        String[] nomesArmas = {"Submarino", "Cruzador", "Porta-avião"};
        int[] qtdEspaco = {3,2,1};
        char [] siglas = {'s', 'c', 'p'};

        for(int i = 0; i < 3; i++) {
            isRegistrados = false;
            while(!isRegistrados) {
                System.out.printf("Digite a posição do '%s': ",nomesArmas[i]);
                String[] pos = ent.nextLine().split(":");
                posicoes = new int[] {Integer.parseInt(pos[0])-1,Integer.parseInt(pos[1])-1};
                isRegistrados = registrarArma( siglas[i] ,qtdEspaco[i] ,posicoes[0],posicoes[1]);
                if(isRegistrados) {
                    System.out.println("Arma Registrada com sucesso!");
                } else { System.out.println("Houve algum conflito ao registrar a posição da arma.");}
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
        if(this.tabuleiroOponente[posicoes[0]][posicoes[1]] == 's' || this.tabuleiroOponente[posicoes[0]][posicoes[1]] == 'c' || this.tabuleiroOponente[posicoes[0]][posicoes[1]] == 'p') {
            System.out.println("Você já acertou esse tiro antes.");
            return false;
        }
        this.registrarTiro(posicoes, oponente.getMeuTabuleiro(), acertou);

        if(acertou) {
            System.out.println("Tiro bem sucedido!!");
        } else {
            System.out.println("O acertou o mar");
        }

        return acertou;
    }

    public boolean verificarSeAcertou(int[] posicoes, char[][] tabuleiroOponente) {
        if(tabuleiroOponente[posicoes[0]][posicoes[1]] != 0) {
            return true;
        } else {
            return false;
        }
    }

    public void registrarTiro(int[] posicoes, char[][] tabuleiroOponente, boolean acertou) {
        if(acertou) {
            this.tabuleiroOponente[posicoes[0]][posicoes[1]] = tabuleiroOponente[posicoes[0]][posicoes[1]];
        } else {
            this.tabuleiroOponente[posicoes[0]][posicoes[1]] = 'X';
        }
    }

    // Métodos Get e Set
    public String getNome() {
        return nome;
    }
    public char[][] getMeuTabuleiro() {
        return meuTabuleiro;
    }

    public char[][] getTabuleiroOponente() {
        return tabuleiroOponente;
    }
}
