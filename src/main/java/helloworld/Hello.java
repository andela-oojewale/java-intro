package helloworld;


public class Hello {
    public static void main(String[] args) {
        System.out.println("args = " + args);
        for (String str : args) {
            System.out.println("str = " + str);
        }
    }
}
