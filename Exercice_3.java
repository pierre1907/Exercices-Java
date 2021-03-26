/*
Exercice 3
    Saisir une date (jj-mm-aaaa) puis determiner si la date 
    est valide ou pas 
        1- pas de classe de java 
        2- Faire avec les classes Java 
*/

import java.util.Scanner;
class Exercice_3{
    public static void main(String args[]){
        Scanner date = new Scanner(System.in);
        System.out.println("Entrer un date au format dd/mm/aaaa");
        System.out.print("Entrez le jour :");
        int jour = date.nextInt();
        System.out.print("Entrez le mois :");
        int mois = date.nextInt();
        System.out.print("Entrez une année :");
        int annee = date.nextInt();
        System.out.println("Votre date est "+ jour+" / " +mois+ " / " +annee );
    switch (mois) {
        case 1: //janvier
            if (1<= jour && jour <= 31){
                System.out.println("Votre date est valide ");
            }
            else{ System.out.println("Votre date est invalide "); 
            }
            break;
    
        case 2: //fevrier
            if((annee% 4==0) && (annee %100==0) && (annee %400==0) && (1<= jour) && (jour <= 29)){
                System.out.println("Votre date est valide ");
            }
            else{ 
               System.out.println("Votre date est invalide ");
            }
            break;
        case 3: //mars
            if (1<= jour && jour <= 31){
                System.out.println("Votre date est valide ");
            }
            else{ System.out.println("Votre date est valide "); 
            }
            break;
        case 4: //avril
            if (1<= jour && jour <= 30){
                System.out.println("Votre date est valide ");
            }
            else{ System.out.println("Votre date est valide "); 
            }
            break;
        case 5: //mai
            if (1<= jour && jour <= 31){
                System.out.println("Votre date est valide ");
            }
            else{ System.out.println("Votre date est valide "); 
            }
            break;
        case 6: //juin
            if (1<= jour && jour <= 30){
                System.out.println("Votre date est valide ");
            }
            else{ System.out.println("Votre date est valide "); 
            }
            break;
        case 7: //juillet
            if (1<= jour && jour <= 31){
                System.out.println("Votre date est valide ");
            }
            else{ System.out.println("Votre date est valide "); 
            }
            break;
        case 8: //aout
            if (1<= jour && jour <= 31){
                System.out.println("Votre date est valide ");
            }
            else{ System.out.println("Votre date est valide "); 
            }
            break;
        case 9: //octobre
            if (1<= jour && jour <= 30){
                System.out.println("Votre date est valide ");
            }
            else{ System.out.println("Votre date est valide "); 
            }
            break;
        case 10: //septembre
            if (1<= jour && jour <= 31){
                System.out.println("Votre date est valide ");
            }
            else{ System.out.println("Votre date est valide "); 
            }
            break;
        case 11: //novembre
            if (1<= jour && jour <= 30){
                System.out.println("Votre date est valide ");
            }
            else{ System.out.println("Votre date est valide "); 
            }
            break;
        case 12: //decembre
            if (1<= jour && jour <= 31){
                System.out.println("Votre date est valide ");
            }
            else{ System.out.println("Votre date est valide "); 
            }
            break;

    }
    
}
}