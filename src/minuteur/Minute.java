package minuteur;

public class Minute {
	/*Attributs*/
	private int minute;
	int n;

	

/* --------------------- Méthodes des l'Objet----------------------*/
/* méthode Objets (fonction d'un objet */
/*'void' qui ne retourne 'rien'*/

	public Minute() {
		this.minute = minute;
	}

	public void tic() {
		if (this.minute ==59) {
			this.minute =0;
		} else {
			this.minute +=1;
			}
		System.out.println(minute);
	}
	
	public void avancer(int n) {
		for (int i = 0; i < n; i++) { 
			this.tic(); }
	}
	
	// === ACCESSEUR === //
	public int getMinute() {
		return minute;
	}
	
	// === Mutateur === //
	
	public void setMinute(int nouvelleValeur) {
		if (nouvelleValeur > 59 || nouvelleValeur < 0);
		this.minute = nouvelleValeur;
	}
}