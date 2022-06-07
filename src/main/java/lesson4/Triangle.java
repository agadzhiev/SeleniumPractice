package lesson4;

public class Triangle {
    public static double triangleArea (int a, int b, int c){
        if(a <= 0 || b <= 0 || c <=0){
            System.out.println("Значение должно быть положительным числом!");

        }

        if (a+b<c || a+c<b || b+c<a){
            System.out.println("Треугольника не сущесвтует!");
        }

        double p = 0.5 * (a + b + c);
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));

    }


}
