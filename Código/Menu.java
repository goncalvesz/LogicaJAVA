package logicaJava;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class Menu {
	public static void main (String args[]) {
		StringBuilder conteudoDeTexto = new StringBuilder(); //StringBuilder permite o uso de Append, que adiciona linhas
		ExMatriz1a5 ex15 = new ExMatriz1a5();
		ExMatriz6a7 ex67 = new ExMatriz6a7();
		ExMatriz8a13 ex813 = new ExMatriz8a13();
		caixaeletronico cx = new caixaeletronico();
		
		try (BufferedReader reader = new BufferedReader(new FileReader("menu.txt"))) { //Como o leitor pode ler de diversas fontes, o FileReader especifica que é um .txt
            String linha; //Armazena temp cada linha individual
            while ((linha = reader.readLine()) != null) { // Enquanto linha != vazio
                conteudoDeTexto.append(linha).append("\n"); //Recebe o valor da varíavel linha e "\n" a cada loop
            }
            reader.close(); //Fecha o leitor
        } catch (IOException e) {
            e.printStackTrace();
        }
		
		int opt = 0;
		while (opt != 99) {
			
			try { //A linha abaixo interrompe os passos posteriores caso o valor inserido seja invalido
				opt = Integer.parseInt(JOptionPane.showInputDialog(null, conteudoDeTexto.toString(), "menu"));
				switch (opt) {
				case 1:
					ex15.Ex01();
				break;	
				case 2:
					ex15.Ex02();
				break;
				case 3:
					ex15.Ex03();
				break;
				case 4:
					ex15.Ex04();
				break;
				case 5:
					ex15.Ex05();
				break;
				case 6:
					ex67.Ex06();
				break;	
				case 7:
					ex67.Ex07();
				break;	
				case 8:
					ex813.ex08();
				break;
				case 9:
					ex813.ex09();
				break;
				case 10:
					ex813.ex10();
				break;
				case 11:
					ex813.ex11();
				break;
				case 12:
					cx.ex12();
				break;
				case 99:
					JOptionPane.showMessageDialog(null, "Fim!");
				break;
				default:
					JOptionPane.showMessageDialog(null, "Valor Inválido!!!");
				break; 
				} //Fim Switch 
			} //Fim Try
			catch (NumberFormatException nfe) {
				JOptionPane.showMessageDialog(null, "Insira um número!!!");
			} //Fim Catch
		} //Fim Loop de execução
	} // Fim main
} //Fim class
