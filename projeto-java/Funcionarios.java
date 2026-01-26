public class Funcionarios {
    private String Nome ; 
    private long CPF ;
    private double salarioBase;

    public Funcionarios (String Nome , long CPF , double salarioBase) {
        this.Nome = Nome ;
        this.CPF = CPF ;
        this.salarioBase = salarioBase ;
  }

  public double calcularSalario() {
    return salarioBase;
  }
  public double getsalarioBase() {
    return salarioBase;
  }
   

    
  public void mostrarInfo() {
    System.out.println("Nome : " + Nome );
    System.out.println("CPF : " + CPF );
    System.out.println("salarioBase : " + salarioBase);
 }

public String getNome() {
    return Nome;
}
public void setNome(String Nome) {
    this.Nome = Nome ; 
}
public long getCPF() {
    return CPF;
}
public void setCPF(long CPF) {
    this.CPF = CPF ; 
}
public void getsalarioBase(double salarioBase ) {
   this.salarioBase = salarioBase ;

}

}