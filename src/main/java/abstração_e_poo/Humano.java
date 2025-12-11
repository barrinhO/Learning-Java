package abstração_e_poo;

// como essa classe estende de SerVivo, tudo dela será visto daqui e poderá ser implementado, como variáveis, métodos etc..
public class Humano extends SerVivo {

// utilizando super para inserir os dados que foram setados no construtor
    public Humano(){
        super(17, "Chris");
    }

    public void respirar() {
        System.out.println("Humano respirando!");
    }
}
