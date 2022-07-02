public class Main {

    public static void main(String[] args) {
        int result = sum(10,10);
        int resultDivision  = division(20,2);
        System.out.println(resultDivision);
        System.out.println(result);
    }

    static int sum(int a, int b){
        return a+b;
    }

    static int division(int a, int b){
        return a/b;
    }



}
