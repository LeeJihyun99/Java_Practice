public class Hello{

    // static String name = "Jihyun";
    // static int age = 26;
    // static double grade = 1.69;
    // static boolean pass = true;

    public static int getNumber(int a){
        return a + 10;
    }

    public static int getNumber(int a, int b){
        return a + b;
    }

    public static float getNumber(double a, double b){
        return (float) (a * b);
    }
        public static void main(String[] args) {

            int first = getNumber(5);
            System.out.println(first);

            int second = getNumber(2, 5);
            System.out.println(second);

            float third = getNumber(2.5, 5.5);
            System.out.println(third);

            // String name = "Jihyun";
            // float score = 56.7f;
            // int int_score =(int)score;
            // int x = 8;
            // int y = 4;
            // int z = (x>y)? x: y;
            // String changed_name = name.replace("Ji", "Soo");

            // String s1 = new String("Java");
            // String s2 =  new String("Java");

            // String s3 = "Java";
            // String s4 = "Java";


            // System.out.println("Hello World");
            // System.out.println(score);
            // System.out.println(int_score);
            // System.out.println(z);

            // System.out.println(name);
            // System.out.println(changed_name);

            // System.out.println(s1 == s2); //false
            // System.out.println(s1.equals(s2)); //true

            // System.out.println(s3 == s4); //true
            // System.out.println(s3.equals(s4)); //true
    // array
        // int[] numbers = new int[5];
        // numbers[0] = 1;
        // System.out.println(numbers[2]);

        // String words[] = new String[]{"a", "b"};
        // System.out.println(words.length);

        // String alphabets[] = new String[3];
        // alphabets[0] = "a";
        // alphabets[1] = "b";
        // System.out.println(alphabets[2]);
    
        // int[] numbers2 = {1,3,2,5,6};
        // System.out.println(numbers2[3]);
    
        // for(int i = 0 ; i < numbers2.length; i++){
        //     System.out.println(numbers2[i]);
        // }
        
        // for(int number:numbers2){
        //     System.out.println(number);
        // }

        // int[][] numbers = new int[2][5];
        // numbers[0] = new int[] {1,2,3,4,5};
        // numbers[1] = new int[] {6,7,8,9,10};


        // for(int i=0 ; i<numbers.length; i++){
        //     for(int j=0; j<numbers[i].length; j++){
        //         System.out.println(numbers[i][j]);
        //     }
        // }
            int result = getNumber(10);
            System.out.println(result);

        }

}

