import processing.core.PImage;
import processing.core.PApplet;

public class Dog {
    private PApplet sketch;
    private PImage img;
    private static final int SCALE_FACTOR = 2;
    private static final int INFO_TEXT_SIZE= 12;
    private String name;
    private String breed;
    private int age;
    private static final int PADDING = 10;
    private Button button;

    public Dog(PApplet sketch, String name, String breed, int age, PImage img) {
        this.sketch = sketch;
        this.img = img;
        img.resize(img.width/SCALE_FACTOR, img.height/SCALE_FACTOR);
        this.name = name;
        this.breed = breed;
        this.age = age;
        button = new Button(this.sketch,"Adopt Me");
    }

    public void draw(int x, int y) {
        int infoXPosition;
        int adoptButtonXPosition, adoptButtonYPosition;
        infoXPosition=adoptButtonXPosition=x+img.width+PADDING;
        adoptButtonYPosition=y+img.height/2;

        sketch.image(img, x, y);
        displayInformation(infoXPosition,y);
        button.draw(adoptButtonXPosition,adoptButtonYPosition);
    }

    private void displayInformation(int x, int y){
        sketch.textAlign(sketch.LEFT);
        sketch.textSize(INFO_TEXT_SIZE);
        sketch.text(toString(),x,y,sketch.width-img.width, (float) (img.height *.5));
    }


    public String toString() {
        return String.format("Name: %s, Breed: %s, Age: %d",name, breed, age);
    }
}
