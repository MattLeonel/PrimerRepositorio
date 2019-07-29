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

    public GestorDePaquetesDeProyectores(String nombre) {
        paquetes = new ArrayList<>();
        this.nombreEmpresa = nombre;
    }

    public String getNombreEmpresa() {
        return nombreEmpresa;
    }

    public void setNombreEmpresa(String nombre) {
        this.nombreEmpresa = nombre;
    }

    public void agregarPaquete(PaqueteDeProyectores paqueteNuevo) {

    }

    int buscarPaqueteDeProyectores(int codPaq) {
        for (int i = 0; i <= paquetes.size(); i++) {
            if (paquetes.get(i).getCodPaquete() == codPaq) {
                return paquetes.get(i).getCodPaquete();
            }
        }
        return 0;

    }
}
