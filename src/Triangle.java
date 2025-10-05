
public class Triangle {
	private float side1;
	private float side2;
	private float side3;
	private double area;
	
	public Triangle(float side1, float side2, float side3) {
		
		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;
	}
	
	private double areaOfTriangle() {
		
		double s;
		
		//1st Calculate semi perimeter
		
		s=(side1+side2+side3)/2.0;
		
		//Calculate Area
		area=Math.sqrt(s*(s-side1)*(s-side2)*(s-side3));
		
		return area;
		
	}
	
	private double perimeterOfTriangle() {
		
		double perimeter;
		
		perimeter=(side1+side2+side3);
		
		return perimeter;

	}
	public static void main(String[] args) {
		
		Triangle triangleObj=new Triangle(3,4,5);
		System.out.println("Area of triangle:"+triangleObj.areaOfTriangle());
		System.out.println("Perimeter of triangle:"+triangleObj.perimeterOfTriangle());
	}
}
