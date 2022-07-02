public class Main {

    public static void main(String[] args) {
        int result = sum(10,10);
        int resultDivision  = division(20,2);
        System.out.println(resultDivision);
        System.out.println(result);
        print();
    }

    static int sum(int a, int b){
        return a+b;
    }

    static int division(int a, int b){
        return a/b;
    }

    static void print(){
        System.out.println("Some functions here");
    }



}
