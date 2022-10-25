import processing.core.PApplet;
import java.util.ArrayList;

public class Shelter {
    private ArrayList<Dog> dogs;
    //private ArrayList<Cat> cats;
    private PApplet sketch;
    private float x,y;
    private final int DOG_ENTRY_XOFFSET = 50;
    private final int DOG_ENTRY_YOFFSET = 100;
    // private final int CAT_ENTRY_XOFFSET = 50;
    // private final int CAT_ENTRY_YOFFSET = 100;
    private final int NAME_YOFFSET = 50;
    private final int NAME_TEXT = 32;

    Shelter(PApplet sketch) {
        this.sketch = sketch;
        dogs = new ArrayList<Dog>();
       // cats = new ArrayList<Cat>();
    }
    void name() {
        sketch.textAlign(sketch.CENTER);
        sketch.textSize(NAME_TEXT);
        sketch.text("Eastons Animal Shelter",sketch.width/2f, NAME_YOFFSET);
    }
    void intake(Dog dog){
        dogs.add(dog);
    }

    // void outTake(Dog dog){
    //     dogs.remove(dog);
    // }

    // void intake(Cat cat){
    //     cats.add(cat);
    // }

    void displayAnimals(){
        for (int i=0; i<dogs.size();++i){
            Dog dog = dogs.get(i);
            dog.draw(DOG_ENTRY_XOFFSET,DOG_ENTRY_YOFFSET+DOG_ENTRY_YOFFSET*i);
        }
        // for (int i=0; i<cats.size();++i){
        //     Cat cat = cats.get(i);
        //     cat.draw(CAT_ENTRY_XOFFSET,CAT_ENTRY_YOFFSET+CAT_ENTRY_YOFFSET*i);

        // }
    }
}