/* Nom du répertoire : Tp1
* Nom du projet : poo
* Nom de la classe : Tp1Exo1
* Auteur : Franck 
* Programme :  Créer une class C-CERCLE*/


package tp1;

import java.util.Arrays;

public class Tp1Exo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		C_Cercle cercle1 = C_Cercle.saisirCercle();
		cercle1.setName("A");
		cercle1.affiche();
		cercle1.seDeplace(6, 5);
		
		C_Cercle cercle2 = new C_Cercle();
		cercle2.setName("B");
		cercle2.affiche();
				
		if( cercle2.compCercle(cercle1)) {
			System.out.println("Le rayon est identique");
		}else {
			System.out.println("Le rayon est différent");
		}
		C_Cercle[] tableau = new C_Cercle[3];
		tableau[0] = cercle1;
		tableau[1] = cercle2;
		tableau[2] = new C_Cercle(12.5f, 5.3f, 4);
		System.out.println(Arrays.toString(tableau));
	}

}
