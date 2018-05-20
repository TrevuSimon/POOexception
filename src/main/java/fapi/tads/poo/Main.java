package fapi.tads.poo;

import fapi.tads.poo.excption.NomeInvalidoException;

public class Main {

	public static void main(String[] args) {
		LerNome lerNome = new LerNome();
		
		try {
			String nome = lerNome.lerNome();
			System.out.println("Nome correto!");
		}catch(NomeInvalidoException e) {
			System.out.println("Erro!\n"+e.getMessage()+" nome:"+e.getNome());
		}
		
	}
}
