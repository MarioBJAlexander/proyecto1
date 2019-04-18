package dao;

import dominio.Alumno;
import dominio.Aula;
import dominio.Escuela;
import dominio.Himno;
import dominio.Profesor;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import vista.BuscarEscuela;
import vista.Asignar_escuela;

public class Escuela_DAO {

//------------------------------------------------------------------------------
    // CREAR
    public boolean crearEscuela(Escuela escuela) {
        Connection con = Conexion.conectarBD();
        String sql = "INSERT INTO escuela VALUES (0, '" + escuela.getNombre() + "', '" + escuela.getDirección() + "', '" + escuela.getTipoEscuela() + "');";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            int n = ps.executeUpdate();

            con.close();

            if (n == 1) {
                return true;
            } else {
                return false;
            }

        } catch (SQLException ex) {
            System.out.println("No se pudo crear la escuela: " + ex);
        }
        return false;
    }

    public boolean crearAlumno(Alumno alumno) {
        Date fn = alumno.getFechaNacimiento();
        String y = Integer.toString(fn.getYear() + 1900);
        String m = Integer.toString(fn.getMonth() + 1);
        String d = Integer.toString(fn.getDate());

        String fecha = y + "-" + m + "-" + d;

        Connection con = Conexion.conectarBD();
        String sql = "INSERT INTO alumnos VALUES (0, '" + alumno.getNombre() + "'," + alumno.getCurso() + " , '" + alumno.getDireccion() + "'," + alumno.getCedula() + ",'" + fecha + "')";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            int n = ps.executeUpdate();
            con.close();
            if (n == 1) {
                return true;
            } else {
                return false;
            }

        } catch (SQLException ex) {
            System.out.println("No se pudo crear al alumno: " + ex);
        }
        return false;
    }

    public boolean crearProfesor(Profesor profesor) {
        Date fn = profesor.getFechaNacimiento();
        String y = Integer.toString(fn.getYear() + 1900);
        String m = Integer.toString(fn.getMonth() + 1);
        String d = Integer.toString(fn.getDate());

        String f = y + "-" + m + "-" + d;

        Connection con = Conexion.conectarBD();
        String sql = "INSERT INTO profesor VALUES (0, '" + profesor.getNombre() + "', '" + profesor.getCargo() + "', '" + profesor.getEspecialidad() + "', '" + profesor.getDireccion() + "', '" + profesor.getTelefono() + "', '" + profesor.getCedula() + "', '" + f + "')";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            int n = ps.executeUpdate();
            con.close();
            if (n == 1) {
                return true;
            } else {
                return false;
            }

        } catch (SQLException ex) {
            System.out.println("No se pudo crear al Profesor: " + ex);
        }
        return false;
    }

    public boolean crearAula(Aula aula) {

        Connection con = Conexion.conectarBD();
        String sql = "INSERT INTO aula VALUES (0, " + aula.getNumeroSillas() + ", " + aula.getNumeroMesas() + ", " + aula.getNumeroEscritorios() + ", " + aula.getNumeroPizarrones() + ")";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            int n = ps.executeUpdate();
            con.close();
            if (n == 1) {
                return true;
            } else {
                return false;
            }

        } catch (SQLException ex) {
            System.out.println("No se pudo crear el Aula: " + ex);
        }
        return false;
    }

    public boolean crearHimno(Himno himno) {

        Connection con = Conexion.conectarBD();
        String sql = "INSERT INTO himno VALUES (0, '" + himno.getLetra() + "', '" + himno.getAutorLetra() + "', '" + himno.getAutorMusica() + "')";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            int n = ps.executeUpdate();
            con.close();
            if (n == 1) {
                return true;
            } else {
                return false;
            }

        } catch (SQLException ex) {
            System.out.println("No se pudo crear el Himno: " + ex);
        }
        return false;
    }

