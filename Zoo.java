public class Zoo {

    private String name;
    private String city ;
   private static final int nbrCages=25;
   private  Animal[] animals=new Animal[nbrCages];
    private  int nbrAnimal=0;

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


    /*public Zoo(String name, String city, int nbrCages) {
        this.name = name;
        this.city = city;
        this.nbrCages = nbrCages;
    }*/




    public void  displayZoo()
    {
        String nbrCage;
        System.out.println(name+" "+city +" "+nbrCages );
    }

    @Override
    /*public String toString() {
        return  name+" "+city+" "+nbrCages ;
    }

    public boolean addAnimal(Animal animal)
    {
      if (nbrAnimal<animals.length)
      {
          animals[nbrAnimal]=animal;
          nbrAnimal++;
          System.out.println("ajouter aavec succes");
        return true;

      }
      else
      {
          System.out.println("tableau plain");
          return false;
      }
    }*/
    public String toString() {
        return  name+" "+city+" "+nbrCages ;
    }

    public boolean addAnimal(Animal animal)
    {
        boolean full=isZooFull();
        if (searchAnimal(animal) != -1)
        {
            System.out.println("animal exist");
            return false ;
        }

        if (!full)
        {
            animals[nbrAnimal]=animal;
            nbrAnimal++;
            System.out.println("ajouter aavec succes");
            return true;

        }
        else
        {
            System.out.println("tableau plain");
            return false;
        }
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

        System.out.println("Animal supprimé avec succès");
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


}
