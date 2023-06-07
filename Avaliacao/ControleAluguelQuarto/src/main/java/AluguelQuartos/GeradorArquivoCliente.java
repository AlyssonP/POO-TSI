package AluguelQuartos;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class GeradorArquivoCliente {
    public static void gerarArquivo() {
        HospedeRepository hospedeRepository = new HospedeRepository();
        ArrayList<Hospede> hospedes = hospedeRepository.consultarHospede();
        
        try (FileWriter fw = new FileWriter("src/main/java/Arquivos/hospedes.csv", false); 
                BufferedWriter bw = new BufferedWriter(fw)){
    
            for (Hospede hospede: hospedes){
                bw.write(hospede.getCpf()+
                        ";"+hospede.getNome()+
                        ";"+hospede.getEndereco()+
                        ";"+hospede.getCelular()+
                        ";"+hospede.getEmail());
                bw.newLine();
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        }
            
    }
    
    public static ArrayList<Hospede> lerAquivo() {
        ArrayList<Hospede> hospedes = new ArrayList<Hospede>();
        
        ArrayList<String> hospedesString = new ArrayList<String>();
        
        try(FileReader fw = new FileReader("src/main/java/Arquivos/hospedes.csv"); 
                BufferedReader bw = new BufferedReader(fw)) {
            String[] dados;
            String cpf, nome, endereco, celular, email;
            while (bw.ready()){
                String linha = bw.readLine();
                dados = linha.split(";");
                cpf = dados[0];
                nome = dados[1];
                endereco = dados[2];
                celular = dados[3];
                email = dados[4];
                hospedes.add(new Hospede(nome, cpf, endereco, celular, email));
            }
        } catch(IOException ex) {
            ex.printStackTrace();
        }
        return hospedes;
    }
}
