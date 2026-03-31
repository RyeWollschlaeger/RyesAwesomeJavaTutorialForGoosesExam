package goose.blud.example.interfaces;

/**
 * Simple gravity interface. Has a field defining the speed of gravity, and one abstract method
 */

public interface Gravity {
    double GRAVITY = 9.81; // Fields in interfaces are 'public static final' by default, AKA they're just constants

    void fall();
}
