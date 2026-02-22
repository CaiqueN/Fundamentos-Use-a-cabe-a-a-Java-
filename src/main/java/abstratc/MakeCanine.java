package abstratc;

public class MakeCanine {
    public void go () {
        Canine o; //Podemos atribuir um objeto da subclasse (Dog)
        o = new Dog();//a uma referência da superclasse (Canine), mesmo que Canine seja abstrata.

        c =  new Canine();
        //Classes abstratas não podem ser instanciadas

    }

    public static void main(String[] args) {

    }
}
