/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package examen_labprograii_iparcial;

import java.awt.Color;
import java.awt.Cursor;

/**
 *
 * @author Gabriela Mejia
 */
public class Menu extends javax.swing.JFrame {

    /**
     * Creates new form Menu
     */
    
    UberSocial social;
    public Menu() {
        this.social=new UberSocial();
        initComponents();
        Color backgroundColor = new Color(66, 84, 87);
        getContentPane().setBackground(backgroundColor);
    }
    Color SELECT_COLOR = new Color(144, 210, 216);

    public void UberSocial(UberSocial uber){
        this.social=uber;
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnAgregarCuenta = new javax.swing.JLabel();
        btnAgregarPost = new javax.swing.JLabel();
        btnAgregarAmigo = new javax.swing.JLabel();
        btnAgregarComentario = new javax.swing.JLabel();
        btnVerPerfil = new javax.swing.JLabel();
        btnSalir = new javax.swing.JLabel();
        lblUberSocial = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnAgregarCuenta.setFont(new java.awt.Font("SimSun", 0, 24)); // NOI18N
        btnAgregarCuenta.setForeground(new java.awt.Color(255, 255, 255));
        btnAgregarCuenta.setText("Agregar Cuenta");
        btnAgregarCuenta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAgregarCuentaMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnAgregarCuentaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnAgregarCuentaMouseExited(evt);
            }
        });

        btnAgregarPost.setFont(new java.awt.Font("SimSun", 0, 24)); // NOI18N
        btnAgregarPost.setForeground(new java.awt.Color(255, 255, 255));
        btnAgregarPost.setText("Agregar Post");
        btnAgregarPost.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAgregarPostMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnAgregarPostMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnAgregarPostMouseExited(evt);
            }
        });

        btnAgregarAmigo.setFont(new java.awt.Font("SimSun", 0, 24)); // NOI18N
        btnAgregarAmigo.setForeground(new java.awt.Color(255, 255, 255));
        btnAgregarAmigo.setText("Agregar Amigo");
        btnAgregarAmigo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAgregarAmigoMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnAgregarAmigoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnAgregarAmigoMouseExited(evt);
            }
        });

        btnAgregarComentario.setFont(new java.awt.Font("SimSun", 0, 24)); // NOI18N
        btnAgregarComentario.setForeground(new java.awt.Color(255, 255, 255));
        btnAgregarComentario.setText("Agregar Comentario");
        btnAgregarComentario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAgregarComentarioMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnAgregarComentarioMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnAgregarComentarioMouseExited(evt);
            }
        });

        btnVerPerfil.setFont(new java.awt.Font("SimSun", 0, 24)); // NOI18N
        btnVerPerfil.setForeground(new java.awt.Color(255, 255, 255));
        btnVerPerfil.setText("Ver Perfil");
        btnVerPerfil.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnVerPerfilMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnVerPerfilMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnVerPerfilMouseExited(evt);
            }
        });

        btnSalir.setFont(new java.awt.Font("SimSun", 0, 24)); // NOI18N
        btnSalir.setForeground(new java.awt.Color(255, 255, 255));
        btnSalir.setText("Salir");
        btnSalir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSalirMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnSalirMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnSalirMouseExited(evt);
            }
        });

        lblUberSocial.setFont(new java.awt.Font("Parchment", 0, 70)); // NOI18N
        lblUberSocial.setForeground(new java.awt.Color(255, 255, 255));
        lblUberSocial.setText("Uber Social");
        lblUberSocial.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblUberSocialMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblUberSocialMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblUberSocialMouseExited(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnSalir)
                .addGap(83, 83, 83))
            .addGroup(layout.createSequentialGroup()
                .addGap(151, 151, 151)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnVerPerfil)
                    .addComponent(btnAgregarComentario)
                    .addComponent(btnAgregarAmigo)
                    .addComponent(btnAgregarPost)
                    .addComponent(btnAgregarCuenta))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(249, Short.MAX_VALUE)
                .addComponent(lblUberSocial)
                .addGap(232, 232, 232))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(69, 69, 69)
                .addComponent(lblUberSocial)
                .addGap(61, 61, 61)
                .addComponent(btnAgregarCuenta)
                .addGap(33, 33, 33)
                .addComponent(btnAgregarPost)
                .addGap(30, 30, 30)
                .addComponent(btnAgregarAmigo)
                .addGap(31, 31, 31)
                .addComponent(btnAgregarComentario)
                .addGap(31, 31, 31)
                .addComponent(btnVerPerfil)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                .addComponent(btnSalir)
                .addGap(27, 27, 27))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnAgregarCuentaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAgregarCuentaMouseClicked
        // TODO add your handling code here:
        AgregarCuenta cuenta = new AgregarCuenta(social);
        cuenta.setVisible(true);
    }//GEN-LAST:event_btnAgregarCuentaMouseClicked

    private void btnAgregarPostMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAgregarPostMouseClicked
        // TODO add your handling code here:
        AgregarPost post = new AgregarPost(social);
        post.setVisible(true);
    }//GEN-LAST:event_btnAgregarPostMouseClicked

    private void btnAgregarAmigoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAgregarAmigoMouseClicked
        // TODO add your handling code here:
        AgregarAmigo amigo = new AgregarAmigo(social);
        amigo.setVisible(true);
    }//GEN-LAST:event_btnAgregarAmigoMouseClicked

    private void btnAgregarComentarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAgregarComentarioMouseClicked
        // TODO add your handling code here:
        AgregarComentario comentario = new AgregarComentario(social);
        comentario.setVisible(true);
    }//GEN-LAST:event_btnAgregarComentarioMouseClicked

    private void btnVerPerfilMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVerPerfilMouseClicked
        // TODO add your handling code here:
        UsuarioPerfil perfil = new UsuarioPerfil(social);
        perfil.setVisible(true);
    }//GEN-LAST:event_btnVerPerfilMouseClicked

    private void btnSalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSalirMouseClicked
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_btnSalirMouseClicked

    private void btnAgregarCuentaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAgregarCuentaMouseEntered
        // TODO add your handling code here:
        btnAgregarCuenta.setForeground(SELECT_COLOR);
        setCursor(Cursor.HAND_CURSOR);
    }//GEN-LAST:event_btnAgregarCuentaMouseEntered

    private void btnAgregarCuentaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAgregarCuentaMouseExited
        // TODO add your handling code here:
        btnAgregarCuenta.setForeground(Color.white);
        setCursor(Cursor.DEFAULT_CURSOR);
    }//GEN-LAST:event_btnAgregarCuentaMouseExited

    private void btnAgregarPostMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAgregarPostMouseEntered
        // TODO add your handling code here:
        btnAgregarPost.setForeground(SELECT_COLOR);
        setCursor(Cursor.HAND_CURSOR);
    }//GEN-LAST:event_btnAgregarPostMouseEntered

    private void btnAgregarPostMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAgregarPostMouseExited
        // TODO add your handling code here:
        btnAgregarPost.setForeground(Color.white);
        setCursor(Cursor.DEFAULT_CURSOR);
    }//GEN-LAST:event_btnAgregarPostMouseExited

    private void btnAgregarAmigoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAgregarAmigoMouseEntered
        // TODO add your handling code here:
        btnAgregarAmigo.setForeground(SELECT_COLOR);
        setCursor(Cursor.HAND_CURSOR);
    }//GEN-LAST:event_btnAgregarAmigoMouseEntered

    private void btnAgregarAmigoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAgregarAmigoMouseExited
        // TODO add your handling code here:
        btnAgregarAmigo.setForeground(Color.white);
        setCursor(Cursor.DEFAULT_CURSOR);
    }//GEN-LAST:event_btnAgregarAmigoMouseExited

    private void btnAgregarComentarioMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAgregarComentarioMouseEntered
        // TODO add your handling code here:
        btnAgregarComentario.setForeground(SELECT_COLOR);
        setCursor(Cursor.HAND_CURSOR);
    }//GEN-LAST:event_btnAgregarComentarioMouseEntered

    private void btnAgregarComentarioMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAgregarComentarioMouseExited
        // TODO add your handling code here:
        btnAgregarComentario.setForeground(Color.white);
        setCursor(Cursor.DEFAULT_CURSOR);
    }//GEN-LAST:event_btnAgregarComentarioMouseExited

    private void btnVerPerfilMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVerPerfilMouseEntered
        // TODO add your handling code here:
        btnVerPerfil.setForeground(SELECT_COLOR);
        setCursor(Cursor.HAND_CURSOR);
    }//GEN-LAST:event_btnVerPerfilMouseEntered

    private void btnVerPerfilMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVerPerfilMouseExited
        // TODO add your handling code here:
        btnVerPerfil.setForeground(Color.white);
        setCursor(Cursor.DEFAULT_CURSOR);
    }//GEN-LAST:event_btnVerPerfilMouseExited

    private void btnSalirMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSalirMouseEntered
        // TODO add your handling code here:
        btnSalir.setForeground(SELECT_COLOR);
        setCursor(Cursor.HAND_CURSOR);
    }//GEN-LAST:event_btnSalirMouseEntered

    private void btnSalirMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSalirMouseExited
        // TODO add your handling code here:
        btnSalir.setForeground(Color.white);
        setCursor(Cursor.DEFAULT_CURSOR);
    }//GEN-LAST:event_btnSalirMouseExited

    private void lblUberSocialMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblUberSocialMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_lblUberSocialMouseClicked

    private void lblUberSocialMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblUberSocialMouseEntered
        // TODO add your handling code here:
        lblUberSocial.setForeground(SELECT_COLOR);
        setCursor(Cursor.HAND_CURSOR);        
    }//GEN-LAST:event_lblUberSocialMouseEntered

    private void lblUberSocialMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblUberSocialMouseExited
        // TODO add your handling code here:
        lblUberSocial.setForeground(Color.white);
        setCursor(Cursor.DEFAULT_CURSOR);        
    }//GEN-LAST:event_lblUberSocialMouseExited

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btnAgregarAmigo;
    private javax.swing.JLabel btnAgregarComentario;
    private javax.swing.JLabel btnAgregarCuenta;
    private javax.swing.JLabel btnAgregarPost;
    private javax.swing.JLabel btnSalir;
    private javax.swing.JLabel btnVerPerfil;
    private javax.swing.JLabel lblUberSocial;
    // End of variables declaration//GEN-END:variables
}
