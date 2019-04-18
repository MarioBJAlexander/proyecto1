/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import dominio.Profesor;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Iepiadm
 */
public class Profesor_table_model extends AbstractTableModel{
    String titulo[] = {"Nombre", "Cargo", "Especialidad", "Dirección", "Telefono","Cédula", "FechaNacimiento","id_escuela"};

    private List<Profesor> filas;
    private Profesor profesor;

    public Profesor_table_model(List<Profesor> filas) {
        this.filas = filas;
    }

    @Override
    public int getRowCount() {
        return getFilas() != null ? getFilas().size() : 0;
    }

    @Override
    public int getColumnCount() {
        return titulo.length;
    }

    @Override
    public String getColumnName(int column) {
        return titulo[column];
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        setProfesor(getFilas().get(rowIndex));

        switch (columnIndex) {
            case 0:
                return getProfesor().getNombre();
            case 1:
                return getProfesor().getCargo();
            case 2:
                return getProfesor().getEspecialidad();
            case 3:                
                return getProfesor().getDireccion();
            case 4:
                return getProfesor().getTelefono();
            case 5:
                return getProfesor().getCedula();
            case 6:
                return getProfesor().getFechaNacimiento();
            case 7:
                return getProfesor().getId_escuela();
        }
        return null;
    }

    /**
     * @return the filas
     */
    public List<Profesor> getFilas() {
        return filas;
    }

    /**
     * @param filas the filas to set
     */
    public void setFilas(List<Profesor> filas) {
        this.filas = filas;
    }

    /**
     * @return the persona
     */
    public Profesor getProfesor() {
        return profesor;
    }

    /**
     * @param profesor the profesor to set
     */
    public void setProfesor(Profesor profesor) {
        this.profesor = profesor;
    }
}
