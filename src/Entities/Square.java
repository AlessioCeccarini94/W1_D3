//Esercizio #1
//Creare una classe Rettangolo che permetta di rappresentare dei rettangoli. Per ogni rettangolo deve essere possibile
//specificare altezza e larghezza in fase di costruzione dell'istanza e devono essere realizzati i metodi per
//calcolare perimetro ed area.
//Realizzare un metodo stampaRettangolo che, dato un Rettangolo, stampi a video area e perimetro.
//Realizzare un metodo stampaDueRettangoli che, dati due rettangoli, stampi area e perimetro di ognuno e quindi la
//somma delle aree e dei perimetri.
//Scrivere un main che utilizzi tutte queste funzioni.


package Entities;

public class Square {
	//attributi
	private static int numberOfSquare=0;

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
	public int getL3() {
		return l3;
	}

	public void setL3(int l3) {
		this.l3= l3;
	}
	public int getL4() {
		return l4;
	}

	public void setL4(int l4) {
		this.l4 = l4;
	}

	//attributi oggetto
	private int l1;
	private int l2;
	private int l3;
	private int l4;
	//costruttore
	public Square(int l1,int l2) {
		this.l1 = l1;
		this.l2 = l2;
		numberOfSquare++;
	}

	public Square(int l1, int l2, int l3, int l4) {
		this.l1 = l1;
		this.l2 = l2;
		this.l3 = l3;
		this.l4 = l4;
		numberOfSquare++;
	}
		//metodi
public int getArea(){
	return l1 * l2;
	}
	public int getScndArea(){
		return l3 * l4;
	}
public int getPrimeter(){
	return l1 * 2 + l2 * 2;
}
	public int getScndPrimeter(){
		return l3 * 2 + l4 * 2;
	}
public int sumArea(){
	return getArea() + getScndArea();
}
public int sumPerimeter(){
	return getPrimeter() + getScndPrimeter();
}
public int sum(){
	return getScndPrimeter() + getScndPrimeter() + getArea() + getScndArea();
}

public void printAreaAndPerimeter(){
		System.out.println("L'area è: "+getArea());
		System.out.println("La seconda area è: "+getScndArea());
	    System.out.println("Il perimetro è: " + getPrimeter());
		System.out.println("Il secondo perimetro é: "+getScndPrimeter());
	}

}


