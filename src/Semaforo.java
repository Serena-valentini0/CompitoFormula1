public class Semaforo {

    private int stato;
    /**
     * costruttore
     * @param stato
     */
    public Semaforo(int stato) {
        this.stato = stato;
    }
    /**
     * controlla il semaforo
     */
    public synchronized void p(){
        while(stato==0){
            try {
                System.out.println(Thread.currentThread().getName()+"-----in attesa al box-----");
                wait();
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
        stato = 0;
    }
    /**
     * incrementa il semaforo
     */
    public synchronized void v(){
        stato=1;
        notify();
    }
}
