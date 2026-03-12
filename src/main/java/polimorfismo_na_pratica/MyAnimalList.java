package polimorfismo_na_pratica;

import abstratc.Animal;
import abstratc.Dog;

public class MyAnimalList {
    private Animal [] animals = new Animal[5];
    private int nexIndex = 0;

    public void add (Dog a){
        if(nexIndex < animals.length){
            animals [nexIndex] = a;
            System.out.println("Animal added at" + nexIndex);
            nexIndex++;
        }
    }
}

