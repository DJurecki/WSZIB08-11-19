package pl.edu.wszib;

import org.junit.*;

public class CalculatorTest {

    static Calculator calculator;

    @BeforeClass
    public static void initData(){
        calculator = new Calculator();
        System.out.println("Before Class!!");
    }

    @AfterClass
    public static void destroyData(){
        calculator = null;
        System.out.println("After Class!!");
    }

    @Before
    public void beforeMethod(){
        System.out.println("Before Method!!");
    }


    @After
    public void afterMethod(){
        System.out.println("After Method!!");
    }

    @Test
    public void positiveSumTest(){
        // przygotowanie danych
        int a = 5;
        int b = 7;
        int expectedResult = 12;

        // wykonanie testu
        int result = CalculatorTest.calculator.add(a, b);

        // asercja
        Assert.assertEquals(expectedResult, result);
    }

    @Test
    public void negativeSumTest(){
        // przygotowanie danych
        int a = -3;
        int b = -5;
        int expectedResult = -8;

        // wykonanie testu
        int result = CalculatorTest.calculator.add(a, b);

        // asercja
        Assert.assertEquals(expectedResult, result);
    }

    @Test
    public void zeroAndNegativeSumTest(){
        // przygotowanie danych
        int a = 0;
        int b = -10;
        int expectedResult = -10;

        // wykonanie testu
        int result = CalculatorTest.calculator.add(a, b);

        // asercja
        Assert.assertEquals(expectedResult, result);
    }

    @Test
    public void positiveNegativeMultiplyTest(){
        // przygotowanie danych
        int a = 5;
        int b = -10;
        int expectedResult = -50;

        // wykonanie testu
        int result = CalculatorTest.calculator.multiply(a, b);

        // asercja
        Assert.assertEquals(expectedResult, result);
    }

    @Test
    public void positiveDivideTest(){
        // przygotowanie danych
        int a = 5;
        int b = 2;
        double expectedResult = 2.5;

        // wykonanie testu
        double result = CalculatorTest.calculator.divide(a, b);

        // asercja
        Assert.assertEquals(expectedResult, result, 0.1);
    }

    @Test(expected = ArithmeticException.class)
    public void divideByZeroTest(){

        // przygotowanie danych
        int a = 5;
        int b = 0;

        // wykonanie testu
        double result = CalculatorTest.calculator.divide(a, b);

    }
}
