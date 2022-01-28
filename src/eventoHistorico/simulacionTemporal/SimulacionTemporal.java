package eventoHistorico.simulacionTemporal;
    
import eventoHistorico.EventoHistorico;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class SimulacionTemporal{
    private final List<EventoHistorico> eventos;

    public SimulacionTemporal(List<EventoHistorico> eventos) {
        this.eventos = eventos;
    }
    
    public void getEventsInRange(Integer ini, Integer fin){
        for (EventoHistorico evento : eventos) {
            if(evento.getDate()>=ini && evento.getDate() <= fin){
                System.out.println(evento.toString());
            }
        }
    }
}
