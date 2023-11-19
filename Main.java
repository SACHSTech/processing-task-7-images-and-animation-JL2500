import processing.core.PApplet;

/**
 * Creates a bouncing coin and ellipse animation.
 * @JulianLi
 *
 */
class Main {
  public static void main(String[] args) {
    
    String[] processingArgs = {"MySketch"};
	  Sketch mySketch = new Sketch();
	  PApplet.runSketch(processingArgs, mySketch);
  }
  
}