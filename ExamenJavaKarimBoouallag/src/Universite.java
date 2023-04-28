import java.util.ArrayList;

public class Universite {
    private String name;
    private String adresse;
    private ArrayList<Etudiant> listeEtudiants;
    private ArrayList<Professeur> listeProfesseurs;
    private ArrayList<Secretaire> listeSecretaires;

    public Universite(String name, String adresse) {
        this.name = name;
        this.adresse = adresse;
        this.listeEtudiants = new ArrayList<>();
        this.listeProfesseurs = new ArrayList<>();
        this.listeSecretaires = new ArrayList<>();
    }

    public void ajouterEtudiant(Etudiant etudiant) {
        this.listeEtudiants.add(etudiant);
    }

    public void ajouterProfesseur(Professeur professeur) {
        this.listeProfesseurs.add(professeur);
    }

    public void ajouterSecretaire(Secretaire secretaire) {
        this.listeSecretaires.add(secretaire);
    }

    public void afficherEtudiants() {
        System.out.println("Liste des étudiants : ");
        for (Etudiant etudiant : listeEtudiants) {
            System.out.println(etudiant.getNom() + " " + etudiant.getPrenom() + " (" + etudiant.getNiveau() + ")");
        }
    }

    public void afficherProfesseurs() {
        System.out.println("Liste des professeurs : ");
        for (Professeur professeur : listeProfesseurs) {
            System.out.println(professeur.getNom() + " " + professeur.getPrenom() + " (" + professeur.getSpecialite() + ")");
        }
    }

    public void afficherSecretaires() {
        System.out.println("Liste des secrétaires : ");
        for (Secretaire secretaire : listeSecretaires) {
            System.out.println(secretaire.getNom() + " " + secretaire.getPrenom() + " (" + secretaire.getBureau() + ")");
        }
    }

    public void afficherPersonnes() {
        System.out.println("Liste des personnes : ");
        for (Etudiant etudiant : listeEtudiants) {
            System.out.println(etudiant.getNom() + " " + etudiant.getPrenom() + " (étudiant)");
        }
        for (Professeur professeur : listeProfesseurs) {
            System.out.println(professeur.getNom() + " " + professeur.getPrenom() + " (professeur)");
        }
        for (Secretaire secretaire : listeSecretaires) {
            System.out.println(secretaire.getNom() + " " + secretaire.getPrenom() + " (secrétaire)");
        }
    }

    public void supprimerPersonne(String nom, String prenom) {
        for (Etudiant etudiant : listeEtudiants) {
            if (etudiant.getNom().equals(nom) && etudiant.getPrenom().equals(prenom)) {
                listeEtudiants.remove(etudiant);
                System.out.println("Etudiant supprimé : " + nom + " " + prenom);
                return;
            }
        }
        for (Professeur professeur : listeProfesseurs) {
            if (professeur.getNom().equals(nom) && professeur.getPrenom().equals(prenom)) {
                listeProfesseurs.remove(professeur);
                System.out.println("Professeur supprimé : " + nom + " " + prenom);
                return;
            }
        }
        for (Secretaire secretaire : listeSecretaires) {
            if (secretaire.getNom().equals(nom) && secretaire.getPrenom().equals(prenom)) {
                listeSecretaires.remove(secretaire);
                System.out.println("Secrétaire supprimé : " + nom + " " + prenom);
                return;
            }
        }
        System.out.println("Personne non trouvée : " + nom + " " + prenom);
    }

}


