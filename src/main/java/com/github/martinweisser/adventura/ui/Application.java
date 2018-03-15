package com.github.martinweisser.adventura.ui;


import com.github.martinweisser.adventura.logika.Hra;
import com.github.martinweisser.adventura.logika.IHra;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * TĹ™Ă­da slouĹľĂ­ ke spuĹˇtÄ›nĂ­ adventury.
 * PĹ™i spuĹˇtÄ›nĂ­ bez parametru konstruuje okno aplikace,
 * s parametrem -text se spouĹˇtĂ­ v textovĂ©m reĹľimu
 * 
 * @author Filip Vencovsky
 *
 */
public class Application extends javafx.application.Application {

	/**
	 * SpouĹˇtÄ›cĂ­ metoda pro aplikaci
	 * @param args
	 */
	public static void main(String[] args) {
		if (args.length == 0) {
            launch(args);
        } else {
            if (args[0].equals("-text")) {
                IHra hra = new Hra();
                TextoveRozhrani ui = new TextoveRozhrani(hra);
                ui.hraj();
            } else {
                System.out.println("NeplatnĂ˝ parametr");
            }
        }
	}
	/**
	 * Metoda, ve kterĂ© se konstruuje okno, kontroler a hra,
	 * kterĂˇ se pĹ™edĂˇvĂˇ kontroleru
	 */
	@Override
	public void start(Stage primaryStage) throws Exception {
//		Parent root = FXMLLoader.load(getClass().getResource("Home.fxml"));
		
		FXMLLoader loader = new FXMLLoader();
		loader.setLocation(getClass()
		          .getResource("Home.fxml"));
		Parent root = loader.load();

		HomeController c = loader.getController();
		
        primaryStage.setTitle("title");
        primaryStage.setScene(new Scene(root));
        primaryStage.show();
		
	}

}
