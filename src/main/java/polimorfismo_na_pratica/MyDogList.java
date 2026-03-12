package polimorfismo_na_pratica;

import abstratc.Dog;

public class MyDogList {
    private Dog[] dogs = new Dog[5]; //Use um array Dog simples nos bastidores
    private int nextIndex = 0; //Vamos incrementar isso sempre que um novo Dog for adicionado

    public void add (Dog d){
        if(nextIndex < dogs.length){ //Se ainda nao estivermos no limite do array dogs adiciona Dog e exibe uma mensagem
            dogs [nextIndex] = d;
            System.out.println("Dog added at " + nextIndex);
            nextIndex++; // incrementa mais um para nos fornecer a ser o proximo indice a ser usado

        }
    }

}
