package consultadenome;

import javax.swing.JOptionPane;

/**
 *
 * @author Maique
 */
public class Consultadenome {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int x,num_de_consult;
        String s = JOptionPane.showInputDialog("Informe a quantidade de pessoas");
        x = Integer.parseInt(s);
        while (x <= 0) {
            s = JOptionPane.showInputDialog("Informe um número maior que zero!");
            x = Integer.parseInt(s);
        }
        String vet[] = new String[x];
        for (int i = 0; i < x; i++) {
            vet[i] = JOptionPane.showInputDialog("Informe o nome da pessoa numero "+ (i+1) + ":");
        }
        JOptionPane.showMessageDialog(null, "Nomes cadastrados com sucesso!");
        String a = JOptionPane.showInputDialog("Infome um numero para encontra o nome desejado.");
        num_de_consult = Integer.parseInt(a);
        while(num_de_consult <= 0 || num_de_consult > x){
            a = JOptionPane.showInputDialog("Por favor informe um numero entre 1 e "+ x);
            num_de_consult = Integer.parseInt(a);       
        }
        JOptionPane.showMessageDialog(null, "Nome: " + vet[num_de_consult-1]+"\nPosição: " +num_de_consult);
    }

}
