import processing.core.PApplet;
import processing.core.PFont;

public class MySketch extends PApplet {
    private Shelter shelter;    

    private final int BACKGROUND_COLOR = 122;
    private final int FONT_SIZE = 10;

    

    public void settings() {
        size(500, 700);
    }

    public void setup() {
        PFont font=createFont("Arial",FONT_SIZE);
        textFont(font);
        shelter = new Shelter(this);
        addAnimals();
        
    }

    private void addAnimals(){
        String[] lines = loadStrings("/Users/mulle/OneDrive/Documents/CS 162 Fall 2022/162 Projects folder/Assignment05_ShelterInheritance/resources/data.txt");
        for (int i = 0 ; i < lines.length; i++) {
            lines = split(lines[i], " , ");
            shelter.intake(new Dog(this, lines[i], lines[i], lines[i], loadImage(lines[i])));
            shelter.intake(new Cat(this, lines[i], lines[i], lines[i], loadImage(lines[i])));
            shelter.intake(new Fish(this, lines[i], lines[i], lines[i], loadImage(lines[i])));
        }
    }

    public void draw() {
        background(BACKGROUND_COLOR);
        shelter.name();
        shelter.displayAnimals();
    }

    // public void mousePressed(){
    //         shelter.gone(animal);
        
    // }
        
    //     for(int i = lines.length -1; i > 0; i++ ){
    //         shelter.isAdopted(i);
    //    }
    // }


}

