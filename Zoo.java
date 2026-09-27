public class Zoo {

    String name;
    String city ;
    int nbrCages;

    public Zoo(String name, String city, int nbrCages) {
        this.name = name;
        this.city = city;
        this.nbrCages = nbrCages;
    }
    public void  displayZoo()
    {
        String nbrCage;
        System.out.println(name+" "+city +" "+nbrCages );
    }

    @Override
    public String toString() {
        return  name+" "+city+" "+nbrCages ;
    }
}
