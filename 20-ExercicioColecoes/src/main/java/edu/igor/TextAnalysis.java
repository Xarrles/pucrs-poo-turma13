package edu.igor;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Map;


public class TextAnalysis {
	private final Map<String, String> dicionario = new HashMap<>();
	
	public TextAnalysis(String[] files) {
		for (String fname : files ) {
			this.carregaDados(fname);
		}
	}
	
	public void listarArquivos(String palavra) {
		palavra = palavra.toLowerCase();

		for (String chave : dicionario.keySet()){
			String text = dicionario.get(chave);

			if (text.contains(palavra)){
				System.out.println("Arquivo " + chave + " Contém a palavra " + palavra);
			}
		}
	}
	
	public void listarArquivos(String[] palavras) {
		boolean find = true;
		for (String chave : dicionario.keySet()){
			for (String palavra : palavras){
				String text = dicionario.get(chave);

				if (!text.contains(palavra)){
					find = false;
					break;
				}
			if (find ==  true){}
					System.out.println("Arquivo " + chave + " Contém a palavra " + palavras.toString());
			}
		}

				

	}
	
	public void listarPalavras(String fileName) {
	}
	
	public void listarPalavrasComuns(String f1, String f2) {
		
	}

	private void carregaDados(String fileName) {
		Path path1 = Paths.get(fileName);
		//System.out.println("\nArquivo: "+fileName);

		try (BufferedReader reader = Files.newBufferedReader(path1, Charset.forName("utf8"))) {
			String line;
			while ((line = reader.readLine()) != null) {
				line = line.toLowerCase().replaceAll("[^a-zA-Záéíóúçãõà-]"," ");
				// aqui vc tem de fazer...
				String [] palavras = line.split(" ");
				
				if (dicionario.containsKey(fileName)){
					line = dicionario.get(fileName)  + " " + line;
				}
				dicionario.put(fileName, line);

			}

			System.out.println();

		} catch (IOException e) {
			System.out.println("Erro na leitura: "+e.getMessage());
		}
	}
}

