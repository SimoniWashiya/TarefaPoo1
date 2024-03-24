public class Circulo {
	
	public static void main (String [] args) {
		double raio;
	}
    
    public double raio;

    public Circulo(double raio) {
        this.raio = raio;
    }

    public double getRaio() {
        return raio;
    }
   
    public void setRaio(double raio) {
        this.raio = raio;
    }
  
    public double calcularArea() {
        return Math.PI * Math.pow(raio, 2);
    }

       public double calcularPerimetro() {
        return 2 * Math.PI * raio;
    }
    
    public static void main(String[] args) {
    
        Circulo circulo = new Circulo(5);

        System.out.println("�rea do c�rculo: " + circulo.calcularArea());

        System.out.println("Per�metro do c�rculo: " + circulo.calcularPerimetro());
    }
}
