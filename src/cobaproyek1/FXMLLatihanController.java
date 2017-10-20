/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cobaproyek1;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXTextArea;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

/**
 * FXML Controller class
 *
 * @author DITO
 */
public class FXMLLatihanController implements Initializable {

    @FXML
    private AnchorPane button;
    @FXML
    private TextField ipnama;
    @FXML
    private TextField ipalamat;
    @FXML
    private TextField ipabsen;
    @FXML
    private TextField iptelepon;
    @FXML
    private JFXButton proses;
    @FXML
    private JFXTextArea hasil;
    @FXML
    private JFXButton hapus;


    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void buttonProses(ActionEvent event) {
        String nama = ipnama.getText();
        String absen = ipabsen.getText();
        String alamat = ipalamat.getText();
        String telepon = iptelepon.getText();
    
        hasil.setText("Nama "+nama+"\n Absen "+absen+"\n Alamat "+alamat+"\n Telepon "+telepon);
    }
    @FXML
    void buttonHapus(ActionEvent event) {
        hasil.setText("");
        ipnama.setText("");
        ipabsen.setText("");
        ipalamat.setText("");
        iptelepon.setText("");
    }
}

