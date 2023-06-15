package AluguelQuartos;

public class Main {
    public static void main(String[] args){
        CadastroResidencia residencias = new CadastroResidencia();
        CadastroHospede hospedes = new CadastroHospede();
        CadastroAluguel alugueis = new CadastroAluguel();

        HospedeRepository hospedeRepository = new HospedeRepository();

        Quarto quarto01 = new Quarto(85.00, 2,true, false);
        Residencia residencia01 = new Residencia("Abdon",888, "São José", 58200000,"(83)98888-8888","hotel@gmail.com");
        residencia01.addQuarto(quarto01);

        //Hospede jose = new Hospede("José","111.222.333-44", "Guarabira", "(83)98888-8888", "jose@gmail.com");
        //hospedeRepository.insertHospede(jose);
//        for( Hospede hospede : hospedeRepository.consultarHospede()) {
//            System.out.println(hospede);
//        }

        //Aluguel aluguel01 = new Aluguel(jose, quarto01, "29/05/2023","31/05/2023");
        //System.out.println(aluguel01);

        //residencias.addResidencia(residencia01);
        //hospedes.addHospede(jose);
        //alugueis.addAluguel(aluguel01);
    }
}
