/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import dao.Usuario_DAO;
import dominio.Usuario;
import java.awt.Frame;
import java.util.List;
import model.Usuario_table_model;

/**
 *
 * @author Iepiadm
 */
public class Buscar_Usuario extends javax.swing.JDialog {

    /**
     * Creates new form Buscar_Usuario
     */
    public Buscar_Usuario(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        consultarButton = new javax.swing.JButton();
        regresarButton = new javax.swing.JButton();
        busText = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setText("BUSCAR USUARIO:");

        consultarButton.setText("CONSULTAR");
        consultarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                consultarButtonActionPerformed(evt);
            }
        });

        regresarButton.setText("REGRESAR");
        regresarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regresarButtonActionPerformed(evt);
            }
        });

        busText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                busTextActionPerformed(evt);
            }
        });
        busText.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                busTextKeyReleased(evt);
            }
        });

        tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tabla);

        jLabel2.setText("BUSCAR USUARIO");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 365, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(137, 137, 137)
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(busText, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(consultarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32)
                        .addComponent(regresarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(busText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(consultarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(regresarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void consultarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_consultarButtonActionPerformed
        try {
            Usuario_table_model tab = (Usuario_table_model) tabla.getModel();
            Usuario usuario = tab.getFilas().get(tabla.getSelectedRow());
            Crear_Usuario cu = new Crear_Usuario((Frame) this.getParent(), true, usuario);
            cu.setVisible(true);
            busTextKeyReleased(null);
        } catch (Exception e) {
            System.out.println("ERROR" + e);
        }
    }//GEN-LAST:event_consultarButtonActionPerformed

    private void regresarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regresarButtonActionPerformed
        this.setVisible(false);
        new Datos_Escuela().setVisible(true);
    }//GEN-LAST:event_regresarButtonActionPerformed

    private void busTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_busTextActionPerformed

    }//GEN-LAST:event_busTextActionPerformed

    private void busTextKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_busTextKeyReleased
        Usuario_DAO ud = new Usuario_DAO();
        List<Usuario> usuario = ud.buscarUsuario(busText.getText());
        tabla.setModel(new Usuario_table_model(usuario));
    }//GEN-LAST:event_busTextKeyReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField busText;
    private javax.swing.JButton consultarButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton regresarButton;
    private javax.swing.JTable tabla;
    // End of variables declaration//GEN-END:variables
}
