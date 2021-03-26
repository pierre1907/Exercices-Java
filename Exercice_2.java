/*Exercice 2 

    Saisir une année  et un mois 
    puis determiner le nombre de jour de ce mois
    dans l'année

        1- pas de classe de java 
        2- Faire avec les classes Java 
*/

import java.time.*;
import java.util.Scanner;
 
 
public class Exercice_2{
	public static void main(String[] args){
		Scanner ok = new Scanner(System.in);
			System.out.println("Saissez le numéro du mois s'il vous plaît :");
			String mois = ok;
			int i = Integer.parseInt(mois);
			System.out.println("Saissez s'il vous plaît l'année :");
			String annee = ok;
			int j = Integer.parseInt(annee);
			System.out.println("Le mois numero "+i+" de l'année "+ annee +" a "+ j +" jours");
	}
}

        
            