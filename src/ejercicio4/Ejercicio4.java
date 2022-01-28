package ejercicio4;

import eventoHistorico.EventoHistorico;
import eventoHistorico.simulacionTemporal.SimulacionTemporal;
import eventoHistorico.tipos.Culturales;
import eventoHistorico.tipos.Descubrimientos;
import eventoHistorico.tipos.Economico;
import eventoHistorico.tipos.Guerra;
import eventoHistorico.tipos.Politico;
import eventoHistorico.tipos.Religioso;
import eventoHistorico.tipos.Sociales;
import java.util.LinkedList;
import java.util.List;

public class Ejercicio4 {

    public static void main(String[] args) {
        
        List<EventoHistorico> eventos = new LinkedList<>();
        
        Sociales socialConTrayectoria = new Sociales("Congo", "Con Trayectoria" , "trayecto", 2012);
        socialConTrayectoria.setTrayectoria("2012-2020");
        eventos.add(socialConTrayectoria);
        
        eventos.add(new Culturales("España", "Hola", "Buenos días", 1999));
        eventos.add(new Descubrimientos("Alemania", "HOLA" , "Buenas noches", 2000));
        eventos.add(new Economico("Brasil", "Adios", "Buenas tardes", 2005));
        eventos.add(new Guerra("Antártida", "Último oso polar", "guerra por el último "
                + "oso polar vivo", 2022));
        eventos.add(new Politico("Inglaterra", "Pasión", "dos jefes de gobierno se enamoran", 1995));
        eventos.add(new Religioso("La Gomera", "Cabra", "se crea una religión con una cabra verde como"
                + " diosa", 1500));
        
        SimulacionTemporal simulacion1 = new SimulacionTemporal(eventos);
        System.out.println("Simulacion 1:");
        simulacion1.getEventsInRange(2000, 2022);
        System.out.println("\nSimulacion 2:");
        simulacion1.getEventsInRange(1400, 2000);
        
    }
    
}
