/**
 * 
 * @author
 *         <h4>Corsano Matteo 4AI</h4> 13/05/2020
 *
 */

public class CorsanoMCLass {
	/**
	 * costruttore vuoto
	 */
	public CorsanoMCLass() {

	}

	/**
	 * 
	 * @param b
	 * @param e
	 * @return val1
	 */
	public float CorsanoMMet(int b, int e) {
		int val1 = 1;
		for (int i = 1; i <= b; i++) {
			val1 = val1 * b;
		}
		return val1;
	}

	/**
	 *
	 * CLASSE main
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CorsanoMCLass cm = new CorsanoMCLass();
		System.out.println(cm.CorsanoMMet(3, 7));

	}

}
