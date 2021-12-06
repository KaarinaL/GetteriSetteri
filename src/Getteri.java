
public class Getteri {

	public static void main(String[] args) {
		
		Kukka kukka = new Kukka(1,20,"punainen");
		kukka.tulostaTiedot();
		kukka.kasva();
		System.out.println("Uusi koko: " + kukka.getKoko() + " cm");

	}

} // getterin lopetus

class Kasvi
{
	protected int ika;
	protected int koko;
	
	public int getKoko() 
	{
		return koko;
	}

	public Kasvi()
	{
		ika = 0;
		koko = 0;
	}
	
	public Kasvi(int i,int j)
	{
		ika = i;
		koko = j;
	}
		
	public void tulostaTiedot()
	{
		System.out.println("Ikä: " + ika);
		System.out.println("Koko: " + koko);
	}
}

class Kukka extends Kasvi
{
	protected String vari;
	
	public Kukka()
	{
		ika = 0;
		koko = 0;
		vari = "";
	}
	
	public Kukka(int i,int j,String k)
	{
		ika = i;
		koko = j;
		vari = k;
	}
	
	public void kasva()
	{
		koko = koko + 1;
	}
	
	@Override
	public void tulostaTiedot()
	{
		System.out.println("Ikä: " + ika + " vuotta");
		System.out.println("Koko: " + koko + " cm");
		System.out.println("Väri: " + vari);
	}
}