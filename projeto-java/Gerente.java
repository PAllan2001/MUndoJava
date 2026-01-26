public class Gerente extends Funcionarios {

    public Gerente( String Nome, long CPF, double salarioBase) {
        super(Nome, CPF, salarioBase);
     
    }
    @Override
    public double calcularSalario() {
     return getsalarioBase() + 2000 ;
        
    }
    @Override
    public void mostrarInfo() {
        System.out.println("===========");
        super.mostrarInfo();
        System.out.println("Salario Final : R$ " + calcularSalario());

        System.out.println("----------");

    }

    
}
