package Model;

public class LocationEvent {
    private String id;
    private String domicilio;
    private String fechaHora;

    public String getDomicilio() {
        return domicilio;
    }

    public String getFechaHora() {
        return fechaHora;
    }

    public String getId() {
        return id;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public void setFechaHora(String fechaHora) {
        this.fechaHora = fechaHora;
    }

    public void setId(String id) {
        this.id = id;
    }

    public LocationEvent(String id, String fechaHora, String domicilio){
        this.id = id;
        this.fechaHora = fechaHora;
        this.domicilio = domicilio;
    }
}
