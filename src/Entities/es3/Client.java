//Cliente
//- codice cliente
//- nome e cognome
//- email
//- data iscrizione



package Entities.es3;

import java.time.LocalDate;
import java.util.Random;

public class Client {
	//ATTRIBUTI
	private final int codClient;
	private String nameSurname;
	private String email;
	private LocalDate dataDiIscrizione;

	public Client( String nameSurname, String email, LocalDate dataDiIscrizione) {
		Random rndm = new Random();
		this.codClient = rndm.nextInt(1, 1000);
		this.nameSurname = nameSurname;
		this.email = email;
		this.dataDiIscrizione = dataDiIscrizione;
	}
}
