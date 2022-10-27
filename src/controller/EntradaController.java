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
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import model.Cars;

public class EntradaController implements Initializable {

    private Stage stage;
    private Scene scene;
    private Parent root;

    @FXML
    private TextField txt_placa;
    
    @FXML
    private TableView<Cars> tabela;
    @FXML
    private TableColumn<Cars, Integer> ID;

    @FXML
    private TableColumn<Cars, String> PLACA;

    @FXML
    private TableColumn<Cars, String> DATA;

    @FXML
    private TableColumn<Cars, String> ENTRADA;

    @FXML
    private TableColumn<Cars, String> SAIDA;

    @FXML
    private TableColumn<Cars, String> TOTAL;

    @FXML
    private TableColumn<Cars, String> PAGO;
       
    
    @FXML
    void back(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("/view/tela_funcao.fxml"));
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    @FXML
    public void  cadastroEntrada(ActionEvent event) {
//        String placa;
//        placa = txt_placa.getText();
        System.out.println("Funcionou");
 
    }
    /**
     * Initializes the controller class.
     * @param url
     * @param rb
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {

    
    }

}
