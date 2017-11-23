/**
jdk版本查uu看----------------------
*/

public class Test {
    public static void main(String[] args) {
	 System.out.println("dos命令切换到cijava文件所在的目录");
 	 System.out.println("javac 文件名.java");
 	 System.out.println("java 文件名");
         String arch = System.getProperty("sun.arch.data.model");   
         System.out.println(arch+"-bit");
    }
}