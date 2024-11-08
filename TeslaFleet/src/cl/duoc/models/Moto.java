/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cl.duoc.models;

/**
 *
 * @author Cetecom
 */
public class Moto extends Vehiculo implements ICalcular{
    
    //Atributos
    
    private int porcentajeBateria;
    private boolean asistenciaModoEco;
    
    //Constructores

    public Moto() {
    }

    public Moto(int porcentajeBateria, boolean asistenciaModoEco) {
        this.porcentajeBateria = porcentajeBateria;
        this.asistenciaModoEco = asistenciaModoEco;
    }

    public Moto(int porcentajeBateria, boolean asistenciaModoEco, String idVehiculo, boolean requiereMantenimiento) {
        super(idVehiculo, requiereMantenimiento);
        this.porcentajeBateria = porcentajeBateria;
        this.asistenciaModoEco = asistenciaModoEco;
    }
    
    //Getters y setters 

    public int getPorcentajeBateria() {
        return porcentajeBateria;
    }

    public void setPorcentajeBateria(int porcentajeBateria) {
        this.porcentajeBateria = porcentajeBateria;
    }

    public boolean isAsistenciaModoEco() {
        return asistenciaModoEco;
    }

    public void setAsistenciaModoEco(boolean asistenciaModoEco) {
        this.asistenciaModoEco = asistenciaModoEco;
    }
    
    //Metodos

    @Override
    public String toString() {
        return "Moto{" + "porcentajeBateria=" + porcentajeBateria + ", asistenciaModoEco=" + asistenciaModoEco + '}';
    }

    @Override
    public void mostrarDatosVehiculo() {
        System.out.println("ID: "+ super.getIdVehiculo()+
                            " PORCENTAJE BATERIA: "+ getPorcentajeBateria()+"%"+
                            " ASISTENCIA MODO ECO: "+ isAsistenciaModoEco() +
                            " NECESITA MANTENCION : "+ super.isRequiereMantenimiento());        
    }

    @Override
    public void costoFinalAlquiler(int cantidadHoras) {
        double costoAlquiler;
        
        costoAlquiler = cantidadHoras * ICalcular.VALOR_HORA_ALQUILER;
        
        
        //No supe hacer esto xd
//        if((this.asistenciaModoEco) > cantidadHoras/2){
//            costoAlquiler = costoAlquiler + (costoAlquiler * 8/100);
//        }
        
        System.out.println("El costo total del alquiler para el vehiculo es: " + costoAlquiler);
    }
    
    
    
}
