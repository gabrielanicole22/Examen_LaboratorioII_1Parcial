/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examen_labprograii_iparcial;

import java.util.ArrayList;

/**
 *
 * @author Miguel Medrano
 */
public class UberSocial {
     ArrayList<SocialClass> Cuentas;
    
    public UberSocial(){
         Cuentas=new ArrayList<>(); 
    }
    
    public SocialClass  buscar(String username, int i){
       if(i<Cuentas.size()){
           if(Cuentas.get(i).equals(username)){
               return Cuentas.get(i);
           }else{
               return buscar(username,i+1);
           }
           
       }       
        return null;
    }
    
    
    
    
    
    
}
