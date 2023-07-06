package az.atlacademy.lesson03;

public class test {
    public static void main(String[] args) {
        StringBuilder a= new StringBuilder("Salam");
        long start=System.currentTimeMillis();
        a.append("a".repeat(1000000000));
       // System.out.println(a);
        long end=System.currentTimeMillis();
        int time=(int)((end-start)/1000);
        System.out.println(time);
    }
}
