/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package teslafleet;

import cl.duoc.models.AdministrarFlota;
import cl.duoc.models.Auto;
import cl.duoc.models.BicicletaElectrica;
import cl.duoc.models.Moto;
import java.util.Scanner;

/**
 *
 * @author Cetecom
 */
public class TeslaFleet {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        
        int opcion = 0;
        int opcionAgregar = 0;
        
        while(opcion!=7){
            System.out.println("*****MENU*****");
            System.out.println("1) Agregar Vehiculo");
            System.out.println("2) Buscar Vehiculo");
            System.out.println("3) Listar Vehiculos");
            System.out.println("4) Calcular alquiler vehiculo.");
            System.out.println("5) Calcular total alquiler de la flota.");
            System.out.println("6) Mostrar cantidad de vehiculos de la flota.");
            System.out.println("7) Salir");
            System.out.println("Ingrese el numero de la opcion que desea: ");
            
            AdministrarFlota flota = new AdministrarFlota();
            opcion = entrada.nextInt();
            
            switch(opcion){
                case 1:
                    System.out.println("Ingrese el numero del tipo de vehiculo que desea ingresar: ");
                    System.out.println("1) Auto");
                    System.out.println("2) Moto");
                    System.out.println("3) Bicicleta Electrica");
                    
                    opcionAgregar = entrada.nextInt();
                    
                    switch(opcionAgregar){
                        case 1:
                            Auto a = new Auto();
                            
                            System.out.println("Ingrese el id del vehiculo:");
                            String parIdAuto = entrada.nextLine();
                            a.setIdVehiculo(parIdAuto);
                            
                            System.out.println("Ingrese la cantidad de pasajeros del auto:");
                            int parCantidadPasajeros = entrada.nextInt();
                            a.setCantidadPasajeros(parCantidadPasajeros);
                            
                            System.out.println("Ingrese si el auto usa piloto automatico(true o flase):");
                            boolean parAutopilot = entrada.nextBoolean();
                            a.setAutopilot(parAutopilot);
                            
                            System.out.println("Ingrese si el vehiculo necesita mantencion(true o false):");
                            boolean parMantencionAuto = entrada.nextBoolean();
                            a.setRequiereMantenimiento(parMantencionAuto);
                            
                            flota.agregarAuto(a);
                            
                        case 2:
                            Moto m = new Moto();
                            
                            System.out.println("Ingrese el id del vehiculo:");
                            String parIdMoto = entrada.nextLine();
                            m.setIdVehiculo(parIdMoto);
                            
                            System.out.println("Ingrese el procentaje de bateria:");
                            int parBateria = entrada.nextInt();
                            m.setPorcentajeBateria(parBateria);
                            
                            System.out.println("Ingrese si usa el Modo Eco (true o false):");
                            boolean parModoEco = entrada.nextBoolean();
                            m.setAsistenciaModoEco(parModoEco);
                            
                            System.out.println("Ingrese si el vehiculo necesita mantencion(true o false):");
                            boolean parMantencionMoto = entrada.nextBoolean();
                            m.setRequiereMantenimiento(parMantencionMoto);
                            
                            flota.agregarMoto(m);
                            
                        case 3:
                            BicicletaElectrica bici = new BicicletaElectrica();
                            
                            System.out.println("Ingrese el id del vehiculo:");
                            String parIdBici = entrada.nextLine();
                            bici.setIdVehiculo(parIdBici);
                            
                            System.out.println("");
                    }
                case 2:
                    
                case 3:
                    flota.listarVehiculos();
                    
                case 6:
                    flota.cantidadVehiculos();
                case 7:
                    System.out.println("Saliendo.");
            }                        
        }
    }    
}

