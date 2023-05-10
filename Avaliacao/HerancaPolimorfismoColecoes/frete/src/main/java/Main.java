class Main {
    public static void main(String[] args) {
        CadastroFrete fretes = new CadastroFrete();
        Fretavel frete01 = new FretePadrao(80.0, 5.50);
        fretes.adicionarFrete(frete01);
        Fretavel frete02 = new FreteExpresso(100, 6.2, 6);
        fretes.adicionarFrete(frete02);
        Fretavel frete03 = new FreteSuperExpresso(300, 6.2, 10, 20);
        fretes.adicionarFrete(frete03);

        System.out.println(frete01);
        System.out.println(frete02);
        System.out.println(frete03);

        System.out.println("Valor total dos fretes: "+fretes.valorTotalFretes());

        System.out.println("O polimorfismo está acontecendo no método calcularFrete das classes concretas, porque cada classe tem sua forma de calcular frete.");

    }
}