public class Vendedor extends Funcionarios {

    private double Comissão;
    
    public Vendedor(String Nome, long CPF, double salarioBase, double Comissão) {
    super(Nome, CPF,salarioBase);
    this.Comissão = Comissão;     
    }
    @Override

    public double calcularSalario() {
        return getsalarioBase() + Comissão;
    }

    @Override 
    public void mostrarInfo() {
        System.out.println("----------");
        super.mostrarInfo();

        System.out.println("Comissão: R$" + Comissão);
        System.out.println("Salario Final: R$ " + calcularSalario());;

        System.out.println("----------");
      }
      public double getComissão() {
        return Comissão;
      }
      public void setComissão(double Comissão) {
        this.Comissão = Comissão ;
      }

     
}
