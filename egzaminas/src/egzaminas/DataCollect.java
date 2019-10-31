package egzaminas;

import java.util.Scanner;

public class DataCollect {
	private String figure;
	private double a;
	private double b;
	private double r;
	
	public String getFigure() {
		return figure;
	}
	
	public double getA() {
		return a;
	}

	
	public double getB() {
		return b;
	}

	public double getR() {
		return r;
	}
	public void surinkDuomenis() {
		Scanner myScanner = new Scanner(System.in);
		System.out.println("Kokios figuros plota skaiciuosite (staciakampis, trikampis, kvadratas ar apskritimas)? ");
		this.figure = myScanner.next();
		
			if (figure.equals("trikampis") || figure.equals("staciakampis")) {
		System.out.println("Irasykite krastines a ilgi");
		this.a = myScanner.nextInt();
		
		System.out.println("Irasykite krastines b ilgi");
		this.b = myScanner.nextInt();}
			
			else if (figure.equals("apskritimas")) {
		System.out.println("Irasykite spinduli r");
		this.r = myScanner.nextInt();
		}
			else if (figure.equals("kvadratas")) {
				System.out.println("Irasykite krastines a ilgi");
				this.a = myScanner.nextInt();
			}
			else {
				System.out.println("Irasykite krastines a ilgis");
				System.exit(0);
			}
		
	}
	
	void DataCollect() {
	}
	
}
