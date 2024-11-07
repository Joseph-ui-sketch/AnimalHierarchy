public class Cat extends Animal {
    private String food;

    public Cat(String name, int age){
        super(name, age);
        food = "wetFood";

        }

    @Override
    public void speak() {
        System.out.println("Meow");
    }
}
