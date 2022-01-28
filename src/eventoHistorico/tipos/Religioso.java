package eventoHistorico.tipos;
    
import eventoHistorico.EventoHistorico;

public class Religioso implements EventoHistorico{
    private String location;
    private String name;
    private String description;
    private Integer date;
    private String trayectoria = "";

    public Religioso(String location, String name, String description, Integer date) {
        this.location = location;
        this.name = name;
        this.description = description;
        this.date = date;
    }

    public String getLocation() {
        return location;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public Integer getDate() {
        return date;
    }
    
    public String getTrayectoria() {
        return trayectoria;
    }
    
    public void setTrayectoria(String trayectoria) {
        this.trayectoria = trayectoria;
    }
    
    @Override
    public String toString(){
        String str =  "Evento " + getName() + " en " + getLocation() + " con la descripción ("
                + getDescription() + ") en " + getDate();
        if(!getTrayectoria().equals("")){
            str += " con Trayectoria de Expansión: "+getTrayectoria();
        }
        return str;
    }
}
