/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dominio;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author Iepiadm
 */
public class Escuela {
    //atributos

    private String nombre;
    private String direccion;
    private String tipoEscuela;
    private int idEscuela;

    private List<Alumno> alumnos;
    private List<Profesor> profesores;
    private List<Aula> aulas;
    private Himno himno;

    public Escuela() {
        alumnos = new ArrayList<>();
        profesores = new ArrayList<>();
        aulas = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDirección() {
        return direccion;
    }

    public void setDirección(String dir) {
        direccion = dir;
    }

    public String getTipoEscuela() {
        return tipoEscuela;
    }

    public void setTipoEscuela(String tipo) {
        tipoEscuela = tipo;
    }

    /**
     * @return the alumnos
     */
    public List<Alumno> getAlumnos() {
        return alumnos;
    }

    /**
     * @param alumnos the alumnos to set
     */
    public void setAlumnos(List<Alumno> alumnos) {
        this.alumnos = alumnos;
    }

    public void setProfesores(List<Profesor> profesores) {
        this.profesores = profesores;
    }

    public void setAulas(List<Aula> aulas) {
        this.aulas = aulas;
    }

    /**
     * @return the profesores
     */
    public List<Profesor> getProfesores() {
        return profesores;
    }

    /**
     * @return the aulas
     */
    public List<Aula> getAulas() {
        return aulas;
    }

    /**
     * @return the himno
     */
    public Himno getHimno() {
        return himno;
    }

    /**
     * @param himno the himno to set
     */
    public void setHimno(Himno himno) {
        this.himno = himno;
    }

    public String toString() {
        return nombre + "-" + direccion;
    }

    /**
     * @return the idEscuela
     */
    public int getIdEscuela() {
        return idEscuela;
    }

    /**
     * @param idEscuela the idEscuela to set
     */
    public void setIdEscuela(int idEscuela) {
        this.idEscuela = idEscuela;
    }

}
