public class Auto extends Thread{
    
    private int id;
    private String scuderia;
    private String nome;
    private Semaforo s;
    private Box b;
    /**
     * costruttore
     * @param id
     * @param s
     * @param nome
     * @param sem
     * @param b
     */
    public Auto (int id, String s, String nome, Semaforo sem, Box b){
        super.setName(nome);
        this.id = id;
        this.b = b;
        this.nome = nome; 
        this.scuderia = s;
        this.s= sem;
    }
    /**
     * ritorna il nome del pilota
     * @return String
     */
    public String getNome(){
        return nome;
    }
    /**
     * 
     * @return void
     */
    public void run(){
        for(int i=1; i<=10; i++){
            int secondi = (int) (1+(Math.random()*4));
            try {
                sleep(secondi*1000);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
            System.out.println("GIRO-"+(i)+" completato "+nome);
            if(i==3|| i==6 || i==9){
                s.p();
                b.cambioGomme();
                s.v();
            }
        }
    }
}
