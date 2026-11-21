package tn.esprit.gestionemployes;
public class Main {
    public static void main(String[] args) {

        // Création de la société
        SocieteArrayList societe = new SocieteArrayList();

        // Création des employés
        Employe e1 = new Employe(1, "Ali", "Ahmed", "Informatique", 2);
        Employe e2 = new Employe(2, "Sami", "Mohamed", "RH", 1);
        Employe e3 = new Employe(3, "Karim", "Amine", "Informatique", 3);

        // Ajouter les employés
        societe.ajouterEmploye(e1);
        societe.ajouterEmploye(e2);
        societe.ajouterEmploye(e3);

        // Afficher les employés
        System.out.println("Liste des employés :");
        societe.displayEmploye();

        // Recherche par nom
        System.out.println("Recherche Ali : "
                + societe.rechercherEmploye("Ali"));

        // Recherche par objet
        System.out.println("Recherche employé e2 : "
                + societe.rechercherEmploye(e2));

        // Recherche par département
        System.out.println("Employés du département Informatique :");
        System.out.println(
                societe.rechercherParDepartement("Informatique"));

        // Tri par ID
        System.out.println("Tri par ID :");
        societe.trierEmployeParId();
        societe.displayEmploye();

        // Tri par département et grade
        System.out.println("Tri par département et grade :");
        societe.trierEmployeParNomDépartementEtGrade();
        societe.displayEmploye();

        // Suppression
        societe.supprimerEmploye(e2);

        System.out.println("Après suppression :");
        societe.displayEmploye();
    }
}
