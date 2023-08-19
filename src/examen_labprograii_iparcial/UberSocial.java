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
  private ArrayList<SocialClass> Cuentas;

    public UberSocial() {
        this.Cuentas = new ArrayList<>();
    }

    public SocialClass buscar(String username) {
        for (SocialClass account : Cuentas) {
            if (account.username.equals(username)) {
                return account;
            }
        }
        return null;
    }

   public void agregarCuenta(String username, String type) {
        if (buscar(username) == null) {
            if (type.equals("FACEBOOK")) {
                Cuentas.add(new Facebook(username));
                JOptionPane.showMessageDialog(null, "Cuenta agregada exitosamente: " + username);
            } else if (type.equals("TWITTER")) {
                Cuentas.add(new Twitter(username));
                JOptionPane.showMessageDialog(null, "Cuenta agregada exitosamente: " + username);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Cuenta ya existe: " + username);
        }
    }

    public void agregarPost(String user, String post) {
        SocialClass account = buscar(user);
        if (account != null) {
            account.addPosts(post);
            JOptionPane.showMessageDialog(null, "Post agregado exitosamente para el usuario: " + user);
        } else {
            JOptionPane.showMessageDialog(null, "Usuario no encontrado: " + user);
        }
    }

    public void agregarAmigo(String user1, String user2) {
        SocialClass account1 = buscar(user1);
        SocialClass account2 = buscar(user2);
        if (account1 != null && account2 != null && account1.getClass() == account2.getClass()) {
            boolean added = account1.addFriend(user2) && account2.addFriend(user1);
            if (added) {
                JOptionPane.showMessageDialog(null, "Amigos agregados exitosamente: " + user1 + " and " + user2);
            } else {
                JOptionPane.showMessageDialog(null, "Adición de amigo fallida. Revisa usuarios y tipo de cuentas.");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Usuarios no encontrados o son de diferente red social.");
        }
    }

    public void agregarComentario(String user, int postID, String author, String comment) {
        SocialClass account = buscar(user);
        if (account instanceof Facebook) {
            Comment newComment = new Comment(postID, author, comment);
            if (((Facebook) account).addComment(newComment)) {
                JOptionPane.showMessageDialog(null, "Comentario agregado exitosamente para: " + user);
            } else {
                JOptionPane.showMessageDialog(null, "Adición de comentario fallida. Verifica PostID.");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Usuario no encontrado o no es una cuenta de facebook: " + user);
        }
    }
    public void profileFrom(String user) {
        SocialClass account = buscar(user);
        if (account != null) {
            account.myProfile();
        }
    }
}