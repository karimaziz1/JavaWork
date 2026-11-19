package src.tn.esprit.gestionZoo.entities;

public class Zoo {

    private String name;
    private String city ;
   private static final int nbrCages=3;
   private  Animal[] animals=new Animal[nbrCages];
    private Aquatic[] aquaticAnimals = new Aquatic[10];
    private  int nbrAnimal;
    private int nbrAqo=0;

    public int getNbrAnimal()
    {
        return nbrAnimal;
    }
    public Zoo(String name,String city) {
        setName(name) ;
        this.city = city;

    }
    public void setName(String name){
        if (name != null && !name.trim().isEmpty())
        {
            this.name=name;
        }
        else
        {
            System.out.println("nom invalide");
        }
    }
    public String getName() {
        return name;
    }


    /*public src.tn.esprit.gestionZoo.entities.Zoo(String name, String city, int nbrCages) {
        this.name = name;
        this.city = city;
        this.nbrCages = nbrCages;
    }*/




    public void  displayZoo()
    {
        String nbrCage;
        System.out.println(name+" "+city +" "+nbrCages );
    }


    public String toString() {
        return  name+" "+city+" "+nbrCages ;
    }



    /*public String toString() {
        return  name+" "+city+" "+nbrCages ;
    }*/

    public void addAnimal(Animal animal) throws ZooFullException,InvalidAgeException
    {

        if (searchAnimal(animal) != -1)
        {
            System.out.println("animal exist");
            return ;
        }
        if (animal.getAge()<0)
        {
            throw new InvalidAgeException("le age est negative");
        }
        if (nbrAnimal >= animals.length) {
            throw new ZooFullException("Le zoo est plein !");
        }

            animals[nbrAnimal]=animal;
            nbrAnimal++;
            System.out.println("ajouter aavec succes");


    }

    public void afficherZoo()
    {
        for (Animal a:animals)
        {
            if (a!=null)
            {
            System.out.println(a);
            }
        }
    }

    public int searchAnimal(Animal animal)
    {

       for (int i=0;i<nbrAnimal;i++)
        {
            if (animals[i].getName().equals(animal.getName())){
               return i;
            }

        }
       return -1;
    }

    public boolean supprimeAnimal(Animal animal)
    {
        int pos=searchAnimal(animal);
        if (pos ==-1 ) {
            System.out.println("animal n'exit pas ");
            return  false;
        }
        for (int i=pos;i<nbrAnimal-1 ;i++)
            {
              animals[i]=animals[i+1];
            }
        animals[nbrAnimal - 1] = null;
        nbrAnimal--;

        System.out.println("src.tn.esprit.gestionZoo.entities.Animal supprimé avec succès");
        return true;

    }
    public boolean isZooFull() {
        return nbrAnimal >= nbrCages;
    }
    public static Zoo comparerZoo(Zoo z1, Zoo z2) {
        if (z1.nbrAnimal > z2.nbrAnimal) {
            return z1;
        } else if (z2.nbrAnimal > z1.nbrAnimal) {
            return z2;
        } else {
            return null;
        }
    }
    public void addAquaticAnimals(Aquatic aquatic) {
        if (nbrAqo < aquaticAnimals.length) {
            aquaticAnimals[nbrAqo] = aquatic;
            nbrAqo++;
        } else {
            System.out.println("Le tableau est plein !");
        }
    }
    public void displayAquaticAnimals() {
        for (int i = 0; i < nbrAqo; i++) {
            System.out.println(aquaticAnimals[i]);
            aquaticAnimals[i].swim();
        }
    }

      public float maxPenguinDepth() {
      float max = 0;

      for (int i = 0; i < 10; i++) {
          if (aquaticAnimals[i] instanceof Penguin) {
              Penguin p = (Penguin) aquaticAnimals[i];

              if (p.getSwimmingDepth() > max) {
                  max = p.getSwimmingDepth();
              }
          }
      }

      return max;
  }
    public void afficherNombreAnimauxAquatiques() {

        int nbDolphins = 0;
        int nbPenguins = 0;

        for (int i = 0; i < nbrAqo; i++) {

            if (aquaticAnimals[i] instanceof Dolphin) {
                nbDolphins++;
            }

            if (aquaticAnimals[i] instanceof Penguin) {
                nbPenguins++;
            }
        }

        System.out.println("Nombre de dauphins : " + nbDolphins);
        System.out.println("Nombre de pingouins : " + nbPenguins);
    }


}
