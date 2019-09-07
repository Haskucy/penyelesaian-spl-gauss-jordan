public class ProgramMain {
	public static void main(String[] args) {

		int banyakPersamaan = 3;
		int banyakUnknown = 4;
		String[] koefisien = {"1 2 3 4 100", "2 1 0 0 125", "0 4 5 3 200"};

		IsiMatrix program = new IsiMatrix(banyakPersamaan,banyakUnknown);

		for (int i = 0; i < banyakPersamaan;i++)
			program.inputMatrixAug(i, koefisien[i]);

		program.isiMatrix();
		program.runner();



	}

}
