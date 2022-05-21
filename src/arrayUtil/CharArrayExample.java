package arrayUtil;

public class CharArrayExample {
    public static void main(String[] args) {

        char[] chars = {'j', 'a', 'v', 'a', 'l', 'o', 'v', 'e'};
        char c = 'o';
        int k = 0;
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == c)
                k++;
        }

        System.out.println(k);

        char[] chars2 = {'j', 'a', 'v', 'a', 'l', 'o', 'v', 'e'};

        int a=chars2.length/2;
        int l=a-1;
        System.out.println(chars2[l] +" "+chars2[a]);

        boolean b;
        char[] chars3 = {'j', 'a', 'v', 'a', 'l', 'o', 'l', 'y'};

        if (chars3[chars3.length - 2] == 'l' && chars3[chars3.length - 1] == 'y') {
            b = true;
        } else {
            b = false;
        }

        System.out.println(b);

        boolean s = false;
        char[] bobArray = {'b', 'a', 'b', 'o', 'b', 'a'};
        char c1 = 'b';

        for (int i = 0; i < bobArray.length-2; i++) {

            if (bobArray[i] == c1 && bobArray[i + 2] == c1) {
                s = true;

            }
        }
        System.out.println(s);

        char[] text = {' ',' ','b','a','r','e','v',' ',' '};
        for (int i = 0; i < text.length; i++) {
            if (text[i]!=' ')
                System.out.print(text[i]);
        }

    }
}

