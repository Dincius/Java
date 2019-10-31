package egzaminas;

public class Staciakampis implements figura {

	private double plotas;

	@Override
	public void skaiciuokPlota(double a, double b) {
		plotas = a * b;	
	}

	@Override
	public double getPlotas() {
		// TODO Auto-generated method stub
		return plotas;
	}
	
	void Staciakampis() {
	}
	
	public String toString() {
	return "Staciakampio plotas yra ";
	}

}
