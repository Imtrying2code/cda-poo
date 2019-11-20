/* Nom du répertoire : Towers
* Nom du projet : poo
* Nom de la classe : Ennemi
* Auteur : Franck */

package towers;

import java.util.Scanner;

/*Attributs*/
public class Ennemi {
	private float posX;
	private float posY;
	private int pv;
	private int rapidite;
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
	
	
	
	/* --------------------- Méthodes des l'Objet----------------------*/
						/* méthode Objets (fonction d'un objet */
						/*'void' qui ne retourne 'rien'*/
	public void affiche() {
		System.out.println(this.name +"\n"+"Points de Vie : " + 
				this.pv + "\nPoints de rapidité : " +
				this.rapidite+ "\nPosition X :" + 
				this.posX + "\nPosition : " + this.posY);
	}
	
	public void recevoirDegats(int deg) {
		this.pv -= deg;		
		System.out.println(this.name +"Se prend "+ deg+" points de dégat");
	}
	
	public void seDeplace(float nouveauX, float nouveauY) {
		this.posX =nouveauX;
		this.posY =nouveauY;
		System.out.println(this.name +"Se déplace vers coordonnées de 'x' :"+ nouveauX+ 
				"\n"+ this.name +"Se déplace vers coordonnées de 'y' :" +nouveauY);
	}
	public boolean estVivant() {
		return (this.pv <= 0);
	}
	public String toString() {
		return "L'ennemi se nomme :" +this.name + "\na " +
				this.pv +" points de vie" +"\na "+
				this.rapidite +" points de rapidité";
	}
		/* Rend la méthode inapte*/
	public static Ennemi sasirUnEnnemi() {
		/*Nom de la fonction*/
		Ennemi unEnnemi = new Ennemi(); 
		/*Saisie au clavier par l'utilisateur.*/
		Scanner sc = new Scanner(System.in);
		System.out.println("Donner les points de vie :");
		unEnnemi.pv= sc.nextInt();
		System.out.println("Donner les points de rapidité :");
		unEnnemi.rapidite = sc.nextInt();
		System.out.println("Donner un nom à l'ennemi :");
		unEnnemi.name = sc.next();
		sc.close();
		return unEnnemi;
	}
	
	// === ACCESSEUR === //
	public int getPv() {
		return this.pv;
	}
	public int getRapidite() {
		return this.rapidite;
	}
	public float getPosX() {
		return this.posX;
	}
	public float getPosY() {
		return this.posY;
	}
	// === Mutateur === //
	
	public void setPv(int nouvelleValeur) {
		this.pv = nouvelleValeur;
	}
	public void setRapidite(int nouvelleValeur) {
		this.rapidite = nouvelleValeur;
	}
	public void setPosX(int nouvelleValeur) {
		this.posX = nouvelleValeur;
	}
	public void setPosY(int nouvelleValeur) {
		this.posY = nouvelleValeur;
	}
}

