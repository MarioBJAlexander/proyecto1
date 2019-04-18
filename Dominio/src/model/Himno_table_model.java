/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;


import dominio.Himno;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Iepiadm
 */
public class Himno_table_model extends AbstractTableModel{
    String titulo[] = {"Letra", "AutorLetra", "AutorMusica"};

    private List<Himno> filas;
    private Himno himno;

    public Himno_table_model(List<Himno> filas) {
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
                return getHimno().getLetra();
            case 1:
                return getHimno().getAutorLetra();
            case 2:
                return getHimno().getAutorMusica();
            
        }
        return null;
    }

    /**
     * @return the filas
     */
    public List<Himno> getFilas() {
        return filas;
    }

    /**
     * @param filas the filas to set
     */
    public void setFilas(List<Himno> filas) {
        this.filas = filas;
    }

    /**
     * @return the persona
     */
    public Himno getHimno() {
        return himno;
    }

    /**
     * @param himno the himno to set
     */
    public void setProfesor(Himno himno) {
        this.himno = himno;
    }
}
