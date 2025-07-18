package Model;

public class SpeedingFine {
    private double velocidadAutomovil;
    private double limiteVelocidad;

    public double getLimiteVelocidad() {
        return limiteVelocidad;
    }

    public double getVelocidadAutomovil() {
        return velocidadAutomovil;
    }

    public void setLimiteVelocidad(double limiteVelocidad) {
        this.limiteVelocidad = limiteVelocidad;
    }

    public void setVelocidadAutomovil(double velocidadAutomovil) {
        this.velocidadAutomovil = velocidadAutomovil;
    }

    public SpeedingFine (double velocidadAutomovil, double limiteVelocidad){
        this.velocidadAutomovil = velocidadAutomovil;
        this.limiteVelocidad = limiteVelocidad;
    }
}
