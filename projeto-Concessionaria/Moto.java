public class Moto extends Veiculo {
    public Moto(String marca, String modelo, int ano) {
    super(marca, modelo, ano);
    }

    @Override
    public void ligar() {
        System.out.println("Moto Ligada com pedal. ");
    }
}
