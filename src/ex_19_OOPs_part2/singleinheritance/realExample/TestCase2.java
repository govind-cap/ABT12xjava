package ex_19_OOPs_part2.singleinheritance.realExample;

public class TestCase2 extends CommonTOAllTest  {
    void runningTC2(){
        startBrowser();
        readExcelFile();
        readDataBaseFile();
        System.out.println("Running TC2");
        closeBrowser();
    }
}