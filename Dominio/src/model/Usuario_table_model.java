/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import dominio.Usuario;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Iepiadm
 */
public class Usuario_table_model extends AbstractTableModel {

    String titulo[] = {"Nombre", "Direccion", "Cedula"};

    private List<Usuario> filas;
    private Usuario usuario;

    public Usuario_table_model(List<Usuario> filas) {
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
        setUsuario(getFilas().get(rowIndex));

        switch (columnIndex) {
            case 0:
                return getUsuario().getNombre();
            case 1:
                return getUsuario().getCedula();
            case 2:
                return getUsuario().getUsuario();
            case 3:
                return getUsuario().getContraseña();
        }
        return null;
    }

    public List<Usuario> getFilas() {
        return filas;
    }

    public void setFilas(List<Usuario> filas) {
        this.filas = filas;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
}
