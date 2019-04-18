/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dominio;

/**
 *
 * @author Iepiadm
 */
public class Himno {
    private int id_himno;
    private String letra;
    private String autorLetra;
    private String autorMusica;
    
    public String getLetra() {
        return letra;
    }

    public void setLetra(String le) {
        letra = le;
    }

    /**
     * @return the autorLetra
     */
    public String getAutorLetra() {
        return autorLetra;
    }

    /**
     * @param autorLetra the autorLetra to set
     */
    public void setAutorLetra(String autorLetra) {
        this.autorLetra = autorLetra;
    }

    /**
     * @return the autorMusica
     */
    public String getAutorMusica() {
        return autorMusica;
    }

    /**
     * @param autorMusica the autorMusica to set
     */
    public void setAutorMusica(String autorMusica) {
        this.autorMusica = autorMusica;
    }

    /**
     * @return the id_himno
     */
    public int getId_himno() {
        return id_himno;
    }

    /**
     * @param id_himno the id_himno to set
     */
    public void setId_himno(int id_himno) {
        this.id_himno = id_himno;
    }
}
