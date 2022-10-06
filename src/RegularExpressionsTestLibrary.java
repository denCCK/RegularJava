import org.junit.Assert;
import org.junit.Test;

public class RegularExpressionsTestLibrary {

    RegularExpressions Checker = new RegularExpressions();

    @Test
    public void IPCheckCorrect1() {
        Assert.assertEquals(true, Checker.RegularIP("198.203.61.8"));
    }
    @Test
    public void IPCheckCorrect2() {
        Assert.assertEquals(true, Checker.RegularIP("100.246.156.185"));
    }
    @Test
    public void IPCheckCorrect3() {
        Assert.assertEquals(true, Checker.RegularIP("224.166.230.190"));
    }
    @Test
    public void IPCheckCorrect4() {
        Assert.assertEquals(true, Checker.RegularIP("170.40.147.120"));
    }
    @Test
    public void IPCheckCorrect5() {
        Assert.assertEquals(true, Checker.RegularIP("40.29.149.225"));
    }
    @Test
    public void IPCheckCorrect6() {
        Assert.assertEquals(true, Checker.RegularIP("5.41.181.52"));
    }
    @Test
    public void IPCheckBitOverflow() {
        Assert.assertEquals(false, Checker.RegularIP("300.255.255.255"));
    }
    @Test
    public void IPCheckWrongBitCharacters1() {
        Assert.assertEquals(false, Checker.RegularIP("192.1_68.31.1"));
    }
    @Test
    public void IPCheckWrongBitCharacters2() {
        Assert.assertEquals(false, Checker.RegularIP("192.abcdf.31.1"));
    }
    @Test
    public void IPCheckWrongStructure1() {
        Assert.assertEquals(false, Checker.RegularIP("192168.31.1"));
    }
    @Test
    public void IPCheckWrongStructure2() {
        Assert.assertEquals(false, Checker.RegularIP("abcdg.//dfffdf"));
    }
    @Test
    public void IPCheckWrongBitCharactersAndStructure() {
        Assert.assertEquals(false, Checker.RegularIP("192.ab.31"));
    }


}
