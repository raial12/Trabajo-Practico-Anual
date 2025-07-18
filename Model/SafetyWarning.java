package Model;

public class SafetyWarning {
    private String descripcion;

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public SafetyWarning(String descripcion){
        this.descripcion = descripcion;
    }
}
