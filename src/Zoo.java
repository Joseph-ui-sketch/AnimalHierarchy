public class Zoo {
    public static void main(String[] args){
        Dog dog = new Dog("Fido", 4);
        Mammal mammal = new Mammal();
        Bird bird = new Bird();

        dog.makeSound();
        mammal.makeSound();
        bird.makeSound();

    }
}
