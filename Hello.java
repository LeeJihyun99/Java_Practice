public class Hello{

    // static String name = "Jihyun";
    // static int age = 26;
    // static double grade = 1.69;
    // static boolean pass = true;
        public static void main(String[] args) {

            String name = "Jihyun";
            float score = 56.7f;
            int int_score =(int)score;
            int x = 8;
            int y = 4;
            int z = (x>y)? x: y;
            String changed_name = name.replace("Ji", "Soo");

            String s1 = new String("Java");
            String s2 =  new String("Java");

            System.out.println("Hello World");
            System.out.println(score);
            System.out.println(int_score);
            System.out.println(z);
            System.out.println(name);
            System.out.println(changed_name);
            System.out.println(s1 == s2);
    }
}
