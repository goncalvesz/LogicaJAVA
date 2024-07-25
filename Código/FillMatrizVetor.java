package logicaJava;

import java.util.Random;

public class FillMatrizVetor {
	Random random = new Random();
	public int[] FillIntArray(int array[]) {
		for (int aux = 0 ;(aux < array.length) ; aux++) {
			array[aux] = random.nextInt(500); //Para essas demonstrações não atingirem válores absurdamente altos, estipulei um limite de até 500 em cada valor inteiro
		}
		return array;
	}
	public int[][] FillIntMatriz(int array[][]){
		for (int x = 0 ; (x < array.length) ; x++) { //horizontal
			for (int y=0 ; y < array[0].length ; y++) { //vertical
				array[x][y] = random.nextInt(500);
			}
		}
		return array;
	}
}
