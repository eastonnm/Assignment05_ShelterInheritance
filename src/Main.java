/**
 * Creates a sketch object, displays a window
 * and runs your sketch inside that window.
 * Creates an arraylist the "shelter" to hold all of our dog/cat/spongebob objects.
 * Cs162 Assignment05 Shelter Inheritance
 * Week 5 Assignment
 * October 24, 2022
 * @author Easton Mullen
 * @version 1.0
 * @since 1.0
 */

import processing.core.PApplet;

public class Main {

    public static void main(String[] args) throws Exception {
        MySketch mySketch = new MySketch();
	    String[] processingArgs = {"Eastons Sketch"};
	    PApplet.runSketch(processingArgs, mySketch);
    }   
}
