/**
* A simple demo on ColorImage.
*/

public class ColorImageDemo{

	private Canvas canvas=new Canvas(); // Create a canvas for ColorImage
	private ColorImage image1=new ColorImage("Car1.png") // Default image
	
	// above instance variable


	// Define two constructors for ColorImageDemo

	public ColorImageDemo(){
		canvas.add(image1,0,0);   // Display ColorImage at (0,0) position
	}

	public ColorImageDemo(int xPos, intyPos){
		image1= new ColorImage();  // Create a new ColorImage from user file
		canvas.add(image1, xPos, yPos);  // Diplay ColorImage at (xPos, yPos) position 

	// Above are constructors 
	}


	// Methods

	public void setRotateDemo(int degress){
		image1.setRotation(degrees);
	}

	// Rotate the image clockwise by degrees

	// Get the degrees in clockwise rotation on the image

	public int getRotateDemo(){
		return image1.getRotation();
	}

	// Scale the image by scaleFactor

	public void scaleDemo(double scaleFactor){
		image.setScale(scaleFactor);
	}

	// Move the image to position (x,y) on the canvas
	public void translateDemo(int x, int y){
		image1.setX(x);
		image1.setY(y);
	}
