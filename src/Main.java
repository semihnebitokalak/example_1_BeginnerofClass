public class Main{
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.Bark();
        dog.Hunger();
        dog.Sleep();
        // Aşağıdaki şekilde atama yapabiliyoruz. Class içine private olmadığı için erişebiliyoruz.
        // Private olsaydı set ve get methodlarını kullanmamız gerekecekti.
        dog.breed = "Golden";
        dog.age = 8;
        dog.color = "yellow";
        System.out.println(dog.breed);
        System.out.println(dog.age);
        System.out.println(dog.color);
    }
}