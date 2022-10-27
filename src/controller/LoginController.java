package controller;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.Initializable;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import javax.swing.JOptionPane;

public class LoginController implements Initializable {
    
    private Stage stage;
    private Scene scene;
    private Parent root;
    @FXML
    private TextField txt_user;
   @FXML
    private PasswordField pf_pass;
    @FXML
    private Button button;
    @FXML
    private Label lbl_erro_login;
    @FXML
    void login(ActionEvent event) throws IOException {
//        String user;
//        int pass;
//        user = txt_user.getText();
//        pass = Integer.parseInt(pf_pass.getText());
        try{
        root = FXMLLoader.load(getClass().getResource("/view/tela_funcao.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
        }catch(IOException e){
           JOptionPane.showMessageDialog(null, "NetDevices list is not serializable - No devices saved", "Saving NetDevices", JOptionPane.INFORMATION_MESSAGE);
        }
       
        

    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {

    }    
    
}
