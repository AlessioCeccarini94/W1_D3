import Entities.Square;

public class Main {
	public static void main(String[] args) {
		Square s1 = new Square(7, 9);
		s1.getArea();
		s1.getPrimeter();
		s1.printAreaAndPerimeter();
		System.out.println(s1.sum());
		System.out.println(Square.getNumberOfSquare());


		Square s2 = new Square(12, 11);
		s2.getArea();
		s2.getPrimeter();
		s2.printAreaAndPerimeter();
		System.out.println(s2.sum());
		System.out.println(Square.getNumberOfSquare());


		Square.printTwoSquare(s1, s2);
	}
}