import processing.core.PApplet;
import processing.core.PFont;

public class MySketch extends PApplet {
    private Shelter shelter;
    private final int BACKGROUND_COLOR = 122;
    private final int FONT_SIZE = 10;
    private final String[] dogNames = {"Scooby-Doo","Toto","Spuds Mackenzie","Snoopy"};
    private final String[] dogBreeds = {"Great Dane","Cairn Terrier","Bull Terrier","Beagle"};
    private final int[] dogAges = {10,2,7,53};
    private final String[] dogImages = {"resources/scoobydoo_small.png", "resources/toto_small.png", "resources/spuds_small.png", "resources/snoopy_small.png"};
    // private final String[] catNames = {"Samel", "Felix"};
    // private final String[] catBreeds = {"American Shorthair"};
    // private final int[] catAges = {500,102};
    // private final String[] catImages = {"resources/salem.png", "resources/felix.png"};

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
        for(int i=0; i<dogNames.length;++i)
            shelter.intake(new Dog(this, dogNames[i],dogBreeds[i],dogAges[i], loadImage(dogImages[i])));

    //     for(int i=0; i<catNames.length;++i)
    //         shelter.intake(new Cat(this, catNames[i],catBreeds[i],catAges[i], loadImage(catImages[i])));
    }
    public void draw() {
        background(BACKGROUND_COLOR);
        shelter.name();
        shelter.displayAnimals();
    }

    // public void mousePressed(){
    //     if (button.isSelected(mouseX, mouseY))
    //     for(int i = dogNames.length -1; i > 0; i++ ){
    //         shelter.outTake(i);
    //    }
    //}

    
}
