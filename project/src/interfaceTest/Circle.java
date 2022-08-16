package interfaceTest;
/*
*定义一个Circle类，声明radius属性，提供getter和setter方法
*
*
 */
public class Circle {

    private Double radius;

    public Circle(){}

    public Circle(Double radius){
        super();
        this.radius = radius;
    }

    public void setRadius(Double radius){
        this.radius = radius;
    }

    public Double getRadius(){
        return radius;
    }
}