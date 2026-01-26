public class Main {
    public static void main(String[] args)
    {
        //Criando objetos das subclasses
        Carro carro1 = new Carro("Honda", "HRV", 2014);

        Moto moto2 = new Moto ("Honda", "Africa Twin", 2024);

        // Testar os metodos 
        carro1.ligar();
        carro1.mostrarInfo();

        System.out.println("-------");

        moto2.ligar();
        moto2.mostrarInfo();
    }
}