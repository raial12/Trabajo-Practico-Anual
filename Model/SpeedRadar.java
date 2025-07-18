package Model;

public class SpeedRadar extends Device{
    private double limiteVelocidad;

    public double getLimiteVelocidad() {
        return limiteVelocidad;
    }

    public void setLimiteVelocidad(double limiteVelocidad) {
        this.limiteVelocidad = limiteVelocidad;
    }

    public SpeedRadar(double limiteVelocidad){
        this.limiteVelocidad = limiteVelocidad;
    }
}
