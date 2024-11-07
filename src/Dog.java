public class Dog extends Animal{
    public Dog(String fido, int i){
        this.species = "Dog";
    }

    @Override
    public void makeSound(){
        System.out.println("Woof Woof");
    }
}

