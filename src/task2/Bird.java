package task2;public class Bird {

    private Animal animal;

    public Bird() {
        this.animal = new Animal();
    }

    // Додаткові методи для птахів

    public void move() {
        animal.move();
    }
}
