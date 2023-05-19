public class Main {
    public static void main(String[] args) {
        CadastroDeContas contas = new CadastroDeContas();
        Conta contaAgua = new ContaDeAgua("João", 10, 20.2, 5.50);
        Conta contaEnergia = new ContaDeEnergia("Alysson", 10, 18, 8.9);
        Conta contaEnergia01 = new ContaDeEnergia("José", 10, 20, 8.9);
        contas.adicionarConta(contaAgua);
        contas.adicionarConta(contaEnergia);
        contas.adicionarConta(contaEnergia01);

        System.out.println("Pesquisando clinte por nome:");
        System.out.println(contas.buscarContaPorNome("Alysson"));

        System.out.println("Todas as contas cadastradas:");
        contas.ExibirContas();

        System.out.printf("Valor total de todas as contas: %.2f\n", contas.valorTotalContas());

        /*
        Questão 2) O polimorfismo se encontra quando calculamos o valor de cada conta no metodo "valorTotalContas()."

        Questão 3) Caso queira criar uma classe concreta IPTU, estendemos
        ela com a classe Conta, contendo os atributos de metroQuadrado,
        tarifaRegional, liquotaImovel. Fazer sobrescrita do método abstrato
        calcularValor() da superClasse Conta, com seguinte cálculo (metroQuadrado * arifaRegional) * liquotaImovel.
        */
    }
}
