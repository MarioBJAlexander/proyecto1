/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import dao.Escuela_DAO;
import dao.Usuario_DAO;
import dominio.Alumno;
import dominio.Aula;
import dominio.Escuela;
import dominio.Himno;
import dominio.Profesor;
import dominio.Usuario;
import java.util.List;
import static main.Main.main;
import vista.Crear_Alumno;
import vista.Crear_Escuela;
import vista.Datos_Escuela;
import vista.Login;

/**
 *
 * @author Iepiadm
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Usuario_DAO ud = new Usuario_DAO();
        if (ud.existenUsuarios() == false){
            Usuario u = new Usuario();
            u.setNombre("Mario");
            u.setCedula("1752476950");
            u.setUsuario("mario77");
            u.setContraseña("mariito77");
            ud.crearUsuario(u);
            Login l = new Login(null, true);
            l.setVisible(true);
        }

//------------------------------------------------------------------------------
    //Run
//        Datos_Escuela da = new Datos_Escuela();
//        da.setVisible(true);
        Login l = new Login(null, true);
        l.setVisible(true);
    }
    
    public void consultas(){
        //------------------------------------------------------------------------------
        //Escuelas 
        Escuela escuela = new Escuela();
        escuela.setNombre("Estados Unidos De Norte América");
        escuela.setDirección("Villaflora");
        escuela.setTipoEscuela("Fiscal");

        Escuela escuela1 = new Escuela();
        escuela1.setNombre("República Argentina");
        escuela1.setDirección("La Mexico");
        escuela1.setTipoEscuela("Fiscal");

//------------------------------------------------------------------------------
        //Alumnos         
        Alumno alumno = new Alumno();
        alumno.setNombre("Mario");
        alumno.setCurso(7);

        Alumno alumno1 = new Alumno();
        alumno1.setNombre("Juan Alimaña");
        alumno1.setCurso(7);

        Alumno alumno2 = new Alumno();
        alumno2.setNombre("Pedro");
        alumno2.setCurso(7);

        Alumno alumno3 = new Alumno();
        alumno3.setNombre("Juan Perez");
        alumno3.setCurso(7);

        alumno.setEscuela(escuela);

        escuela.getAlumnos().add(alumno);
        escuela.getAlumnos().add(alumno1);
        escuela.getAlumnos().add(alumno2);
        escuela.getAlumnos().add(alumno3);

        Alumno estudiante1 = new Alumno();
        estudiante1.setNombre("Mateo Jarrin");
        estudiante1.setCurso(4);

        Alumno estudiante2 = new Alumno();
        estudiante2.setNombre("Patricio Rocha");
        estudiante2.setCurso(5);

        Alumno estudiante3 = new Alumno();
        estudiante3.setNombre("Jorge Cueva");
        estudiante3.setCurso(6);
        
        Alumno estudiante4 = new Alumno();
        estudiante4.setNombre("maria");
        estudiante4.setCurso(6);

        escuela1.getAlumnos().add(estudiante1);
        escuela1.getAlumnos().add(estudiante2);
        escuela1.getAlumnos().add(estudiante3);

//------------------------------------------------------------------------------
        //Profesores
        Profesor profesor = new Profesor();
        profesor.setNombre("William Mejía");
        profesor.setEspecialidad("Sistemas");
        profesor.setCargo("Maestro");
        profesor.getAlumnos().add(alumno);
        profesor.getAlumnos().add(alumno1);

        Profesor profesor1 = new Profesor();
        profesor1.setNombre("Jorge Barreno");
        profesor1.setEspecialidad("Estudios Sociales");
        profesor1.setCargo("Maestro");
        profesor1.getAlumnos().add(alumno2);
        profesor1.getAlumnos().add(alumno3);

        Profesor profesor2 = new Profesor();
        profesor2.setNombre("Geovanny Pazmiño");
        profesor2.setEspecialidad("Matemáticas");
        profesor2.setCargo("Maestro");
        profesor2.getAlumnos().add(estudiante1);
        profesor2.getAlumnos().add(estudiante2);

        Profesor profesor3 = new Profesor();
        profesor3.setNombre("Carlos Correa");
        profesor3.setEspecialidad("Lengua y Literatura");
        profesor3.setCargo("Maestro");
        profesor3.getAlumnos().add(estudiante3);
        profesor3.getAlumnos().add(estudiante4);

        escuela.getProfesores().add(profesor);
        escuela1.getProfesores().add(profesor1);
        escuela1.getProfesores().add(profesor2);
        escuela1.getProfesores().add(profesor3);

//------------------------------------------------------------------------------
        //Himnos
        Himno himno = new Himno();
        himno.setLetra("Hoy cantemos un himno al colegio, ese templo de luz nuestro hogar");

        escuela.setHimno(himno);

//------------------------------------------------------------------------------
        //Aulas
        Aula aula = new Aula();
        aula.setNumeroSillas(40);
        aula.setNumeroMesas(40);
        aula.setEscritorios(2);
        aula.setNumeroPizarrones(2);

        escuela.getAulas().add(aula);

//------------------------------------------------------------------------------
        //Pruebas
        // Alumno de 4to curso    
        for (int i = 0; i < escuela1.getAlumnos().size(); i++) {
            if ((escuela1.getAlumnos().get(i).getCurso()) == 4) {
                System.out.println("Los alumnos de 4to curso son:  " + escuela1.getAlumnos().get(i).getNombre() + " - " + escuela1.getAlumnos().get(i).getCurso());
                System.out.println("");
            }
        }

        // Profesores de Matemáticas
        for (int i = 0; i < escuela1.getProfesores().size(); i++) {
            if (escuela1.getProfesores().get(i).getEspecialidad().contains("Matemáticas")) {
                System.out.println("El profesor que iparte la materia de matematica es:  " + escuela1.getProfesores().get(i).getNombre() + " - " + escuela1.getProfesores().get(i).getEspecialidad());
                System.out.println("");
            }
        }

        // Profesores de Estudios Sociales
        for (int i = 0; i < escuela1.getProfesores().size(); i++) {
            if (escuela1.getProfesores().get(i).getEspecialidad().contains("Sociales")) {
                System.out.println("El profesor que iparte la materia Estudios Sociales es:  " + escuela1.getProfesores().get(i).getNombre() + " - " + escuela1.getProfesores().get(i).getEspecialidad());
                System.out.println("");
            }
        }

        // Alumnos de un profesor 
        for (int i = 0; i < escuela1.getProfesores().size(); i++) {
            if (escuela1.getProfesores().get(i).getNombre().contains("Carlos")) {
                System.out.println("Los alumnos a cargo del profesor Carlos son:  " + escuela1.getProfesores().get(i).getAlumnos());
                System.out.println("");
            }
        }
    }
}
