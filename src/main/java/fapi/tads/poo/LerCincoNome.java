package fapi.tads.poo;

import java.util.Scanner;

import fapi.tads.poo.excption.NomeInvalidoException;

public class LerCincoNome {
	private Scanner scan = new Scanner(System.in);
	
	public String[] lerNome() throws NomeInvalidoException {
		
		System.out.print("Nome: ");
		String[] nome  = new String[5];
		NomeInvalidoException[] exp = new NomeInvalidoException[5];
		
		int cert, erra;
		cert = 0;
		erra = 0;
		
		
		LerNome lernome = new LerNome();
		
		for(int i = 0; i < nome.length;i++) {
			try{
				nome[i] = lernome.lerNome();
				cert++;
			}catch(NomeInvalidoException e) {
				exp[i] = e;
				erra++;
			}
		}
		System.out.println(cert+" nomes certos e "+erra+" errados");
		
		if(cert == 5) {
			return nome;
		}else {
			throw new NomeInvalidoException("Eita!","Eita");
		}
		
		
	}	
}
