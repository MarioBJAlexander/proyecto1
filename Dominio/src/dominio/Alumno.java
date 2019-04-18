/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dominio;


import java.util.Date;
import java.util.List;

/**
 *
 * @author Iepiadm
 */
public class Alumno {
    private int id_alumno;
    private String nombre;
    private int curso;
    private String direccion;
    private String cedula;
    private Date fechaNacimiento;

    private Escuela escuela;
    private List<Profesor> profesores;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String no) {
        nombre = no;
    }

    public int getCurso() {
        return curso;
    }

    public void setCurso(int cur) {
        curso = cur;
    }

    @Override
    public String toString() {
        return nombre + ", " + curso;
    }

    /**
     * @return the escuela
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

    public void setEscuela1(Escuela escuela1) {
        this.escuela = escuela1;
    }

    /**
     * @return the profesores
     */
    public List<Profesor> getProfesores() {
        return profesores;
    }

    /**
     * @param profesores the profesores to set
     */
    public void setProfesores(List<Profesor> profesores) {
        this.profesores = profesores;
    }

    /**
     * @return the direccion
     */
    public String getDireccion() {
        return direccion;
    }

    /**
     * @param direccion the direccion to set
     */
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    /**
     * @return the fechaNacimiento
     */
    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    /**
     * @param fechaNacimiento the fechaNacimiento to set
     */
    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    /**
     * @return the cedula
     */
    public String getCedula() {
        return cedula;
    }

    /**
     * @param cedula the cedula to set
     */
    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    /**
     * @return the id_alumno
     */
    public int getId_alumno() {
        return id_alumno;
    }

    /**
     * @param id_alumno the id_alumno to set
     */
    public void setId_alumno(int id_alumno) {
        this.id_alumno = id_alumno;
    }

}
