package com.mws.cars.controllers;

import com.mws.cars.CarsApplication;
import com.mws.cars.services.LoginService;
import com.mws.cars.views.CarListView;
import de.felixroske.jfxsupport.FXMLController;
import javafx.fxml.FXML;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;
import org.springframework.beans.factory.annotation.Autowired;

@FXMLController
public class LoginController {

    @FXML
    private TextField loginField;

    @FXML
    private PasswordField passwordField;

    @FXML
    private Text actionTargetText;

    @Autowired
    private LoginService loginService;

    @FXML
    private void setHelloText() {
        String login = loginField.getText();
        String password = passwordField.getText();
        boolean loggedIn = loginService.login(login, password);
        if (loggedIn) {
            CarsApplication.showView(CarListView.class);
        } else {
            actionTargetText.setText("Incorrect login or password");
        }
    }
}
