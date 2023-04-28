public class Professeur extends Personne {
    private String specialite;
    private double salaire;

    public Professeur(String nom, String prenom, int age, String sexe, String specialite, double salaire) {
        super(nom, prenom, age, sexe);
        this.specialite = specialite;
        this.salaire = salaire;
    }

    public String getSpecialite() {
        return specialite;
    }

    public void setSpecialite(String specialite) {
        this.specialite = specialite;
    }

    public double getSalaire() {
        return salaire;
    }

    public void setSalaire(double salaire) {
        this.salaire = salaire;
    }
}

