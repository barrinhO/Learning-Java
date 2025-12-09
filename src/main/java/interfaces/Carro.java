package interfaces;

/*
Em Java, uma interface
é um contrato que define um conjunto de métodos que uma classe deve implementar
funciona como um modelo que especifica o que uma classe deve fazer, sem detalhar como ela vai fazer
*/

// interfaces não podem ser instanciadas, ou seja, é necessário uma classe que implemente a interface como modelo

// aqui os métodos são criados
public interface Carro {
    void acelerar();
    void frear();
    void parar();
}
