/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controle;

import frames_cadastro_funciionarios.funcionario;
import java.util.ArrayList;

/**
 *
 * @author Maique
 */
public class controleacesso {
  private ArrayList<funcionario> lista = new ArrayList();    
  
  public boolean Salvar(funcionario f){
  if(f != null){
      lista.add(f);
      return true;
  }else{
      return false;
  }
  }
  public ArrayList<funcionario> exibirlista(){
      return lista;
  }
  
 }
