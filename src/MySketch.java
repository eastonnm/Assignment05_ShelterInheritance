import processing.core.PApplet;
import processing.core.PFont;

public class MySketch extends PApplet {
    private Shelter shelter;
    private Button button;
    private Animal animal;
    private final int BACKGROUND_COLOR = 122;
    private final int FONT_SIZE = 10;

    private final String[] dogImages = {"resources/scoobydoo_small.png", "resources/toto_small.png", "resources/spuds_small.png", "resources/snoopy_small.png"};
    private final int[] dogAges = {10,2,7,53};
    private final String[] catImages = {"resources/salem.png", "resources/felix.png"};
    private final int[] catAges = {53,102};



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
        String[] lines = loadStrings("Animal.txt");
        for (int i = 0 ; i < lines.length; i++) {
            shelter.intake(new Dog(this, lines[i], lines[i],dogAges[i], loadImage(dogImages[i])));
            shelter.intake(new Cat(this, lines[i], lines[i],catAges[i], loadImage(catImages[i])));
        }
    }

    public void draw() {
        background(BACKGROUND_COLOR);
        shelter.name();
        shelter.displayAnimals();
    }

    // public void mousePressed(){
    //     if (dog.isAdopted()){
    //         return;
    //     }
        
    //     for(int i = dogNames.length -1; i > 0; i++ ){
    //         shelter.outTake(i);
    //    }
    // }


}

