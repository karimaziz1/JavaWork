package src.tn.esprit.gestionZoo.main;


import src.tn.esprit.gestionZoo.entities.*;

class ZooMangment {
 public static void main(String[] args) {

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

     Aquatic  fish =new Aquatic("fish","9arous",10,true,"tunisie");
     Dolphin balle=new Dolphin("fish","fou9ma",10 ,false,"france",25);
      Penguin peng1= new Penguin("bt","jiji",10,true ,"tunis",15);

      Dolphin balle2=new Dolphin("ea","fou9ma",10 ,false,"france",25);
     Terrestrial ters2 = new Terrestrial("dez","ters",5, false ,5);

     System.out.println(fish);

     System.out.println(balle);
     System.out.println(peng1);
     System.out.println(balle2);

     fish.swim();
     balle.swim();
     peng1.swim();








 }
}