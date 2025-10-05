
public class Rectangle {

	private float length;
	private float breadth;

	public Rectangle(float length, float breadth) {
		this.length = length;
		this.breadth = breadth;
	}

	public double area() {
		return length * breadth;
	}

	public double perimeter() {
		return 2*(length + breadth);
	}

	public static void main(String[] args) {

		Rectangle rectObj1 = new Rectangle(4, 5);
		Rectangle rectObj2 = new Rectangle(5, 8);
		
		Square squareObj = new Square(5);
		System.out.println("Area of rectangle:" + rectObj1.area());
		System.out.println("Area of rectangle:" + rectObj2.area());
		
		System.out.println("Perimeter of rectangle:" + rectObj1.perimeter());
		System.out.println("Perimeter of rectangle:" + rectObj2.perimeter());
		
		System.out.println("Area of Square:" + squareObj.area());
		
	}
}
