import java.util.*;

// Enter 3 numbers from the user & make a function to print their average.

//public class Problems {
//    public static void main(String args[]) {
//        Scanner sc = new Scanner(System.in);
//        int a = sc.nextInt();
//        int b = sc.nextInt();
//        int c = sc.nextInt();
//
//
//        int average = (a + b + c) / 3;
//        System.out.println(average);
//    }
//}

// Write a function to print the sum of all odd numbers from 1 to n.

//public class Problems {
//    public static void printSum(int n) {
//        int sum = 0;
//
//
//        for(int i=1; i<=n; i++) {
//            if(i % 2 != 0) {
//                sum = sum + i;
//            }
//        }
//
//
//        System.out.println(sum);
//    }
//    public static void main(String args[]) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        printSum(n);
//    }
//}


// Write a function which takes in 2 numbers and returns the greater of those two.

//public class Problems {
//    public static int getGreater(int a, int b) {
//        if(a > b) {
//            return a;
//        } else {
//            return b;
//        }
//    }
//    public static void main(String args[]) {
//        Scanner sc = new Scanner(System.in);
//        int a = sc.nextInt();
//        int b = sc.nextInt();
//        System.out.println(getGreater(a, b));
//    }
//}

// Write a function that takes in the radius as input and returns the circumference of a circle.

//public class Problems {
//    public static Double getCircumference(Double radius) {
//        return 2 * 3.14 * radius;
//    }
//    public static void main(String args[]) {
//        Scanner sc = new Scanner(System.in);
//        Double r = sc.nextDouble();
//        System.out.println(getCircumference(radius));
//    }
//}


// Write a function that takes in age as input and returns if that person is eligible to vote or not. A person of age > 18 is eligible to vote.

//public class Problems {
//    public static boolean isElligible(int age) {
//        if(age > 18) {
//            return true;
//        }
//        return false;
//    }
//    public static void main(String args[]) {
//        Scanner sc = new Scanner(System.in);
//        int age = sc.nextInt();
//        System.out.println(isElligible(age));
//    }
//}


//Write a program to enter the numbers till the user wants and at the end it should display the count of positive, negative and zeros entered.

//public class Problems {
//    public static void main(String args[]) {
//        int positive = 0, negative = 0, zeros = 0;
//        System.out.println("Press 1 to continue & 0 to stop");
//        Scanner sc = new Scanner(System.in);
//        int input = sc.nextInt();
//
//
//        while(input == 1) {
//            System.out.println("Enter your number : ");
//            int number = sc.nextInt();
//            if(number > 0) {
//                positive++;
//            } else if(number < 0) {
//                negative++;
//            } else {
//                zeros++;
//            }
//
//
//            System.out.println("Press 1 to continue & 0 to stop");
//            input = sc.nextInt();
//        }
//
//
//        System.out.println("Positives : "+ positive);
//        System.out.println("Negatives : "+ negative);
//        System.out.println("Zeros : "+ zeros);
//    }
//}

//Two numbers are entered by the user, x and n. Write a function to find the value of one number raised to the power of another i.e. xn.

//public class Problems {
//    public static void main(String args[]) {
//        System.out.println("Enter x");
//        Scanner sc = new Scanner(System.in);
//        int x = sc.nextInt();
//        System.out.println("Enter n");
//        int n = sc.nextInt();
//
//
//        int result = 1;
//        //Please see that n is not too large or else result will exceed the size of int
//        for(int i=0; i<n; i++) {
//            result = result * x;
//        }
//
//
//        System.out.println("x to the power n is : "+ result);
//    }
//}


//Write a function that calculates the Greatest Common Divisor of 2 numbers. (BONUS)

//public class Problems {
//    public static void main(String args[]) {
//        Scanner sc = new Scanner(System.in);
//        int n1 = sc.nextInt();
//        int n2 = sc.nextInt();
//
//
//        while(n1 != n2) {
//            if(n1>n2) {
//                n1 = n1 - n2;
//            } else {
//                n2 = n2 - n1;
//            }
//        }
//        System.out.println("GCD is : "+ n2);
//    }
//}

//Write a program to print Fibonacci series of n terms where n is input by user :
//        0 1 1 2 3 5 8 13 21 .....

public class Problems {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int a = 0, b = 1;

        System.out.print(a+" ");

        if(n > 1) {
            //find nth term
            for(int i=2; i<=n; i++) {
                System.out.print(b+" ");
                //the concept below is called swapping
                int temp = b;
                b = a + b;
                a = temp;
            }


            System.out.println();
        }
    }
}


