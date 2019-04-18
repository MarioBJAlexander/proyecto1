/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import dominio.Escuela;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Iepiadm
 */
public class Escuela_table_model extends AbstractTableModel {

    String titulo[] = {"Nombre", "Dirección", "Tipo_escuela"};

    private List<Escuela> filas;
    private Escuela escuela;

    public Escuela_table_model(List<Escuela> filas) {
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
        setEscuela(getFilas().get(rowIndex));

        switch (columnIndex) {
            case 0:
                return getEscuela().getNombre();
            case 1:
                return getEscuela().getDirección();
            case 2:
                return getEscuela().getTipoEscuela();
        }
        return null;
    }

    /**
     * @return the filas
     */
    public List<Escuela> getFilas() {
        return filas;
    }

    /**
     * @param filas the filas to set
     */
    public void setFilas(List<Escuela> filas) {
        this.filas = filas;
    }

    /**
     * @return the persona
     */
    public Escuela getEscuela() {
        return escuela;
    }

    /**
     * @param escuela the escuela to set
     */
    public void setEscuela(Escuela escuela) {
        this.escuela = escuela;
    }

}
