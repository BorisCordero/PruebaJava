/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cl.duoc.models;

/**
 *
 * @author Cetecom
 */
public class BicicletaElectrica extends Vehiculo implements ICalcular{
    
    //Atributos
    
    private String tipoFreno;
    private int capacidadBateria;
    
    //Constructores

    public BicicletaElectrica() {
    }

    public BicicletaElectrica(String tipoFreno, int capacidadBateria) {
        this.tipoFreno = tipoFreno;
        this.capacidadBateria = capacidadBateria;
    }

    public BicicletaElectrica(String tipoFreno, int capacidadBateria, String idVehiculo, boolean requiereMantenimiento) {
        super(idVehiculo, requiereMantenimiento);
        this.tipoFreno = tipoFreno;
        this.capacidadBateria = capacidadBateria;
    }
    
    //Getters y setters

    public String getTipoFreno() {
        return tipoFreno;
    }

    public void setTipoFreno(String tipoFreno) {
        this.tipoFreno = tipoFreno;
    }

    public int getCapacidadBateria() {
        return capacidadBateria;
    }

    public void setCapacidadBateria(int capacidadBateria) {
        this.capacidadBateria = capacidadBateria;
    }
    
    //Metodos

    @Override
    public String toString() {
        return "BicicletaElectrica{" + "tipoFreno=" + tipoFreno + ", capacidadBateria=" + capacidadBateria + '}';
    }

    @Override
    public void mostrarDatosVehiculo() {
        System.out.println("ID: "+ super.getIdVehiculo()+
                            " CAPACIDAD BATERIA: "+ getCapacidadBateria()+
                            " TIPO DE FRENOS: "+getTipoFreno()+
                            " NECESITA MANTENCION : "+ super.isRequiereMantenimiento());
    }

    @Override
    public void costoFinalAlquiler(int cantidadHoras) {
        double costoAlquiler;
        
        costoAlquiler = cantidadHoras * ICalcular.VALOR_HORA_ALQUILER;
        
        if((this.capacidadBateria) < 20){
            costoAlquiler = costoAlquiler - (costoAlquiler* (5/100));
        }
        
        System.out.println("El costo total del alquiler para el vehiculo es: " + costoAlquiler);
    }
    
    
}