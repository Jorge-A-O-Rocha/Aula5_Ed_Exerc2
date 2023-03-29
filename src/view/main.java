package view;

import controller.modulos;

public class main {
	public static void main(String[] args) throws Exception {
		modulos mod = new modulos();
		
		int vet[] = {0, 5, 7, -4, 3, 5, -2, -1, 10, 4, 3, -6, 2, -9, 1, -5};
		
		System.out.println("Há "+ mod.exerc2(vet)+ " elementos na pilha.");
	}

}
