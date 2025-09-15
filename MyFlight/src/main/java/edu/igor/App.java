package edu.igor;

import java.time.Duration;
import java.time.LocalDateTime;

public class App {
	public static void main(String[] args) {
		System.out.println("\nMyFlight project...");

		LocalDateTime datahora = LocalDateTime.of(2025, 9, 15, 11, 30);
		Duration duracao = Duration.ofMinutes(120);
        
		// Tópico 2 (Exercio 1) -

		// Longitude e Latitude de POA -
		Geo geoPOA = new Geo(-30.033056, -51.23);
		// Cia Aérea -
		CiaAerea cia = new CiaAerea("LATAM", "LAT444");
		// Aeroportos -
		Aeroporto poa = new Aeroporto("POA", "Salgado Filho", geoPOA);
		// Aeronave -
		Aeronave aeronave = new Aeronave("666", "Airbus 666");
		// Rota - 
		Rota rota = new Rota(cia, poa, poa, aeronave);
		// Voo -
		Voo voo = new Voo(rota, datahora, duracao);
		
		// Teste de distancia de GEO -> Tópico 3 (Exercio 2)
		Geo geoGRU = new Geo(-23.4321, -46.4731);
		double distancia = Geo.distancia(geoPOA, geoGRU);
		System.out.println("Distância entre POA e GRU: " + distancia + " km");
	}
}
