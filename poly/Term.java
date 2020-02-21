public class Term {
    private int coef;
    private int index;
    public Term(int c,int i) {
        this.coef = c;
        this.index = i;
    }
    @Override
    public String toString() {
        String ret;
        if (coef > 0) {
            ret = "+" + coef;
        }
        else if (coef < 0) {
            ret = String.valueOf(coef);
        }
        else {
            ret = "0";
        }

        if (index == 0) {
            return ret;
        }
        else if (index == 1) {
            return ret + "x";
        }
        return ret + "*x^" + index;
    }
}