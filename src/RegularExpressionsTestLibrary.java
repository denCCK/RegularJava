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

    @Test
    public void GUIDCheckCorrect1() {
        Assert.assertEquals(true, Checker.RegularGUID("b523b685-c83e-48f3-abca-aae73a36091f"));
    }
    @Test
    public void GUIDCheckCorrect2() {
        Assert.assertEquals(true, Checker.RegularGUID("e23b8f62-d273-4046-85a7-d19a945f6ba4"));
    }
    @Test
    public void GUIDCheckCorrect3() {
        Assert.assertEquals(true, Checker.RegularGUID("ffd4b3f3-2046-4eff-a401-f92c6f9e85d3"));
    }
    @Test
    public void GUIDCheckCorrect4() {
        Assert.assertEquals(true, Checker.RegularGUID("61f16cd1-9379-4f71-93f7-6a0ff57267ff"));
    }
    @Test
    public void GUIDCheckCorrect5() {
        Assert.assertEquals(true, Checker.RegularGUID("124b967f-69d3-4d9d-9d4a-30314b591aad"));
    }
    @Test
    public void GUIDCheckCorrect6() {
        Assert.assertEquals(true, Checker.RegularGUID("0f81b3dc-f68c-40f1-9e91-16765747402d"));
    }
    @Test
    public void GUIDCheckWrongSize1() {
        Assert.assertEquals(false, Checker.RegularGUID("0f81b-f68c-40f1-9e91-16765747402d"));
    }
    @Test
    public void GUIDCheckWrongSize2() {
        Assert.assertEquals(false, Checker.RegularGUID("0f81b3dc-f68c-40f1-9e91-1"));
    }
    @Test
    public void GUIDCheckWrongStructure1() {
        Assert.assertEquals(false, Checker.RegularGUID("0f81b3dc-f68c-40f1-9e91"));
    }
    @Test
    public void GUIDCheckWrongStructure2() {
        Assert.assertEquals(false, Checker.RegularGUID("0f81b3dc-f68c-40f1-9e91-16765747402d-31d2"));
    }
    @Test
    public void GUIDCheckWrongStructure3() {
        Assert.assertEquals(false, Checker.RegularGUID("0f81b3dc-f68c./40f1-9e91-16765747402d"));
    }
    @Test
    public void GUIDCheckWrongStructureAndSize() {
        Assert.assertEquals(false, Checker.RegularGUID("0f81b3dc-f68c-40f1-9e91,,.16765747402d-31d2"));
    }
}
