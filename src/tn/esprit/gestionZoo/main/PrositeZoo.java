package src.tn.esprit.gestionZoo.main;


import src.tn.esprit.gestionZoo.entities.Animal;
import src.tn.esprit.gestionZoo.entities.Zoo;

class ZooMangment {
 public static void main(String[] args) {
// int nbrCages=20;
// String zooName ="my zoo";
// System.out.println(zooName+" comporte "+nbrCages+" cages ");
 /* Scanner sc = new Scanner(System.in);
  System.out.println("donner le nombre des cages :");
  int nbrCages = sc.nextInt();
  sc.nextLine();
  System.out.println("donner le nom de zoo :");
  String zooName = sc.nextLine();
  while (nbrCages < 0 || zooName.isEmpty()) {
   if (nbrCages < 0) {
    System.out.println(" le nombre des cages negative :");
    nbrCages = sc.nextInt();
    sc.nextLine();
   }
   if (zooName.isEmpty()) {
    System.out.println(" le nom de zoo est vide :");
    zooName = sc.nextLine();
   }
  }
  System.out.println(zooName + " comporte " + nbrCages + " cages ");
  sc.close();*/

  /*src.tn.esprit.gestionZoo.entities.Animal lion= new src.tn.esprit.gestionZoo.entities.Animal();
  lion.family="cat";
  lion.name="tarchouna";
  lion.age=5;
  lion.isMammal=true;

  src.tn.esprit.gestionZoo.entities.Zoo myzoo= new src.tn.esprit.gestionZoo.entities.Zoo();
  myzoo.city="tunis";
  myzoo.name="carthage";
  myzoo.nbrCages=50;*/
    Animal lion =new Animal("cat", "tarchouna",5, true);
     Animal cheval =new Animal("cheval", "hoh",10, true);
     Animal cheval2 =new Animal("cheval", "hoh",10, true);
     Animal cat =new Animal("cat", "dsd",2, true);

    Zoo myzoo=new Zoo("carthage", "tunis");
    Zoo myzoo1=new Zoo("afriga", "tunjerbais");
    //affichage//
    myzoo.displayZoo();
  myzoo1.displayZoo();
 //toString methode//
  System.out.println(lion);
  System.out.println(myzoo);

     myzoo.addAnimal(lion);
    myzoo.addAnimal(cheval);
     myzoo.addAnimal(cat);
     myzoo.afficherZoo();
     //myzoo.searchAnimal(lion4);
     System.out.println(myzoo.searchAnimal(lion));
     myzoo.supprimeAnimal(cheval);
     myzoo.afficherZoo();
     myzoo.supprimeAnimal(cat);

     Zoo resultat = Zoo.comparerZoo(myzoo, myzoo1);
     if (resultat != null) {
         System.out.println("Le zoo qui contient le plus d'animaux est : "
                 + resultat.getName());
     } else {
         System.out.println("Les deux zoos ont le même nombre d'animaux.");
     }





 }
}