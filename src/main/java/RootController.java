import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;


import java.io.IOException;
import java.math.BigDecimal;
import java.net.URL;
import java.util.ResourceBundle;

public class RootController implements Initializable {

    @FXML
    private Button Save;
    @FXML
    private TextField CreditValueIn;
    @FXML
    private TextField NumberOfInstallmentIn;
    @FXML
    private TextField InstallmentValueIn;





    @Override
    public void initialize(URL location, ResourceBundle resources) {
        CreditService creditService = new CreditService ();
        creditService.ReadCredit ();
    }

    public void saveButton() throws IOException {
        CreditService creditService = new CreditService ();
        creditService.newSettingsCredit (new BigDecimal (CreditValueIn.getText ()),new BigDecimal (InstallmentValueIn.getText ()),Integer.valueOf (NumberOfInstallmentIn.getText ()));
    }
}
