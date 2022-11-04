import processing.core.PImage;
import processing.sound.Sound;
import processing.core.PApplet;


public class Dog extends Animal{
    

    public Dog(PApplet sketch, String type, String name, String breed, int age, PImage img) {
        super(sketch,type, name, breed, age, img);
    }

    
    // public void sound() {

    //     super.sound();
    //     sound = new Sound(this.sketch, "dog.aiff");
        
    // }
}

