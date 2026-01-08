//Esercizio #3
//Scrivere un'applicazione che simula il funzionamento di un e-commerce.
//Si devono quindi rappresentare i dati relativi i seguenti elementi:
//Articolo
//- codice articolo
//- descrizione articolo
//- prezzo
//- numero pezzi disponibili a magazzino


package Entities;

public class Articolo {
	//ATTRIBUTI
	private static int stockProduct;

	//COSTRUTTORE
	private String codiceArticolo;
	private String descrzioneArticolo;
	private int prezzo;
	private int stock = stockProduct;

	public Articolo(String codiceArticolo, String descrizioneArticolo, int prezzo, int stock) {
		this.codiceArticolo = codiceArticolo;
		this.descrzioneArticolo = descrizioneArticolo;
		this.prezzo = prezzo;
		this.stock = stock;
		stockProduct--;
	}
}
