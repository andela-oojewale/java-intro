package helloworld;

public class EnhancedForLoop {

    public void nums(){
        int [] figures = {1,2,3,4,5,6,7};
        for(int i: figures) {
            System.out.print(i);
            System.out.print("\t");
        }
    }

    public void alphabets(){
        String [] letters = {"a","b","c","d","e"};
        for(String i: letters) {
            System.out.print(i);
            System.out.print("\t");
        }
    }

    public static void main(String [] args) {
        EnhancedForLoop seeLoop = new EnhancedForLoop();
        seeLoop.nums();
        System.out.print("\n");
        seeLoop.alphabets();
    }

}
