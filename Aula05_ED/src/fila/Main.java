package fila;

import pilha.Pilha;

public class Main {
	public static void main(String[] args) {
		Pilha objPilha = new Pilha();
		for (int i = 0; i < 100000; i++) {
			objPilha.push(i);
			
		}
		
		for (int i = 0; i < 200000; i++) {
			objPilha.pop();
		}
	}
}
