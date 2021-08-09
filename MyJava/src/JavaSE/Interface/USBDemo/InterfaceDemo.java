package JavaSE.Interface.USBDemo;

/**
 * @author coulson
 * @version 16.0.1 2021-07-20 16:32
 */



// JianPan -> YouPan -> JavaSE.Interface.USBDemo.USB

interface USB {
    //public static final


    //public and abstract
    void read();
    void write();
}

// JavaSE.Interface.USBDemo.USBdisk
class USBdisk implements USB {
    @Override
    public void read() {
        System.out.println("U盘正在通过USB功能读取数据");
    }
    @Override
    public void write() {
        System.out.println("U盘正在通过USB功能写入数据");
    }
}


class Keyboard implements USB {
    @Override
    public void read() {
        System.out.println("键盘正在通过USB功能读取数据");
    }
    @Override
    public void write() {
        System.out.println("键盘正在通过USB功能写入数据");
    }
}


public class InterfaceDemo {
    public static void main(String[] args) {
        //生成一个实现可USB接口（标准）的U盘对象
        USBdisk youPan = new USBdisk();
        //调用U盘的read( )方法读取数据
        youPan.read();
        //调用U盘的write( )方法写入数据
        youPan.write();

        //生成一个实现可USB接口（标准）的键盘对象
        Keyboard keyboard = new Keyboard();
        //调用键盘的read( )方法读取数据
        keyboard.read();
        //调用键盘的write( )方法写入数据
        keyboard.write();
    }
}


