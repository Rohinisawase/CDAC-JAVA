// Base class
class Shape {
	void display() {
		System.out.println("This is shape");
	}
	
	public static void main(String[] args) {
		Square1 squareObj = new Square1();

		squareObj.display(); 
		squareObj.displayRectangle(); // From Rectangle
		squareObj.displaySquare(); // From Square
	}
}

// Rectangle class inheriting Shape
class Rectangle1 extends Shape {
	void displayRectangle() {
		System.out.println("This is rectangular shape");
	}
}

// Circle class inheriting Shape
class Circle extends Shape {
	void displayCircle() {
		System.out.println("This is circular shape");
	}
}

// Square class inheriting Rectangle
class Square1 extends Rectangle1 {
	void displaySquare() {
		System.out.println("Square is a rectangle");
	}
}
