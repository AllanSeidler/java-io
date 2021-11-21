package br.com.alura.java.io.teste;

import java.io.FileReader;
import java.io.FileWriter;
import java.util.Properties;

public class TestaProperties {

	public static void main(String[] args) throws Exception {
		//import deve ser java.util.Properties
		Properties props = new Properties(); 
		
		//chave, valor
		props.setProperty("login", "alura"); 
		props.setProperty("senha", "alurapass");
		props.setProperty("endereco", "www.alura.com.br");
		
		props.store(new FileWriter("conf.properties"), "algum comentário");
		
//		O RESULTADO:	
//		#algum comentário
//		#Thu May 10 14:29:38 BRT 2018
//		senha=alurapass
//		login=alura
//		endereco=www.alura.com.br
		
		Properties props2 = new Properties();        
		props2.load(new FileReader("conf.properties"));

		String login = props2.getProperty("login");
		String senha = props2.getProperty("senha");
		String endereco = props2.getProperty("endereco");

		System.out.println(login + ", " + senha  + ", " +  endereco);
	}
}
