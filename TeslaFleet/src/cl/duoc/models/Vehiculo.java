/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cl.duoc.models;

/**
 *
 * @author Cetecom
 */
public abstract class Vehiculo {
    
    //Atributos
    
    private String idVehiculo;
    private boolean requiereMantenimiento;

    //Constructores
    
    public Vehiculo() {
    }

    public Vehiculo(String idVehiculo, boolean requiereMantenimiento) {
        this.idVehiculo = idVehiculo;
        this.requiereMantenimiento = requiereMantenimiento;
    }
    
    //Getters y setters 

    public String getIdVehiculo() {
        return idVehiculo;
    }

    public void setIdVehiculo(String idVehiculo) {
        this.idVehiculo = idVehiculo;
    }

    public boolean isRequiereMantenimiento() {
        return requiereMantenimiento;
    }

    public void setRequiereMantenimiento(boolean requiereMantenimiento) {
        this.requiereMantenimiento = requiereMantenimiento;
    }
    
    //Metodos

    @Override
    public String toString() {
        return "Vehiculo{" + "idVehiculo=" + idVehiculo + ", requiereMantenimiento=" + requiereMantenimiento + '}';
    }
    
    public abstract void mostrarDatosVehiculo();    
    
}
