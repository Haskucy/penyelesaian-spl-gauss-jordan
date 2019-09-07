
public class IsiMatrix {
	private static int baris = 0;
	private static int unknown = 0;
	private static int koefisienMatrixAug = unknown+1;
	private static int[][] matrixAug = new int[baris][unknown+1];



	public IsiMatrix(int baris1, int unknown1) {
		this.baris = baris1;
		this.unknown = unknown1;
		this.koefisienMatrixAug = unknown+1;
		this.matrixAug = new int[baris][unknown+1];
	}

	public void inputMatrixAug(int barisSaatIni, String koefisienMatrix) {
		int barisIni = barisSaatIni;
		String[] koefisien = koefisienMatrix.split(" ");

		for (int i = 0; i < koefisien.length; i++)
			IsiMatrix.matrixAug[barisIni][i] = Integer.parseInt(koefisien[i]);
	}

	public void isiMatrix() {
		for(int i = 0; i< IsiMatrix.baris; i++) {
			for(int j = 0; j<IsiMatrix.koefisienMatrixAug; j++) {
				System.out.print(matrixAug[i][j] + " ");
			}
			System.out.println();
		}
	}

	public void runner() {
		System.out.println("isiMatrix -> banyak persamaan : " + IsiMatrix.baris + ", banyak unknown : " + IsiMatrix.unknown );
	}

}
