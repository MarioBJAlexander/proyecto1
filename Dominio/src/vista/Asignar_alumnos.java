/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import dao.Escuela_DAO;
import dominio.Alumno;
import dominio.Profesor;
import java.awt.Frame;
import java.util.List;
import javax.swing.JOptionPane;
import model.Alumno_table_model;
import model.Profesor_combo_model;

/**
 *
 * @author Iepiadm
 */
public class Asignar_alumnos extends javax.swing.JDialog {

    /**
     * Creates new form Asignar_alumnos
     */
    public Asignar_alumnos(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        llenarProfesores();
        buscar();
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        alumnoTable = new javax.swing.JTable();
        asignarButton = new javax.swing.JButton();
        regresarButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        busText = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        profesorCombobox = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator1 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        alumnoTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane2.setViewportView(alumnoTable);

        asignarButton.setText("ASIGNAR");
        asignarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                asignarButtonActionPerformed(evt);
            }
        });

        regresarButton.setText("REGRESAR");
        regresarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regresarButtonActionPerformed(evt);
            }
        });
        regresarButton.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                regresarButtonKeyReleased(evt);
            }
        });

        jLabel1.setText("BUSCAR ALUMNOS:");

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

        jLabel2.setText("ASIGNAR ALUMNOS");

        profesorCombobox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                profesorComboboxActionPerformed(evt);
            }
        });

        jLabel3.setText("PROFESOR:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jLabel1)
                                .addGap(18, 18, 18)
                                .addComponent(busText, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(29, 29, 29))
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addComponent(asignarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(regresarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jSeparator2)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.DEFAULT_SIZE, 1, Short.MAX_VALUE)
                        .addGap(33, 33, 33)
                        .addComponent(profesorCombobox, javax.swing.GroupLayout.PREFERRED_SIZE, 404, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(206, 206, 206)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(busText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(4, 4, 4)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(profesorCombobox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 84, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(asignarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(regresarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
private void buscar() {
        try {
            Alumno_table_model alu = (Alumno_table_model) alumnoTable.getModel();
            Alumno al = alu.getFilas().get(alumnoTable.getSelectedRow());
            Crear_Alumno ca = new Crear_Alumno((Frame) this.getParent(), true, al);
            ca.setVisible(true);
        } catch (Exception e) {
        }
    }

    private void llenarProfesores() {
        Escuela_DAO ed = new Escuela_DAO();

        List<Profesor> profe = ed.buscarProfesor(busText.getText());
        profesorCombobox.setModel(new Profesor_combo_model(profe));
    }
    private void asignarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_asignarButtonActionPerformed
        try {
            Alumno_table_model al = (Alumno_table_model) alumnoTable.getModel();
            Alumno a = al.getFilas().get(alumnoTable.getSelectedRow());

            Profesor_combo_model pro = (Profesor_combo_model) profesorCombobox.getModel();
            Profesor p = pro.getSelectedItem();
            
            Escuela_DAO ed = new Escuela_DAO();
            if (a.getId_alumno() != 0) {
                if (ed.editarId_Alumnos(p.getId_profesor(), a.getId_alumno())) {
                    JOptionPane.showMessageDialog(this, "El alumno se asignó correctamente");
                }
            } else {
                JOptionPane.showConfirmDialog(this, "Desea reasignar de maestro al alumno", "advertencia", JOptionPane.YES_NO_OPTION);
            }
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
    }//GEN-LAST:event_asignarButtonActionPerformed

    private void regresarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regresarButtonActionPerformed
        dispose();
        Datos_Escuela da = new Datos_Escuela();
        da.setVisible(true);
    }//GEN-LAST:event_regresarButtonActionPerformed

    private void regresarButtonKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_regresarButtonKeyReleased

    }//GEN-LAST:event_regresarButtonKeyReleased

    private void busTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_busTextActionPerformed

    }//GEN-LAST:event_busTextActionPerformed

    private void busTextKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_busTextKeyReleased
        Escuela_DAO ed = new Escuela_DAO();
        List<Alumno> alumno = ed.buscarAlumno(busText.getText());
        alumnoTable.setModel(new Alumno_table_model(alumno));
    }//GEN-LAST:event_busTextKeyReleased

    private void profesorComboboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_profesorComboboxActionPerformed

    }//GEN-LAST:event_profesorComboboxActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable alumnoTable;
    private javax.swing.JButton asignarButton;
    private javax.swing.JTextField busText;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JComboBox<String> profesorCombobox;
    private javax.swing.JButton regresarButton;
    // End of variables declaration//GEN-END:variables

}
