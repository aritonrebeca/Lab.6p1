public class Animal {
    public void eat() {
        System.out.println("The animal is eating.");
    }

    public void sound() {
        System.out.println("The animal makes a generic sound.");
    }
}

class Lion extends Animal {
    @Override
    public void eat() {
        System.out.println("The lion eats meat.");
    }

    @Override
    public void sound() {
        System.out.println("The lion roars!");
    }
}

class Tiger extends Animal {
    @Override
    public void eat() {
        System.out.println("The tiger eats meat and occasionally hunts in water.");
    }

    @Override
    public void sound() {
        System.out.println("The tiger growls!");
    }
}

class Panther extends Animal {
    @Override
    public void eat() {
        System.out.println("The panther eats meat and is a skilled hunter.");
    }

    @Override
    public void sound() {
        System.out.println("The panther vocalizes with a distinctive growl.");
    }
}

