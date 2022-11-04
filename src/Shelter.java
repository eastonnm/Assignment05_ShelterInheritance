import processing.core.PApplet;
import java.util.ArrayList;

public class Shelter {
    private ArrayList<Animal> animals;

    private PApplet sketch;
    private float x,y;
    private final int ANIMAL_ENTRY_XOFFSET = 50;
    private final int ANIMAL_ENTRY_YOFFSET = 100;
    private final int NAME_YOFFSET = 50;
    private final int NAME_TEXT = 32;

    Shelter(PApplet sketch) {
        this.sketch = sketch;

        animals = new ArrayList<Animal>();
        
    }
    void name() {
        sketch.textAlign(sketch.CENTER);
        sketch.textSize(NAME_TEXT);
        sketch.text("Eastons Animal Shelter",sketch.width/2f, NAME_YOFFSET);
    }

    void intake(Animal animal){
        animals.add(animal);
    }

    void adopt (int mouseX, int mouseY){
        //grab a dog from the shelter
        //see if mouse was clicked on this dog
        //if yes print a message
        //if no grab next dog and repeat
        //if checked all dogs none clicked print none selected

        //for (int i = animals.size()-1; i >= 0; i--)
        for (Animal animal: animals){
            boolean isAdopt = animal.isAdoptMeClicked(mouseX, mouseY);
            if (isAdopt){
                System.out.println("found one");
                break;
            }
        }

        
    }


    void displayAnimals(){
        for (int i=0; i<animals.size();++i){
            Animal animal = animals.get(i);
            animal.draw(ANIMAL_ENTRY_XOFFSET,ANIMAL_ENTRY_YOFFSET+ANIMAL_ENTRY_YOFFSET*i);
        }
    }
}