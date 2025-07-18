package Model;

public class Fine {
    private double importe;
    private int puntosScoring;

    public int getPuntosScoring() {
        return puntosScoring;
    }

    public double getImporte() {
        return importe;
    }

    public void setPuntosScoring(int puntosScoring) {
        this.puntosScoring = puntosScoring;
    }

    public void setImporte(double importe) {
        this.importe = importe;
    }

    public Fine (double importe, int puntosScoring){
        this.importe = importe;
        this.puntosScoring = puntosScoring;
    }
}
