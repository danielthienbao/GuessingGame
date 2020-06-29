public class Driver{
    public static void main(String[] args){
        Human myObj = new Human(5,100,"Daniel");
        System.out.println(myObj.getheight() + " ft");
        System.out.println(myObj.getweight() + " lbs.");
        System.out.println(myObj.getname());
    }
}