package carImpl;

import car.Car;

public class CheapCar extends Car {
    private String engine = "No engine";
    private String color = "None";

    @Override
    public void buildEngine() {
        this.engine = "Cheap car engine installed";
    }

    @Override
    public void carPaint() {
        this.color = "BLACK";
    }

    public void showCar() {
        System.out.println(engine + "\nCheap car has " + wheels + " wheels\n" + windows + " windows was installed\nCar was painted in " + color
                + " color\nYour car is ready\n\n" );
    }
}
