package edu.igor;

import java.util.ArrayList;

public class GerenciadorCias {
	private ArrayList<CiaAerea> empresas;
	
	public GerenciadorCias() {
		empresas = new ArrayList<>();
	}

	public void adicionar(CiaAerea cia) {
		empresas.add(cia);
	}

	public ArrayList<CiaAerea> listarTodas(){
		return null;
	}

	public CiaAerea buscarCodigo(String codigo){
		return null;
	}

	public CiaAerea buscarNome(String nome){
		return null;
	}

}
