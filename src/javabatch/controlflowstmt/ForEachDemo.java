package javabatch.controlflowstmt;

public class ForEachDemo {
    public static void main(String[] args) {
        int a[] = {1,2,3};
        String str[] = {"Hello","World","!!!"};
        for (int i:a){
            System.out.println(i);
        }

        for (String s:str){
            System.out.print(s);
        }
    }
}
