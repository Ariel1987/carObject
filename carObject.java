package carObject;

public class carObject {
	public int portas;
	public String cor;
	public int ano;
	public String modelo;
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		carObject ford = new carObject();
		ford.portas = 4;
		ford.cor = "azul";
		ford.ano = 1987;
		ford.modelo = "Ford";
		
		carObject fiat = new carObject();
		fiat.portas = 2;
		fiat.cor = "preto";
		fiat.ano = 1999;
		fiat.modelo = "Fiat";
		
		carObject gm = new carObject();
		gm.portas = 3;
		gm.cor = "branco";
		gm.ano = 2015;
		gm.modelo = "GM";
		
		carObject wv = new carObject();
		wv.portas = 4;
		wv.cor = "branco";
		wv.ano = 2018;
		wv.modelo = "WV";
		
		System.out.println(ford.portas);
		System.out.println(ford.cor);
		System.out.println(ford.ano);
		System.out.println(ford.modelo);
		
		System.out.println(fiat.portas);
		System.out.println(fiat.cor);
		System.out.println(fiat.ano);
		System.out.println(fiat.modelo);

		System.out.println(gm.portas);
		System.out.println(gm.cor);
		System.out.println(gm.ano);
		System.out.println(gm.modelo);

		System.out.println(wv.portas);
		System.out.println(wv.cor);
		System.out.println(wv.ano);
		System.out.println(wv.modelo);
		 
	}
	
}


