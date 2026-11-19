
package src.tn.esprit.gestionZoo.main;

import src.tn.esprit.gestionZoo.entities.*;

class ZooMangment {
    public static void main(String[] args) {

        Zoo zoo = new Zoo("My Zoo", "Tunis");

        Animal a1 = new Animal("Lion", "hg", -15, true);
        Animal a2 = new Animal("fsd", "zer", 5, true);
        Animal a3 = new Animal("gezr", "df", 5, true);
        Animal a4 = new Animal("bc", "gfd", 5, true);

        try {
            zoo.addAnimal(a1);
        } catch (InvalidAgeException e) {
            System.out.println(e.getMessage());
        } catch (ZooFullException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("nbre total: " + zoo.getNbrAnimal());
        }

        try {
            zoo.addAnimal(a2);
        } catch (InvalidAgeException e) {
            System.out.println(e.getMessage());
        } catch (ZooFullException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("nbre total: " + zoo.getNbrAnimal());
        }

        try {
            zoo.addAnimal(a3);
        } catch (InvalidAgeException e) {
            System.out.println(e.getMessage());
        } catch (ZooFullException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("nbre total: " + zoo.getNbrAnimal());
        }

        try {
            zoo.addAnimal(a4);
        } catch (InvalidAgeException e) {
            System.out.println(e.getMessage());
        } catch (ZooFullException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("nbre total: " + zoo.getNbrAnimal());
        }
    }
}
