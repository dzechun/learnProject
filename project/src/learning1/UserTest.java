package learning1;
/*
*类中属性的使用
*
* 属性（成员变量） VS 局部变量
* 1.相同点：
*   定义变量的格式：数据类型 变量名=变量值
*   先声明，后使用
*   变量都有其对应的作用域
* 2.不同点：
*   在类中声明的位置的不同
*   属性：直接定义在类的一对{}内
*   局部变量：生命在方法内、方法形参、代码块内、构造器形参、构造器内部的变量
*
*   关于权限修饰符的不同
*   属性：可以在生命属性时，指明其权限，使用权限修饰符
*   常用的权限修饰符：private public 缺省 protected--->封装性
*   局部变量：不可使用修饰符
*
*   默认初始化值的情况：
*   属性：类的属性，根据其类型，都有每人初始化值
*       整形（byte short int long）: 0
*       浮点型（float double）0.0
*       字符型（char）\u0000
*       布尔型（boolean）:false
*       引用数据类型（类、数组、接口）:null
*
*   局部变量，没有初始化值
*       意味着，我们在调用局部变量之前，一定要显式赋值
*       特别的，形参在调用时，我们赋值即可
*
*   在内存中加载的位置：
*   属性：加载到推空间中（非static）
*   局部变量：加载到栈空间
*
 */
public class UserTest {
    public static void main(String[] args) {
        User u1 = new User();
        System.out.println(u1.name);
        System.out.println(u1.age);
        System.out.println(u1.isMale);
    }

}

class User{
    //属性（或成员变量）
    String name;
    public int age;
    boolean isMale;

    public void talk(String language){
        System.out.println("use" + language);
    }

    public void eat(){
        String food = "rice";
        System.out.println("chinese"+food);
    }
}