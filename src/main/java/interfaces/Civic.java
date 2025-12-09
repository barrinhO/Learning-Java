package interfaces;

// Civic é um tipo de carro, e ele implementa a interface Carro, como um modelo

// e nessa classe Civic, utilizamos o modelo da interface e criamos nossos métodos

public class Civic implements Carro {
    @Override
    public void acelerar(){
        System.out.println("Civic acelerou");
    }

    @Override
    public void frear(){
        System.out.println("Civic freou");
    }

    @Override
    public void parar(){
        System.out.println("Civic parou\n");
    }

}
