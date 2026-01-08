//Esercizio #2
//telefonia cellulare.
//Scrivere un'applicazione che simula il funzionamento di un frammento del sistema informativo di un operatore di
//Si devono quindi rappresentare i dati relativi ad una carta SIM, ed in particolare:
//- il numero di telefono
//- il credito disponibile in euro
//- la lista delle ultime 5 chiamate effettuate
//Per ciascuna Chiamata deve essere rappresentata la durata in minuti e il numero chiamato
//La classe SIM dovrà fornire le seguenti funzionalita:
//- un costruttore che crea una SIM con numero di telefono passato come parametro, credito a O e lista delle
//chiamate vuota
//- una funzione per la stampa dei dati della SIM
//Scrivere un main che crei una istanza di SIM e ne stampi i dati.


package Entities.es2;

import java.util.Arrays;

public class Sim {
	@Override
	public String toString() {
		return "Sim{" +
				"calls=" + Arrays.toString(calls) +
				'}';
	}

	Calls[] calls;
}
