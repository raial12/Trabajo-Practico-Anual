package Model;

public class Vehicle {
    private String patente;
    private String propietario;
    private String domicilio;
    private String color;

    public String getDomicilio() {
        return domicilio;
    }

    public String getColor() {
        return color;
    }

    public String getPatente() {
        return patente;
    }

    public String getPropietario() {
        return propietario;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setPatente(String patente) {
        this.patente = patente;
    }

    public void setPropietario(String propietario) {
        this.propietario = propietario;
    }

    public Vehicle(String patente, String propietario, String domicilio, String color){
        this.color = color;
        this.patente = patente;
        this.domicilio = domicilio;
        this.propietario = propietario;
    }
}
