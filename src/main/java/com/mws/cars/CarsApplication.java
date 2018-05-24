package com.mws.cars;

import com.mws.cars.views.LoginView;
import de.felixroske.jfxsupport.AbstractJavaFxApplicationSupport;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CarsApplication extends AbstractJavaFxApplicationSupport {

	public static void main(String[] args) {
		launch(CarsApplication.class, LoginView.class, args);
	}
}
