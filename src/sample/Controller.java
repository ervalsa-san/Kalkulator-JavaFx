package sample;

import javafx.fxml.FXML;

import java.awt.*;
import java.awt.event.ActionEvent;

public class Controller {
    @FXML
    public javafx.scene.control.TextField tfBilanganPertama;
    @FXML
    public javafx.scene.control.TextField tfBilanganKedua;
    @FXML
    public javafx.scene.control.Button btnTambah;
    @FXML
    public javafx.scene.control.Button btnKurang;
    @FXML
    public javafx.scene.control.Button btnKali;
    @FXML
    public javafx.scene.control.Button btnBagi;
    @FXML
    public javafx.scene.control.TextField tfHasil;

    @FXML
    public void onButtonClicked(javafx.event.ActionEvent e) {
        BilanganModel bilanganModel = new BilanganModel();

        try {
            bilanganModel.setBilanganPertama(Double.parseDouble(tfBilanganPertama.getText()));
            bilanganModel.setBilanganKedua(Double.parseDouble(tfBilanganKedua.getText()));
        } catch (NumberFormatException el) {
            tfHasil.setText("Masukkan hanya boleh angka.");
            return;
        }

        if (e.getSource().equals(btnTambah)) {
            bilanganModel.setHasil(bilanganModel.getBilanganPertama() + bilanganModel.getBilanganKedua());
            tfHasil.setText(String.valueOf(bilanganModel.getHasil()));
        } else if (e.getSource().equals(btnKurang)) {
            bilanganModel.setHasil(bilanganModel.getBilanganPertama() - bilanganModel.getBilanganKedua());
            tfHasil.setText(String.valueOf(bilanganModel.getHasil()));
        } else if (e.getSource().equals(btnKali)) {
            bilanganModel.setHasil(bilanganModel.getBilanganPertama() * bilanganModel.getBilanganKedua());
            tfHasil.setText(String.valueOf(bilanganModel.getHasil()));
        } else if (e.getSource().equals(btnBagi)) {
            bilanganModel.setHasil(bilanganModel.getBilanganPertama() / bilanganModel.getBilanganKedua());
            tfHasil.setText(String.valueOf(bilanganModel.getHasil()));
        }
    }
}