//------------------------------------------------------------------------------
    // BUSCAR
    public List<Escuela> buscarEscuela(String texto) {
        Connection con = Conexion.conectarBD();
        String sql = "SELECT * FROM escuela where nombre like '%" + texto + "%'";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            List<Escuela> escu = new ArrayList<Escuela>();
            while (rs.next()) {
                Escuela esc = new Escuela();
                esc.setIdEscuela(rs.getInt("id_escuela"));
                esc.setNombre(rs.getString("nombre"));
                esc.setDirección(rs.getString("direccion"));
                esc.setTipoEscuela(rs.getString("tipoEscuela"));
                escu.add(esc);
            }
            con.close();

            return escu;

        } catch (SQLException ex) {
            return new ArrayList<Escuela>();
        }
    }

    public List<Alumno> buscarAlumno(String texto) {
        Connection con = Conexion.conectarBD();
        String sql = "SELECT * FROM alumnos where nombre like '%" + texto + "%'";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            List<Alumno> alum = new ArrayList<Alumno>();
            while (rs.next()) {
                Alumno al = new Alumno();
                al.setId_alumno(rs.getInt("id_alumno"));
                al.setNombre(rs.getString("nombre"));
                al.setCurso(rs.getInt("curso"));
                al.setDireccion(rs.getString("direccion"));
                al.setCedula(rs.getString("cedula"));
                al.setFechaNacimiento(rs.getDate("fecha_nacimiento"));
                alum.add(al);
            }
            con.close();

            return alum;

        } catch (SQLException ex) {
            System.out.println("Error al buscar: " + ex);
            return new ArrayList<Alumno>();
        }
    }

    public List<Profesor> buscarProfesor(String texto) {
        Connection con = Conexion.conectarBD();
        String sql = "SELECT * FROM profesor where nombre like '%" + texto + "%'";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            List<Profesor> pro = new ArrayList<Profesor>();
            while (rs.next()) {
                Profesor p = new Profesor();
                p.setId_profesor(rs.getInt("id_profesor"));
                p.setNombre(rs.getString("nombre"));
                p.setCargo(rs.getString("cargo"));
                p.setEspecialidad(rs.getString("especialidad"));
                p.setDireccion(rs.getString("direccion"));
                p.setTelefono(rs.getString("telefono"));
                p.setCedula(rs.getString("cedula"));
                p.setFechaNacimiento(rs.getDate("fecha_nacimiento"));
                p.setId_escuela(rs.getInt("id_escuela"));

                pro.add(p);
            }
            con.close();

            return pro;

        } catch (SQLException ex) {
            System.out.println("Error al buscar: " + ex);
            return new ArrayList<Profesor>();
        }
    }

    public List<Aula> buscarAula(int n) {
        Connection con = Conexion.conectarBD();
        String sql = "SELECT * FROM aula WHERE numeroSillas like '%" + n + "%'";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            List<Aula> aul = new ArrayList<Aula>();
            while (rs.next()) {
                Aula au = new Aula();
                au.setId_aula(rs.getInt("id_aula"));
                au.setNumeroSillas(rs.getInt("numeroSillas"));
                au.setNumeroMesas(rs.getInt("numeroMesas"));
                au.setEscritorios(rs.getInt("numeroEscritorios"));
                au.setNumeroPizarrones(rs.getInt("numeroPizarrones"));

                aul.add(au);
            }
            con.close();

            return aul;

        } catch (SQLException ex) {
            System.out.println("Error al buscar: " + ex);
            return new ArrayList<Aula>();
        }
    }

    public List<Himno> buscarHimno(String texto) {
        Connection con = Conexion.conectarBD();
        String sql = "SELECT * FROM himno where letra like '%" + texto + "%'";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            List<Himno> him = new ArrayList<Himno>();
            while (rs.next()) {
                Himno h = new Himno();
                h.setId_himno(rs.getInt("id_himno"));
                h.setLetra(rs.getString("Letra"));
                h.setAutorLetra(rs.getString("autorLetra"));
                h.setAutorMusica(rs.getString("autorMusica"));

                him.add(h);
            }
            con.close();

            return him;

        } catch (SQLException ex) {
            System.out.println("Error al buscar: " + ex);
            return new ArrayList<Himno>();
        }
    }

