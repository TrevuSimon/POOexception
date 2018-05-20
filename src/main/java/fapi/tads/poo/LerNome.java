package fapi.tads.poo;

import java.util.Scanner;

import fapi.tads.poo.excption.NomeInvalidoException;

public class LerNome {
	private Scanner scan = new Scanner(System.in);
	
	public String lerNome() throws NomeInvalidoException{
		System.out.print("Nome: ");
		String nome = scan.nextLine();
		if(nome.charAt(0) == '_') {
			throw new NomeInvalidoException("Nome invalido, contém _", nome);
		}else {
			return nome;
		}
	}

}
