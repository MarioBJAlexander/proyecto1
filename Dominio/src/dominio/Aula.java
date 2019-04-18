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
public class Aula {
    private int id_aula;
    private int numeroSillas;
    private int numeroMesas;
    private int numeroEscritorios;
    private int numeroPizarrones;  
    
    public int getNumeroSillas() {
        return numeroSillas;
    }

    public void setNumeroSillas(int si) {
        numeroSillas = si;
    }

    public int getNumeroMesas() {
        return numeroMesas;
    }

    public void setNumeroMesas(int me) {
        numeroMesas = me;
    }

    public int getNumeroEscritorios() {
        return numeroEscritorios;
    }

    public void setEscritorios(int es) {
        numeroEscritorios = es;
    }
    
    public int getNumeroPizarrones() {
        return numeroPizarrones;
    }

    public void setNumeroPizarrones(int piz) {
        numeroPizarrones = piz;
    }

    /**
     * @return the id_aula
     */
    public int getId_aula() {
        return id_aula;
    }

    /**
     * @param id_aula the id_aula to set
     */
    public void setId_aula(int id_aula) {
        this.id_aula = id_aula;
    }
}
