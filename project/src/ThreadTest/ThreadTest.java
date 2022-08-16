package ThreadTest;
/*
*多线程的创建，方式一：继承于Thread类的
* 1.创建一个继承于Thread类的子类
* 2.重写Thread类的run方法-->将此线程执行的操作声明在run()中
* 3.创建Thread类的子类的对象
* 4.通过此对象调用start()方法
* 例子：遍历100以内的所有的偶数
*
*
 */
//创建一个继承于Thread类的子类
class MyThread extends Thread{
    //重写Thread类的run()
    @Override
    public void run() {
        for(int i = 1;i < 100;i++){
            if(i % 2 == 0){
                System.out.println(Thread.currentThread().getName() + ":" + i);
            }
        }

    }
}

public class ThreadTest {
    public static void main(String[] args) {
        //创建Thread类的子类的对象
        MyThread myThread = new MyThread();
        //调用对象的start()：1.启动当前线程2.调用当前线程的run()方法
        myThread.start();
        //问题一：我们不能通过直接调用run()的方式启动线程
//        myThread.run();
//        问题二：再启动一个线程，遍历100以内的偶数,不能让已经start（）的线程去执行，会报IllegalThreadStateException
//        myThread.start();
        MyThread myThread1 = new MyThread();
        myThread1.start();

        //如下操作仍然是在main线程中执行的
        for(int i = 1;i < 100;i++){
            if(i % 2 != 0){
                System.out.println(i + "*****main()*****");
            }
        }
    }
}
