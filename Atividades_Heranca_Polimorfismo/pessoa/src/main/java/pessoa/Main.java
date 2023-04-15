package pessoa;

public class Main {
    public static void main(String[] args) {
        Aluno aluno1 = new Aluno("Alysson","alysson@gmail.com", "(83)98911-0317","Masculino", 19, "202213810037");
        Funcionario fun01 = new Funcionario("Maria", "maria@gmail.com","(83)91111-2222", "Feminino", 28,2000.00f);
        Professor prof01 = new Professor("José", "jose@gmail.com", "(83)98888-8888", "Masculino", 28, 5600.80f, "Algoritmos");
        System.out.println("Aluno: "+aluno1);
        System.out.println("Funcionário: "+fun01);
        System.out.println("Professor: "+prof01);
    }
}
