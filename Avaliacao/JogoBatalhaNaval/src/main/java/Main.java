public class Main {
    public static void main(String[] args) {
        Jogador jogador01 = new Jogador("José");
        Jogador jogador02 = new Jogador("João");

        BatalhaNaval bn = new BatalhaNaval(jogador01,jogador02);
        bn.adicionarArmas();
        bn.jogo();


    }
}
