package newfuncionario;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;


/**
 *
 * @author aluno
 */
public class Newfuncionario {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner x = new Scanner(System.in);
        funcionario f = new funcionario();
        System.out.println("informe seu nome: ");
        String nome = f.getNome();
        System.out.println("informe sua data de admissão");
        String Adm = x.next();
        System.out.println("informe valor da hora trabalhada: ");
        float valor_hora = f.getValorHora();
        System.out.println("informe sua horas trabalhadas: ");
        float horas_trabalhadas = f.getHorasTrabalhada();
        
        SimpleDateFormat form = new SimpleDateFormat("dd/MM/yyyy");
        try{
        Date Admissao = form.parse(Adm);
        f.setDataAdmissao(Admissao);
        }
        catch(ParseException ex){
            System.out.println("data inválida");
        }
        
        String mensagem = "nome" + f.getNome();
        mensagem += "\ndata de admissão" + f.getDataAdmissao();
        mensagem += "\nvalor da hora trabalhada" + f.getHorasTrabalhada();
        mensagem += "\nhoras trabalhadas" + f.getHorasTrabalhada();
        
        
        
        
    }
    
}
