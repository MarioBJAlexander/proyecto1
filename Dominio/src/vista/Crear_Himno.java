/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import dao.Escuela_DAO;
import dominio.Aula;
import dominio.Himno;
import javax.swing.JOptionPane;

/**
 *
 * @author Iepiadm
 */
public class Crear_Himno extends javax.swing.JDialog {

    private Himno himno;

    /**
     * Creates new form Crear_Himno
     */
    public Crear_Himno(java.awt.Frame parent, boolean modal, Himno himno) {
        super(parent, modal);
        initComponents();
        this.setLocationRelativeTo(null);
        if (himno != null) {
            this.himno = himno;
            cargarHimno();
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        letraText = new javax.swing.JTextField();
        autorLText = new javax.swing.JTextField();
        autorMText = new javax.swing.JTextField();
        agregarButton = new javax.swing.JButton();
        eliminarButton = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setText("Agregar Himno");

        jLabel2.setText("agregar letra: ");

        jLabel3.setText("agregar el autor de la letra:");

        jLabel4.setText("agregar al autor de la música:");

        agregarButton.setText("Agregar");
        agregarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agregarButtonActionPerformed(evt);
            }
        });

        eliminarButton.setText("Eliminar");
        eliminarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarButtonActionPerformed(evt);
            }
        });

        jButton7.setText("Regresar");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(154, 154, 154)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(letraText)
                            .addComponent(autorLText)
                            .addComponent(autorMText, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(agregarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(eliminarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(letraText))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(autorLText, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(autorMText, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(agregarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(eliminarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public boolean validarEntradas() {
        if (letraText.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "falta llenar el campo nombre");
            return false;
        } else if (autorLText.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "falta llenar el campo cargo");
            return false;
        } else if (autorMText.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "falta llenar el campo especialidad");
            return false;
        }
        return true;
    }

    public void cargarHimno() {
        letraText.setText(himno.getLetra());
        autorLText.setText(himno.getAutorLetra());
        autorMText.setText(himno.getAutorMusica());
    }

    private void agregarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregarButtonActionPerformed
        if (validarEntradas()) {
            if (himno != null) {
                himno.setLetra(letraText.getText());
                himno.setAutorLetra(autorLText.getText());
                himno.setAutorMusica(autorMText.getText());

                Escuela_DAO ed = new Escuela_DAO();
                boolean estado = ed.editarHimno(himno);
                int guarda = JOptionPane.showConfirmDialog(this, "Desea guardar los cambios?", "Advertencia", JOptionPane.YES_NO_OPTION);
                if (guarda == JOptionPane.YES_OPTION) {
                    if (estado == true) {
                        JOptionPane.showMessageDialog(this, "Se edito correctamente");
                        dispose();
                    }
                } else {
                    JOptionPane.showMessageDialog(this, "Error al editar");
                }
            } else{
                Himno him = new Himno();
                him.setLetra(letraText.getText());
                him.setAutorLetra(autorLText.getText());
                him.setAutorMusica(autorMText.getText());
                Escuela_DAO h = new Escuela_DAO();
                if (h.crearHimno(him) == true) {
                    JOptionPane.showMessageDialog(null, "El himno se agregó correctamente");
                    letraText.setText("");
                    autorLText.setText("");
                    autorMText.setText("");
                    letraText.requestFocus();
                }
            }
        }
    }//GEN-LAST:event_agregarButtonActionPerformed

    private void eliminarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarButtonActionPerformed
        himno.setLetra(letraText.getText());
        himno.setAutorLetra(autorLText.getText());
        himno.setAutorMusica(autorMText.getText());

        Escuela_DAO ed = new Escuela_DAO();
        boolean estado = ed.eliminarHimno(himno);
        int guarda = JOptionPane.showConfirmDialog(this, "Desea guardar los cambios?", "Advertencia", JOptionPane.YES_NO_OPTION);
        if (guarda == JOptionPane.YES_OPTION) {
            if (estado == true) {
                JOptionPane.showMessageDialog(this, "Se eliminó correctamente");
                dispose();
            }
        } else {
            JOptionPane.showMessageDialog(this, "Error al eliminar");
        }
    }//GEN-LAST:event_eliminarButtonActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        Datos_Escuela da = new Datos_Escuela();
        da.setVisible(true);
    }//GEN-LAST:event_jButton7ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton agregarButton;
    private javax.swing.JTextField autorLText;
    private javax.swing.JTextField autorMText;
    private javax.swing.JButton eliminarButton;
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField letraText;
    // End of variables declaration//GEN-END:variables

}
