//Napisati program koji racuna sumu brojeva koji se nalaze prvom sheet-u excel tabele
// koji se zove Brojevi (sami izaberite neke random brojeve). U tabeli svi brojevi se nalaze
// u prvoj koloni. Program treba da cita red po red iz tabele i upisane brojeve dodaje na sumu.
// Ukupnu sumu na kraju treba ispisati na standardnom izlazu. Potrebno je omoguciti da program radi
// i ukoliko se u datu tabelu doda jos brojeva.

package SumaIzExcelaDomaci;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.io.IOException;

public class SumaTest {
    public ExcelSuma excelSuma;

    @BeforeClass
    public void set() throws IOException {
        excelSuma = new ExcelSuma("C:\\Users\\Milos\\IdeaProjects\\Selenium\\src\\test\\java\\SumaIzExcelaDomaci\\Book1.xlsx");
    }
    @Test
    public void suma(){
        int sum = 0;
        int broj = 0;
         for(int i = 0; i<= excelSuma.getLastRow(0); i++){
             broj = excelSuma.getIntegerData(0,i,0);
          //int broj1 = excelSuma.getIntegerDataName("Brojevi",i,0);
             sum += broj;
         }
        System.out.println(sum);
    }
}
