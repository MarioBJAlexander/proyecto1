/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import dao.Escuela_DAO;
import dominio.Escuela;
import dominio.Profesor;
import java.awt.Frame;
import java.util.List;
import javax.swing.JOptionPane;
import model.Escuela_combo_model;
import model.Escuela_table_model;
import model.Profesor_table_model;

/**
 *
 * @author Iepiadm
 */
public class Asignar_escuela extends javax.swing.JDialog {

    public Asignar_escuela(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        llenarEscuelas();
        buscar();
        this.setLocationRelativeTo(null);
    }

    private void buscar(){
        try {
            Profesor_table_model tab = (Profesor_table_model) profesorTable1.getModel();
            Profesor profesor = tab.getFilas().get(profesorTable1.getSelectedRow());
            Crear_Profesor cp = new Crear_Profesor((Frame) this.getParent(), true, profesor);
            cp.setVisible(true);
        } catch (Exception e){
        }
    }
    
    private void llenarEscuelas() {
        Escuela_DAO ed = new Escuela_DAO();

        List<Escuela> escuelas = ed.buscarEscuela(busText.getText());
        escuelasCombobox.setModel(new Escuela_combo_model(escuelas));
        escuelasCombobox.setSelectedIndex(0);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jSeparator1 = new javax.swing.JSeparator();
        jScrollPane2 = new javax.swing.JScrollPane();
        profesorTable1 = new javax.swing.JTable();
        asignarButton = new javax.swing.JButton();
        regresarButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        busText = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        escuelasCombobox = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();

        jMenu1.setText("File");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        profesorTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane2.setViewportView(profesorTable1);

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

        jLabel1.setText("BUSCAR PROFESOR:");

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

        jLabel2.setText("ASIGNAR ESCUELA");

        escuelasCombobox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                escuelasComboboxActionPerformed(evt);
            }
        });

        jLabel3.setText("Escuelas:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator2)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(busText, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(29, 29, 29))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(asignarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(regresarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(68, 68, 68))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 438, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jSeparator1)
                                .addGap(18, 18, 18)
                                .addComponent(escuelasCombobox, javax.swing.GroupLayout.PREFERRED_SIZE, 351, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(busText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(4, 4, 4)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(escuelasCombobox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(regresarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(asignarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
        List<Profesor> profesor = ed.buscarProfesor(busText.getText());
        profesorTable1.setModel(new Profesor_table_model(profesor));
    }//GEN-LAST:event_busTextKeyReleased

    private void asignarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_asignarButtonActionPerformed
        try {
            Profesor_table_model pro = (Profesor_table_model) profesorTable1.getModel();
            Profesor p = pro.getFilas().get(profesorTable1.getSelectedRow());

            Escuela_combo_model esc = (Escuela_combo_model) escuelasCombobox.getModel();
            Escuela e = esc.getSelectedItem();

            Escuela_DAO ed = new Escuela_DAO();
            if (ed.editarId_Profesor(p.getId_profesor(), e.getIdEscuela())) {
                if (e.getIdEscuela() == 0) {
                    JOptionPane.showMessageDialog(this, "El profesor se asignó correctamente");
                }else{
                    JOptionPane.showConfirmDialog(this, "Desea reasignar de escuela al profesor", "advertencia", JOptionPane.YES_NO_OPTION);
                }
            }
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }

    }//GEN-LAST:event_asignarButtonActionPerformed

    private void escuelasComboboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_escuelasComboboxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_escuelasComboboxActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton asignarButton;
    private javax.swing.JTextField busText;
    private javax.swing.JComboBox<String> escuelasCombobox;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTable profesorTable1;
    private javax.swing.JButton regresarButton;
    // End of variables declaration//GEN-END:variables
}
