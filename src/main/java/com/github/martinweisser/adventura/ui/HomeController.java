package com.github.martinweisser.adventura.ui;

import com.github.martinweisser.adventura.logika.IHra;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;

/**
 * Kontroler, kterĂ˝ zprostĹ™edkovĂˇvĂˇ komunikaci mezi grafikou
 * a logikou adventury
 * 
 * @author Filip Vencovsky
 *
 */
public class HomeController extends GridPane {
	
	@FXML private TextField vstupniText;
	
	/**
	 * metoda ÄŤte pĹ™Ă­kaz ze vstupnĂ­ho textovĂ©ho pole
	 * a zpracuje ho
	 */
	@FXML public void odesliPrikaz() {
		System.out.println(vstupniText.getText());
		vstupniText.setText("");
	}
	
	/**
	 * Metoda bude souĹľit pro pĹ™edĂˇnĂ­ objektu se spuĹˇtÄ›nou hrou
	 * kontroleru a zobrazĂ­ stav hry v grafice.
	 * @param objekt spuĹˇtÄ›nĂ© hry
	 */
	public void inicializuj(IHra hra) {
		
	}

}
