/*
Exercice 1

    Saisir une année qui est un entier positif puis 
    determiner si l'année est bisextile ou pas 
*/

import java.util.Scanner;

class Exercice_1{
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        System.out.print("Entrez une année: ");
        int p = s.nextInt();
        boolean c = false;
        if(p % 400 == 0){
            c = true;
        }
        else if (p % 100 == 0){
            c = false;
        }
        else if(p % 4 == 0){
            c = true;
        }
        else{
            c = false;
        }
        if(c == true){
            System.out.println("L'année "+ p +" est une année bissextile");
        }
        else{
            System.out.println("L'année "+ p +" n'est pas une année bissextile");
        }
    }
}