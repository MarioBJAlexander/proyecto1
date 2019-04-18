/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import dao.Escuela_DAO;
import dominio.Profesor;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author Iepiadm
 */
public class Crear_Profesor extends javax.swing.JDialog {

    private Profesor profesor;

    /**
     * Creates new form Crear_Profesor
     */
    public Crear_Profesor(java.awt.Frame parent, boolean modal, Profesor profesor) {
        super(parent, modal);
        initComponents();
        this.setLocationRelativeTo(null);
        if (profesor != null) {
            this.profesor = profesor;
            cargarProfesor();
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        agregarButton = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        cedulaText = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        fechaNacimientoChooser = new com.toedter.calendar.JDateChooser();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        nombreText = new javax.swing.JTextField();
        cargoText = new javax.swing.JTextField();
        direcciónText = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        telefonoText = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        especialidadText = new javax.swing.JTextField();
        eliminarButton = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        agregarButton.setText("Agregar");
        agregarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agregarButtonActionPerformed(evt);
            }
        });

        jLabel5.setText("agregar cedula:");

        jLabel6.setText("agregar fecha de nacimiento:");

        jLabel1.setText("Agregar Profesor");

        jLabel2.setText("agregar nombre: ");

        jLabel3.setText("agregar cargo: ");

        jLabel4.setText("agregar dirección:");

        jLabel7.setText("agregar teléfono:");

        telefonoText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                telefonoTextActionPerformed(evt);
            }
        });

        jLabel8.setText("agregar especialidad:");

        eliminarButton.setText("Eliminar");
        eliminarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarButtonActionPerformed(evt);
            }
        });

        jButton1.setText("Regresar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(agregarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(eliminarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(149, 149, 149)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addGap(18, 18, 18)
                        .addComponent(fechaNacimientoChooser, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(25, 25, 25)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addContainerGap()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(telefonoText, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(nombreText, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                                .addComponent(cargoText)
                                .addComponent(direcciónText)
                                .addComponent(cedulaText)
                                .addComponent(especialidadText)))))
                .addContainerGap(16, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nombreText, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cargoText, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(especialidadText, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(direcciónText, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cedulaText, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(telefonoText, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fechaNacimientoChooser, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(agregarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(eliminarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public boolean validarEntradas() {
        if (nombreText.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "falta llenar el campo nombre");
            return false;
        } else if (cargoText.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "falta llenar el campo cargo");
            return false;
        } else if (especialidadText.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "falta llenar el campo especialidad");
            return false;
        } else if (direcciónText.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "falta llenar el campo dirección");
            return false;
        } else if (cedulaText.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "falta llenar el campo cédula");
        } else if (telefonoText.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "falta llenar el campo teléfono");
        }
        return true;
    }

    public void cargarProfesor() {
        nombreText.setText(profesor.getNombre());
        cargoText.setText(profesor.getCargo());
        especialidadText.setText(profesor.getEspecialidad());
        direcciónText.setText(profesor.getDireccion());
        telefonoText.setText(profesor.getTelefono());
        cedulaText.setText(profesor.getCedula());
        fechaNacimientoChooser.setDate(profesor.getFechaNacimiento());
    }

    private void agregarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregarButtonActionPerformed
        if (validarEntradas()) {
            if (profesor != null) {
                profesor.setNombre(nombreText.getText());
                profesor.setCargo(cargoText.getText());
                profesor.setEspecialidad(especialidadText.getText());
                profesor.setTelefono(telefonoText.getText());
                profesor.setCedula(cedulaText.getText());
                profesor.setDireccion(direcciónText.getText());
                profesor.setFechaNacimiento(fechaNacimientoChooser.getDate());

                Escuela_DAO ed = new Escuela_DAO();
                boolean estado = ed.editarProfesor(profesor);
                int guarda = JOptionPane.showConfirmDialog(this, "Desea guardar los cambios?", "Advertencia", JOptionPane.YES_NO_OPTION);
                if (guarda == JOptionPane.YES_OPTION) {
                    if (estado == true) {
                        JOptionPane.showMessageDialog(this, "Se edito correctamente"); 
                        dispose();
                    }
                } else {
                    JOptionPane.showMessageDialog(this, "Error al editar");
                }
            } else {
                Profesor pro = new Profesor();
                pro.setNombre(nombreText.getText());
                pro.setCargo(cargoText.getText());
                pro.setEspecialidad(especialidadText.getText());
                pro.setTelefono(telefonoText.getText());
                pro.setCedula(cedulaText.getText());
                pro.setDireccion(direcciónText.getText());
                pro.setFechaNacimiento(fechaNacimientoChooser.getDate());

                Escuela_DAO pf = new Escuela_DAO();
                if (pf.crearProfesor(pro) == true) {
                    JOptionPane.showMessageDialog(null, "El profesor se agregó correctamente");
                    nombreText.setText("");
                    cargoText.setText("");
                    direcciónText.setText("");
                    especialidadText.setText("");
                    telefonoText.setText("");
                    cedulaText.setText("");
                    fechaNacimientoChooser.setDate(new Date());
                    nombreText.requestFocus();
                }
            }
        }
    }//GEN-LAST:event_agregarButtonActionPerformed

    private void telefonoTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_telefonoTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_telefonoTextActionPerformed

    private void eliminarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarButtonActionPerformed
        profesor.setNombre(nombreText.getText());
        profesor.setCargo(cargoText.getText());
        profesor.setEspecialidad(especialidadText.getText());
        profesor.setTelefono(telefonoText.getText());
        profesor.setCedula(cedulaText.getText());
        profesor.setDireccion(direcciónText.getText());
        profesor.setFechaNacimiento(fechaNacimientoChooser.getDate());

        Escuela_DAO ed = new Escuela_DAO();
        boolean estado = ed.eliminarProfesor(profesor);
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

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Datos_Escuela da = new Datos_Escuela();
        da.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton agregarButton;
    private javax.swing.JTextField cargoText;
    private javax.swing.JTextField cedulaText;
    private javax.swing.JTextField direcciónText;
    private javax.swing.JButton eliminarButton;
    private javax.swing.JTextField especialidadText;
    private com.toedter.calendar.JDateChooser fechaNacimientoChooser;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JTextField nombreText;
    private javax.swing.JTextField telefonoText;
    // End of variables declaration//GEN-END:variables
}
