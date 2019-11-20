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

	/* méthode Objets (fonction d'un objet */
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

	/* méthode Objets (fonction d'un objet , 'void' qui ne retourne 'rien'*/
	public void affiche() {
		System.out.println("Le points de Vie : " + this.pv + "\nLes points de rapidité : " + this.rapidite
				+ "\nLa position X :" + this.posX + "\nLa position : " + this.posY);
	}
	public Ennemi(int pv, int rapidite) {
		this.pv = pv;
		this.rapidite =rapidite;
	}
}
