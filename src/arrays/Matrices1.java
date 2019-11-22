package arrays;

public class Matrices1 {

	public static void main(String[] args) {
		int [][] matrix = new int[4][5];
		
		matrix[0][0] = 14;
		matrix[0][1] = 12;
		matrix[0][2] = 12;
		matrix[0][3] = 16;
		matrix[0][4] = 18;
		
		matrix[1][0] = 54;
		matrix[1][1] = 132;
		matrix[1][2] = 123;
		matrix[1][3] = 15;
		matrix[1][4] = 48;
		
		matrix[2][0] = 524;
		matrix[2][1] = 432;
		matrix[2][2] = 223;
		matrix[2][3] = 15;
		matrix[2][4] = 18;
		
		matrix[3][0] = 594;
		matrix[3][1] = 232;
		matrix[3][2] = 23;
		matrix[3][3] = 5;
		matrix[3][4] = 4;
		
//		System.out.println(matrix[3][0]);
		
		for(int i=0; i<4; i++) {
			for(int j=0; j<5; j++) {
				System.out.print(matrix[i][j]+" ");
			}
			System.out.println();
		}
	}

}
