package src.tn.esprit.gestionZoo.entities;

public class Aquatic extends Animal {
    protected String habitat;


    public Aquatic(String family, String name, int age, boolean isMammal, String habitat) {
        super(family, name, age, isMammal);
        this.habitat = habitat;
    }
    /*public Aquatic()
    {
        System.out.println("aquatic");
    }*/

    public String toString() {
        return super.toString() + " " + habitat;
    }
    public void swim()
    {
        System.out.println("this aquatic animal is swimming ");

    }
}
