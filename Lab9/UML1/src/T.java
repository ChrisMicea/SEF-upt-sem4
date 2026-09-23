import java.util.ArrayList;

public class T implements X{
    private ArrayList<X> obj = new ArrayList<>();

    public int m() {
        int sum = 0;

        for (X x : obj) {
            sum += x.m();
        }

        return sum;
    }

    public void add(X a) {
        obj.add(a);
    }
}
