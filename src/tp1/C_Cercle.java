package tp1;
/*Attributs*/

import java.util.Scanner;

public class C_Cercle {
	private float posX;
	private float posY;
	private float ray;
	private String name ="C";

	/* --------------------- Constructeurs ---------------------- */
	/* d'un Objet */

	public C_Cercle(float abs, float ord, float rayon) {
		this.posX = abs;
		this.posY = ord;
		this.ray = rayon;
		


	}
	public C_Cercle() {
		this.posX = 10.5f;
		this.posY = 9.2f;
		this.ray = 10;
	}
	/* --------------------- Méthodes des l'Objet---------------------- */
	/* méthode Objets (fonction d'un objet */
	/* 'void' qui ne retourne 'rien' */

	public void affiche() {
		System.out.println("le cercle à un Rayon de :" + this.ray);
		System.out.println("le cercle à une coordonnée 'X' de :" + this.posX);
		System.out.println("le cercle à une coordonnée 'Y' de :" + this.posY);
	}
	public String toString() {
		return "Cercle " + this.name + " de rayon " + this.ray  + " :  coord ( " + this.posX + " , " + this.posY + ")";
	}

	public void seDeplace(float deltaX, float deltaY) {
		this.posX = deltaX;
		this.posY = deltaY;
		System.out.println("Nouvelle coordonnée 'X' de :" + this.posX);
		System.out.println("Nouvelle coordonnée 'Y' de :" + this.posY);
	}
	public boolean compCercle(C_Cercle autreCercle) {
		return this.ray == autreCercle.ray ;
	}

	/* Rend la méthode inapte */
	public static C_Cercle saisirCercle() {
		/* Nom de la fonction */
		C_Cercle monCercle = new C_Cercle();
		/* Saisie au clavier par l'utilisateur. */
		Scanner sc = new Scanner(System.in);
		System.out.println("Donner la coordonnées de 'X' : ");
		monCercle.posX = sc.nextFloat();
		System.out.println("Saisir la coordonnées de 'Y' : ");
		monCercle.posY = sc.nextFloat();
		System.out.println("Saisir la valeur du 'rayon' du cercle : ");
		monCercle.ray = sc.nextFloat();
		sc.close();
		return monCercle;
	}

	// === ACCESSEUR === //
	public float getPosX() {
		return this.posX;
	}

	public float getPosY() {
		return this.posY;
	}

	public float getRay() {
		return this.ray;
	}
	public String getName() {
		return this.name;
	}

	// === Mutateur === //
	public void setPosX(int nouvelleValeur) {
		this.posX = nouvelleValeur;
	}

	public void setPosY(int nouvelleValeur) {
		this.posY = nouvelleValeur;
	}

	public void setRay(int nouvelleValeur) {
		this.ray = nouvelleValeur;
	}
	public void setName(String nouvelleValeur ) {
		this.name = nouvelleValeur;
	}
}
