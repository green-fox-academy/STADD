import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

public class VariableMutation {
    public static void main(String[] args){

        int a = 3;
        a += 10;

        System.out.println(a);

        int b  = 100;
        b -= 7;

        System.out.println(b);

        int c = 44;
        c *= 2;

        System.out.println(c);

        int d = 125;
        d /= 5;

        System.out.println(d);

        int e = 8;
        e *= e;

        System.out.println(e);

        int f1 = 123;
        int f2 = 345;

        System.out.println(f1 > f2);

        int g1 = 350;
        int g2 = 200;

        System.out.println(g2 * 2 > g1);

        int h = 135798745;
        System.out.println(h % 11 == 0);

        int i1 = 10;
        int i2 = 3;
        double cube = Math.pow(i2, 4);
        double square = Math.pow(i2, 2);

        System.out.println(cube < i1 && i1 > square );

        int j = 1521;

        System.out.println(j % 2 == 0 || j % 3 == 0);

        String k = "Apple";

        System.out.println(k);

    }
}
