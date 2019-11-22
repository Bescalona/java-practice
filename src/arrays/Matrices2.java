package arrays;

public class Matrices2 {

	public static void main(String[] args) {
		int [][] matrix = {
				{10,12,33,44,12},
				{12,55,78,23,22},
				{12,67,23,78,22},
				{34,99,55,32,87}
		};
		
//		for(int i=0; i<4; i++) {
//			for(int j=0; j<5; j++) {
//				System.out.print(matrix[i][j]+" ");
//			}
//			System.out.println();
//		}
		
		for(int[]fila:matrix) {
			
			for(int numero:fila) {
				System.out.print(numero+" ");
			}
			
			System.out.println();
		}
		
	}

}
