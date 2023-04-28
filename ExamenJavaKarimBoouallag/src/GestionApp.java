import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class GestionApp extends JFrame {
    private ArrayList<Etudiant> listeEtudiants;
    private ArrayList<Professeur> listeProfesseurs;
    private ArrayList<Secretaire> listeSecretaires;

    public GestionApp() {
        listeEtudiants = new ArrayList<Etudiant>();
        listeProfesseurs = new ArrayList<Professeur>();
        listeSecretaires = new ArrayList<Secretaire>();

        // Création des composants graphiques
        JLabel labelTitre = new JLabel("Gestion GoldenCollar");
        labelTitre.setFont(new Font("Arial", Font.BOLD, 24));
        labelTitre.setHorizontalAlignment(SwingConstants.CENTER);

        JButton buttonAjouterEtudiant = new JButton("Ajouter un étudiant");
        JButton buttonAjouterProfesseur = new JButton("Ajouter un professeur");
        JButton buttonAjouterSecretaire = new JButton("Ajouter une secrétaire");
        JButton buttonAfficherEtudiants = new JButton("Afficher les étudiants");
        JButton buttonAfficherProfesseurs = new JButton("Afficher les professeurs");
        JButton buttonAfficherSecretaires = new JButton("Afficher les secrétaires");

        // Création des panneaux
        JPanel panelTitre = new JPanel();
        panelTitre.add(labelTitre);

        JPanel panelAjout = new JPanel();
        panelAjout.setLayout(new GridLayout(3, 1));
        panelAjout.add(buttonAjouterEtudiant);
        panelAjout.add(buttonAjouterProfesseur);
        panelAjout.add(buttonAjouterSecretaire);

        JPanel panelAffichage = new JPanel();
        panelAffichage.setLayout(new GridLayout(3, 1));
        panelAffichage.add(buttonAfficherEtudiants);
        panelAffichage.add(buttonAfficherProfesseurs);
        panelAffichage.add(buttonAfficherSecretaires);

        JPanel panelPrincipal = new JPanel();
        panelPrincipal.setLayout(new BorderLayout());
        panelPrincipal.add(panelTitre, BorderLayout.NORTH);
        panelPrincipal.add(panelAjout, BorderLayout.WEST);
        panelPrincipal.add(panelAffichage, BorderLayout.EAST);

        // Ajout des listeners aux boutons
        buttonAjouterEtudiant.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String nomE = JOptionPane.showInputDialog("Nom de l'étudiant:");
                String prenomE = JOptionPane.showInputDialog("Prénom de l'étudiant:");
                String ageE = JOptionPane.showInputDialog("Age:");
                String sexeE = JOptionPane.showInputDialog("Sexe:");
                String numE = JOptionPane.showInputDialog("Numero:");
                String niveauE = JOptionPane.showInputDialog("Niveau:");
                Etudiant etudiant = new Etudiant(nomE, prenomE, Integer.parseInt(ageE), sexeE, Integer.parseInt(numE),niveauE);
                listeEtudiants.add(etudiant);
                JOptionPane.showMessageDialog(null, "L'étudiant a été ajouté.");
            }
        });

        buttonAjouterProfesseur.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String nomP= JOptionPane.showInputDialog("Nom du professeur:");
                String prenomP = JOptionPane.showInputDialog("Prénom du professeur:");
                String ageP = JOptionPane.showInputDialog("Age:");
                String sexeP = JOptionPane.showInputDialog("Sexe:");
                String specialiteP = JOptionPane.showInputDialog("Spécialité:");
                String salaireP = JOptionPane.showInputDialog("Salaire:");
                Professeur professeur = new Professeur(nomP, prenomP, Integer.parseInt(ageP), sexeP, specialiteP, Integer.parseInt(salaireP));
                listeProfesseurs.add(professeur);
                JOptionPane.showMessageDialog(null, "Le professeur a été ajouté.");
            }
        });

        buttonAjouterSecretaire.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String nomS = JOptionPane.showInputDialog("Nom de la secrétaire:");
                String prenomS = JOptionPane.showInputDialog("Prénom de la secrétaire:");
                String ageS = JOptionPane.showInputDialog("Age:");
                String sexeS = JOptionPane.showInputDialog("Sexe:");
                String bureauS = JOptionPane.showInputDialog("Bureau:");
                String salaireS = JOptionPane.showInputDialog("Salaire:");
                Secretaire secretaire = new Secretaire(nomS, prenomS, Integer.parseInt(ageS), sexeS, bureauS, Integer.parseInt(salaireS));
                listeSecretaires.add(secretaire);
                JOptionPane.showMessageDialog(null, "La secrétaire a été ajoutée.");
            }
        });

        buttonAfficherEtudiants.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String message = "";
                for (Etudiant etudiant : listeEtudiants) {
                    message += etudiant.getNom() + " " + etudiant.getPrenom() + " " + etudiant.getAge() + " " + etudiant.getSexe() + " " + etudiant.getNumEtudiant() + " " + etudiant.getNiveau() + "\n";
                }
                if (message.equals("")) {
                    JOptionPane.showMessageDialog(null, "Aucun étudiant n'a été ajouté.");
                } else {
                    JOptionPane.showMessageDialog(null, message);
                }
            }
        });

        buttonAfficherProfesseurs.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String message = "";
                for (Professeur professeur : listeProfesseurs) {
                    message += professeur.getNom() + " " + professeur.getPrenom() + " " + professeur.getAge() + " " + professeur.getSexe() + " " + professeur.getSpecialite() + " " + professeur.getSalaire() + "\n";
                }
                if (message.equals("")) {
                    JOptionPane.showMessageDialog(null, "Aucun professeur n'a été ajouté.");
                } else {
                    JOptionPane.showMessageDialog(null, message);
                }
            }
        });

        buttonAfficherSecretaires.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String message = "";
                for (Secretaire secretaire : listeSecretaires) {
                    message += secretaire.getNom() + " " + secretaire.getPrenom() + " " + secretaire.getAge() + " " + secretaire.getSexe() + " " + secretaire.getBureau() + " " + secretaire.getSalaire()+ "\n";
                }
                if (message.equals("")) {
                    JOptionPane.showMessageDialog(null, "Aucune secrétaire n'a été ajoutée.");
                } else {
                    JOptionPane.showMessageDialog(null, message);
                }
            }
        });

        // Configuration de la fenêtre
        setTitle("Gestion de l'école (par Karim BOUALLAG)");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setContentPane(panelPrincipal);
        pack();
        setVisible(true);
    }

    public static void main(String[] args) {
        new GestionApp();
    }
}

