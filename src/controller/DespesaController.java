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
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class DespesaController implements Initializable {
    private Stage stage;
    private Scene scene;
    private Parent root; 
    @FXML
    private TableView<?> tabela;

    @FXML
    private TableColumn<?, ?> produtoServico;

    @FXML
    private TableColumn<?, ?> data;

    @FXML
    private TableColumn<?, ?> valorAPagar;
    
    @FXML
    private TextField txt_produto_servico;

    @FXML
    private TextField txt_valor_a_pagar;

    @FXML
    private TextField txt_data_dia;

    @FXML
    private TextField txt_data_mes;
    @FXML
    private Label lbl_total_mes;
    
    @FXML
    public void back(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("/view/tela_funcao.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    @FXML
    void adicionar(ActionEvent event) {
//        String produto_servico;
//        int valor_a_pagar,data_dia,data_mes;
//        produto_servico = txt_produto_servico.getText();
//        valor_a_pagar = Integer.parseInt(txt_valor_a_pagar.getText());
//        data_dia = Integer.parseInt(txt_data_dia.getText());
//        data_mes = Integer.parseInt(txt_data_mes.getText());
         
    }
    
    @FXML
    void editar(ActionEvent event) {
//        String produto_servico;
//        int valor_a_pagar,data_dia,data_mes;
//        produto_servico = txt_produto_servico.getText();
//        valor_a_pagar = Integer.parseInt(txt_valor_a_pagar.getText());
//        data_dia = Integer.parseInt(txt_data_dia.getText());
//        data_mes = Integer.parseInt(txt_data_mes.getText());
    }

    @FXML
    void totalMes(ActionEvent event) {
//        String produto_servico;
//        int valor_a_pagar,data_dia,data_mes;
//        produto_servico = txt_produto_servico.getText();
//        valor_a_pagar = Integer.parseInt(txt_valor_a_pagar.getText());
//        data_dia = Integer.parseInt(txt_data_dia.getText());
//        data_mes = Integer.parseInt(txt_data_mes.getText());
    }

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
