package goose.blud.example.animals;

import goose.blud.example.interfaces.Gravity;

/**
 * Slightly more complex, extends {@link AbstractAnimal} and implements {@link Gravity} as an interface, which means
 * this Cat needs to implement its own gravity!
 */
public class Cat extends AbstractAnimal implements Gravity {
    private double upwardsVelocity = 0;
    private double purrDecibels;

    public Cat(double purrDecibels) {
        super(4, "Meow");
        this.purrDecibels = purrDecibels;
    }

    public double getUpwardsVelocity() { return upwardsVelocity; }
    public void setUpwardsVelocity(double upwardsVelocity) { this.upwardsVelocity = upwardsVelocity; }

    public double getPurrDecibels() { return purrDecibels; }
    public void setPurrDecibels(double purrDecibels) { this.purrDecibels = purrDecibels; }

    @Override
    public void fall() {
        upwardsVelocity -= (GRAVITY);
    }
}
