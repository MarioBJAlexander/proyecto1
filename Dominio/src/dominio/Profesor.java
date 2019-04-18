/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dominio;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author Iepiadm
 */
public class Profesor {
    
    private int id_profesor;
    private String nombre;
    private String cargo;
    private String especialidad;
    private String direccion;
    private String telefono;
    private String cedula;
    private Date fechaNacimiento;
    private int id_escuela;
    
    
    private List<Alumno> alumnos;

    public Profesor(){
        alumnos = new ArrayList<>();
    }
    
  
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nom) {
        nombre = nom;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String car) {
        cargo = car;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String esp) {
        especialidad = esp;
    }

    @Override
    public String toString() {
        return nombre + " - " + especialidad;
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
     * @return the telefono
     */
    public String getTelefono() {
        return telefono;
    }

    /**
     * @param telefono the telefono to set
     */
    public void setTelefono(String telefono) {
        this.telefono = telefono;
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
     * @return the id_profesor
     */
    public int getId_profesor() {
        return id_profesor;
    }

    /**
     * @param id_profesor the id_profesor to set
     */
    public void setId_profesor(int id_profesor) {
        this.id_profesor = id_profesor;
    }

    /**
     * @return the id_escuela
     */
    public int getId_escuela() {
        return id_escuela;
    }

    /**
     * @param id_escuela the id_escuela to set
     */
    public void setId_escuela(int id_escuela) {
        this.id_escuela = id_escuela;
    }
    
}
