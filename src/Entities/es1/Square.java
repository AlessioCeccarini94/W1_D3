//Esercizio #1
//Creare una classe Rettangolo che permetta di rappresentare dei rettangoli. Per ogni rettangolo deve essere possibile
//specificare altezza e larghezza in fase di costruzione dell'istanza e devono essere realizzati i metodi per
//calcolare perimetro ed area.
//Realizzare un metodo stampaRettangolo che, dato un Rettangolo, stampi a video area e perimetro.
//Realizzare un metodo stampaDueRettangoli che, dati due rettangoli, stampi area e perimetro di ognuno e quindi la
//somma delle aree e dei perimetri.
//Scrivere un main che utilizzi tutte queste funzioni.


package Entities.es1;

public class Square {
	//attributi
	private static int numberOfSquare=0;



	//attributi oggetto
	private int l1;
	private int l2;
	private int area;
	private int perimeter;
	//costruttore
	public Square(int l1,int l2) {
		this.l1 = l1;
		this.l2 = l2;
		this.area=this.getArea();
		this.perimeter=this.getPrimeter();
		numberOfSquare++;
	}
	public static int getNumberOfSquare() {
		return numberOfSquare;
	}

	public int getL1() {
		return l1;
	}

	public void setL1(int l1) {
		this.l1 = l1;
	}

	public int getL2() {
		return l2;
	}

	public void setL2(int l2) {
		this.l2 = l2;
	}

		//metodi
public int getArea(){
	return l1 * l2;
	}

public int getPrimeter(){
	return l1 * 2 + l2 * 2;
}

public int sumArea(){
	return getArea();
}
public int sumPerimeter(){
	return getPrimeter() ;
}
public int sum(){
	return getPrimeter() + getArea();
}
	public static void printAreaAndPerimeter(Square square) {
		System.out.println("L'area è: " + square.getArea());
		System.out.println("Il perimetro è: " + square.getPrimeter());
	}

	public static void printTwoSquare(Square s1, Square s2) {

		System.out.println("primo rettanangolo : ");
		s1.printAreaAndPerimeter(s1);
		System.out.println(" secondo rettangolo: ");
		s2.printAreaAndPerimeter(s2);
		System.out.println("la somma delle aree è: " +( s1.area + s2.area));

	}

}


