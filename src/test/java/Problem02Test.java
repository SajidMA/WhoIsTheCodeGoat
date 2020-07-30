import org.junit.Test;
import org.junit.Assert;

public class Problem02Test {

    @Test
    public void tableTest1(){
        //Given
        Problem02 prob2 = new Problem02();
        int n = 3;
        String expected = "Magic square of 3\n"+
                "-----------------------\n"+
                "2   7   6\n"+
                "9   5   1\n"+
                "4   3   8\n"+
                "Sum in each row & each column = 3*(3^2+1)/2 = 15";
        //When
        String actual = prob2.magicSquare(n);
        System.out.println(actual);
        //Then
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void tableTest2(){
        //Given
        Problem02 prob2 = new Problem02();
        int n = 5;
        String expected = "Magic square of 5\n"+
                "--------------\n"+
                " 9   3  22  16  15\n"+
                " 2  21  20  14   8\n"+
                "25  19  13   7   1\n"+
                "18  12   6   5  24\n"+
                "11  10   4  23  17\n"+
                "Sum in each row & each column = 5*(5^2+1)/2 = 65";
        //When
        String actual = prob2.magicSquare(n);
        System.out.println(actual);
        //Then
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void tableTest3(){
        //Given
        Problem02 prob2 = new Problem02();
        int n = 7;
        String expected = "Magic square of 7\n"+
                "----------------------\n"+
                "20  12   4  45  37  29  28\n"+
                "11   3  44  36  35  27  19\n"+
                "2  43  42  34  26  18  10\n"+
                "49  41  33  25  17   9   1\n"+
                "40  32  24  16   8   7  48\n"+
                "31  23  15  14   6  47  39\n"+
                "22  21  13   5  46  38  30\n"+
                "Sum in each row & each column = 7*(7^2+1)/2 = 175";
        //When
        String actual = prob2.magicSquare(n);
        System.out.println(actual);
        //Then
        Assert.assertEquals(expected, actual);
    }
}