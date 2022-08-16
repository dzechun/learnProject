package learning4;

public class Boy{
    private String name;
    private int age;

    public Boy(){}

    public Boy(String name){
        this();
        this.name = name;
    }

    public Boy(String name, int age){
        this(name);
        this.age = age;
    }

    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }

    public void setAge(int age){
        this.age = age;
    }

    public int getAge(){
        return age;
    }

    public void marry(Girl girl){
        System.out.println("I wanna marry"+ girl.getName());
    }

    public void shout(){
        if(this.age >= 22){
            System.out.println("you can marry now");
        }else{
            System.out.println("You can make love first");
        }
    }
}
