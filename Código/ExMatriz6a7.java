package logicaJava;

import javax.swing.JOptionPane;

public class ExMatriz6a7 {
	FillMatrizVetor Fill = new FillMatrizVetor();
	static int vet6[] = new int[20]; 
	static int ex6done;

	public void Ex06() {
		//Esse exercício corresponde ao 6º da lista 1.3 do professor Ricardo Satoshi
		ex6done = 1;
		Fill.FillIntArray(vet6);
		int temp = 0;
		String Resultado = "";
		
		for (int i = 0; i<=18 ; i++) {
			for (int aux = (i+1) ; aux<=19 ; aux++) {
				if (vet6[i] > vet6[aux]) {
					temp = vet6[i];
					vet6[i] = vet6[aux];
					vet6[aux] = temp;
				}
			}
		Resultado += ("" + vet6[i] + ", ");
		}
		Resultado += ("" + vet6[19] + ". ");
		JOptionPane.showMessageDialog(null, Resultado);
	}
	
	public void Ex07() {
		int inicio = 0;
		int fim = 19;
		
		if (ex6done == 1) {
			int valor = Integer.parseInt(JOptionPane.showInputDialog("Insira um valor a ser buscado"));
			BuscaBinaria(valor, inicio, fim);
		}
		else {
			JOptionPane.showMessageDialog(null, "Essa atividade depende do exercício 06, selecione ele primeiro");
		}
	}
	
	public void BuscaBinaria(int alvo, int in, int fim) {
	    while (in <= fim) {
	        int meio = in + (fim - in) / 2;

	        if (vet6[meio] == alvo) {
	            JOptionPane.showMessageDialog(null, "O valor " + alvo + " foi encontrado na posição " + (meio+1));
	            return;
	        }

	        if (vet6[meio] < alvo) {
	            in = meio + 1;
	        } 
	        else {
	            fim = meio - 1;
	        }
	    }

	    JOptionPane.showMessageDialog(null, "Valor não encontrado");
	}
}	