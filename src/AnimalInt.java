public interface AnimalInt {
    void feed();
    default void test(){
        System.out.println("hello im test");
    }
}
