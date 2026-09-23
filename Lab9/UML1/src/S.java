public class S implements X {
    private T objT;

    public S(T x) {
        this.objT = x;
    }

    public int m() {
        if (objT == null) {
            return 1;
        }
        else {
            return objT.m() + 1;
        }
    }
}
