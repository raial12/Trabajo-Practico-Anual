package Model;

public class ParkingCamera extends Device{
    private int tiempoTolerancia;

    public int getTiempoTolerancia() {
        return tiempoTolerancia;
    }

    public void setTiempoTolerancia(int tiempoTolerancia) {
        this.tiempoTolerancia = tiempoTolerancia;
    }

    public ParkingCamera(int tiempoTolerancia){
        this.tiempoTolerancia = tiempoTolerancia;
    }
}
