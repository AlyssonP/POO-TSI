public class Main {
    public static void main(String[] args) {
        FolhaDePagamento folha = new FolhaDePagamento();

        // Instanciando empregados
        Empregado jose = new Assalariado("José","Antônio", "111.222.333-44", 2000);
        Empregado alysson = new Comissionado("Alysson", "Pereira", "444.333.222-11", 10, 223.40);
        Empregado maria = new Horista("Maria", "Souza", "123.456.789-10",35.50, 80);

        // Adicionando na folha.
        folha.adicionarFuncionario(jose);
        folha.adicionarFuncionario(alysson);
        folha.adicionarFuncionario(maria);
        folha.adicionarFuncionario(maria);

        // Exibir todos os funcionarios
        System.out.println("Lista de funcionários:");
        folha.exibirTodos();

        // Exibir valor total
        System.out.printf("Valor total da folha de pagamento: %.2f\n",folha.calcularValorTotal());
    }
}
