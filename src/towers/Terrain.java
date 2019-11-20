/* Nom du répertoire : Towers
* Nom du projet : poo
* Nom de la classe : Terrain
* Auteur : Franck */


package towers;

public class Terrain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ennemi grosMechant = new Ennemi(100,2); 
		Ennemi unAutreEnnemi = new Ennemi(50,4);
		Ennemi leVraiGrosEnnemi = new Ennemi(500,1);
		Ennemi lePetitRapide = new Ennemi(200,10);
		grosMechant.seDeplace(5, 8);
		unAutreEnnemi.seDeplace(6,2);
		
		grosMechant.affiche();
		
		grosMechant.recevoirDegats(50);
		unAutreEnnemi.recevoirDegats(10);
		
		grosMechant.affiche();
		unAutreEnnemi.affiche();
	}

}
