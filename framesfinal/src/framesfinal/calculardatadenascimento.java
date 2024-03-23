/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package framesfinal;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author Maique
 */
public class calculardatadenascimento {

    public static int calcular(Date date) {
        Calendar datanasc = Calendar.getInstance();
        datanasc.setTime(date);
        Calendar hoje = Calendar.getInstance();
        hoje.getTime();
        int i = hoje.get(Calendar.YEAR) - datanasc.get(Calendar.YEAR);
        datanasc.add(Calendar.YEAR, i);
        if (hoje.before(datanasc)) {
            i--;
        }

        return i;

    }
}
