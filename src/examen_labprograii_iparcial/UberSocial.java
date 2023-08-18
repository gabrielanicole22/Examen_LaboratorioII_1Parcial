/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examen_labprograii_iparcial;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;

/**
 *
 * @author David 
 */
public class UberSocial {

    ArrayList<SocialClass> Cuentas;

    public UberSocial() {
        Cuentas = new ArrayList<>();
    }

    public SocialClass buscar(String username, int i) {
        if (i < Cuentas.size()) {
            if (Cuentas.get(i).username.equals(username)) {
                return Cuentas.get(i);
            } else {
                return buscar(username, i + 1);
            }

        }else{
        return null;   
        }
    }

    public void AgregarPost(String Username, String Post) {
        SocialClass user = buscar(Username, 0);

        if (user != null) {
            user.addPosts(Post);
            JOptionPane.showMessageDialog(null, "Post agregado existosamente!");
        } else {
            JOptionPane.showMessageDialog(null, "Error: Usuario no encontrado");
        }

    }

    public void AgregarCuenta(String username, String tipo) {
        SocialClass user=buscar(username, 0);
        
        
        if (user == null) {
            if (tipo.equals("Facebook")) {
                Facebook face = new Facebook(username);
                Cuentas.add(face);
                JOptionPane.showMessageDialog(null, "Cuenta agregada exitosamente!");
            } else if (tipo.equals("Twitter")) {
                Twitter tweet = new Twitter(username);
                Cuentas.add(tweet);
                JOptionPane.showMessageDialog(null, "Cuenta agregada exitosamente!");
            } else {
                JOptionPane.showMessageDialog(null, "Error: tipo inexistente");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Error: Username no disponible");
        }

    }

    public void AgregarAmigo(String user1, String user2) {
        SocialClass userr = buscar(user2, 0);
        boolean amigo2=false;
        if(userr!=null){
            amigo2=true;
        }
        userr = buscar(user1, 0);
        
        
        if(amigo2==true && userr!=null){
        userr.addFriend(user2);
            JOptionPane.showMessageDialog(null, "Amigo agregado existosamente"); 
    }else{
     JOptionPane.showMessageDialog(null, "Error: usuario no encontrado");    
        }
        
    }

        public void AgregarComment(String user,int id, String autor,String comment) {

            SocialClass userr = buscar(user, 0);
            
            
            if (userr != null && userr instanceof Facebook) {
                Facebook facebookuser=(Facebook) userr;
                Comment comentar=new Comment(id,autor,comment);
                facebookuser.addComment(comentar);
                JOptionPane.showMessageDialog(null, "Comentario agregado exitosamente");

            }
        }
        
        public void profileFrom(String user,JTextArea area){
             SocialClass userr = buscar(user, 0);
             if (userr != null) {
                userr.myProfile(area);
            }else{
                 JOptionPane.showMessageDialog(null, "Error: usuario no encontrado");
             }
             
        }
}
