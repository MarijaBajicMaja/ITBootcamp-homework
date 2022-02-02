package SumaIzExcelaDomaci;

import java.io.IOException;

public class ZbirUMainu {
    public static void main(String[] args) throws IOException {
        ExcelSuma excelSuma = new ExcelSuma("C:\\Users\\Milos\\IdeaProjects\\Selenium\\src\\test\\java\\SumaIzExcelaDomaci\\Book1.xlsx");
        int sum = 0;
        int broj;
        for(int i = 0; i<= excelSuma.getLastRow(0); i++){
            broj = excelSuma.getIntegerData(0,i,0);
            //int broj1 = excelSuma.getIntegerDataName("Brojevi",i,0);
            sum += broj;
        }
        System.out.println(sum);
    }
}
