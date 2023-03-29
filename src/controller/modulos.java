package controller;

import br.edu.fateczl.pilhaint.Pilha;

public class modulos {
	public modulos() {
		super();
	}
	
	public Pilha pilha = new Pilha();
	
	public int exerc2(int[] vet) throws Exception {
		int tamanho = vet.length;
		
		for(int i=0; i < tamanho; i++) {
			pilha.push(vet[i]);
			int x = pilha.pop();
			if(x >= 0) {
				pilha.push(x);
			}else {
				int p1 = pilha.pop();
				int p2 = pilha.pop();
				pilha.push(x);
				pilha.push(p1+p2);
			}
		}
		return pilha.size();
		
		
	}
	

	
}