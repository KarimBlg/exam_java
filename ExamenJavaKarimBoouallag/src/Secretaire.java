public class Secretaire extends Personne {
    private String bureau;
    private double salaire;
    public Secretaire(String nom, String prenom, int age, String sexe, String bureau, double salaire) {
        super(nom, prenom, age, sexe);
        this.bureau = bureau;
        this.salaire = salaire;
    }

    public String getBureau() {
        return bureau;
    }

    public void setBureau(String bureau) {
        this.bureau = bureau;
    }

    public double getSalaire() {
        return salaire;
    }

    public void setSalaire(double salaire) {
        this.salaire = salaire;
    }

}
