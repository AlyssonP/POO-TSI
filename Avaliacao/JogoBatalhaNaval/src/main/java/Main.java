public class Main {
    public static void main(String[] args) {
        Jogador jogador01 = new Jogador("José");
        Jogador jogador02 = new Jogador("João");

        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
        System.out.println("     Batalha Naval vLight");
        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
        BatalhaNaval bn = new BatalhaNaval(jogador01,jogador02);
        System.out.printf("Jogadores: %s X %s\n",bn.getJogador01().getNome(), bn.getJogador02().getNome());
        bn.adicionarArmas();
        bn.jogo();

    }
}
