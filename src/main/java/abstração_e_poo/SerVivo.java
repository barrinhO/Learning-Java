// classes abstratas
// sinceramente ainda nao entendi como funciona mas ok ngm liga

// mas sei que não podem ser instanciadas
// métodos abstratos: não podem ter corpo
// métodos concretos: podem ter métodos normais (com corpo), que são herdados pelas subclasses.
// e o conceito de herança de POO define um comportamento base e força subclasses a implementar detalhes específicos.

package abstração_e_poo;

public abstract class SerVivo {

    protected int idade;
    protected  String nome;

    public SerVivo(int idade, String nome){
        this.idade = idade;
        this.nome = nome;
    }

// métodos abstratos só se assina, não possuem corpo ex:
    /*public abstract void fotossíntese();*/

    // método concreto
    public void comer(){
        System.out.println("Se chama " + nome + ", tem " + idade + " anos e está: comendo... ");
    }
}
