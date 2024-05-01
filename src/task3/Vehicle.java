package task3;

public class Vehicle {
    private final Movable movable;

    public Vehicle(Movable movable) {
        this.movable = movable;
    }

    public void move() {
        movable.move();
    }
}
