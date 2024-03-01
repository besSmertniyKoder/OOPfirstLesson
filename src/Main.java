public class Main {
    public static void main(String[] args) {
//        Animal animal = new Animal("barsik");
//        animal.setName("murzik"); ; //поле стало приватным
//
//        animal.voice();
        Cat cat = new Cat();
        cat.setName("cat");
        cat.voice();
        cat.feed();
        Dog dog = new Dog();
        dog.setName("sharik");
        dog.voice();
    }
}
