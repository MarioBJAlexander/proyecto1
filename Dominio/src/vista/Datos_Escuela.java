/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import java.awt.Frame;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import de.javasoft.plaf.synthetica.SyntheticaBlackEyeLookAndFeel;
import de.javasoft.plaf.synthetica.SyntheticaBlackMoonLookAndFeel;
import de.javasoft.plaf.synthetica.SyntheticaBlueIceLookAndFeel;
import de.javasoft.plaf.synthetica.SyntheticaGreenDreamLookAndFeel;
import de.javasoft.plaf.synthetica.SyntheticaOrangeMetallicLookAndFeel;
import de.javasoft.plaf.synthetica.SyntheticaSkyMetallicLookAndFeel;
/**
 *
 * @author Iepiadm
 */
public class Datos_Escuela extends javax.swing.JFrame {

    /**
     * Creates new form Datos_Escuela
     */
    public Datos_Escuela() {
        initComponents();
        this.setLocationRelativeTo(null);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu3 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();
        jCheckBoxMenuItem1 = new javax.swing.JCheckBoxMenuItem();
        jMenu5 = new javax.swing.JMenu();
        jCheckBoxMenuItem2 = new javax.swing.JCheckBoxMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenu6 = new javax.swing.JMenu();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem7 = new javax.swing.JMenuItem();
        MenuBar = new javax.swing.JMenuBar();
        asignarMenu = new javax.swing.JMenu();
        nuevoEItem = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        editarEItem = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        eliminarEItem = new javax.swing.JMenuItem();
        jSeparator14 = new javax.swing.JPopupMenu.Separator();
        jMenuItem3 = new javax.swing.JMenuItem();
        jSeparator19 = new javax.swing.JPopupMenu.Separator();
        jMenuItem6 = new javax.swing.JMenuItem();
        jSeparator20 = new javax.swing.JPopupMenu.Separator();
        jMenuItem8 = new javax.swing.JMenuItem();
        jSeparator21 = new javax.swing.JPopupMenu.Separator();
        jMenuItem9 = new javax.swing.JMenuItem();
        alumnoMenu = new javax.swing.JMenu();
        nuevoAItem1 = new javax.swing.JMenuItem();
        jSeparator3 = new javax.swing.JPopupMenu.Separator();
        editarAItem1 = new javax.swing.JMenuItem();
        jSeparator4 = new javax.swing.JPopupMenu.Separator();
        eliminarAItem1 = new javax.swing.JMenuItem();
        profesorMenu = new javax.swing.JMenu();
        jSeparator5 = new javax.swing.JPopupMenu.Separator();
        nuevoPItem2 = new javax.swing.JMenuItem();
        jSeparator6 = new javax.swing.JPopupMenu.Separator();
        editarPItem2 = new javax.swing.JMenuItem();
        jSeparator11 = new javax.swing.JPopupMenu.Separator();
        eliminarPItem2 = new javax.swing.JMenuItem();
        aulaMenu = new javax.swing.JMenu();
        nuevoAuItem3 = new javax.swing.JMenuItem();
        jSeparator7 = new javax.swing.JPopupMenu.Separator();
        editarAuItem3 = new javax.swing.JMenuItem();
        jSeparator8 = new javax.swing.JPopupMenu.Separator();
        eliminarAuItem3 = new javax.swing.JMenuItem();
        himnoMenu = new javax.swing.JMenu();
        nuevoHItem4 = new javax.swing.JMenuItem();
        jSeparator9 = new javax.swing.JPopupMenu.Separator();
        editarHItem4 = new javax.swing.JMenuItem();
        jSeparator10 = new javax.swing.JPopupMenu.Separator();
        eliminarHItem4 = new javax.swing.JMenuItem();
        usuarioMenu = new javax.swing.JMenu();
        nuevoMenu = new javax.swing.JMenuItem();
        jSeparator12 = new javax.swing.JPopupMenu.Separator();
        editarMenu = new javax.swing.JMenuItem();
        jSeparator13 = new javax.swing.JPopupMenu.Separator();
        eliminarMenu = new javax.swing.JMenuItem();
        jMenu7 = new javax.swing.JMenu();
        negro = new javax.swing.JMenuItem();
        jSeparator15 = new javax.swing.JPopupMenu.Separator();
        azul = new javax.swing.JMenuItem();
        jSeparator16 = new javax.swing.JPopupMenu.Separator();
        verde = new javax.swing.JMenuItem();
        jSeparator17 = new javax.swing.JPopupMenu.Separator();
        naranja = new javax.swing.JMenuItem();
        jSeparator18 = new javax.swing.JPopupMenu.Separator();
        celeste = new javax.swing.JMenuItem();
        salirMenu = new javax.swing.JMenu();
        salirItem = new javax.swing.JMenuItem();

        jMenuItem1.setText("jMenuItem1");

        jMenuItem2.setText("jMenuItem2");

        jMenu1.setText("jMenu1");

        jMenu2.setText("jMenu2");

        jMenu3.setText("File");
        jMenuBar1.add(jMenu3);

        jMenu4.setText("Edit");
        jMenuBar1.add(jMenu4);

        jCheckBoxMenuItem1.setSelected(true);
        jCheckBoxMenuItem1.setText("jCheckBoxMenuItem1");

        jMenu5.setText("jMenu5");

        jCheckBoxMenuItem2.setSelected(true);
        jCheckBoxMenuItem2.setText("jCheckBoxMenuItem2");

        jMenuItem4.setText("jMenuItem4");

        jMenu6.setText("jMenu6");

        jMenuItem5.setText("jMenuItem5");

        jMenuItem7.setText("jMenuItem7");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        asignarMenu.setText("Escuela");

        nuevoEItem.setText("Nuevo");
        nuevoEItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nuevoEItemActionPerformed(evt);
            }
        });
        asignarMenu.add(nuevoEItem);
        asignarMenu.add(jSeparator1);

        editarEItem.setText("Editar");
        editarEItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editarEItemActionPerformed(evt);
            }
        });
        asignarMenu.add(editarEItem);
        asignarMenu.add(jSeparator2);

        eliminarEItem.setText("Eliminar");
        eliminarEItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarEItemActionPerformed(evt);
            }
        });
        asignarMenu.add(eliminarEItem);
        asignarMenu.add(jSeparator14);

        jMenuItem3.setText("Asignar Maestro");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        asignarMenu.add(jMenuItem3);
        asignarMenu.add(jSeparator19);

        jMenuItem6.setText("Asignar Alumnos");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        asignarMenu.add(jMenuItem6);
        asignarMenu.add(jSeparator20);

        jMenuItem8.setText("Consultar Maestros");
        jMenuItem8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem8ActionPerformed(evt);
            }
        });
        asignarMenu.add(jMenuItem8);
        asignarMenu.add(jSeparator21);

        jMenuItem9.setText("Consultar Alumnos");
        jMenuItem9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem9ActionPerformed(evt);
            }
        });
        asignarMenu.add(jMenuItem9);

        MenuBar.add(asignarMenu);

        alumnoMenu.setText("Alumno");

        nuevoAItem1.setText("Nuevo");
        nuevoAItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nuevoAItem1ActionPerformed(evt);
            }
        });
        alumnoMenu.add(nuevoAItem1);
        alumnoMenu.add(jSeparator3);

        editarAItem1.setText("Editar");
        editarAItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editarAItem1ActionPerformed(evt);
            }
        });
        alumnoMenu.add(editarAItem1);
        alumnoMenu.add(jSeparator4);

        eliminarAItem1.setText("Eliminar");
        eliminarAItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarAItem1ActionPerformed(evt);
            }
        });
        alumnoMenu.add(eliminarAItem1);

        MenuBar.add(alumnoMenu);

        profesorMenu.setText("Profesor");
        profesorMenu.add(jSeparator5);

        nuevoPItem2.setText("Nuevo");
        nuevoPItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nuevoPItem2ActionPerformed(evt);
            }
        });
        profesorMenu.add(nuevoPItem2);
        profesorMenu.add(jSeparator6);

        editarPItem2.setText("Editar");
        editarPItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editarPItem2ActionPerformed(evt);
            }
        });
        profesorMenu.add(editarPItem2);
        profesorMenu.add(jSeparator11);

        eliminarPItem2.setText("Eliminar");
        eliminarPItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarPItem2ActionPerformed(evt);
            }
        });
        profesorMenu.add(eliminarPItem2);

        MenuBar.add(profesorMenu);

        aulaMenu.setText("Aula");

        nuevoAuItem3.setText("Nuevo");
        nuevoAuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nuevoAuItem3ActionPerformed(evt);
            }
        });
        aulaMenu.add(nuevoAuItem3);
        aulaMenu.add(jSeparator7);

        editarAuItem3.setText("Editar");
        editarAuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editarAuItem3ActionPerformed(evt);
            }
        });
        aulaMenu.add(editarAuItem3);
        aulaMenu.add(jSeparator8);

        eliminarAuItem3.setText("Eliminar");
        eliminarAuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarAuItem3ActionPerformed(evt);
            }
        });
        aulaMenu.add(eliminarAuItem3);

        MenuBar.add(aulaMenu);

        himnoMenu.setText("Himno");

        nuevoHItem4.setText("Nuevo");
        nuevoHItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nuevoHItem4ActionPerformed(evt);
            }
        });
        himnoMenu.add(nuevoHItem4);
        himnoMenu.add(jSeparator9);

        editarHItem4.setText("Editar");
        editarHItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editarHItem4ActionPerformed(evt);
            }
        });
        himnoMenu.add(editarHItem4);
        himnoMenu.add(jSeparator10);

        eliminarHItem4.setText("Eliminar");
        eliminarHItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarHItem4ActionPerformed(evt);
            }
        });
        himnoMenu.add(eliminarHItem4);

        MenuBar.add(himnoMenu);

        usuarioMenu.setText("Usuario");

        nuevoMenu.setText("Nuevo");
        nuevoMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nuevoMenuActionPerformed(evt);
            }
        });
        usuarioMenu.add(nuevoMenu);
        usuarioMenu.add(jSeparator12);

        editarMenu.setText("Editar");
        editarMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editarMenuActionPerformed(evt);
            }
        });
        usuarioMenu.add(editarMenu);
        usuarioMenu.add(jSeparator13);

        eliminarMenu.setText("Eliminar");
        eliminarMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarMenuActionPerformed(evt);
            }
        });
        usuarioMenu.add(eliminarMenu);

        MenuBar.add(usuarioMenu);

        jMenu7.setText("Temas");

        negro.setText("Balck Moon");
        negro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                negroActionPerformed(evt);
            }
        });
        jMenu7.add(negro);
        jMenu7.add(jSeparator15);

        azul.setText("Blue Ice");
        azul.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                azulActionPerformed(evt);
            }
        });
        jMenu7.add(azul);
        jMenu7.add(jSeparator16);

        verde.setText("Green Dream");
        verde.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                verdeActionPerformed(evt);
            }
        });
        jMenu7.add(verde);
        jMenu7.add(jSeparator17);

        naranja.setText("Orange Metallic");
        naranja.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                naranjaActionPerformed(evt);
            }
        });
        jMenu7.add(naranja);
        jMenu7.add(jSeparator18);

        celeste.setText("Sky Metallic");
        celeste.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                celesteActionPerformed(evt);
            }
        });
        jMenu7.add(celeste);

        MenuBar.add(jMenu7);

        salirMenu.setText("Salir");
        salirMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salirMenuActionPerformed(evt);
            }
        });

        salirItem.setText("Salir");
        salirItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salirItemActionPerformed(evt);
            }
        });
        salirMenu.add(salirItem);

        MenuBar.add(salirMenu);

        setJMenuBar(MenuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 371, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 210, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nuevoEItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nuevoEItemActionPerformed
        Crear_Escuela ce = new Crear_Escuela((Frame) this.getParent(), true, null);
        ce.setVisible(true);
    }//GEN-LAST:event_nuevoEItemActionPerformed

    private void editarEItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editarEItemActionPerformed
        BuscarEscuela e = new BuscarEscuela();
        e.setVisible(true);
    }//GEN-LAST:event_editarEItemActionPerformed

    private void nuevoAItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nuevoAItem1ActionPerformed
        Crear_Alumno ca = new Crear_Alumno((Frame) this.getParent(), true, null);
        ca.setVisible(true);
    }//GEN-LAST:event_nuevoAItem1ActionPerformed

    private void editarAItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editarAItem1ActionPerformed
        BuscarAlumno a = new BuscarAlumno(null, rootPaneCheckingEnabled);
        a.setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_editarAItem1ActionPerformed

    private void eliminarPItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarPItem2ActionPerformed
        BuscarProfesor p = new BuscarProfesor(this, rootPaneCheckingEnabled);
        p.setVisible(true);
    }//GEN-LAST:event_eliminarPItem2ActionPerformed

    private void nuevoPItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nuevoPItem2ActionPerformed
        Crear_Profesor cp = new Crear_Profesor((Frame) this.getParent(), true, null);
        cp.setVisible(true);
    }//GEN-LAST:event_nuevoPItem2ActionPerformed

    private void nuevoAuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nuevoAuItem3ActionPerformed
        Crear_Aula cau = new Crear_Aula((Frame) this.getParent(), true, null);
        cau.setVisible(true);
    }//GEN-LAST:event_nuevoAuItem3ActionPerformed

    private void editarAuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editarAuItem3ActionPerformed
        BuscarAula au = new BuscarAula(this, rootPaneCheckingEnabled);
        au.setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_editarAuItem3ActionPerformed

    private void nuevoHItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nuevoHItem4ActionPerformed
        Crear_Himno ch = new Crear_Himno((Frame) this.getParent(), true, null);
        ch.setVisible(true);
    }//GEN-LAST:event_nuevoHItem4ActionPerformed

    private void editarHItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editarHItem4ActionPerformed
        BuscarHimno h = new BuscarHimno(this, rootPaneCheckingEnabled);
        h.setVisible(true);
    }//GEN-LAST:event_editarHItem4ActionPerformed

    private void salirMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salirMenuActionPerformed

    }//GEN-LAST:event_salirMenuActionPerformed

    private void salirItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salirItemActionPerformed
        int cerrar = JOptionPane.showConfirmDialog(this, "Desea salir de la aplicacion", "advertencia", JOptionPane.YES_NO_OPTION);
        if (cerrar == JOptionPane.YES_OPTION) {
            System.exit(0);
        }
    }//GEN-LAST:event_salirItemActionPerformed

    private void eliminarEItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarEItemActionPerformed
        BuscarEscuela e = new BuscarEscuela();
        e.setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_eliminarEItemActionPerformed

    private void eliminarAItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarAItem1ActionPerformed
        BuscarAlumno a = new BuscarAlumno(this, rootPaneCheckingEnabled);
        a.setVisible(true);       // TODO add your handling code here:
    }//GEN-LAST:event_eliminarAItem1ActionPerformed

    private void editarPItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editarPItem2ActionPerformed
        BuscarProfesor p = new BuscarProfesor(this, rootPaneCheckingEnabled);
        p.setVisible(true);
    }//GEN-LAST:event_editarPItem2ActionPerformed

    private void eliminarAuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarAuItem3ActionPerformed
        BuscarAula au = new BuscarAula(this, rootPaneCheckingEnabled);
        au.setVisible(true);         // TODO add your handling code here:
    }//GEN-LAST:event_eliminarAuItem3ActionPerformed

    private void eliminarHItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarHItem4ActionPerformed
        BuscarHimno h = new BuscarHimno(this, rootPaneCheckingEnabled);
        h.setVisible(true);      // TODO add your handling code here:
    }//GEN-LAST:event_eliminarHItem4ActionPerformed

    private void nuevoMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nuevoMenuActionPerformed
        Crear_Usuario cu = new Crear_Usuario((Frame) this.getParent(), true, null);
        cu.setVisible(true);
    }//GEN-LAST:event_nuevoMenuActionPerformed

    private void editarMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editarMenuActionPerformed
        Buscar_Usuario bu = new Buscar_Usuario(this, rootPaneCheckingEnabled);
        bu.setVisible(true);
    }//GEN-LAST:event_editarMenuActionPerformed

    private void eliminarMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarMenuActionPerformed
        Buscar_Usuario bu = new Buscar_Usuario(this, rootPaneCheckingEnabled);
        bu.setVisible(true);
    }//GEN-LAST:event_eliminarMenuActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        Asignar_escuela bd = new Asignar_escuela(this, rootPaneCheckingEnabled);
        bd.setVisible(true);
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void verdeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_verdeActionPerformed
        try {
            UIManager.setLookAndFeel(new SyntheticaGreenDreamLookAndFeel());
            this.setVisible(false);
            Datos_Escuela p = new Datos_Escuela();
            p.setVisible(true);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error");
            
        }
    }//GEN-LAST:event_verdeActionPerformed

    private void celesteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_celesteActionPerformed
        try {
            UIManager.setLookAndFeel(new SyntheticaSkyMetallicLookAndFeel());
            this.setVisible(false);
            Datos_Escuela p = new Datos_Escuela();
            p.setVisible(true);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error");
            
        }
    }//GEN-LAST:event_celesteActionPerformed

    private void negroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_negroActionPerformed
        try {
            UIManager.setLookAndFeel(new SyntheticaBlackMoonLookAndFeel());
            this.setVisible(false);
            Datos_Escuela p = new Datos_Escuela();
            p.setVisible(true);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error");
        }
    }//GEN-LAST:event_negroActionPerformed

    private void azulActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_azulActionPerformed
        try {
            UIManager.setLookAndFeel(new SyntheticaBlueIceLookAndFeel());
            this.setVisible(false);
            Datos_Escuela p = new Datos_Escuela();
            p.setVisible(true);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error");
            
        }
    }//GEN-LAST:event_azulActionPerformed

    private void naranjaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_naranjaActionPerformed
        try {
            UIManager.setLookAndFeel(new SyntheticaOrangeMetallicLookAndFeel());
            this.setVisible(false);
            Datos_Escuela p = new Datos_Escuela();
            p.setVisible(true);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error");
            
        }
    }//GEN-LAST:event_naranjaActionPerformed

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
        Asignar_alumnos bd = new Asignar_alumnos(this, rootPaneCheckingEnabled);
        bd.setVisible(true);
    }//GEN-LAST:event_jMenuItem6ActionPerformed

    private void jMenuItem8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem8ActionPerformed
        Consultar_Maestros c = new Consultar_Maestros(this, rootPaneCheckingEnabled);
        c.setVisible(true);
    }//GEN-LAST:event_jMenuItem8ActionPerformed

    private void jMenuItem9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem9ActionPerformed
        Consultar_alumnos ca = new Consultar_alumnos(this, rootPaneCheckingEnabled);
        ca.setVisible(true);
    }//GEN-LAST:event_jMenuItem9ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar MenuBar;
    private javax.swing.JMenu alumnoMenu;
    private javax.swing.JMenu asignarMenu;
    private javax.swing.JMenu aulaMenu;
    private javax.swing.JMenuItem azul;
    private javax.swing.JMenuItem celeste;
    private javax.swing.JMenuItem editarAItem1;
    private javax.swing.JMenuItem editarAuItem3;
    private javax.swing.JMenuItem editarEItem;
    private javax.swing.JMenuItem editarHItem4;
    private javax.swing.JMenuItem editarMenu;
    private javax.swing.JMenuItem editarPItem2;
    private javax.swing.JMenuItem eliminarAItem1;
    private javax.swing.JMenuItem eliminarAuItem3;
    private javax.swing.JMenuItem eliminarEItem;
    private javax.swing.JMenuItem eliminarHItem4;
    private javax.swing.JMenuItem eliminarMenu;
    private javax.swing.JMenuItem eliminarPItem2;
    private javax.swing.JMenu himnoMenu;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem1;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JMenuItem jMenuItem9;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator10;
    private javax.swing.JPopupMenu.Separator jSeparator11;
    private javax.swing.JPopupMenu.Separator jSeparator12;
    private javax.swing.JPopupMenu.Separator jSeparator13;
    private javax.swing.JPopupMenu.Separator jSeparator14;
    private javax.swing.JPopupMenu.Separator jSeparator15;
    private javax.swing.JPopupMenu.Separator jSeparator16;
    private javax.swing.JPopupMenu.Separator jSeparator17;
    private javax.swing.JPopupMenu.Separator jSeparator18;
    private javax.swing.JPopupMenu.Separator jSeparator19;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JPopupMenu.Separator jSeparator20;
    private javax.swing.JPopupMenu.Separator jSeparator21;
    private javax.swing.JPopupMenu.Separator jSeparator3;
    private javax.swing.JPopupMenu.Separator jSeparator4;
    private javax.swing.JPopupMenu.Separator jSeparator5;
    private javax.swing.JPopupMenu.Separator jSeparator6;
    private javax.swing.JPopupMenu.Separator jSeparator7;
    private javax.swing.JPopupMenu.Separator jSeparator8;
    private javax.swing.JPopupMenu.Separator jSeparator9;
    private javax.swing.JMenuItem naranja;
    private javax.swing.JMenuItem negro;
    private javax.swing.JMenuItem nuevoAItem1;
    private javax.swing.JMenuItem nuevoAuItem3;
    private javax.swing.JMenuItem nuevoEItem;
    private javax.swing.JMenuItem nuevoHItem4;
    private javax.swing.JMenuItem nuevoMenu;
    private javax.swing.JMenuItem nuevoPItem2;
    private javax.swing.JMenu profesorMenu;
    private javax.swing.JMenuItem salirItem;
    private javax.swing.JMenu salirMenu;
    private javax.swing.JMenu usuarioMenu;
    private javax.swing.JMenuItem verde;
    // End of variables declaration//GEN-END:variables

    /**
     * @return the usuarioMenu
     */
    public javax.swing.JMenu getUsuarioMenu() {
        return usuarioMenu;
    }

    /**
     * @param usuarioMenu the usuarioMenu to set
     */
    public void setUsuarioMenu(javax.swing.JMenu usuarioMenu) {
        this.usuarioMenu = usuarioMenu;
    }
}
