package tp_git;

import java.util.ArrayList;
import java.util.List;

public class System_hospitalier {
	
	private List<Requête> listRequetes;

	public System_hospitalier(List<Requête> listRequetes) {
		super();
		this.listRequetes = listRequetes;
	}

	public System_hospitalier() {
		super();
		listRequetes = new ArrayList<>();
	}

	public List<Requête> getListRequetes() {
		return listRequetes;
	}

	public void setListRequetes(List<Requête> listRequetes) {
		this.listRequetes = listRequetes;
	}
	
	public void recevoirRequete(Requête requete) {
		listRequetes.add(requete);
		String analyse =  analyserRequete(requete);
		String comparaisonDonnees = comparerDonnes();
		System.out.println(analyse);
		System.out.println(comparaisonDonnees);
	}
	
	private String analyserRequete(Requête requête) {
		// Analyser la requête
		// Récupère les symptômes de la requête
		// Récupère le patient de la requête 
		// Analyse les informations rentrés
		// Retourne une chaîne de caractères pour confirmer l'analyse
		return "requête analysée";
	}
	
	private String comparerDonnes() {
		// Comparaison des données
		// Compare les données d'une requête afin de déterminer un cluster
		// Si un cluster est trouvé, on retourne une confirmation
		return "Cluster trouvé";
		// Sinon on informe que ce n'est pas un cluster
	}

}
