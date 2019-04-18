/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import dominio.Usuario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import vista.Crear_Usuario;
import vista.Login;

/**
 *
 * @author Iepiadm
 */
public class Usuario_DAO {

    public boolean crearUsuario(Usuario usuario) {
        Crear_Usuario cu = new Crear_Usuario(null, true, usuario);
        String c = cu.combo();
        Connection con = Conexion.conectarBD();
        String sql = "INSERT INTO usuario VALUES (0, '" + usuario.getNombre() + "', '" + usuario.getCedula() + "', '" + usuario.getUsuario() + "', '" + usuario.getContraseña() + "', roles='" + c + "');";
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
            System.out.println("No se pudo crear el usuario: " + ex);
        }
        return false;
    }

    public List<Usuario> buscarUsuario(String texto) {
        Connection con = Conexion.conectarBD();
        String sql = "SELECT * FROM usuario";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            List<Usuario> usu = new ArrayList<Usuario>();
            while (rs.next()) {
                Usuario us = new Usuario();
                us.setId_usuario(rs.getInt("id_usuario"));
                us.setNombre(rs.getString("nombre"));
                us.setCedula(rs.getString("cedula"));
                us.setUsuario(rs.getString("username"));
                us.setContraseña(rs.getString("password"));
                us.setRoles(rs.getString("roles"));
                usu.add(us);
            }
            con.close();

            return usu;

        } catch (SQLException ex) {
            return new ArrayList<Usuario>();
        }
    }

    public boolean editarUsuario(Usuario usuario) {
        Connection con = Conexion.conectarBD();
        String sql = "UPDATE usuario SET nombre='" + usuario.getNombre() + "' , cedula='" + usuario.getCedula() + "', username='" + usuario.getUsuario() + "', password='" + usuario.getContraseña() + "', roles='" + usuario.getRoles() + "' WHERE id_usuario=" + usuario.getId_usuario() + "";
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
            System.out.println("No se pudo editar el usuario: " + ex);
        }
        return false;
    }

    public boolean eliminarUsuario(Usuario usuario) {
        Connection con = Conexion.conectarBD();
        String sql = "DELETE FROM usuario WHERE id_usuario=" + usuario.getId_usuario() + "";
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
            System.out.println("No se pudo eliminar el usuario: " + ex);
        }
        return false;
    }

    public boolean existenUsuarios() {
        Connection con = Conexion.conectarBD();
        String sql = "SELECT * FROM usuario";
        boolean a = false;
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                a = true;
            }
        } catch (Exception e) {
            System.out.println("Error:" + e);
        }
        return a;
    }
}
