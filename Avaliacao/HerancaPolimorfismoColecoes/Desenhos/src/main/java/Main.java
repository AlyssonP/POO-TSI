public class Main {
    public static void main(String[] args) {
        CadastroDeDesenhos desenhos = new CadastroDeDesenhos();

        // Instanciando os objetos.
        Desenho retangulo = new Retangulo(2,2);
        Desenho circulo = new Circulo(4.2);
        Desenho quadrado = new Quadrado(2);
        Desenho pessoa = new Pessoa("Alysson");

        // Adicionando desenhos.
        desenhos.desenharDesenho(retangulo);
        desenhos.desenharDesenho(circulo);
        desenhos.desenharDesenho(quadrado);
        desenhos.desenharDesenho(pessoa);

        // Desenhando todos os desenhos.
        desenhos.desenharTodos();
    }
}
