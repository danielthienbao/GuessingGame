public class Human {
    int height;
    int weight;
    String name;
    public Human(){
        int height = 0;
        int weight = 0;
        String name = null;
    }
    public Human(int height, int weight, String name){
        this.height = height;
        this.weight = weight;
        this.name = name;
    }

    public int getheight(){
        return height;
    }

    public void setheight(int height){
        this.height = height;
    }
    public int getweight(){
        return weight;
    }

    public void setweight(int weight){
        this.weight = weight;
    }
    public String getname(){
        return name;
    }

    public void setname(String name){
        this.name = name;
    }
}
