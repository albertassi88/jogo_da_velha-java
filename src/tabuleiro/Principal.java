package tabuleiro;

import java.util.Arrays;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {

		String[][] matriz = new String[3][3];
		Scanner sc = new Scanner(System.in);

		int c = 1;
		for (int a = 0; a < matriz.length; a++) {
			for (int b = 0; b < matriz.length; b++) {
				matriz[a][b] = String.valueOf(c);
				c++;
			}
		}

		for (String[] obj : matriz) {
			System.out.println(Arrays.toString(obj));
		}

		String j2 = "";
		System.out.println("");
		System.out.println("Jogador 1 você escolhe a letra 'X' ou 'O'?");
		String j1 = sc.nextLine();
		while ((!j1.equalsIgnoreCase("x")) & (!j1.equalsIgnoreCase("o"))) {
			System.out.println("Opção Inválida! Digite a letra 'X' ou 'O'!");
			j1 = sc.nextLine();
		}
		if (j1.equalsIgnoreCase("x")) {
			j2 = "o";
		} else if (j1.equalsIgnoreCase("o")) {
			j2 = "x";
		}
		System.out.println("Jogador 2, sua letra vai ser " + j2.toUpperCase() + "!");
		System.out.println("");
	
		Regras regras = new Regras();
		regras.jogo(matriz, j1, j2);
	}
}