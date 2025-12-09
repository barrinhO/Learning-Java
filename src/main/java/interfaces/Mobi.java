package interfaces;

public class Mobi implements Carro {

    // Mobi é outro um tipo de carro, e ele implementa a interface Carro, como um modelo

    // e nessa classe Mobi, utilizamos o modelo da interface e criamos nossos métodos

    @Override
    public void acelerar(){
        System.out.println("Mobi acelerou");
    }

    @Override
    public void frear(){
        System.out.println("Mobi freou");
    }

    @Override
    public void parar(){
        System.out.println("Mobi parou\n");
    }

}
