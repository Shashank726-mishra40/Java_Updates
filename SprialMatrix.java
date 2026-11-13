import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[][] arr = { { 1, 2, 10 }, { 3, 2, 9 }, { 4, 1, 8 }, { 5, 6, 7 } };
		int r = arr.length;
		int c = arr[0].length;
		int srow = 0;
		int erow = r - 1;
		int scol = c - 1;
		int ecol = 0;
		while (srow <= erow && scol >= ecol) {
			// top
			for (int j = ecol; j <= scol; j++) {
				System.out.println(arr[srow][j]);
			}
			// right
			for (int k = srow + 1; k <= erow; k++) {
				System.out.println(arr[k][scol]);
			}
			// bottom
			if (srow < erow) {
				for (int l = scol - 1; l >= ecol; l--) {
					if (srow == erow)
						break;
					System.out.println(arr[erow][l]);
				}
			}
			// left
			if (scol > ecol) {
				for (int m = erow - 1; m > srow; m--) {
					if (ecol == scol)
						break;
					System.out.println(arr[m][ecol]);
				}
			}
			srow++;
			erow--;
			scol--;
			ecol++;

		}

	}
}
