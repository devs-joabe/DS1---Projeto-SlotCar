/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
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
import javafx.scene.control.TextField;
import javafx.stage.Stage;


/**
 * FXML Controller class
 *
 * @author Eduardo
 */
public class SaidaController implements Initializable {
    private Stage stage;
    private Scene scene;
    private Parent root;
    @FXML
    private TextField txt_placa;

    @FXML
    private TableColumn<?, ?> ID;

    @FXML
    private TableColumn<?, ?> PLACA;

    @FXML
    private TableColumn<?, ?> DATA;

    @FXML
    private TableColumn<?, ?> ENTRADA;

    @FXML
    private TableColumn<?, ?> SAIDA;

    @FXML
    private TableColumn<?, ?> TOTAL;

    @FXML
    private TableColumn<?, ?> PAGO;

    @FXML
    void back(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("/view/tela_funcao.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    void cadastroSaida(ActionEvent event) {
//        String placa;
//        txt_placa.setText(placa);
        System.out.println("Funciona");
    }
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
