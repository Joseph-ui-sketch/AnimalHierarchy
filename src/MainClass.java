public class MainClass {
    public static void main(String [] arg){
    Animal cat1 = new Cat("Tina", 0);
    Animal dog1 = new Dog("Fido", 4);
        makeAnimalSpeak(cat1);
        makeAnimalSpeak(dog1);
    }

    public static void  makeAnimalSpeak(Animal animal){
        animal.speak();
    }
}
