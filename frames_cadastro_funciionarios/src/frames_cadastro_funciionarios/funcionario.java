/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package frames_cadastro_funciionarios;

import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author Maique
 */
public class funcionario {
    private String nome;
    private Date dataAdmissao;
    private float valor_horas;
    private float horas_trabalhadas;

    public String getNome() {
        return nome;
    }

    public Date getDataAdmissao() {
        return dataAdmissao;
    }

    public float getValor_horas() {
        return valor_horas;
    }

    public float getHoras_trabalhadas() {
        return horas_trabalhadas;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setDataAdmissao(Date dataAdmissao) {
        this.dataAdmissao = dataAdmissao;
    }

    public void setValor_horas(float valor_horas) {
        this.valor_horas = valor_horas;
    }

    public void setHoras_trabalhadas(float horas_trabalhadas) {
        this.horas_trabalhadas = horas_trabalhadas;
    }
     int i;

    public int calcularTempoempresa() {
        Calendar dataADM = Calendar.getInstance();
        dataADM.setTime(dataAdmissao);
        Calendar hoje = Calendar.getInstance();
        hoje.getTime();
        i = hoje.get(Calendar.YEAR) - dataADM.get(Calendar.YEAR);
        dataADM.add(Calendar.YEAR, i);
        if (hoje.before(dataADM)) {
            i--;
        }
        return i;

    }

    public float calcularSalario() {
        float sal = ((valor_horas * horas_trabalhadas));
        float sal_reajustado5 = sal*0.05f, sal_reajustado10 = sal*0.10f;
        
        int p = calcularTempoempresa();
        if (p >= 5 && p < 10) {
             sal += sal_reajustado5;
        } else if (p >= 10) {
            sal += sal_reajustado10;
        }
        return sal;

    }
}
