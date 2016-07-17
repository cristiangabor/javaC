public class Point {

	public int x = 0;
	public int y = 0;

	public Point(int a, int b) {
		x= a;
		y= b;

	}

}


public class CreateObjectDemo {
	
	

	public CreateObjectDemo(){
		
	}

	public static void main(String[] args){
		String numedevar = "Cristian";
		Point mostenitor;
		mostenitor = new Point(1994,1989);
		System.out.println("Am sa printez ce este aici: varsta si numele: " + numedevar + mostenitor);

	}
}
/**
*public class Rectangle {
*
*	public int width = 0;
*	public int heigh = 0;
*	public Point origin;
*
*	
*
*
*	public Rectangle() {
*		origin = new Point(0,0);
*		}
*	public Rectangle(Point p) {
*		origin = p;
*	}
*	public Rectangle(int w, int h) {
*		origin = new Point(0,0);
*		width = w;
*		height = h;
*	}
*	public Rectangle(Point p, int w, int h) {
*		origin = p;
*		width = w;
*		height = h;
*	}
*
*	// a method for moving the rectangle
*
*	public void move(int x, int y) {
*		origin.x = x;
*		origin.y = y;
*	}
*
*	// a method for computing the area of the rectangle
*	public int getArea() {
*		return width * height;
*	}
*
*}
*/