package logicaJava;

import javax.swing.JOptionPane;

public class ExMatriz8a13 {
	FillMatrizVetor Fill = new FillMatrizVetor();
	
	public void ex08(){
		int mat[][] = new int[4][3]; Fill.FillIntMatriz(mat);
		String Matriz = "";
		int aux = 0;
		int temp = 0;
		int totais = 0;
		
		for (int x = 0 ; x < 4 ; x++) { //Imprime Matriz
			for (int y = 0 ; y < 3 ; y++) {
				Matriz += ("" + mat[x][y] + " | ");
				totais += mat[x][y];
			}
		Matriz += "\n";
		} 
		
		for (int y = 0 ; y < 3 ; y++) {//Vendas mensais de cada produto
			for (int x = 0 ; x < 4 ; x++) {
				temp += mat[x][y];
			}
		Matriz += ("\nO produto " + (aux+1) + " vendeu " + temp + " vezes");
		temp=0; aux++;
		}
		aux=0;
		Matriz += "\n";
		
		for (int x = 0 ; x < 4 ; x++) { //vendas totais por semana
			for (int y= 0 ; y < 3 ; y++) {
				temp += mat[x][y];
			}
		Matriz += ("\nForam vendidos " + temp + " produtos na semana " + (aux+1));
		temp=0; aux++;
		}
		Matriz += "\n";
		
		Matriz += ("\nProdutos totais vendidos:  " + totais);
		JOptionPane.showMessageDialog(null, "" + Matriz);
	}

	public void ex09() {
		int mat[][] = new int [8][8];
		Fill.FillIntMatriz(mat);
		int potencia = 0;
		String Matriz = "";
		
		for (int x = 0 ; x < 8 ; x++) {
			for (int y = 0 ; y < 8 ; y++) {
				if (x == y) {
					mat[x][y] = (int) java.lang.Math.pow(4, potencia);
					potencia++;
				}
				Matriz += (mat[x][y] + " | ");
			}
			Matriz +="\n";
		}
		JOptionPane.showMessageDialog(null, Matriz);
	}
	
	public void ex10() {
		int mat[][] = new int[8][8]; Fill.FillIntMatriz(mat);
		String Matriz = "";
		int soma = 0;
		
		for (int x = 0 ; x < 8 ; x++) {
			for (int y = 0 ; y < 8 ; y++) {
				if (y == 7) {
	                Matriz += ("" + soma + " | ");
				}
				else {
	                Matriz += ("" + mat[x][y] + " | ");
	                soma += mat[x][y]; 
				}
			}
		soma=0;
		Matriz += "\n";
		}
		JOptionPane.showMessageDialog(null, Matriz);
	}

	public void ex11() {
		int mat[][] = new int[8][8];
		String res = "";
		
		
		for (int aux = 1 ; aux <= 4 ; aux++) { //preenche
			for (int x = (aux-1) ; x <= (8-aux) ; x++) {
				for (int y = (aux-1) ; y<= (8-aux) ; y++) {
					mat[x][y] = aux;
				}
			}
		}
		for (int x = 0 ; x<8 ; x++) { //mostra
			for (int y = 0 ; y<8 ; y++) {
				res += ("" + mat[x][y] + " | ");
			}
			res += ("\n");
		}
		JOptionPane.showMessageDialog(null, res);
	}

}

