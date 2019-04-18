/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import dao.Usuario_DAO;
import dominio.Usuario;
import java.awt.event.KeyEvent;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author Iepiadm
 */
public class Login extends javax.swing.JDialog {

    /**
     * Creates new form Login
     */
    public Login(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        this.setLocationRelativeTo(null);
        usuarioText.requestFocus(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPasswordField1 = new javax.swing.JPasswordField();
        usuario = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        usuarioText = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        passwordText = new javax.swing.JPasswordField();

        jPasswordField1.setText("jPasswordField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        usuario.setText("USERNAME:");

        jLabel2.setText("PASSWORD:");

        usuarioText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usuarioTextActionPerformed(evt);
            }
        });

        jButton1.setText("LOG IN");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        passwordText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordTextActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(usuario, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(usuarioText, javax.swing.GroupLayout.DEFAULT_SIZE, 177, Short.MAX_VALUE)
                    .addComponent(passwordText))
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addContainerGap(35, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(usuarioText, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(usuario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(passwordText, javax.swing.GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(39, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(30, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    public boolean validar() {
        if (usuarioText.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "falta llenar el campo usuario");
            return false;
        } else if (passwordText.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "falta llenar el campo contraseña");
            return false;
        }
        return true;
    }
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        loginUser();
    }//GEN-LAST:event_jButton1ActionPerformed
    public void loginUser() {
        if (validar()) {
            Usuario_DAO us = new Usuario_DAO();
            boolean a = false;
            List<Usuario> usuarios = us.buscarUsuario(usuarioText.getText());
            for (int i = 0; i < usuarios.size(); i++) {
                if (usuarios.get(i).getUsuario().equals(usuarioText.getText())) {
                    if (usuarios.get(i).getContraseña().equals(passwordText.getText())) {
                        a = true;
                        dispose();
                        if (usuarios.get(i).getRoles().equals("administrador")) {
                            Datos_Escuela da = new Datos_Escuela();                            
                            da.setVisible(true);
                        } else {
                            Datos_Escuela da = new Datos_Escuela();
                            da.getUsuarioMenu().setEnabled(false);
                            da.setVisible(true);
                        }

                        return;
                    } else {
                        JOptionPane.showMessageDialog(this, "Datos Incorrectos, vuelva a intentar");
                        usuarioText.setText("");
                        passwordText.setText("");
                        usuarioText.requestFocus();
                        return;
                    }
                }
            }
            if (a == false) {
                JOptionPane.showMessageDialog(this, "Datos Incorrectos, vuelva a intentar");
                usuarioText.setText("");
                passwordText.setText("");
                usuarioText.requestFocus();
            }
        }
    }

    private void passwordTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordTextActionPerformed
        loginUser();
    }//GEN-LAST:event_passwordTextActionPerformed

    private void usuarioTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usuarioTextActionPerformed
        loginUser();
    }//GEN-LAST:event_usuarioTextActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JPasswordField passwordText;
    private javax.swing.JLabel usuario;
    private javax.swing.JTextField usuarioText;
    // End of variables declaration//GEN-END:variables
}
