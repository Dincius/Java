package egzaminas;

public class Apskritimas implements figura {
	private double plotas;

	public double getPlotas() {
		// TODO Auto-generated method stub
		return plotas;
	}
	
	void Apskritimas() {
	}

	@Override
	public void skaiciuokPlota(double a, double b) {
		b = Math.PI;
		plotas = Math.pow(a, 2) * b;
		plotas = Math.round(plotas);
		
	}
	
	public String toString() {
	return "Apskritimo plotas yra ";
	}

}
