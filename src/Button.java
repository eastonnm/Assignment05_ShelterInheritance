import processing.core.PApplet;
import static processing.core.PConstants.CENTER;

public class Button {

    private PApplet sketch;
    private String text;
    private float width;
    private float height;
    private int x, y;
    private static final int WHITE=255;
    private static final int BLACK=0;
    private static final float BUTTON_WIDTH=100;
    private static final float BUTTON_HEIGHT=20;


    public Button(PApplet sketch, String text) {
        this(sketch,text,BUTTON_WIDTH,BUTTON_HEIGHT);
    }


    public Button(PApplet sketch, String text, float width, float height) {
        this.sketch=sketch;
        this.text=text;
        this.width=width;
        this.height=height;
    }

    public void draw(int x, int y){
        this.x = x;
        this.y = y;
        sketch.fill(WHITE);
        sketch.rect(x,y,width,height);
        sketch.fill(BLACK);
        sketch.textAlign(CENTER);
        sketch.text(text,x+width/2,y+(height/2));
    }

    public boolean isClicked(int x, int y){
        return(leftEdge() <= x && rightEdge() >= x  && y >= bottomEdge() && y <= topEdge());
    }
    

    public float leftEdge(){
        return (x);
    }

    public float rightEdge(){
        return (x + BUTTON_WIDTH);
    }
    
    public float topEdge(){
        return (y);
    }

    public float bottomEdge(){
        return (y + BUTTON_HEIGHT);
    }

}
