// print the pattern in the rectangle

// class Pattern{
//     public static void main(String[] args) {
//         int n = 4;
//         int m =5;
//         for(int i=1;i<=n;i++){
//             for(int j=1;j<=m;j++){
//                 System.out.print("*");
//             }
//             System.out.println(" ");
//         }
//     }
// }
// print a pattern in * holo pattern
// class Pattern {
//     public static void main(String[] args) {
//         int n = 4;
//         int m = 5;
//         // outer loop
//         for (int i = 1; i <= n; i++) {
//             // inner loop
//             for (int j = 1; j <= m; j++) {
//                 // cell -> (i,j)
//                 if (i == 1 || j == 1 || i == n || j == m) {
//                     System.out.print("*");
//                 }else{
//                     System.out.print(" ");
//                 }
//             }
//             System.out.println();
//         }
//     }
// }
// print a pattern in right angle triangle
// class Pattern {
//     public static void main(String[] args) {
//         int n = 4;
//         // outer loop
//         for (int i = 1; i <= n; i++) {
//             // inner loop  //inner loop is decide the row
//             for (int j = 1; j <= i; j++) {  
//                 System.out.print("*");
//             }
//             System.out.println(" ");
//         }
//     }
// }
// class Pattern {
//     public static void main(String[] args) {
//         int n = 4;
//         // outer loop
//         for (int i = 1; i <= n; i++) {
//             // inner loop  //inner loop is decide the row
//             for (int j = i; j <= n; j++) {  
//                 System.out.print("*");
//             }
//             System.out.println(" ");
//         }
//     }
// }
// class Pattern {
//     public static void main(String[] args) {
//         int n = 4;
//         // outer loop
//         for (int i = 1; i <= n; i++) {
//             // inner loop  //inner loop is decide the row
//             for (int j = 1; j <= n - i; j++) {
//                 System.out.print(" ");
//             }
//             for (int k = 1; k <= i; k++) {
//                 System.out.print("*");
//             }
//             System.out.println(" ");
//         }
//     }
// }





// butterfly pattern 
class Pattern {

    public static void main(String[] args) {
        int n = 6;
        // upper half
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            // spaces
            int spaces = 2 * (n - i);
            for (int k = 1; k <= spaces; k++) {
                System.out.print(" ");
            }

            //second part
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }

        //lower half
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            // spaces
            int spaces = 2 * (n - i);
            for (int k = 1; k <= spaces; k++) {
                System.out.print(" ");
            }

            //second part
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
}
