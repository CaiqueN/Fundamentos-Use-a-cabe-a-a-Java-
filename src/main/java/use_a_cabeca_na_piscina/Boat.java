package use_a_cabeca_na_piscina;

public class Boat {
    private int length;
    public void setLength(int len){
        length = len;
    }

    public int getLength() {
        return length;
    }

    public void move() {
        System.out.println("drift");
    }
}
