package arrays;

public class EjemploMatriz {

	public static void main(String[] args) {
		double acumulado;
		double interes;

		double[][] saldo = new double[5][6];

		for (int i = 0; i < 5; i++) {
			interes = 0.10;
			for (int j = 0; j < 6; j++) {
				if (i == 0) {
					acumulado = 10000;
					saldo[i][j] = acumulado;
				} else {
					acumulado = saldo[i - 1][j];
					saldo[i][j] = acumulado + (acumulado * interes);
					interes = interes + 0.01;
				}
				
			}
		}

		for (double[] fila : saldo) {

			for (double numero : fila) {
				System.out.printf("%.2f",numero);
				System.out.print(" ");
			}

			System.out.println();
		}

	}

}
