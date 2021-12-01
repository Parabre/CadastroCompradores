package controller;

import java.util.Hashtable;

import javax.swing.JOptionPane;

public class Cadastro {
	
	public static void main(String[] args) {
		Hashtable<String, Comprador> mapaComprador = new Hashtable<String, Comprador>();
		
		boolean exibeMenu = true;
		while (exibeMenu) {
			int opcao = Integer.parseInt(JOptionPane.showInputDialog(null, "Escolha uma das opções \n "
					+ "1- Cadastrar Comprador \n 2- Visualizar chaves Hash" + "\n 3- Sair"));
			
			switch (opcao) {
			case 1:
				Comprador comprador = new Comprador();
				comprador.nome =  String.valueOf(JOptionPane.showInputDialog(null, "Digite um Nome"));
				comprador.cpf =  Integer.valueOf(JOptionPane.showInputDialog(null, "Digite um CPF"));
				comprador.telefone =  Integer.valueOf(JOptionPane.showInputDialog(null, "Digite um Telefone"));
				comprador.rg =  Integer.valueOf(JOptionPane.showInputDialog(null, "Digite um RG"));
				mapaComprador.put(comprador.nome, comprador);
				break;
			case 2:
				System.out.println(mapaComprador.keySet());
				break;
			case 3:
				exibeMenu = false;
				break;
			default:
				System.err.println("Escolha uma opção entre 1 a 3");
				break;
			}
		}
		
	}

}
