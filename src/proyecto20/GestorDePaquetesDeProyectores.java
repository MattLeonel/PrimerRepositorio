/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto20;

import java.util.ArrayList;

/**
 *
 * @author Punto Digital
 */
public class GestorDePaquetesDeProyectores {
    private ArrayList<PaqueteDeProyectores> paquetes;
    private String nombreEmpresa;
    
    public GestorDePaquetesDeProyectores(String nombre){
        
        this.nombreEmpresa = nombre;
    }

    public String getNombreEmpresa() {
        return nombreEmpresa;
    }

    public void setNombreEmpresa(String nombre) {
        this.nombreEmpresa = nombre;
    }
    
    public void agregarPaquete(PaqueteDeProyectores paqueteNuevo){
    
    
    }
}
