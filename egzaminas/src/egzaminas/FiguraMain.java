package egzaminas;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class FiguraMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//skaiciuokPlotus();
		Trikampis pirmas = new Trikampis();
		Staciakampis antras = new Staciakampis();
		Kvadratas trecias = new Kvadratas();
		Apskritimas ketvirtas = new Apskritimas();
		
		 List <figura> manoFiguros = new ArrayList<figura>();
		 manoFiguros.add(pirmas);
		 manoFiguros.add(antras);
		 manoFiguros.add(trecias);
		 manoFiguros.add(ketvirtas);
		
		 manoPlotai(16, 16, manoFiguros);
//		 skaiciuokPlotus();
		 
	}
	
	public static void manoPlotai (double a, double b, List<figura> figuruList) {	
		 Double plotas = (double) 0;
		 Map <figura, Double> figuruPlotai = new HashMap <figura, Double>();
		 for (int i = 0; i < figuruList.size(); i++)
		 {
			 if(figuruList.get(i) instanceof Kvadratas) {
				figuruList.get(i).skaiciuokPlota(a, 1);
				plotas = figuruList.get(i).getPlotas();
				figuruPlotai.put(figuruList.get(i), plotas);
			 }
			 else {
			figuruList.get(i).skaiciuokPlota(a, b);
			plotas = figuruList.get(i).getPlotas();
			figuruPlotai.put(figuruList.get(i), plotas);
//			System.out.println(figuruList.get(i).toString());
		 }
		 }
		 Set<Map.Entry<figura, Double>> visiPlotai = figuruPlotai.entrySet();
		 System.out.println(visiPlotai);

	}

	public static void skaiciuokPlotus() {
		DataCollect pirma = new DataCollect();
		pirma.surinkDuomenis();
		
		String figura = pirma.getFigure();
		if (figura.equals("trikampis"))
		{
			Trikampis trikampis = new Trikampis();
			trikampis.skaiciuokPlota(pirma.getA(), pirma.getB());
			System.out.println("Jusu pasirinkta figura - statusis trikampis. Jo plotas yra lygus " + trikampis.getPlotas());
		}
		else if (figura.equals("staciakampis")){
			Staciakampis staciakampis = new Staciakampis();
			staciakampis.skaiciuokPlota(pirma.getA(), pirma.getB());
			System.out.println("Jusu pasirinkta figura - staciakampis. Jo plotas yra lygus " + staciakampis.getPlotas());
		}
		else if (figura.equals("kvadratas")){
			Kvadratas kvadratas = new Kvadratas();
			kvadratas.skaiciuokPlota(pirma.getA(), 1);
			System.out.println("Jusu pasirinkta figura - kvadratas. Jo plotas yra lygus " + kvadratas.getPlotas());
		}
		else if (figura.equals("apskritimas")){
			Apskritimas apskritimas = new Apskritimas();
			apskritimas.skaiciuokPlota(pirma.getR(), Math.PI);
			System.out.println("Jusu pasirinkta figura - apskritimas. Jo plotas yra lygus " + apskritimas.getPlotas());
		}
		else
		{
			System.out.println("Tokios figuros nepazistu.");
			System.exit(0);		}

	}

}
