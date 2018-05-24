package com.mws.cars.controllers;

import com.mws.cars.model.Car;
import com.mws.cars.services.CarService;
import de.felixroske.jfxsupport.FXMLController;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableView;
import org.springframework.beans.factory.annotation.Autowired;

import java.net.URL;
import java.util.ResourceBundle;

@FXMLController
public class CarController implements Initializable {

    @FXML
    private TableView<Car> tableView;

    @Autowired
    private CarService carService;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        tableView.getItems().setAll(carService.getInitialCars());
    }
}
