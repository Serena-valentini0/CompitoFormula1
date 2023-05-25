

public class Box {
    /**
     * 
     * @return void
     */
    public void cambioGomme(){
        System.out.println("PIT-STOP "+ Thread.currentThread().getName()+" cambio gomme in corso" );
        int secondi = (int) (1+(Math.random()*5));
        try {
            Thread.currentThread().sleep(secondi*1000);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        System.out.println("PIT-STOP "+ Thread.currentThread().getName()+" FINITO");
    }
}
