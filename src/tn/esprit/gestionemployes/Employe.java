package tn.esprit.gestionemployes;

public class Employe implements Comparable<Employe>{

     private  int id ;
     private String nom,prenom;
     private String nomDepartement;
     private int grade;

     //constructeur parametres
    public Employe(int id, String nom, String prenom, String nomDepartement, int grade) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.nomDepartement = nomDepartement;
        this.grade = grade;
    }
 //constructeur par default
    public Employe() {
    }

    public int getId()
    {
        return  id;

    }
    public int getGrade() {
        return grade;
    }

    public String getNom() {
        return nom;
    }

    public String getNomDepartement() {
        return nomDepartement;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setNomDepartement(String nomDepartement) {
        this.nomDepartement = nomDepartement;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }
    public String toString()
    {
        return "id : "+ id +"nom :"+ nom +" prenom : "+ prenom +"nomDepartement : "+ nomDepartement + " grade : "+ grade;
    }

    public int compareTo(Employe e) {
            return Integer.compare(this.id, e.id);
        }

}

