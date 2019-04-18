/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Iepiadm
 */

import dominio.Escuela;
import java.util.List;
import javax.swing.AbstractListModel;
import javax.swing.ComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JFrame;

public class Escuela_combo_model extends AbstractListModel implements ComboBoxModel {
//  String[] ComputerComps = { "Nombre:"};
  private List<Escuela> escuelas;    

  Escuela selection;
  public Escuela_combo_model(List<Escuela> es){
      escuelas = es;
  }

  @Override
  public Object getElementAt(int index) {
    return escuelas.get(index);
  }

  @Override
  public int getSize() {
    return escuelas.size();
  }

  public void setSelectedItem(Object anItem) {
    selection = (Escuela) anItem; // to select and register an
    
  } // item from the pull-down list

  // Methods implemented from the interface ComboBoxModel
  @Override
  public Escuela getSelectedItem() {
    return selection; // to add the selection to the combo box
  }
}