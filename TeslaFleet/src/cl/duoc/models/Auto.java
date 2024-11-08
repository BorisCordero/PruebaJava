/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cl.duoc.models;

/**
 *
 * @author Cetecom
 */
public class Auto extends Vehiculo implements ICalcular{
    
    //Atributos 
    
    private int cantidadPasajeros;
    private boolean autopilot;
    
    //Constructores

    public Auto() {
    }

    public Auto(int cantidadPasajeros, boolean autopilot) {
        this.cantidadPasajeros = cantidadPasajeros;
        this.autopilot = autopilot;
    }

    public Auto(int cantidadPasajeros, boolean autopilot, String idVehiculo, boolean requiereMantenimiento) {
        super(idVehiculo, requiereMantenimiento);
        this.cantidadPasajeros = cantidadPasajeros;
        this.autopilot = autopilot;
    }

    //Getters y setters 

    public int getCantidadPasajeros() {
        return cantidadPasajeros;
    }

    public void setCantidadPasajeros(int cantidadPasajeros) {
        this.cantidadPasajeros = cantidadPasajeros;
    }

    public boolean isAutopilot() {
        return autopilot;
    }

    public void setAutopilot(boolean autopilot) {
        this.autopilot = autopilot;
    }
    
    //Metodos

    @Override
    public String toString() {
        return "Auto{" + "cantidadPasajeros=" + cantidadPasajeros + ", autopilot=" + autopilot + '}';
    }
    
    @Override
    public void mostrarDatosVehiculo() {
        System.out.println("ID: "+ super.getIdVehiculo()+
                            " CANTIDAD PASAJEROS: "+ getCantidadPasajeros()+"%"+
                            " PILOTOD AUTOMATICO: "+ isAutopilot()+
                            " NECESITA MANTENCION : "+ super.isRequiereMantenimiento());        
    }

    @Override
    public void costoFinalAlquiler(int cantidadHoras) {
        
        double costoAlquiler;
        
        costoAlquiler = cantidadHoras * ICalcular.VALOR_HORA_ALQUILER;
        
        if(this.autopilot){
            costoAlquiler = costoAlquiler + (costoAlquiler* (10/100));
        }
        
        System.out.println("El costo total del alquiler para el vehiculo es: " + costoAlquiler);
    }
    
    
    
}
