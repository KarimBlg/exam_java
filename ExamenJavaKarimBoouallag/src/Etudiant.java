public class Etudiant extends Personne {
    private int numEtudiant;
    private String niveau;

    public Etudiant(String nom, String prenom, int age, String sexe, int numEtudiant, String niveau) {
        super(nom, prenom, age, sexe);
        this.numEtudiant = numEtudiant;
        this.niveau = niveau;
    }

    public int getNumEtudiant() {
        return numEtudiant;
    }

    public void setNumEtudiant(int numEtudiant) {
        this.numEtudiant = numEtudiant;
    }

    public String getNiveau() {
        return niveau;
    }

    public void setNiveau(String niveau) {
        this.niveau = niveau;
    }

}
