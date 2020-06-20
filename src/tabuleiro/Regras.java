package tabuleiro;

import java.util.Arrays;
import java.util.Scanner;

public class Regras {

	Scanner sc = new Scanner(System.in);
	Tratamento_erro te = new Tratamento_erro();

	public void jogo(String matriz[][], String j1, String j2) {

		int ganhou = 0;
		int jogadas = 0;
		int num = 0;

		while (ganhou != 1) {
			for (int x = 1; x <= 2; x++) {

				System.out.println("Jogador " + x + " digite um número da tabela.");
				num = te.erro();
				while ((num < 1) | (num > 9)) {
					System.out.println("Jogador " + x + " Opção Inválida! digite um número da tabela.");
					num = te.erro();
				}
				String op = "";
				if (x != 1)
					op = j2;
				else if (x != 2) {
					op = j1;
				}

				if (num == 1) {
					matriz[0][0] = op;
					jogadas = jogadas + 1;
				} else if (num == 2) {
					matriz[0][1] = op;
					jogadas = jogadas + 1;
				} else if (num == 3) {
					matriz[0][2] = op;
					jogadas = jogadas + 1;
				} else if (num == 4) {
					matriz[1][0] = op;
					jogadas = jogadas + 1;
				} else if (num == 5) {
					matriz[1][1] = op;
					jogadas = jogadas + 1;
				} else if (num == 6) {
					matriz[1][2] = op;
					jogadas = jogadas + 1;
				} else if (num == 7) {
					matriz[2][0] = op;
					jogadas = jogadas + 1;
				} else if (num == 8) {
					matriz[2][1] = op;
					jogadas = jogadas + 1;
				} else if (num == 9) {
					matriz[2][2] = op;
					jogadas = jogadas + 1;
				}

				for (String[] obj : matriz) {
					System.out.println(Arrays.toString(obj));
				}

				if ((matriz[0][0].equalsIgnoreCase("x")) & (matriz[1][1].equalsIgnoreCase("x"))
						& (matriz[2][2].equalsIgnoreCase("x"))
						| (matriz[0][0].equalsIgnoreCase("o")) & (matriz[1][1].equalsIgnoreCase("o"))
								& (matriz[2][2].equalsIgnoreCase("o"))) {
					System.out.println("O Jogador " + x + " ganhou!");
					ganhou = ganhou + 1;
					break;
				} else if ((matriz[0][0].equalsIgnoreCase("x")) & (matriz[1][0].equalsIgnoreCase("x"))
						& (matriz[2][0].equalsIgnoreCase("x"))
						| (matriz[0][0].equalsIgnoreCase("o")) & (matriz[1][0].equalsIgnoreCase("o"))
								& (matriz[2][0].equalsIgnoreCase("o"))) {
					System.out.println("O Jogador " + x + " ganhou!");
					ganhou = ganhou + 1;
					break;
				} else if ((matriz[0][1].equalsIgnoreCase("x")) & (matriz[1][1].equalsIgnoreCase("x"))
						& (matriz[2][1].equalsIgnoreCase("x"))
						| (matriz[0][1].equalsIgnoreCase("o")) & (matriz[1][1].equalsIgnoreCase("o"))
								& (matriz[2][1].equalsIgnoreCase("o"))) {
					System.out.println("O Jogador " + x + " ganhou!");
					ganhou = ganhou + 1;
					break;
				} else if ((matriz[0][2].equalsIgnoreCase("x")) & (matriz[1][2].equalsIgnoreCase("x"))
						& (matriz[2][2].equalsIgnoreCase("x"))
						| (matriz[0][2].equalsIgnoreCase("o")) & (matriz[1][2].equalsIgnoreCase("o"))
								& (matriz[2][2].equalsIgnoreCase("o"))) {
					System.out.println("O Jogador " + x + " ganhou!");
					ganhou = ganhou + 1;
					break;
				} else if ((matriz[0][0].equalsIgnoreCase("x")) & (matriz[0][1].equalsIgnoreCase("x"))
						& (matriz[0][2].equalsIgnoreCase("x"))
						| (matriz[0][0].equalsIgnoreCase("o")) & (matriz[0][1].equalsIgnoreCase("o"))
								& (matriz[0][2].equalsIgnoreCase("o"))) {
					System.out.println("O Jogador " + x + " ganhou!");
					ganhou = ganhou + 1;
					System.out.println(jogadas);
					break;
				} else if ((matriz[1][0].equalsIgnoreCase("x")) & (matriz[1][1].equalsIgnoreCase("x"))
						& (matriz[1][2].equalsIgnoreCase("x"))
						| (matriz[1][0].equalsIgnoreCase("o")) & (matriz[1][1].equalsIgnoreCase("o"))
								& (matriz[1][2].equalsIgnoreCase("o"))) {
					System.out.println("O Jogador " + x + " ganhou!");
					ganhou = ganhou + 1;
					break;
				} else if ((matriz[2][0].equalsIgnoreCase("x")) & (matriz[2][1].equalsIgnoreCase("x"))
						& (matriz[2][2].equalsIgnoreCase("x"))
						| (matriz[2][0].equalsIgnoreCase("o")) & (matriz[2][1].equalsIgnoreCase("o"))
								& (matriz[2][2].equalsIgnoreCase("o"))) {
					System.out.println("O Jogador " + x + " ganhou!");
					ganhou = ganhou + 1;
					break;
				} else if ((matriz[2][0].equalsIgnoreCase("x")) & (matriz[1][1].equalsIgnoreCase("x"))
						& (matriz[0][2].equalsIgnoreCase("x"))
						| (matriz[2][0].equalsIgnoreCase("o")) & (matriz[1][1].equalsIgnoreCase("o"))
								& (matriz[0][2].equalsIgnoreCase("o"))) {
					System.out.println("O Jogador " + x + " ganhou!");
					ganhou = ganhou + 1;
					break;
				} else if ((jogadas >= 9)) {
					System.out.println("Empate!");
					ganhou = ganhou + 1;
					break;
				}
			}
		}
	}
}
