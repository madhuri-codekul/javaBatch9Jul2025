package javabatch.controlflowstmt;

public class ContinueDemo {
    public static void main(String[] args) {
        for (int i=0;i<5;i++){
            if (i==3){
                continue;
            }
            System.out.println("i is "+i);
        }
    }
}
