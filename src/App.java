public class App {
    public static void main(String[] args) throws Exception {
        Semaforo s = new Semaforo(1);
        Box box = new Box();
        Auto a = new Auto(0, "Ferrari", "Serena", s, box);
        Auto a1 = new Auto(1, "Ferrari", "Davide", s, box);
        Auto a2 = new Auto(2, "Ferrari", "Sara", s, box);
        Auto a3 = new Auto(3, "Ferrari", "Alessia", s, box);
        Auto a4 = new Auto(4, "Ferrari", "Giorgio", s, box);
        a.start();
        a1.start();
        a2.start();
        a3.start();
        a4.start();
        a.join();
        a1.join();
        a2.join();
        a3.join();
        a4.join();
        System.out.println("FINE GARA");
    }
}
