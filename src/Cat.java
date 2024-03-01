public class Cat extends Animal implements AnimalInt{
    @Override
    public void voice() {
        System.out.println("meow " + name);
    }

    @Override
    public void feed() {
        System.out.println("cat is feeding");
    }
}
