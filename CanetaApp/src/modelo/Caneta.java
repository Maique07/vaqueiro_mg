
package modelo;

import java.util.Objects;


public class Caneta {
 private int  codigo;
 private String modelo,cor,tamp; 
 private float ponta;
 private int carga;
 private boolean tampada;
  
    
    public int tampar(){
        int erro = 0;
    if(!tampada){
        tampada = true;
       
    }else{
        erro = 1;
    }
    return erro; 
  }  
   
    public int destampar(){
        int erro = 0;
    if(tampada){
        tampada = false;
       
    }else{
        erro = 1;
    }
    return erro;
    }

    @Override
    public String toString() {
        return "caneta1{" + "modelo=" + modelo + ", cor=" + cor + ", ponta=" + ponta + ", carga=" + carga + ", tampada=" + tampada + '}';
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 19 * hash + Objects.hashCode(this.modelo);
        hash = 19 * hash + Objects.hashCode(this.cor);
        hash = 19 * hash + Objects.hashCode(this.tamp);
        hash = 19 * hash + Float.floatToIntBits(this.ponta);
        hash = 19 * hash + this.carga;
        hash = 19 * hash + (this.tampada ? 1 : 0);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Caneta other = (Caneta) obj;
        if (Float.floatToIntBits(this.ponta) != Float.floatToIntBits(other.ponta)) {
            return false;
        }
        if (this.carga != other.carga) {
            return false;
        }
        if (this.tampada != other.tampada) {
            return false;
        }
        if (!Objects.equals(this.modelo, other.modelo)) {
            return false;
        }
        if (!Objects.equals(this.cor, other.cor)) {
            return false;
        }
        if (!Objects.equals(this.tamp, other.tamp)) {
            return false;
        }
        return true;
    }

    
    public String getModelo() {
        return modelo;
    }

    public String getCor() {
        return cor;
    }

    public String getTamp() {
        return tamp;
    }

    public float getPonta() {
        return ponta;
    }

    public int getCarga() {
        return carga;
    }

    public boolean isTampada() {
        return tampada;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public void setTamp(String tamp) {
        this.tamp = tamp;
    }

    public void setPonta(float ponta) {
        this.ponta = ponta;
    }

    public void setCarga(int carga) {
        this.carga = carga;
    }

    public void setTampada(boolean tampada) {
        this.tampada = tampada;
    }

    public int getCodigo() {
        return codigo;
    }

   

    
    
}                 