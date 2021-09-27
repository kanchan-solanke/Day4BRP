public class HarmonicNumber {
    public static void main(String[] args) {
        double n = 10, i;
        double sum = 0;
        for (i = 1; i <= n; i++) {
            sum = sum + (1 / i);
            System.out.println(sum);
        }
        System.out.println("Harmonic value = " + sum);
    }
}
/*
Harmonic Value :
h = 1+1/2+1/3+1/4--+1/n
sum = 1+1/2+1/3-- 1/10
h1= 1
h2= 1+1/2 =1.5
h3=1.5+1/3=1.83
h4=1.83+1/4 =2.08

 */
