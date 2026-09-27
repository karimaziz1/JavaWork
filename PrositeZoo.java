import java.util.Scanner;
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

  /*Animal lion= new Animal();
  lion.family="cat";
  lion.name="tarchouna";
  lion.age=5;
  lion.isMammal=true;

  Zoo myzoo= new Zoo();
  myzoo.city="tunis";
  myzoo.name="carthage";
  myzoo.nbrCages=50;*/
    Animal lion =new Animal ("cat", "tarchouna",5, true);
    Zoo myzoo=new  Zoo("carthage", "tunis", 20);
    Zoo myzoo1=new  Zoo("afriga", "tunjerbais", 50);
    //affichage//
    myzoo.displayZoo();
  myzoo1.displayZoo();
 //toString methode//
  System.out.println(lion);
  System.out.println(myzoo);



 }
}