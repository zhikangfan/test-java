import java.io.*;
import java.util.Arrays;
public class T {
    public static void main(String[] args) {

        int n = 5;
        double d = 1.2 + 24.0;
        System.out.println(d);

        int[] numsArr = {1,2,3};
        for (int i = 0; i < numsArr.length; i++) {
            System.out.println(numsArr[i]);
        }

        for (int item:numsArr) {

            System.out.println(item);
        }

        System.out.println(Arrays.toString(numsArr));

        int lifeMoney = 311 + 1500;
        double huabeiMoney = 860.29;

        Person p = new Person();

        p.setName("Ming");
        System.out.println(p.getName());
        System.out.println(lifeMoney + huabeiMoney);
    }
}

