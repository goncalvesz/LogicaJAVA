package logicaJava;

import javax.swing.JOptionPane;

public class ExMatriz1a5 {
	
	FillMatrizVetor Fill = new FillMatrizVetor();
	public void Ex01(){
		//Esse exercício corresponde ao 1º da lista 1.3 do professor Ricardo Satoshi

		int vet[] = new int[50];
		int aux; //Vai percorrer os 50 valores de Vet
		int soma = 0; //Armazena a soma dos numeros entre 10 e 200
		int qtd = 0; //Armazena a quantidade de números entre 10 e 200
		int impares = 0; //Valor dos números ímpares
		
		Fill.FillIntArray(vet);
		
		for (aux = 0; aux <50 ; aux++) {
			if (vet[aux] > 9 && vet[aux] < 201) {
				soma = soma + vet[aux];
				qtd++;
			}
			if (vet[aux]%2 != 0) {
				impares = impares + vet[aux];
			}
		}
		JOptionPane.showMessageDialog(null, "Houveram " + qtd + " numeros entre 10 e 200, a media desses numeros e aproximadamente " + (soma/qtd) + "\n A soma de todos os numeros impares do vetor e " + impares);
	}
	
	public void Ex02(){
		//Esse exercício corresponde ao 2º da lista 1.3 do professor Ricardo Satoshi
		int vet[] = new int[100];
		int aux;
		int soma = 0;
		int maior = 0;
		int menor = 500;
		
		Fill.FillIntArray(vet);
		for (aux = 0; aux < 100 ; aux++) {
			soma = (soma +vet[aux]);
			if (vet[aux] > maior ) {
				maior = vet[aux];
			}
			
			if (vet[aux] < menor) {
				menor = vet[aux];
			}
		}
		JOptionPane.showMessageDialog(null, "A média de todos os valores foi " + (soma/100) + " \nO menor valor foi " + menor + "\nO maior valor foi " + maior);
	}
	
	public void Ex03() {
		//Esse exercício corresponde ao 3º da lista 1.3 do professor Ricardo Satoshi
		int vet1[] = new int [3]; Fill.FillIntArray(vet1);
		int vet2[] = new int [3]; Fill.FillIntArray(vet2);
		int vet3[] = new int[6];
		String resultado="";
		
		for (int aux = 0 ; aux < 3 ; aux++) {
			vet3[aux] = vet1[aux];
			vet3[(aux+3)] = vet2[aux];
		}
		for (int aux=0 ; aux <3 ; aux++) {
			resultado += ("O " + (aux+1) + " valor do vetor I é igual a " + vet1[aux] + "\n");
		}
		resultado += ("----------\n");
		for (int aux=0 ; aux <3 ; aux++) {
			resultado += ("O " + (aux+1) + " valor do vetor II é igual a " + vet2[aux] + "\n");
		}
		resultado += ("----------\n");
		for (int aux = 0 ; aux<6 ; aux++) {
			resultado += ("O " + (aux+1) + " valor do vetor III é igual a " + vet3[aux] + "\n");
		}
		JOptionPane.showMessageDialog(null, resultado);
	}
	
	public void Ex04() {
		//Esse exercício corresponde ao 4º da lista 1.3 do professor Ricardo Satoshi
		float vet[] = new float [30];
		float media=0;
		String menor ="";
		int maior = 0;
		
		for (int i=0 ; i<30 ; i++) {
			vet[i] = ((float) (Math.random() * 10));
			media = media + vet[i];
		}
		media = media/30;
		for (int i=0; i <30; i++) {
			if (vet[i]>media) {
				maior++;
			}
			if (vet[i]<media) {
				menor = menor + ("\nAluno " + (i+1));
			}
		}
		JOptionPane.showMessageDialog(null,"Media = " + media + "\nQuantidade de notas acima da média: " + maior + "\nAlunos com nota abaixo da média: " + menor);
	}
	
	public void Ex05(){
		//Esse exercício corresponde ao 5º da lista 1.3 do professor Ricardo Satoshi
		int vet[] = new int[20]; Fill.FillIntArray(vet);
		double resultado=0;
		
		for (int i =0 ; i<10 ; i++) {
			resultado += (vet[0] - vet[19 - i]);
		}
		JOptionPane.showMessageDialog(null, "resultado: " + resultado);
	}

}

