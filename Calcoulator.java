public class Calcoulator{
    public int add(int a, int b){
        return a + b;
    }
    public int subtract(int a, int b){
        return a - b;
    }
    public static void main(String[]args){
        Calcoulator cls = new Calcoulator();
        System.out.println("5 + 3 = "+ cls.add(5,3));
        System.out.println("10 - 4 = " +cls.subtract(10,4));
    }
}