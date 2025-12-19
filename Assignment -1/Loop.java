public class LOOP {
    public static void main(String[] args) {

        System.out.println("// -------- For LOOP --------//");
        for (int a = 1; a <= 5; a++) {
            System.out.println(a);
        }

        System.out.println("// -------- While LOOP --------//");
        int i = 5;
        while (i > 0) {
            System.out.println(i);
            i--;
        }

        System.out.println("// -------- Do-While LOOP --------//");
        int b = 1;
        do {
            System.out.println(b);
            b++;
        } while (b <= 5);

        System.out.println("//-------- Infinite LOOP (commented to avoid crash) --------//");
        System.out.println("/* while (true) {");
        System.out.println("   System.out.println(\"This is an infinite loop\");");
        System.out.println("} */");

        System.out.println("// -------- Break Statement --------//");
        for (int c = 1; c <= 10; c++) {
            if (c == 5)
                break;
            System.out.println(c);
        }

        System.out.println("//-------- Continue Statement --------//");
        for (int d = 1; d <= 5; d++) {
            if (d == 3)
                continue;
            System.out.println(d);
        }

        System.out.println("//-------- Even Numbers --------//");
        for (int e = 1; e <= 50; e++) {
            if (e % 2 == 0) {
                System.out.println(e);
            }
        }
    }
}
