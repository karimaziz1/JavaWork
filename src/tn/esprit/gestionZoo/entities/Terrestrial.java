package src.tn.esprit.gestionZoo.entities;

public class Terrestrial extends  Animal {

    protected int nbrLegs;


    public Terrestrial(String family, String name, int age, boolean isMammal, int nbrLegs) {
        super(family, name, age, isMammal);
        this.nbrLegs = nbrLegs;
    }
   /* public terrestrial()
    {
        System.out.println("terrestrial a cree");
    }*/
   public String toString() {
       return super.toString() +" " +nbrLegs;
   }
}
