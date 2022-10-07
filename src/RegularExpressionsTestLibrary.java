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

    @Test
    public void URLCheckCorrect1() {
        Assert.assertEquals(true, Checker.RegularURL("https://www.youtube.com/"));
    }
    @Test
    public void URLCheckCorrect2() {
        Assert.assertEquals(true, Checker.RegularURL("http://vyatsu.ru/"));
    }
    @Test
    public void URLCheckCorrect3() {
        Assert.assertEquals(true, Checker.RegularURL("google.com"));
    }
    @Test
    public void URLCheckCorrect4() {
        Assert.assertEquals(true, Checker.RegularURL("www.google.com"));
    }
    @Test
    public void URLCheckCorrect5() {
        Assert.assertEquals(true, Checker.RegularURL("https://www.vyatsu.ru/studentu-1/spravochnaya-informatsiya/"));
    }
    @Test
    public void URLCheckCorrect6() {
        Assert.assertEquals(true, Checker.RegularURL("https://www.google.com:8008"));
    }
    @Test
    public void URLCheckOneLetterDomain() {
        Assert.assertEquals(false, Checker.RegularURL("https://a.com"));
    }
    @Test
    public void URLCheckJustText() {
        Assert.assertEquals(false, Checker.RegularURL("Hello World"));
    }
    @Test
    public void URLCheckDomainWithIP() {
        Assert.assertEquals(false, Checker.RegularURL("http://255.255.255.255"));
    }
    @Test
    public void URLCheckWrongChar1() {
        Assert.assertEquals(false, Checker.RegularURL("http://new_site.com"));
    }
    @Test
    public void URLCheckWrongChar2() {
        Assert.assertEquals(false, Checker.RegularURL("https://new-site.com"));
    }
    @Test
    public void URLCheckWrongSeparator() {
        Assert.assertEquals(false, Checker.RegularURL("https:::////www.google.com"));
    }

    @Test
    public void PassCheckCorrect1() {
        Assert.assertEquals(true, Checker.RegularPass("C00l_Pass"));
    }
    @Test
    public void PassCheckCorrect2() {
        Assert.assertEquals(true, Checker.RegularPass("SupperPas1"));
    }
    @Test
    public void PassCheckCorrect3() {
        Assert.assertEquals(true, Checker.RegularPass("sTRonG_pass99"));
    }
    @Test
    public void PassCheckCorrect4() {
        Assert.assertEquals(true, Checker.RegularPass("Qwerty12"));
    }
    @Test
    public void PassCheckCorrect5() {
        Assert.assertEquals(true, Checker.RegularPass("123456789_Abc"));
    }
    @Test
    public void PassCheckCorrect6() {
        Assert.assertEquals(true, Checker.RegularPass("12_09_1986_Bd"));
    }
    @Test
    public void PassCheckWrongSize() {
        Assert.assertEquals(false, Checker.RegularPass("C00l"));
    }
    @Test
    public void PassCheckWrongCharacter() {
        Assert.assertEquals(false, Checker.RegularPass("Qwerty=12%"));
    }
    @Test
    public void PassCheckWrongStructure1() {
        Assert.assertEquals(false, Checker.RegularPass("Cool_pass"));
    }
    @Test
    public void PassCheckWrongStructure2() {
        Assert.assertEquals(false, Checker.RegularPass("123456789"));
    }
    @Test
    public void PassCheckWrongStructure3() {
        Assert.assertEquals(false, Checker.RegularPass("NOTAPASSWORD"));
    }
    @Test
    public void PassCheckWrongStructure4() {
        Assert.assertEquals(false, Checker.RegularPass("Pass_With whitespace11"));
    }
}
