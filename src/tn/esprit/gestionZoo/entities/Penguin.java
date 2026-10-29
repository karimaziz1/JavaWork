package src.tn.esprit.gestionZoo.entities;

public class Penguin extends  Aquatic{

    protected   float swimmingDepth;

    public Penguin(String family, String name, int age, boolean isMammal, String habitat, float swimmingDepth) {
        super(family, name, age, isMammal, habitat);
        this.swimmingDepth = swimmingDepth;
    }



    /*public Penguin()
    {
        System.out.println("penguine cree");
    }*/
    public String toString() {
        return super.toString() +" " +swimmingDepth;

    }
    public void swim()
    {
        System.out.println("this penguin is swimming ");

    }
}
