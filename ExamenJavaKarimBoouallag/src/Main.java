public class Main {
    public static void main(String[] args) {
        // Création de l'université
        Universite universite = new Universite("GoldenCollar UFEC", "30 rue esquirol, 75013 Paris");

        // Création de 5 étudiants
        Etudiant etudiant1 = new Etudiant("Bouallag", "Karim", 23, "M", 1, "bac+4");
        Etudiant etudiant2 = new Etudiant("Bouali", "Khaled", 33, "M", 2, "bac+4");
        Etudiant etudiant3 = new Etudiant("Bordjah", "Abdelhakim", 27, "M", 3, "bac+4");
        Etudiant etudiant4 = new Etudiant("Beddek", "Ouerdia", 24, "F", 4, "bac+4");
        Etudiant etudiant5 = new Etudiant("Korso", "Ferroudja", 26, "F", 5, "bac+4");

        // Création de 5 professeurs
        Professeur professeur1 = new Professeur("Bertrand", "Liaudet", 54, "M", "Web", 1700);
        Professeur professeur2 = new Professeur("Assoulina", "Amar", 38, "M", "Java", 1300 );
        Professeur professeur3 = new Professeur("Nidzar", "Leila", 31, "F", "Python", 1580 );
        Professeur professeur4 = new Professeur("Benmouhooub", "Amine", 29, "M", "Design", 1240 );
        Professeur professeur5 = new Professeur("Ahfir", "Syrine", 30, "F", "Comptabilité", 1450 );

        // Création de 5 secrétaires
        Secretaire secretaire1 = new Secretaire("Amer", "Sophia", 27, "F", "Accueil", 1330);
        Secretaire secretaire2 = new Secretaire("Dupont", "Xavier", 28 , "M", "Accueil", 1520 );
        Secretaire secretaire3 = new Secretaire("Moussouni", "Messi", 26 , "M", "Comptable",1750 );
        Secretaire secretaire4 = new Secretaire("Malek", "Juba", 31 , "M", "Gestion", 2410 );
        Secretaire secretaire5 = new Secretaire("Merrad", "Lina", 25 , "F", "Administration", 1380 );

        // Ajout des étudiants à l'université
        universite.ajouterEtudiant(etudiant1);
        universite.ajouterEtudiant(etudiant2);
        universite.ajouterEtudiant(etudiant3);
        universite.ajouterEtudiant(etudiant4);
        universite.ajouterEtudiant(etudiant5);

        // Ajout des professeurs à l'université
        universite.ajouterProfesseur(professeur1);
        universite.ajouterProfesseur(professeur2);
        universite.ajouterProfesseur(professeur3);
        universite.ajouterProfesseur(professeur4);
        universite.ajouterProfesseur(professeur5);

        // Ajout des secrétaires à l'université
        universite.ajouterSecretaire(secretaire1);
        universite.ajouterSecretaire(secretaire2);
        universite.ajouterSecretaire(secretaire3);
        universite.ajouterSecretaire(secretaire4);
        universite.ajouterSecretaire(secretaire5);

        // Affichage de l'université et de ses membres
        universite.afficherPersonnes();

    }
}