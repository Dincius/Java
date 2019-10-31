/**
 * 
 */
package egzaminas;

/**
 * @author PC
 *
 */
public class Trikampis implements figura {

	private double plotas;
	
	@Override
	public void skaiciuokPlota(double a, double b) {
		this.plotas = (a * b)/2;	
	}

	@Override
	public double getPlotas() {
		// TODO Auto-generated method stub
		return plotas;
	}
	
	void Trikampis() {
	}
	
	public String toString() {
	return "Trikampio plotas yra ";
	}
}
