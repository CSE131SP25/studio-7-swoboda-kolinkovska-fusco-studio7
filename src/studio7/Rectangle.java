package studio7;

public class Rectangle {

 private int width;
 private int length;
 
 public Rectangle (int theWidth, int theLength) {
	 width = theWidth;
	 length = theLength;
 }
public int Area (int width, int length) {
	return width*length;
	}
public int Perimeter (int width, int length) {
	return 2*width + 2*length;
	}

public boolean compareAreas (Rectangle a, Rectangle b) {
	if (Area(a.width, a.length)> Area(b.width, b.length)) {
		return true;
	} else {
		return false;
	}
	
}
}




