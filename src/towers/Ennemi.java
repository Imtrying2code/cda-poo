/* Nom du répertoire : Towers
* Nom du projet : poo
* Nom de la classe : Ennemi
* Auteur : Franck */

package towers;

/*Attributs*/
public class Ennemi {
	float posX;
	float posY;
	int pv;
	int rapidite;
	/* --------------------- Constructeurs ----------------------*/
							/*d'un Objet*/
	public Ennemi(float posX, float posY, int pv, int rapidite) {
		this.posX = posX;
		this.posY = posY;
		this.pv = pv;
		this.rapidite = rapidite;

	}

					/* Constructeur de l'objet */
	public Ennemi() {
		this.pv = 200;
		this.rapidite =2;
		this.posX =0;
		this.posY =0;
	}

	public Ennemi(int pv, int rapidite) {
		this.pv = pv;
		this.rapidite =rapidite;
	}
	
	
	/* --------------------- Méthodes des l'Objet----------------------*/
						/* méthode Objets (fonction d'un objet */
						/*'void' qui ne retourne 'rien'*/
	public void affiche() {
		System.out.println("Le points de Vie : " + this.pv + "\nLes points de rapidité : " + this.rapidite
				+ "\nLa position X :" + this.posX + "\nLa position : " + this.posY);
	}
	
	public void recevoirDegats(int deg) {
		this.pv -= deg;		
	}
	
	public void seDeplace(float nouveauX, float nouveauY) {
		this.posX =nouveauX;
		this.posY =nouveauY;
	}
	
}
