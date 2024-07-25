package logicaJava;

import java.util.Random;
import javax.swing.JOptionPane;

public class caixaeletronico {

	public void ex12() {
		int opcao = 0;
		int qtd[] = new int[7]; //Qtd notas
		int valor[] = {200,100,50,20,10,5,2}; //Valor das notas
		
		int notasCarregadas = 0; //verifica se a qtd foi carregada ou nao
		
		int saque = 0; //notas a ser sacadas
		int total = 0; //total sacado
		
		while (opcao != 9) {
			
			try {
				opcao = Integer.parseInt(JOptionPane.showInputDialog("1 - Carregar Quantidade de Notas \n2 - Sacar notas\n3 - Estatisticas\n9 - Fim"));
			} //Fim Try
			catch (NumberFormatException e) {
				JOptionPane.showMessageDialog(null, "Insira um número");
			} //Fim Catch
			
			switch(opcao) {
			case 1:
				carrega(qtd);
				JOptionPane.showMessageDialog(null, "Notas carregadas! Retirada liberada");
				notasCarregadas = 1;
			break;
			case 2:
				if (notasCarregadas == 1) {
					for (int i = 0 ; i < 7 ; i++) {
						if (qtd[i] > 0) { //Ignora notas se nao tem nenhuma no caixa
                            boolean validInput = false; // 
                            while (validInput != true) {
                                try {
                                    saque = Integer.parseInt(JOptionPane.showInputDialog("Notas totais de " + valor[i] + " reais no caixa: " + qtd[i] + "\n\nQuantas sacar?\n\nTotal sendo sacado: " + total));
                                    validInput = true; //Impede prosseguir sem um valor valido
                                } // Fim Try
                                catch (NumberFormatException e) {
                                    JOptionPane.showMessageDialog(null, "Insira um número");
                                } // Fim Catch
                            }
							
							if (saque > qtd[i]) {
								saque = qtd[i];
								total += (saque*valor[i]);
								qtd[i] = 0;
								JOptionPane.showMessageDialog(null,"Valor máximo de notas excedido, " + saque + " notas sacadas, saque atual = " + total);
							}
							else {
								qtd[i] =- saque;
								total += (saque*valor[i]);
							}
						} //Ignora notas = 0
					}
					JOptionPane.showMessageDialog(null, "Total sacado: " + total);
				}
				else {
					JOptionPane.showMessageDialog(null, "Carregue primeiro!");
				}
			break;
			}//Fim Switch
		} //Fim Loop
	}
	
	public int[] carrega(int caixa[]) {
		Random random = new Random();
		
		for (int i = 0 ; i < 7 ; i++) {
			caixa[i] = random.nextInt(150); //max 150 de cada nota no caixa
		}
		return caixa;	
	}
	
}
