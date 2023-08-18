/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examen_labprograii_iparcial;

import java.util.ArrayList;
import javax.swing.JOptionPane;

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
    
    public void AgregarPost(String Username,String Post){
        SocialClass user=buscar(Username,0);
        
        if(user!=null){
            user.addPosts(Post);
            JOptionPane.showMessageDialog(null, "Post agregado existosamente!");
        }else{
            JOptionPane.showMessageDialog(null, "Error: Usuario no encontrado");
        }
        
    }
    
        
    
    public void AgregarCuenta(String username,String tipo){
        
        if(buscar(username,0)==null){
        if(tipo.equals("Facebook")){
            Facebook face=new Facebook(username);
            Cuentas.add(face);
        }else if(tipo.equals("Twitter")){
            Twitter tweet=new Twitter(username);
            Cuentas.add(tweet);
        }else{
            JOptionPane.showMessageDialog(null, "Error: tipo inexistente");
        }   
        }else{
            JOptionPane.showMessageDialog(null, "Error: Username no disponible");
        }
        
    }

    
    public void AgregarAmigo(String user1,String user2){
        SocialClass userr=buscar(user1,0);
        if(userr!=null && userr instanceof Facebook==true){
            userr.addFriend(user2);
            JOptionPane.showMessageDialog(null, "Amigo agregado existosamente");
        }else{
            JOptionPane.showMessageDialog(null, "Error: Usuario/s no encontrados");
        }
    }
    
    
    
    
}
