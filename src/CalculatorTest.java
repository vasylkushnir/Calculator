import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


public class CalculatorTest {

    @DataProvider(name="addNumbers", parallel = true)
    public Object[][] addNumbers(){
        return new Object[][]{{1,2,3,}, {3,0,3}, {-4,6,2}};
    }
    @DataProvider(name="substractNumbers", parallel = true)
    public Object[][] substractNumbers(){
        return new Object[][]{{4,2,2,}, {6,0,6}, {-4,20,-24}};
    }
    @DataProvider(name="multiplyNumbers", parallel = true)
    public Object[][] multiplyNumbers(){
        return new Object[][]{{2,2,4,}, {6,0,0}, {-4,-2,8}};
    }
    @DataProvider(name="divideNumbers", parallel = true)
    public Object[][] divideNumbers(){
        return new Object[][]{{10,2,5,}, {10,10,1}, {-4,-2,2}};
    }

    @Test(dataProvider = "addNumbers")
    public void addNumbers (int a,int b,int c)
    {
        Assert.assertEquals(Calculator.addNumbers(a, b), c);

    }
    @Test(dataProvider = "substractNumbers")
    public void substractNumbers (int a,int b,int c)
    {
        Assert.assertEquals(Calculator.substractNumbers(a, b), c);

    }
    @Test(dataProvider = "multiplyNumbers")
    public void multiplyNumbers (int a,int b,int c)
    {
        Assert.assertEquals(Calculator.multiplyNumbers(a, b), c);

    }
    @Test(dataProvider = "divideNumbers")
    public void divideNumbers (int a,int b,int c)
    {
        Assert.assertEquals(Calculator.divideNumbers(a, b), c);

    }
}

