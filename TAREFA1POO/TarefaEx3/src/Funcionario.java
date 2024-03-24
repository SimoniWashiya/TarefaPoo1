public class Funcionario {
   
    private String nome;
    private double salario;
    private String cargo;
    private double salarioMinimo = 1412.00;

    public Funcionario(String nome, double salario, String cargo) {
        this.nome = nome;
        if (salario < salarioMinimo) {
            this.salario = salarioMinimo;
        } else {
            this.salario = salario;
        }
        this.cargo = cargo;
    }

    public double calcularSalarioLiquido() {
    	 double impostos = salario * 0,075
    	 double valeAlim = 500,00
         double salarioLiquido = salario - impostos + valeAlim;
         return salarioLiquido;
        
    }

    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario("Maria", 1200.0, "Secretaria");
      
        double salarioLiquido = funcionario.calcularSalarioLiquido();

        System.out.println("Salário líquido de " + funcionario.getNome() + ": R$" + salarioLiquido);
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        if (salario < salarioMinimo) {
            this.salario = salarioMinimo;
        } else {
            this.salario = salario;
        }
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
}
