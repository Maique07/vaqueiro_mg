/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package funcionario;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Maique
 */
public class Funcionario {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner x = new Scanner(System.in);
        CLASS_FUNCIONARIO f = new CLASS_FUNCIONARIO();
        System.out.println("informe seu nome: ");
        f.setNome(x.next());
        System.out.println("informe sua data de admissão");
        String Adm = x.next();
        System.out.println("informe valor da hora trabalhada: ");
        f.setValor_horas(x.nextFloat());
        System.out.println("informe sua horas trabalhadas: ");
        f.setHoras_trabalhadas(x.nextFloat());
        SimpleDateFormat form = new SimpleDateFormat("dd/MM/yyyy");
        try {
            Date Admissao = form.parse(Adm);
            f.setDataAdmissao(Admissao);
         int tempoEmpresa = f.calcularTempoempresa();
         float salario = f.calcularSalario();
        String mensagem = "nome: " + f.getNome();
        mensagem += "\ndata de admissão: " + f.getDataAdmissao();
        mensagem += "\nvalor da hora trabalhada: " + f.getValor_horas();
        mensagem += "\nhoras trabalhadas: " + f.getHoras_trabalhadas();
        mensagem += "\nTempo na empresa: "  + tempoEmpresa;
        mensagem += "\nSalario: " + salario;
        System.out.println(mensagem);
        } catch (ParseException ex) {
            System.out.println("data inválida");
        }

        
    }

}
