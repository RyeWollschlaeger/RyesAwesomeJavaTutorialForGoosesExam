package goose.blud.example.animals;

import goose.blud.example.interfaces.Flyable;
import goose.blud.example.interfaces.Gravity;

/**
 * Most complex example, this Pigeon extends {@link AbstractAnimal} and implements 2 interfaces, {@link Flyable} and
 * {@link Gravity}, meaning this class needs to implement flying and gravity
 */
public class Pigeon extends AbstractAnimal implements Flyable, Gravity {
    private double upwardsVelocity = 0;
    private double gravityModifier = 1;
    private double flapStrength;

    public Pigeon(double flapStrength) {
        super(2, "Coo");
        this.flapStrength = flapStrength;
    }

    public double getUpwardsVelocity() { return upwardsVelocity; }
    public void setUpwardsVelocity(double upwardsVelocity) { this.upwardsVelocity = upwardsVelocity; }

    public double getFlapStrength() { return flapStrength; }
    public void setFlapStrength(double flapStrength) { this.flapStrength = flapStrength; }


    @Override
    public void flapWings() {
        upwardsVelocity += flapStrength;
    }

    @Override
    public void glide() {
        gravityModifier = 0.5;
    }

    @Override
    public void stopGliding() {
        gravityModifier = 1;
    }

    @Override
    public void fall() {
        upwardsVelocity -= (GRAVITY * gravityModifier);
    }
}
