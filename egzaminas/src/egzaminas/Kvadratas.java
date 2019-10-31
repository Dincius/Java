package egzaminas;

public class Kvadratas extends Staciakampis implements figura{
	
	private double plotas;

	public void skaiciuokPlota(double a, double b) {
		b = 1;
		plotas = a * a;
		this.plotas = getPlotas();
	}

	public double getPlotas() {
		// TODO Auto-generated method stub
		return plotas;
	}
	
	public Kvadratas() {
		super();
	}
	
	public String toString() {
	return "Kvadrato plotas yra ";
	}

}
