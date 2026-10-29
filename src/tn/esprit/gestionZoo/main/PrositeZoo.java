package src.tn.esprit.gestionZoo.main;


import src.tn.esprit.gestionZoo.entities.*;

class ZooMangment {
 public static void main(String[] args) {

    Animal lion =new Animal("cat", "tarchouna",5, true);
     Animal cheval =new Animal("cheval", "hoh",10, true);
     Animal cheval2 =new Animal("cheval", "hoh",10, true);
     Animal cat =new Animal("cat", "dsd",2, true);

    Zoo myzoo=new Zoo("carthage", "tunis");

    //affichage//
    myzoo.displayZoo();

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

     Zoo resultat = Zoo.comparerZoo(myzoo, myzoo);
     if (resultat != null) {
         System.out.println("Le zoo qui contient le plus d'animaux est : "
                 + resultat.getName());
     } else {
         System.out.println("Les deux zoos ont le même nombre d'animaux.");
     }

  Aquatic q = new Dolphin("fish", "9arous", 10, true, "tunisie", 25);
  Aquatic q1 = new Dolphin("fish1", "dauphin1", 8, true, "tunisie", 20);
  Aquatic q2 = new Dolphin("fish2", "dauphin2", 7, true, "france", 22);
  Aquatic q3 = new Penguin("bt", "jiji", 10, true, "tunis", 100);
  Aquatic q4 = new Penguin("bt", "jiji", 10, true, "tunis", 110);



     //polly//

     myzoo.addAquaticAnimals(q);
     myzoo.addAquaticAnimals(q1);
  myzoo.addAquaticAnimals(q2);
  myzoo.addAquaticAnimals(q3);
  myzoo.addAquaticAnimals(q4);

     myzoo.displayAquaticAnimals();



  System.out.println("Profondeur maximale des pingouins : "
          + myzoo.maxPenguinDepth());

  myzoo.afficherNombreAnimauxAquatiques();
  System.out.println(q3.equals(q4));











 }
}