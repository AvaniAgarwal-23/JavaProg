class Animal{

    final void sleep(){
        System.out.println("Animal sleeps");
    }
    void sound(){
        System.out.println("Animal makes sound");
    }
}

class Dog extends Animal{

    void sound(){
        super.sound();
        System.out.println("Dog barks");
    }
    void move(){
        System.out.println("Dog runs");
    }
}

class Cat extends Animal{

    void sound(){
        super.sound();
        System.out.println("Cat meows");
    }
    void move(){
        System.out.println("Cat walks");
    }
}

class Bird extends Animal{

    void sound(){
        super.sound();
        System.out.println("Bird chirps");
    }
    void move(){
        System.out.println("Bird flies");
    }
}

public class inherit{
    public static void main(String[] args){
        Dog d=new Dog();
        d.sound();
        d.move();
        d.sleep();
    }
}