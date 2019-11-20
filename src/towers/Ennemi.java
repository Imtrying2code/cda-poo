/* Nom du r�pertoire : Towers
* Nom du projet : poo
* Nom de la classe : Ennemi
* Auteur : Franck */

package towers;

import java.util.Scanner;

/*Attributs*/
public class Ennemi {
	float posX;
	float posY;
	int pv;
	int rapidite;
	String name;
	static int compteur;
	
	/* --------------------- Constructeurs ----------------------*/
							/*d'un Objet*/
	public Ennemi(float posX, float posY, int pv, int rapidite) {
		compteur ++;
		this.posX = posX;
		this.posY = posY;
		this.pv = pv;
		this.rapidite = rapidite;		
	}

					/* Constructeur de l'objet */
	public Ennemi() {
		compteur ++;
		this.pv = 200;
		this.rapidite =2;
		this.posX =0;
		this.posY =0;
	}

	public Ennemi(int pv, int rapidite, String name) {
		compteur ++;
		this.pv = pv;
		this.rapidite = rapidite;
		this.name = name;
		
	}
	
	
	
	/* --------------------- M�thodes des l'Objet----------------------*/
						/* m�thode Objets (fonction d'un objet */
						/*'void' qui ne retourne 'rien'*/
	public void affiche() {
		System.out.println(this.name +"\n"+"Points de Vie : " + 
				this.pv + "\nPoints de rapidit� : " +
				this.rapidite+ "\nPosition X :" + 
				this.posX + "\nPosition : " + this.posY);
	}
	
	public void recevoirDegats(int deg) {
		this.pv -= deg;		
		System.out.println(this.name +"Se prend "+ deg+" points de d�gat");
	}
	
	public void seDeplace(float nouveauX, float nouveauY) {
		this.posX =nouveauX;
		this.posY =nouveauY;
		System.out.println(this.name +"Se d�place vers coordonn�es de 'x' :"+ nouveauX+ 
				"\n"+ this.name +"Se d�place vers coordonn�es de 'y' :" +nouveauY);
	}
	public boolean estVivant() {
		return (this.pv <= 0);
	}
	public String toString() {
		return " L'ennemi :" +this.name + " a :" +this.pv +"point de vie";
	}
		/* Rend la m�thode inapte*/
	public static Ennemi sasirUnEnnemi() {
		/*Nom de la fonction*/
		Ennemi unEnnemi = new Ennemi(); 
		/*Saisie au clavier par l'utilisateur.*/
		Scanner sc = new Scanner(System.in);
		unEnnemi.pv= sc.nextInt();
		unEnnemi.rapidite = sc.nextInt();
		unEnnemi.name = sc.next();
		return unEnnemi;
		
	}
	
}
