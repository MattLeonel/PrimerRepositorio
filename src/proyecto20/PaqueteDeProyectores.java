/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto20;

/**
 *
 * @author Punto Digital
 */
public class PaqueteDeProyectores {
    private int codPaqueteDeProyectores;
    private String destinatario;
    private String destino;
    private float costoEnvio;
    private boolean enTransito;
    
    public PaqueteDeProyectores(int codPaqueteDeProyectores,String destinatario,String destino,float costoEnvio){
    
        this.codPaqueteDeProyectores = codPaqueteDeProyectores;
        this.costoEnvio = costoEnvio;
        this.destinatario = destinatario;
        this.destino = destino;
    }

    public int getCodPaquete() {
        return codPaqueteDeProyectores;
    }

    public void setCodPaquete(int cod) {
        this.codPaqueteDeProyectores = cod;
    }

    public boolean isEnTransito() {
        return enTransito;
    }

    public void setEnTransito(boolean enTransito) {
        this.enTransito = enTransito;
    }

    public void setDestinatario(String destinatario) {
        this.destinatario = destinatario;
    }
    
    
    
}
