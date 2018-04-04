package br.com.caelum.jdbc.teste;


import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import br.com.caelum.jdbc.dao.ContatoDao;
import br.com.caelum.jdbc.modelo.Contato;

public class TestaLista {

	public static void main(String[] args) {
		
		ContatoDao dao = new ContatoDao();
		List<Contato> contatos = dao.getLista();
		
		for(Contato contato : contatos){
			System.out.println("Nome: " + contato.getNome());
			System.out.println("Email: " + contato.getEmail());
			System.out.println("Endereço: " + contato.getEndereco());
			Calendar c = contato.getDataNascimento();
			Date d = c.getTime();
			SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
			String formatada = sdf.format(d);
			
			
			System.out.println("Data de Nascimento: " + formatada);
			//System.out.println("Data de Nascimento: " + contato.getDataNascimento().getTime() + "\n");
			
		}

	}

}
