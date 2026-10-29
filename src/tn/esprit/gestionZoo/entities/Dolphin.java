package src.tn.esprit.gestionZoo.entities;

public class Dolphin extends Aquatic {

     protected float swimmingSpeed;



    public Dolphin(String family, String name, int age, boolean isMammal, String habitat, float vitesse_de_nage) {
        super(family, name, age, isMammal, habitat);
        this.swimmingSpeed = swimmingSpeed;
    }
   // public Dolpihn()


    @Override
    public String toString() {
        return super.toString() +" " +swimmingSpeed;
    }
    public void swim()
    {
        System.out.println("this dolphine   is swimming ");

    }
}
