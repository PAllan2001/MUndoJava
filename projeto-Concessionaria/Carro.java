public class Carro extends Veiculo{
    //Construtor chama da class mae 
    public Carro(String marca, String modelo, int ano) {
   
        super(marca, modelo, ano);
    }
    @Override  
    public void ligar() {
        System.out.println("Carro ligado com chave.");
    }
}