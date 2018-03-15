package com.github.martinweisser.adventura.ui;


import java.util.Scanner;
import com.github.martinweisser.adventura.logika.IHra;
/**
 *  Class TextoveRozhrani
 * 
 *  Toto je uĹľivatelskĂ©ho rozhranĂ­ aplikace Adventura
 *  Tato tĹ™Ă­da vytvĂˇĹ™Ă­ instanci tĹ™Ă­dy Hra, kterĂˇ pĹ™edstavuje logiku aplikace.
 *  ÄŚte vstup zadanĂ˝ uĹľivatelem a pĹ™edĂˇvĂˇ tento Ĺ™etÄ›zec logice a vypisuje odpovÄ›ÄŹ logiky na konzoli.
 *  Pokud chcete hrĂˇt tuto hru, vytvoĹ™te instanci tĂ©to tĹ™Ă­dy
 *  a potĂ© na nĂ­ vyvolejte metodu "hraj". 
 *  
 *
 *@author     Michael Kolling, Lubos Pavlicek, Jarmila Pavlickova
 *@version    pro ĹˇkolnĂ­ rok 2014/2015
 */

public class TextoveRozhrani {
    private IHra hra;

    /**
     *  VytvĂˇĹ™Ă­ hru.
     */
    public TextoveRozhrani(IHra hra) {
        this.hra = hra;
    }

    /**
     *  HlavnĂ­ metoda hry. VypĂ­Ĺˇe ĂşvodnĂ­ text a pak opakuje ÄŤtenĂ­ a zpracovĂˇnĂ­
     *  pĹ™Ă­kazu od hrĂˇÄŤe do konce hry (dokud metoda konecHry() z logiky nevrĂˇtĂ­
     *  hodnotu true). Nakonec vypĂ­Ĺˇe text epilogu.
     */
    public void hraj() {
        System.out.println(hra.vratUvitani());

        // zĂˇkladnĂ­ cyklus programu - opakovanÄ› se ÄŤtou pĹ™Ă­kazy a potĂ©
        // se provĂˇdÄ›jĂ­ do konce hry.

        while (!hra.konecHry()) {
            String radek = prectiString();
            System.out.println(hra.zpracujPrikaz(radek));
        }

        System.out.println(hra.vratEpilog());
    }

    /**
     *  Metoda pĹ™eÄŤte pĹ™Ă­kaz z pĹ™Ă­kazovĂ©ho Ĺ™Ăˇdku
     *
     *@return    VracĂ­ pĹ™eÄŤtenĂ˝ pĹ™Ă­kaz jako instanci tĹ™Ă­dy String
     */
    private String prectiString() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("> ");
        return scanner.nextLine();
    }

}
