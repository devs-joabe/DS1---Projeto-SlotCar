package controller;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class FuncaoController implements Initializable {
    
    private Stage stage;
    private Scene scene;
    private Parent root;

    @FXML
    public void clickTelaEntrada(ActionEvent event) throws IOException{
        root = FXMLLoader.load(getClass().getResource("/view/tela_entrada.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();

    }

    @FXML
    public void clickTelaSaida(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("/view/tela_saida.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    
    @FXML
    public void clickTelaCal(ActionEvent event) throws IOException{
        root = FXMLLoader.load(getClass().getResource("/view/tela_cal_manual.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();

    }
    @FXML
    public void clickTelaDespesa(ActionEvent event) throws IOException{
        root = FXMLLoader.load(getClass().getResource("/view/tela_despesa.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();

    }
    @FXML
    public void clickTelaRelatorio(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("/view/tela_relatorio.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    @FXML
    public void back(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("/view/tela_login.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
