import java.io.IOException;
import java.io.PrintWriter;
import java.math.BigDecimal;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.util.List;


public class CreditService {

    //Credit credit= new Credit (BigDecimal.ZERO,BigDecimal.ZERO,0, LocalDate.of (2018,1,1),1);
// TO Ogarnąć Tworzenie obiektu Credit, który zarówno będzie się tworzył poprzez dodanie nowego kredytu kiedy nie istnieje oraz przy otiwraniu programu z odczytu parametrów z pliku.
    public void ReadCredit(){
        if(Files.exists (Paths.get ("credit.txt"))) {
            try {
                 List<String> txt=Files.readAllLines (Paths.get ("credit.txt"), Charset.forName ("UTF-8"));
                System.out.println (txt);
                System.out.println (txt.get (0));
                System.out.println ( (txt.get (0).substring (12)));
                System.out.println (txt.get (1));
                System.out.println (txt.get (2));
            } catch (IOException e) {
                e.printStackTrace ();
            }
        }
    }
    public void newSettingsCredit(BigDecimal creditValue,BigDecimal InstallmentValue, int NumberOfInstallment) throws IOException {
        if( !Files.exists (Paths.get ("credit.txt"))){
            Files.createFile(Paths.get("credit.txt"));
        }
        /*credit.setCreditValue (creditValue);
        credit.setInstallmentValue (InstallmentValue);
        credit.setNumberOfInstallment (NumberOfInstallment);*/
       //  TOD Zamiana w BigDecimalu ',' na '.'
        PrintWriter saveFile = new PrintWriter ("credit.txt");
        saveFile.write ("CreditValue:"+creditValue+"\n" +
                "InstallmentValue:"+InstallmentValue+"\n" +
                "NumberOfInstallment:"+NumberOfInstallment);
        saveFile.close ();

    }
}
