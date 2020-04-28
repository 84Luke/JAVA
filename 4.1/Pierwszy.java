
public class Pierwszy {

	public static void main(String[] args) {
		new Pierwszy();

	}
	
	public Pierwszy()
	{
		Paczka telewizor = new Paczka(150,80,120,6000);
		int objetosc1 = telewizor.ObliczObj();
		
		System.out.println("Objêtoœæ paczki o rozmiarach : "+telewizor.PodajDlugosc()+" , "
		+telewizor.PodajSzerokosc()+" , "+telewizor.PodajWysokosc()+" , wynosi : "+objetosc1+".");
	}

}

class Paczka{
	private int dlugosc;
	private int szerokosc;
	private int wysokosc;
	private int wartosc;
	
	public Paczka(int aDl, int aSzer, int aWys, int aWart)
	{
		dlugosc = aDl;
		szerokosc = aSzer;
		wysokosc = aWys;
		wartosc = aWart;
	}
	
	public int PodajDlugosc()
	{
		return dlugosc;
	}
	
	public int PodajSzerokosc()
	{
		return szerokosc;
	}
	
	public int PodajWysokosc()
	{
		return wysokosc;
	}
	
	public int PodajWartosc()
	{
		return wartosc;
	}
	
	public int ObliczObj()
	{
		return dlugosc*szerokosc*wysokosc;
	}
	
	public int ObliczPodst()
	{
		return dlugosc*szerokosc;
	}
	
}
