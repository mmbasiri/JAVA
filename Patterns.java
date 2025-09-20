import java.util.*;

//  ****
//  ****
//  ****
//  ****

//public class Patterns {
//    public static void main(String args[]) {
//        int n = 5;
//        int m = 4;
//        for(int i=0; i<n; i++) {
//            for(int j=0; j<m; j++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//    }
//}

// ****
// *  *
// *  *
// ****

//public class Patterns {
//    public static void main(String args[]) {
//        int n = 5;
//        int m = 4;
//        for(int i=0; i<n; i++) {
//            for(int j=0; j<m; j++) {
//                if(i == 0 || i == n-1 || j == 0 || j == m-1) {
//                    System.out.print("*");
//                } else {
//                    System.out.print(" ");
//                }
//            }
//            System.out.println();
//        }
//    }
//}

// *
// **
// ***
// ****

//public class Patterns {
//    public static void main(String args[]) {
//        int n = 4;
//
//        for(int i=1; i<=n; i++) {
//            for(int j=1; j<=i; j++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//    }
//}

// ****
// ***
// **
// *

//public class Patterns {
//    public static void main(String args[]) {
//        int n = 4;
//
//        for(int i=n; i>=1; i--) {
//            for(int j=1; j<=i; j++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//    }
//}

//    *
//   **
//  ***
// ****

//public class Patterns {
//    public static void main(String args[]) {
//        int n = 4;
//
//        for(int i=n; i>=1; i--) {
//            for(int j=1; j<i; j++) {
//                System.out.print(" ");
//            }
//
//
//            for(int j=0; j<=n-i; j++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//    }
//}

//        1
//        2 3
//        4 5 6
//        7 8 9 10
//        11 12 13 14 15

//public class Patterns {
//    public static void main(String args[]) {
//        int n = 5;
//        int number = 1;
//
//
//        for(int i=1; i<=n; i++) {
//            for(int j=1; j<=i; j++) {
//                System.out.print(number+" ");
//                number++;
//            }
//            System.out.println();
//        }
//    }
//}

//       1
//        0 1
//        1 0 1
//        0 1 0 1
//        1 0 1 0 1

//public class Patterns {
//    public static void main(String args[]) {
//        int n = 5;
//
//
//        for(int i=1; i<=n; i++) {
//            for(int j=1; j<=i; j++) {
//                if((i+j) % 2 == 0) {
//                    System.out.print(1+" ");
//                } else {
//                    System.out.print(0+" ");
//                }
//            }
//            System.out.println();
//        }
//    }
//}

//        *      *
//        **    **
//        ***  ***
//        ********
//        ********
//        ***  ***
//        **    **
//        *      *

//public class Patterns {
//    public static void main(String args[]) {
//        int n = 4;
//
//
//        //upper part
//        for(int i=1; i<=n; i++) {
//            for(int j=1; j<=i; j++) {
//                System.out.print("*");
//            }
//
//
//            int spaces = 2 * (n-i);
//            for(int j=1; j<=spaces; j++) {
//                System.out.print(" ");
//            }
//
//
//            for(int j=1; j<=i; j++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//
//
//        //lower part
//        for(int i=n; i>=1; i--) {
//            for(int j=1; j<=i; j++) {
//                System.out.print("*");
//            }
//
//
//            int spaces = 2 * (n-i);
//            for(int j=1; j<=spaces; j++) {
//                System.out.print(" ");
//            }
//
//
//            for(int j=1; j<=i; j++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//    }
//}

//            *****
//            *****
//            *****
//            *****
//            *****

//public class Patterns {
//    public static void main(String args[]) {
//        int n = 5;
//
//
//        for(int i=1; i<=n; i++) {
//            //spaces
//            for(int j=1; j<=n-i; j++) {
//                System.out.print(" ");
//            }
//
//
//            //stars
//            for(int j=1; j<=n; j++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//    }
//}

//            1
//            2 2
//            3 3 3
//            4 4 4 4
//            5 5 5 5 5

//public class Patterns {
//    public static void main(String args[]) {
//        int n = 5;
//
//
//        for(int i=1; i<=n; i++) {
//            //spaces
//            for(int j=1; j<=n-i; j++) {
//                System.out.print(" ");
//            }
//
//
//            //numbers
//            for(int j=1; j<=i; j++) {
//                System.out.print(i+" ");
//            }
//            System.out.println();
//        }
//    }
//}

//                1
//               212
//              32123
//             4321234
//            543212345

//public class Patterns {
//    public static void main(String args[]) {
//        int n = 5;
//        for(int i=1; i<=n; i++) {
//            //spaces
//            for(int j=1; j<=n-i; j++) {
//                System.out.print(" ");
//            }
//
//
//            //first part
//            for(int j=i; j>=1; j--) {
//                System.out.print(j);
//            }
//
//
//            //second part
//            for(int j=2; j<=i; j++) {
//                System.out.print(j);
//            }
//            System.out.println();
//        }
//    }
//}

//                *
//               ***
//              *****
//             *******
//            *********
//            *********
//             *******
//              *****
//               ***
//                *

public class Patterns {
    public static void main(String args[]) {
        int n = 5;


        //upper part
        for(int i=1; i<=n; i++) {
            //spaces
            for(int j=1; j<=n-i; j++) {
                System.out.print(" ");
            }
            for(int j=1; j<=2*i-1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }


        //lower part
        for(int i=n; i>=1; i--) {
            //spaces
            for(int j=1; j<=n-i; j++) {
                System.out.print(" ");
            }
            for(int j=1; j<=2*i-1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}


