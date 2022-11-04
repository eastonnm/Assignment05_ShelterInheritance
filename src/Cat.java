import processing.core.PImage;
import processing.core.PApplet;

public class Cat extends Animal{


    public Cat(PApplet sketch,String type, String name, String breed, int age, PImage img){
        super(sketch, type,name, breed, age, img);
    }

    public void sound(){
        super.sound();
    }
    
}