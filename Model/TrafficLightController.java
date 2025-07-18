package Model;

import org.jxmapviewer.viewer.GeoPosition;

import java.awt.*;
import java.io.Serializable;
import java.time.LocalTime;
import java.time.Duration;

public class TrafficLightController extends Device implements Runnable, Serializable {
    private LocalTime starTimeIntermittent, endTimeIntermittent;
    private int durationRed,durationGreen,durationYellow,durationTwoRed;
    private TrafficLight semaphore1,semaphore2;
    private GeoPosition location;
    private TrafficLight light1,light2;
    private boolean running;

    public TrafficLightController() {
        this.durationGreen = 40000;
        this.durationYellow = 4000;
        this.durationTwoRed = 3000;
        this.durationRed = 30000;
        light1 = new TrafficLight();
        light2 = new TrafficLight();
        light1.setMain();
    }

    @Override
    public void run() {
        System.out.println("El hilo empezo");
        running = true;
        while (running){
            try {
                light1.setState(Color.GREEN);
                light2.setState(Color.RED);
                System.out.println("Verde");
                Thread.sleep(40000);

                light1.setState(Color.YELLOW);
                light2.setState(Color.RED);
                //panel1.setColor(LT1.getColor(),LT2.getColor());
                System.out.println("Amarillo");
                Thread.sleep(4000);

                light1.setState(Color.RED);
                light2.setState(Color.RED);
                //panel1.setColor(LT1.getColor(),LT2.getColor());
                System.out.println("doble rojo");
                Thread.sleep(3000);

                light1.setState(Color.RED);
                light2.setState(Color.GREEN);
                //panel1.setColor(LT1.getColor(),LT2.getColor());
                System.out.println("Rojo");
                Thread.sleep(30000);

                light1.setState(Color.RED);
                light2.setState(Color.YELLOW);
                //panel1.setColor(LT1.getColor(),LT2.getColor());
                System.out.println("sec amarillo");
                Thread.sleep(4000);

                light1.setState(Color.RED);
                light2.setState(Color.RED);
                //panel1.setColor(LT1.getColor(),LT2.getColor());
                System.out.println("doble rojos");
                Thread.sleep(3000);

            }catch (InterruptedException e){
                System.out.println("Traffic Ligth error");
                running = false;
            }
        }
    }
    public void stop(){
        this.running = false;}

    public GeoPosition getLocation() {
        return location;
    }

    public void setLocation(GeoPosition location) {
        this.location = location;
    }

    public TrafficLight getLightMain() {
        return light1;
    }
}