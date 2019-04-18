/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;


import dominio.Aula;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Iepiadm
 */
public class Aula_table_model extends AbstractTableModel{
    String titulo[] = {"NumeroSillas", "NumeroMesas", "NumeroEscritorios", "NumeroPizarrones"};

    private List<Aula> filas;
    private Aula aula;

    public Aula_table_model(List<Aula> filas) {
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
                return getAula().getNumeroSillas();
            case 1:
                return getAula().getNumeroMesas();
            case 2:
                return getAula().getNumeroEscritorios();
            case 3:                
                return getAula().getNumeroPizarrones();
            
        }
        return null;
    }

    /**
     * @return the filas
     */
    public List<Aula> getFilas() {
        return filas;
    }

    /**
     * @param filas the filas to set
     */
    public void setFilas(List<Aula> filas) {
        this.filas = filas;
    }

    /**
     * @return the persona
     */
    public Aula getAula() {
        return aula;
    }

    /**
     * @param aula the aula to set
     */
    public void setProfesor(Aula aula) {
        this.aula = aula;
    }
}
