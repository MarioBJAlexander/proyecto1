/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import dao.Escuela_DAO;
import dominio.Alumno;
import java.awt.Frame;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author Iepiadm
 */
public class Crear_Alumno extends javax.swing.JDialog {

    private Alumno alumno;

    /**
     * Creates new form Crear_Alumno
     *
     * @param parent
     */
    public Crear_Alumno(java.awt.Frame parent, boolean modal, Alumno alumno) {
        super(parent, modal);
        initComponents();
        this.setLocationRelativeTo(null);
        if (alumno != null) {
            this.alumno = alumno;
            cargarAlumno();
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        nombreText = new javax.swing.JTextField();
        cursoText = new javax.swing.JTextField();
        direcciónText = new javax.swing.JTextField();
        agregarButton = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        cedulaText = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        fechaNacimientoChooser = new com.toedter.calendar.JDateChooser();
        eliminarButton = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setText("Agregar Alumno");

        jLabel2.setText("agregar nombre: ");

        jLabel3.setText("agregar curso: ");

        jLabel4.setText("agregar dirección:");

        agregarButton.setText("Agregar");
        agregarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agregarButtonActionPerformed(evt);
            }
        });

        jLabel5.setText("agregar cedula:");

        jLabel6.setText("agregar fecha de nacimiento");

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
                        .addGap(149, 149, 149)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(agregarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(eliminarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(9, 9, 9))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(14, 14, 14)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(nombreText, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                                            .addComponent(cursoText)
                                            .addComponent(direcciónText)
                                            .addComponent(cedulaText)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(fechaNacimientoChooser, javax.swing.GroupLayout.DEFAULT_SIZE, 204, Short.MAX_VALUE)))))))
                .addContainerGap(27, Short.MAX_VALUE))
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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(cursoText, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(direcciónText, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cedulaText, javax.swing.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(fechaNacimientoChooser, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(agregarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(eliminarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    public boolean validarEntradas() {
        if (nombreText.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "falta llenar el campo nombre");
            return false;
        } else if (cursoText.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "falta llenar el curso");
            return false;
        } else if (direcciónText.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "falta llenar el campo dirección");
            return false;
        } else if (cedulaText.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "falta llenar el campo cédula");
        }
        return true;
    }

    public void cargarAlumno() {
        nombreText.setText(alumno.getNombre());
        cursoText.setText(alumno.getCurso()+"");
        direcciónText.setText(alumno.getDireccion());
        cedulaText.setText(alumno.getCedula());
        fechaNacimientoChooser.setDate(alumno.getFechaNacimiento());

    }
    private void agregarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregarButtonActionPerformed
        if (validarEntradas()) {
            if (alumno != null) {
                
                int c = Integer.parseInt(cursoText.getText());
                alumno.setNombre(nombreText.getText());
                alumno.setCurso(c);
                alumno.setDireccion(direcciónText.getText());
                alumno.setCedula(cedulaText.getText());
                alumno.setFechaNacimiento(fechaNacimientoChooser.getDate());
                
                Escuela_DAO ed = new Escuela_DAO();
                boolean estado = ed.editarAlumno(alumno);
                int guarda = JOptionPane.showConfirmDialog(this, "Desea guardar los cambios?", "Advertencia", JOptionPane.YES_NO_OPTION);
                if (guarda == JOptionPane.YES_OPTION) {
                    if (estado == true) {
                        JOptionPane.showMessageDialog(this, "Se edito correctamente");
                        dispose();
                    }
                } else {
                    System.out.println("Error al editar");
                }
            } else {
                Alumno alu = new Alumno();
                int c = Integer.parseInt(cursoText.getText());
                alu.setNombre(nombreText.getText());
                alu.setCurso(c);
                alu.setDireccion(direcciónText.getText());
                alu.setCedula(cedulaText.getText());
                alu.setFechaNacimiento(fechaNacimientoChooser.getDate());
                
                Escuela_DAO al = new Escuela_DAO();
                if (al.crearAlumno(alu) == true) {
                    JOptionPane.showMessageDialog(null, "El alumno se agregó correctamente");
                    nombreText.setText("");
                    cursoText.setText("");
                    direcciónText.setText("");
                    cedulaText.setText("");
                    fechaNacimientoChooser.setDate(new Date());
                    nombreText.requestFocus();
                }
            }
        }
    }//GEN-LAST:event_agregarButtonActionPerformed

    private void eliminarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarButtonActionPerformed
        int c = Integer.parseInt(cursoText.getText());
        alumno.setNombre(nombreText.getText());
        alumno.setCurso(c);
        alumno.setDireccion(direcciónText.getText());
        alumno.setCedula(cedulaText.getText());
        alumno.setFechaNacimiento(fechaNacimientoChooser.getDate());
        
        Escuela_DAO ed = new Escuela_DAO();
        boolean estado = ed.eliminarAlumno(alumno);
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
    private javax.swing.JTextField cedulaText;
    private javax.swing.JTextField cursoText;
    private javax.swing.JTextField direcciónText;
    private javax.swing.JButton eliminarButton;
    private com.toedter.calendar.JDateChooser fechaNacimientoChooser;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField nombreText;
    // End of variables declaration//GEN-END:variables
}
