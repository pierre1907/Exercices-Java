/*
Exercice 4
    Saisir une date puis determiner la date suivante puis la date precedente 
        1- pas de classe de java 
        2- Faire avec les classes Java 
*/

import java.util.Scanner;

class Exercice_4{
    public static void main(String args[]){
        Scanner date = new Scanner(System.in);
        System.out.println("Le systéme vous demanderas d'entrer une date au format dd/mm/yyyy");
        System.out.print("Entrez le jour : ");
        int jour = date.nextInt();
        System.out.print("Entrez le mois : ");
        int mois = date.nextInt();
        System.out.print("Entrez une année : ");
        int annee = date.nextInt();
        System.out.println("La date que vous avez entrée est : " + jour+" / " +mois+ " / " +annee );
        System.out.println("Affichage de la date suivante : ");
        if((mois == 12 ) && (jour ==31 )){
            annee +=1 ;
            jour = 1;
            mois =1;
            System.out.println("La date suivante  est : "+jour+" / "+mois+" / "+annee );   
        }


        System.out.println("Affichage de la date precedente : ");
        
    }
}