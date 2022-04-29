public class QuadraticEquation {
     private final int  a, b, c;
     private final double discriminant;


    public QuadraticEquation(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.discriminant = this.b * this.b -4 * this.a * this.c;
    }

    public double getDiscriminant(){
        return  this.discriminant;
    }
    public Solution getSolution () {
        double root1, root2;
        if (this.discriminant >= 0) {
            root1 =  (-this.b + Math.pow(this.discriminant, 0.5)) / (2*this.a);
            root2 =  (-this.b - Math.pow(this.discriminant, 0.5)) / (2*this.a);
            return new Solution (new Double []{root1, root2});
        }
        else {
            return new Solution();
        }
    }

}
