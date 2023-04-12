import java.util.ArrayList;

public class Calculation implements Runnable{
    private int max;
    private int min;
    ArrayList<Integer> cisla = new ArrayList();

    public void addnum(){
        for(int i = 1; i <= 10000000; i++){
            cisla.add(i);
        }
    }
    public void run() {
    }

    @Override
    public String toString() {
        return "Calculation{" +
                "cisla=" + cisla +
                '}';
    }
}