//------------------------------------------------------------------------------
    // EDITAR 
    public boolean editarEscuela(Escuela escuela) {
        Connection con = Conexion.conectarBD();
        String sql = "UPDATE escuela SET nombre='" + escuela.getNombre() + "' , direccion='" + escuela.getDirección() + "', tipoEscuela='" + escuela.getTipoEscuela() + "' WHERE id_escuela=" + escuela.getIdEscuela() + "";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            int n = ps.executeUpdate();

            con.close();

            if (n == 1) {
                return true;
            } else {
                return false;
            }

        } catch (SQLException ex) {
            System.out.println("No se pudo editar la escuela: " + ex);
        }
        return false;
    }

    public boolean editarAlumno(Alumno alumno) {
        Date fn = alumno.getFechaNacimiento();
        String y = Integer.toString(fn.getYear() + 1900);
        String m = Integer.toString(fn.getMonth() + 1);
        String d = Integer.toString(fn.getDate());
        String fe = y + "-" + m + "-" + d;
        Connection con = Conexion.conectarBD();
        String sql = "UPDATE alumnos SET nombre='" + alumno.getNombre() + "' , curso=" + alumno.getCurso() + ", direccion='" + alumno.getDireccion() + "', cedula='" + alumno.getCedula() + "', fecha_nacimiento='" + fe + "' WHERE id_alumno=" + alumno.getId_alumno() + "";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            int n = ps.executeUpdate();

            con.close();

            if (n == 1) {
                return true;
            } else {
                return false;
            }

        } catch (SQLException ex) {
            System.out.println("No se pudo editar al alumno: " + ex);
        }
        return false;
    }

    public boolean editarHimno(Himno himno) {
        Connection con = Conexion.conectarBD();
        String sql = "UPDATE himno SET letra='" + himno.getLetra() + "' , autorLetra='" + himno.getAutorLetra() + "', autorMusica='" + himno.getAutorMusica() + "' WHERE id_himno=" + himno.getId_himno() + "";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            int n = ps.executeUpdate();

            con.close();

            if (n == 1) {
                return true;
            } else {
                return false;
            }

        } catch (SQLException ex) {
            System.out.println("No se pudo editar al alumno: " + ex);
        }
        return false;
    }

    public boolean editarAula(Aula aula) {
        Connection con = Conexion.conectarBD();
        String sql = "UPDATE aula SET numeroSillas=" + aula.getNumeroSillas() + " , numeroMesas=" + aula.getNumeroMesas() + ", numeroEscritorios=" + aula.getNumeroEscritorios() + ", numeroPizarrones=" + aula.getNumeroPizarrones() + " WHERE id_aula=" + aula.getId_aula() + "";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            int n = ps.executeUpdate();

            con.close();

            if (n == 1) {
                return true;
            } else {
                return false;
            }

        } catch (SQLException ex) {
            System.out.println("No se pudo editar al alumno: " + ex);
        }
        return false;
    }

    public boolean editarProfesor(Profesor profesor) {
        Date fn = profesor.getFechaNacimiento();
        String y = Integer.toString(fn.getYear() + 1900);
        String m = Integer.toString(fn.getMonth() + 1);
        String d = Integer.toString(fn.getDate());
        String f = y + "-" + m + "-" + d;
        Connection con = Conexion.conectarBD();
        String sql = "UPDATE profesor SET nombre='" + profesor.getNombre() + "' , cargo='" + profesor.getCargo() + "', especialidad='" + profesor.getEspecialidad() + "', direccion='" + profesor.getDireccion() + "', telefono='" + profesor.getTelefono() + "', cedula='" + profesor.getCedula() + "', fecha_nacimiento='" + f + "' WHERE id_profesor=" + profesor.getId_profesor() + "";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            int n = ps.executeUpdate();

            con.close();

            if (n == 1) {
                return true;
            } else {
                return false;
            }

        } catch (SQLException ex) {
            System.out.println("No se pudo editar al alumno: " + ex);
        }
        return false;
    }

