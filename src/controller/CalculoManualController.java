
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
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import javax.swing.JOptionPane;
import model.CalculoManual;

public class CalculoManualController implements Initializable {

    private Stage stage;
    private Scene scene;
    private Parent root;
    @FXML
    private TextField txt_hora_entrada;

    @FXML
    private TextField txt_minuto_entrada;

    @FXML
    private TextField txt_minuto_saida;

    @FXML
    private TextField txt_hora_saida;

    @FXML
    private Label lbl_resu;

    @FXML
    private Label lbl_erro;
    @FXML
    private TextField txt_placa;
    
    @FXML
    public void calculoManual(ActionEvent event) {
        
        try {
            lbl_erro.setText("");
            double horaE, minE, horaS, minS;
            String horaEs, minEs, horaSs, minSs;
            horaEs = txt_hora_entrada.getText();
            minEs = txt_minuto_entrada.getText();
            horaSs = txt_hora_saida.getText();
            minSs = txt_minuto_saida.getText();
            horaE = Double.parseDouble(horaEs);
            minE = Double.parseDouble(minEs);
            horaS = Double.parseDouble(horaSs);
            minS = Double.parseDouble(minSs);
            CalculoManual cm = new CalculoManual(horaE, minE, horaS, minS);
            double resu;
            resu = cm.converterEmDuasCasa(cm.calculo());
            
            if(horaEs.length() !=2 || minEs.length() !=2 || horaSs.length() != 2 || minSs.length() !=2){
                lbl_resu.setText("");
                lbl_erro.setText("Caractere inválido");
            }else if(resu<0){
                lbl_resu.setText("");
                lbl_erro.setText("Caractere inválido");
            }else{
            lbl_resu.setText("Valor pago: R$" + resu);
            }           
        }catch(NumberFormatException e){
            lbl_resu.setText("");
            lbl_erro.setText("Caractere inválido");
        }
    }
    @FXML
    public void gerarRecibo(ActionEvent event){
            String placa,horaE, minE, horaS, minS;
            placa = txt_placa.getText();
            horaE = txt_hora_entrada.getText();
            minE = txt_minuto_entrada.getText();
            horaS = txt_hora_saida.getText();
            minS = txt_minuto_saida.getText();
            
             JOptionPane.showMessageDialog(null,
                "Placa: "+ placa + "\nEntrada: "
                      + horaE + ":" + minE + "\nSaída: " 
                        + horaS + ":" + minS + "\n" +lbl_resu.getText()
                     ,
                "RECIBO",
                JOptionPane.INFORMATION_MESSAGE);
    }

    @FXML
    void back(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("/view/tela_funcao.fxml"));
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
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
