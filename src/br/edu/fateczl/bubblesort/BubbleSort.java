package br.edu.fateczl.bubblesort;

public class BubbleSort {

	public BubbleSort() {
		super();
	}
	
	public int [] Bubble(int [] vetor) {
		int tamanho = vetor.length;
		int aux;
		
		for(int i = 0; i < tamanho; i++) {
			for(int j = 0; j < tamanho - 1; j++) {
				if(vetor[j] > vetor[j+1]) {
					aux = vetor[j];
					vetor[j] = vetor[j+1];
					vetor[j+1] = aux;
				}
			}
		}
		return vetor;
		
		}
}