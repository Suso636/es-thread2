package it.thereaper.thread;

public class Contatore {
    private int val;
    private int vmax;

    public Contatore(){
        this.val = 0;
        this.vmax = 10;
    }


    public synchronized boolean incrementa(String nomeThread){

        if( val < vmax ){
            val++;
            System.out.println("il " + nomeThread + " ha effettuato un incremento di 1 ed é arrivato a: " + val);
            return true;
        }

        return false;
    }

}
