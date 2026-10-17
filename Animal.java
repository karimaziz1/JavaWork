public class Animal {

    private  String  family;
     private String name;
     private   int age ;
   private   boolean isMammal;


    public Animal(String family, String name, int age, boolean isMammal) {
        this.family = family;
        this.name = name;
        setAge(age);
        this.isMammal = isMammal;
    }

     public void  setAge(int age){
        if (age>=0)
        {
            this.age=age;
        }else
        {
            System.out.println("age invalide ");
        }
     }

     public int getAge(){
        return  age ;
     }
    public String getName() {
        return name;
    }
    @Override
    public String toString() {
        return  family+" "+name+" "+age+" "+isMammal ;
    }
}
