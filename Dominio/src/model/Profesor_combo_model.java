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

import dominio.Profesor;
import java.util.List;
import javax.swing.AbstractListModel;
import javax.swing.ComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JFrame;

public class Profesor_combo_model extends AbstractListModel implements ComboBoxModel {

  private List<Profesor> profesor;    

  Profesor selection;
  public Profesor_combo_model(List<Profesor> profe){
      profesor = profe;
  }

  @Override
  public Object getElementAt(int index) {
    return profesor.get(index);
  }

  @Override
  public int getSize() {
    return profesor.size();
  }

  public void setSelectedItem(Object anItem) {
    selection = (Profesor) anItem; // to select and register an
    
  } // item from the pull-down list

  // Methods implemented from the interface ComboBoxModel
  @Override
  public Profesor getSelectedItem() {
    return selection; // to add the selection to the combo box
  }
}
