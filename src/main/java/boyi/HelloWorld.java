package boyi;

public class HelloWorld {
    public static void main(String[] args) {

        printNum(3);
        printNum(0);
        printStr("hello");
        printStr("world");

    }


    public static int printNum(int i){
        if(i==3){
            return 3;
        }
        return 0;

    }
    public static String printStr(String str){
        if (str.equals("hello")){
            return "hello";
        }else{
            return "world";
        }
    }
}
