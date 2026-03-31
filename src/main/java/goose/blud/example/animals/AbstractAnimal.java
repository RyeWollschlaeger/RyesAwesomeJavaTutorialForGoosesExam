package goose.blud.example.animals;

/**
 * Abstract class that all animal implementations should extend. This class can't be instantiated by itself
 */

public abstract class AbstractAnimal {
    private int legs;
    private String sound;

    protected AbstractAnimal(int legs, String sound) {
        this.legs = legs;
        this.sound = sound;
    }

    public int getLegs() {
        return legs;
    }

    public String getSound() {
        return sound;
    }
}
