package ConstructorEx;

public class ConstructorExample {
    private int id;
    private String name;

    public ConstructorExample(){

    }
    public  ConstructorExample(int id, String name){
        this.id = id;
        this.name = name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }


}
