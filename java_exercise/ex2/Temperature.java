package isp.lab9.exercise2;

import java.util.concurrent.ThreadLocalRandom;

public class Temperature extends Observable {
    
    private int value;
    
    public void readSensor() {
        value = ThreadLocalRandom.current().nextInt(0, 100);
        this.changeState(this,value);
    }

}
