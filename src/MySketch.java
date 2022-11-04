import processing.core.PApplet;
import processing.core.PFont;

public class MySketch extends PApplet {
    private Shelter shelter;    

    private final int BACKGROUND_COLOR = 122;
    private final int FONT_SIZE = 10;
    String [] lines;
    String [] animalData;

    

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
        String[] lines = loadStrings("resources/data.txt");
        for (int i = 0 ; i < lines.length; i++) {
        animalData = split(lines[i], ",");
        
        if(animalData[0].equals("dog")){

                    shelter.intake(new Dog(this, animalData[0], animalData[1], animalData[2], Integer.parseInt(animalData[3]), loadImage(animalData[4])));
                    
        } else if(animalData[0].equals("cat")){
                    shelter.intake(new Cat(this, animalData[0], animalData[1], animalData[2], Integer.parseInt(animalData[3]), loadImage(animalData[4])));
            
        }else if(animalData[0].equals("fish")){
                    shelter.intake(new Fish(this, animalData[0], animalData[1], animalData[2], Integer.parseInt(animalData[3]), loadImage(animalData[4])));
                
            }
        }
    }

    public void draw() {
        background(BACKGROUND_COLOR);
        shelter.name();
        shelter.displayAnimals();
    }




    public void mousePressed(){
        //when mouse is pressed call shelter method to 
        //determine if mouse is pressed on animal in shelter
            shelter.adopt(mouseX, mouseY);
        
    }
        
    //     for(int i = lines.length -1; i > 0; i++ ){
    //         shelter.isAdopted(i);
    //    }
    // }


}

