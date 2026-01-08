import Entities.Square;

public class Main {
	public static void main(String[] args) {
//		Square s1 = new Square(7, 9);
//		s1.getArea();
//		s1.getPrimeter();
//		s1.printAreaAndPerimeter();
//		System.out.println(s1.sum());
//		System.out.println(Square.getNumberOfSquare());
//
//
//		Square s2 = new Square(12, 11);
//		s2.getArea();
//		s2.getPrimeter();
//		s2.printAreaAndPerimeter();
//		System.out.println(s2.sum());
//		System.out.println(Square.getNumberOfSquare());
//		System.out.println(s1.sum()+s2.sum());


		Square s3 = new Square(12, 11, 5, 8);
		s3.getArea();
		s3.getScndArea();
		s3.getPrimeter();
		s3.getScndPrimeter();
		s3.printAreaAndPerimeter();
		System.out.println("La somma delle aree e dei perimetrié: "+s3.sum());
		System.out.println(Square.getNumberOfSquare());
	}
}