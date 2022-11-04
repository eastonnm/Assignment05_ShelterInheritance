import processing.core.PImage;
import processing.core.PApplet;
import processing.sound.*;

public class Animal {
    
    private PApplet sketch;
    private PImage img;
    private final int SCALE_FACTOR = 2;
    private final int INFO_TEXT_SIZE= 12;
    private String name;
    private String breed;
    private String age;
    private final int PADDING = 10;
    private Button button;
    private Button button2;
    Sound sound;


    public Animal(PApplet sketch, String name, String breed, String age, PImage img) {
        this.sketch = sketch;
        this.img = img;
        img.resize(img.width/SCALE_FACTOR, img.height/SCALE_FACTOR);
        this.name = name;
        this.breed = breed;
        this.age = age;
        button = new Button(this.sketch,"Adopt Me");
        button2 = new Button(this.sketch, "Hear Me");
    }

    public void draw(int x, int y) {
        int infoXPosition;
        int adoptButtonXPosition, adoptButtonYPosition;
        infoXPosition=adoptButtonXPosition=x+img.width+PADDING;
        adoptButtonYPosition=y+img.height/2;
        sketch.image(img, x, y);
        displayInformation(infoXPosition,y);
        button.draw(adoptButtonXPosition,adoptButtonYPosition);
        button2.draw(adoptButtonXPosition + 150,adoptButtonYPosition);

    }
    private void displayInformation(int x, int y){
        sketch.textAlign(sketch.LEFT);
        sketch.textSize(INFO_TEXT_SIZE);
        sketch.text(toString(),x,y,sketch.width-img.width, (float) (img.height *.5));
    }

    public String toString() {
        return String.format("Name: %s, Breed: %s, Age: %d",name, breed, age);
    }
    
    public void sound(){
        if (button2.isClicked(sketch.mouseX, sketch.mouseY)){
            sound = new SoundFile(sketch, "read.mp3");
            sound.play();
        }
        
    }


    public boolean adopted(){
        if (button.isClicked(sketch.mouseX, sketch.mouseY)){
        return true;
    }
        else {
            return false;
        }
    }

}

