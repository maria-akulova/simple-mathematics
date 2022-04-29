import org.testng.Assert;
import org.testng.annotations.Test;

public class QuadraticEquationTest {
    @Test
    public void discriminantLessZero() {
        QuadraticEquation quadraticEquation = new QuadraticEquation(3,-4,2);
        Solution solution = quadraticEquation.getSolution();

        Assert.assertNull(solution.getRoot1(), "When discriminant less 0 the root 1 should be Null. " );
        Assert.assertNull(solution.getRoot2(), "When discriminant less 0 the root 2 should be Null. " );
    }

    @Test
    public void positiveDiscriminantHasTwoDifferentRoots() {
        QuadraticEquation quadraticEquation = new QuadraticEquation(1,-4,-5);
        Solution solution = quadraticEquation.getSolution();

        Assert.assertEquals(solution.getRoot1(),5.0,"Invalid root 1");
        Assert.assertEquals(solution.getRoot2(),-1.0,"Invalid root 2");
        Assert.assertNotEquals(solution.getRoot1(),solution.getRoot2(), "if discriminant more then 0 the root 1 and root 2 should be different");
    }
    @Test
    public void zeroDiscriminantHasEqualRoots(){
        QuadraticEquation quadraticEquation = new QuadraticEquation(1,-2,1);
        Solution solution = quadraticEquation.getSolution();

        Assert.assertEquals(quadraticEquation.getDiscriminant(), 0, "Discriminant should be zero");
        Assert.assertEquals(solution.getRoot1(),solution.getRoot2(),"Roots should be the same if discriminant is zero");
    }
}
