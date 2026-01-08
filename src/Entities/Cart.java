//Carrello
//- Cliente associato
//- elenco articoli (Articolo[])
//- totale costo articoli


package Entities;

public class Cart {
    private double tot;
	private Client client;
	private Articolo[] articolo;

public Cart(Client client, Articolo[] articolo) {
	this.client = client;
	this.articolo = new Articolo[0];
}
}
