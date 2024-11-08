/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cl.duoc.models;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Cetecom
 */
public class AdministrarFlota {
    
    private List<Vehiculo> listaVehiculos = new ArrayList<>();
    
    //Constructor

    public AdministrarFlota() {
    }
    
    //Metodos

    @Override
    public String toString() {
        return "AdministrarFlota{" + "listaVehiculos=" + listaVehiculos + '}';
    }
    
    
    public void agregarAuto(Auto parAuto){
        listaVehiculos.add(parAuto);
        System.out.println("Auto agregado correctamente.");
    }
    
    public void agregarMoto(Moto parMoto){
        listaVehiculos.add(parMoto);
        System.out.println("Moto agregada correctamente.");
    }
    
    public void agregarBicicleta(BicicletaElectrica parBicicleta){
        listaVehiculos.add(parBicicleta);
        System.out.println("Bicicleta Electrica agregada correctamente.");
    }
    
    public void listarVehiculos(){
        for(Vehiculo i:listaVehiculos){
            if(i instanceof Auto){
                System.out.println("ID: "+ i.getIdVehiculo()+
                        " CANTIDAD PASAJEROS: "+ ((Auto) i).getCantidadPasajeros()+"%"+
                        " PILOTO AUTOMATICO: "+ ((Auto) i).isAutopilot()+
                        " NECESITA MANTENCION: "+ i.isRequiereMantenimiento());
            }
            else if(i instanceof Moto){
                System.out.println("ID: "+ i.getIdVehiculo()+
                            " PORCENTAJE BATERIA: "+ ((Moto) i).getPorcentajeBateria()+"%"+
                            " ASISTENCIA MODO ECO: "+ ((Moto) i).isAsistenciaModoEco()+
                            " NECESITA MANTENCION: "+ i.isRequiereMantenimiento());
        
            }
            else if(i instanceof BicicletaElectrica){
                System.out.println("ID: "+ i.getIdVehiculo()+
                                    " CAPACIDAD BATERIA: " + ((BicicletaElectrica) i).getCapacidadBateria()+
                                    " TIPO DE FRENOS: " + ((BicicletaElectrica) i).getTipoFreno()+
                                    " NECESITA MANTENCION: " + i.isRequiereMantenimiento());
            }
        }
    }
    
    public void cantidadVehiculos(){
        System.out.println("La flota tiene un total de: "+listaVehiculos.size() 
                + " vehiculos.");
    }
}
