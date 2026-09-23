package it.thereaper.thread;

public class Lavoratore implements Runnable {

    private Contatore c;
    private String nome;

    public Lavoratore(Contatore c, String nome){
        this.c = c;
        this.nome = nome;


    }

    
    @Override
    public void run() {
        
        while (c.incrementa(nome)) {
            try {
                Thread.sleep((long)Math.random()* 400 + 100);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
            
        }


    }

}
