package carObject;

public class carObject {
	public int portas;
	public String cor;
	public int ano;
	public String modelo;
	
	public void imprimir() {
        System.out.println("Quantidade de portas: " + portas);
        System.out.println("Cor: " + cor);
        System.out.println("Ano: " + ano);
        System.out.println("Modelo: " + modelo);
         
  }
   
  public int getPortas() {
        return portas;
  }
  public void setPortas(int portas) {
        this.portas = portas;
  }
  public String getCor() {
        return cor;
  }
  public void setCor(String cor) {
        this.cor = cor;
  }
  public int getAno() {
        return ano;
  }
  public void setAno(int ano) {
        this.ano = ano;
  }
  public String getModelo() {
        return modelo;
  }
  public void Modelo(String modelo) {
        this.modelo = modelo;
  }
   

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		    carObject ford = new carObject();
		    ford.setPortas(4);
		    ford.setCor("azul");
		    ford.setAno(1987);
		    ford.Modelo("Ford");
		    ford.imprimir();
		    
		    carObject fiat = new carObject();
		    fiat.setPortas(3);
		    fiat.setCor("branco");
		    fiat.setAno(2015);
		    fiat.Modelo("Fiat");
		    fiat.imprimir();
		    
		    carObject gm = new carObject();
		    gm.setPortas(4);
		    gm.setCor("azul");
		    gm.setAno(1987);
		    gm.Modelo("General Motors");
		    gm.imprimir();
		    
		    carObject vw = new carObject();
		    vw.setPortas(4);
		    vw.setCor("azul");
		    vw.setAno(1987);
		    vw.Modelo("Volkswagen");
		    vw.imprimir();
		    
		    
	}
}