//------------------------------------------------------------------------------
    // Eliminar
    public boolean eliminarEscuela(Escuela escuela) {
        Connection con = Conexion.conectarBD();
        String sql = "DELETE FROM escuela WHERE id_escuela=" + escuela.getIdEscuela() + "";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            int n = ps.executeUpdate();

            con.close();

            if (n == 1) {
                return true;
            } else {
                return false;
            }

        } catch (SQLException ex) {
            System.out.println("No se pudo eliminar la escuela: " + ex);
        }
        return false;
    }

    public boolean eliminarAlumno(Alumno alumno) {
        Connection con = Conexion.conectarBD();
        String sql = "DELETE FROM alumnos WHERE id_alumno=" + alumno.getId_alumno() + "";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            int n = ps.executeUpdate();

            con.close();

            if (n == 1) {
                return true;
            } else {
                return false;
            }

        } catch (SQLException ex) {
            System.out.println("No se pudo eliminar al alumno: " + ex);
        }
        return false;
    }

    public boolean eliminarHimno(Himno himno) {
        Connection con = Conexion.conectarBD();
        String sql = "DELETE FROM himno WHERE id_himno=" + himno.getId_himno() + "";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            int n = ps.executeUpdate();

            con.close();

            if (n == 1) {
                return true;
            } else {
                return false;
            }

        } catch (SQLException ex) {
            System.out.println("No se pudo eliminar el himno: " + ex);
        }
        return false;
    }

    public boolean eliminarAula(Aula aula) {
        Connection con = Conexion.conectarBD();
        String sql = "DELETE FROM aula WHERE id_aula=" + aula.getId_aula() + "";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            int n = ps.executeUpdate();

            con.close();

            if (n == 1) {
                return true;
            } else {
                return false;
            }

        } catch (SQLException ex) {
            System.out.println("No se pudo eliminar el aula: " + ex);
        }
        return false;
    }

    public boolean eliminarProfesor(Profesor profesor) {
        Connection con = Conexion.conectarBD();
        String sql = "DELETE FROM profesor WHERE id_profesor=" + profesor.getId_profesor() + "";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            int n = ps.executeUpdate();

            con.close();

            if (n == 1) {
                return true;
            } else {
                return false;
            }

        } catch (SQLException ex) {
            System.out.println("No se pudo eliminar al profeosr: " + ex);
        }
        return false;
    }

//------------------------------------------------------------------------------
    // Foreing Key
    public boolean editarId_Profesor(int id_profesor, int id_escuela) {
        Connection con = Conexion.conectarBD();
        String sql = "UPDATE profesor SET id_escuela=" + id_escuela + " WHERE id_profesor=" + id_profesor + "";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            int n = ps.executeUpdate();

            con.close();

            if (n == 1) {
                return true;
            } else {
                return false;
            }

        } catch (SQLException ex) {
            System.out.println("No se pudo editar al alumno: " + ex);
        }
        return false;
    }

    public boolean editarId_Alumnos(int id_profesor, int id_alumno) {
        Connection con = Conexion.conectarBD();
        String sql = "UPDATE alumnos SET id_profesor=" + id_profesor + " WHERE id_alumno=" + id_alumno + "";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            int n = ps.executeUpdate();

            con.close();

            if (n == 1) {
                return true;
            } else {
                return false;
            }

        } catch (SQLException ex) {
            System.out.println("No se pudo editar al alumno: " + ex);
        }
        return false;
    }

//------------------------------------------------------------------------------
    // Buscar con el foreing key
    public List<Profesor> buscarProfe(int texto) {
        Connection con = Conexion.conectarBD();
        String sql = "SELECT * FROM profesor WHERE id_escuela=" + texto + "";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            List<Profesor> pro = new ArrayList<Profesor>();
            while (rs.next()) {
                Profesor p = new Profesor();
                p.setId_profesor(rs.getInt("id_profesor"));
                p.setNombre(rs.getString("nombre"));
                p.setCargo(rs.getString("cargo"));
                p.setEspecialidad(rs.getString("especialidad"));
                p.setDireccion(rs.getString("direccion"));
                p.setTelefono(rs.getString("telefono"));
                p.setCedula(rs.getString("cedula"));
                p.setFechaNacimiento(rs.getDate("fecha_nacimiento"));
                p.setId_escuela(rs.getInt("id_escuela"));

                pro.add(p);
            }
            con.close();

            return pro;

        } catch (SQLException ex) {
            System.out.println("Error al buscar: " + ex);
            return new ArrayList<Profesor>();
        }
    }

    public List<Alumno> buscarAlum(int texto) {
        Connection con = Conexion.conectarBD();
        String sql = "SELECT * FROM alumnos WHERE id_profesor=" + texto + "";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            List<Alumno> alum = new ArrayList<Alumno>();
            while (rs.next()) {
                Alumno al = new Alumno();
                al.setId_alumno(rs.getInt("id_alumno"));
                al.setNombre(rs.getString("nombre"));
                al.setCurso(rs.getInt("curso"));
                al.setDireccion(rs.getString("direccion"));
                al.setCedula(rs.getString("cedula"));
                al.setFechaNacimiento(rs.getDate("fecha_nacimiento"));
                alum.add(al);
            }
            con.close();

            return alum;

        } catch (SQLException ex) {
            System.out.println("Error al buscar: " + ex);
            return new ArrayList<Alumno>();
        }
    }
}
