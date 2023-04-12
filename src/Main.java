public class Main {
    public static void main(String[] args) {
        Calculation c = new Calculation();
     Thread thread = new Thread(c);
     thread.start();
     c.addnum();
        System.out.println(c.toString());
    }
}