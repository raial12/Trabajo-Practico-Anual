package Model;

import java.awt.*;
import java.io.Serializable;

public class TrafficLight implements Serializable {
    private static final  long serialVersionUID = 1L;
    private String street;
    private boolean main = false;
    private Color state;

    public TrafficLight() {
        this.state = Color.red;
    }

    public Color getState() {
        return state;
    }

    public void setState(Color state) {
        this.state = state;
    }

    public boolean getMain() {
        return main;
    }

    public void setMain() {
        this.main = true;
    }
}