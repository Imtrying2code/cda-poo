/* Nom du répertoire : Towers
* Nom du projet : poo
* Nom de la classe : Terrain
* Auteur : Franck */


package towers;

import java.util.Scanner;

public class Terrain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ennemi grosMechant = new Ennemi(100,2, "grosMechant"); 
		Ennemi unAutreEnnemi = new Ennemi(50,4,"unAutreEnnemi");
		Ennemi leVraiGrosEnnemi = new Ennemi(500,1,"leVraiGrosMechant");
		Ennemi lePetitRapide = new Ennemi(200,10,"lePetitrapide");
		grosMechant.seDeplace(5, 8);
		unAutreEnnemi.seDeplace(6,2);
				
		grosMechant.recevoirDegats(50);
		unAutreEnnemi.recevoirDegats(10);

		Ennemi creation = Ennemi.sasirUnEnnemi();
		System.out.println(creation);	
		
	}

}
