public class Solution {

    private Double[] roots = new Double[2];

    public Solution(Double [] roots) {
        this.roots = roots;
    }
    public Solution() {
        this.roots[0] =null;
        this.roots[1] = null;

    }

    public Object getRoot1() {

            return roots[0];

    }
    public Object getRoot2() {

            return roots[1];

    }

    public void printResult() {
            System.out.println("root 1: " + getRoot1());
            System.out.println("root 2: " + getRoot2());
    }
}
