
package newfuncionario;

import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author aluno
 */
public class funcionario {
    private String nome;
    private Date dataAdmissao;
    private float valorHora;
    private float horasTrabalhada;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Date getDataAdmissao() {
        return dataAdmissao;
    }

    public void setDataAdmissao(Date dataAdmissao) {
        this.dataAdmissao = dataAdmissao;
    }

    public float getValorHora() {
        return valorHora;
    }

    public void setValorHora(float valorHora) {
        this.valorHora = valorHora;
    }

    public float getHorasTrabalhada() {
        return horasTrabalhada;
    }

    public void setHorasTrabalhada(float horasTrabalhada) {
        this.horasTrabalhada = horasTrabalhada;
    }

    /**
     *
     */
    public int calcularTempoEmpresa() {
         Calendar dataADM = Calendar.getInstance();
        dataADM.setTime(dataAdmissao);
        Calendar hoje = Calendar.getInstance();
        hoje.getTime();
        int i = hoje.get(Calendar.YEAR) -  dataADM.get(Calendar.YEAR);
         dataADM.add(Calendar.YEAR, i);
        if (hoje.before( dataADM)) {
            i--;
        }
       return i;
    }

    /**
     *
     */
    public void calcularSalario() {
        float sal;
                
    }
}

