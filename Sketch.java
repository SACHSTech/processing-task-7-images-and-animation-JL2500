import processing.core.PApplet;
import processing.core.PImage; 

public class Sketch extends PApplet {

  PImage imgCoin;
  PImage imgStock;

  // Variables for moving coin
  float coinAngleX = 0;
  float coinAngleY = 0;
  float coinX = 150 * sin(coinAngleX);
  float coinY = 50 + (150 * sin(coinAngleY));  
  float coinSpeedX = 6; 
  float coinSpeedY = 7; 

  // Variables for moving ellipse
  float ellipseX = 100;
  float ellipseY = 100;  
  float ellipseSpeedX = 1; 
  float ellipseSpeedY = 2; 
	
  public void settings() {

    size(400, 400);

  }

  public void setup() {

    imgCoin = loadImage("coin_01.png");
    imgCoin.resize(50,50);
    imgStock = loadImage("stock_market_background.png");
    imgStock.resize(400,400);

  }

  public void draw() {

    // Sets background
    background(128);
    image(imgStock, 0, 0);

    // Moves the coin in a curved motion
    coinX += coinSpeedX * sin(coinAngleX);
    coinY += coinSpeedY * sin(coinAngleY);

    // Collision detection for coin
    if (coinX > 400 - imgCoin.width || coinX < 0) {
      coinSpeedX *= -1;
    }

    if (coinY > 400 - imgCoin.height || coinY < 0) {
      coinSpeedY *= -1;
    }

    // Adds different angles for a visible curve
    coinAngleX += 0.02;
    coinAngleY += 0.03;

    // Moves the ellipse
    ellipseX += ellipseSpeedX;
    ellipseY += ellipseSpeedY;

    // Collision detection for the ellipse
    if (ellipseX > 350 || ellipseX < 50) {
      ellipseSpeedX *= -1;
    }

    if (ellipseY > 350 || ellipseY < 50) {
      ellipseSpeedY *= -1;
    }

    // Draws the coin and ellipse
    image(imgCoin, coinX, coinY);
    fill(0,255,0);
    ellipse(ellipseX, ellipseY, 100, 100);

  }
  
}