package tn.esprit.gestionemployes;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Collections;
import java.util.List;

public class SocieteArrayList implements  IGestionEmploye<Employe> ,IRechercheAvancee<Employe>{

    ArrayList<Employe> list = new ArrayList<>();

    @Override
    public void ajouterEmploye(Employe employe) {
        list.add(employe);
    }


    @Override
    public boolean rechercherEmploye(Employe employe) {

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getId() == employe.getId())
                return true;
        }
        return false;
    }

    @Override
    public boolean rechercherEmploye(String nom) {

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getNom().equals(nom))
                return true;
        }
        return false;
    }

    @Override
    public void supprimerEmploye(Employe employe) {

        for (int i = 0; i < list.size(); i++) {

            if (list.get(i).getId() == employe.getId()) {
                list.remove(i);
            }
        }
    }

    @Override
    public void displayEmploye() {

        for (Employe e : list) {
            System.out.println(e);
        }
    }

    @Override
    public void trierEmployeParId() {
       /* Employe aux;
        for (int i=0;i<list.size();i++)
        {
            for (int j=0 ;j<list.size()-1;j++)
                if (list.get(j).getId()>list.get(j+1).getId())
                {
                    aux=list.get(j);
                    list.set(j,list.get(j+1));
                    list.set(j+1,aux);
                }

        }*/
        Collections.sort(list);

    }

    @Override
    public void trierEmployeParNomDépartementEtGrade() {

        list.sort(
                Comparator.comparing(Employe::getNomDepartement)
                        .thenComparingInt(Employe::getGrade)
                        .thenComparing(Employe::getNom)
        );

    }

    @Override
    public List<Employe> rechercherParDepartement(String nomDepartement) {

        List<Employe> resultat = new ArrayList<>();

        for (Employe e : list) {
            if (e.getNomDepartement().equals(nomDepartement)) {
                resultat.add(e);
            }
        }

        return resultat;
    }
}

