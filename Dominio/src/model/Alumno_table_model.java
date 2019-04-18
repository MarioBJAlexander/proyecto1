/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import dominio.Alumno;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Iepiadm
 */
public class Alumno_table_model extends AbstractTableModel {

    String titulo[] = {"Nombre", "Direccion", "Cedula"};

    private List<Alumno> filas;
    private Alumno alumno;

    public Alumno_table_model(List<Alumno> filas) {
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
        setAlumno(getFilas().get(rowIndex));

        switch (columnIndex) {
            case 0:
                return getAlumno().getNombre();
            case 1:
                return getAlumno().getDireccion();
            case 2:
                return getAlumno().getCedula();
        }
        return null;
    }

    public List<Alumno> getFilas() {
        return filas;
    }

    public void setFilas(List<Alumno> filas) {
        this.filas = filas;
    }

    public Alumno getAlumno() {
        return alumno;
    }

    public void setAlumno(Alumno alumno) {
        this.alumno = alumno;
    }
}
