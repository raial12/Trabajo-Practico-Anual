package Model;

public class TypeInfraction {
    private String descripcion;
    private float importe;
    private int puntosScoring;

    public String getDescripcion() {
        return descripcion;
    }

    public float getImporte() {
        return importe;
    }

    public int getPuntosScoring() {
        return puntosScoring;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setImporte(float importe) {
        this.importe = importe;
    }

    public void setPuntosScoring(int puntosScoring) {
        this.puntosScoring = puntosScoring;
    }

    public TypeInfraction (String descripcion, float importe, int puntosScoring){
        this.descripcion = descripcion;
        this.importe = importe;
        this.puntosScoring = puntosScoring;
    }
}
