public class patterns {
    public static void main(String[] args) {
        
        pattern.p5(6);

    }
    
}

class pattern {
    static void p1(int n) {
        for (int row = 1; row <= n; row++){
            for (int col =1; col<=n; col++){
                System.out.print("* ");
            }
            System.out.println();
        }

    }

    static void p3(int n){
        for (int i = 1; i<=n ; i++) {
            for (int j = 1; j <=n-i+1 ; j++){
                System.out.print("* ");

            }
        System.out.println();
  
        }
    }
    

    static void p2 (int n){
            for (int i = 1; i<=n ; i++) {
                for (int j = 1; j <=i; j++){
                    System.out.print("* ");

                }
            System.out.println();
    
            }
        }
        
    static void p4 (int n){
        for (int i = 1; i<=n ; i++) {
                for (int j = 1; j <=i; j++){
                    System.out.print(j + " " );

                }
            System.out.println();
    
            }
    }
    static void p5 (int n){
            for (int i = 1; i<=((2*n)-1) ; i++) {
                int c;
                if (i > n) { 
                    c = 2 *n - i ;
                }
                else {
                    c = i;
                }
                for (int j = 1; j <=c; j++){
                    System.out.print("* ");

                }
            System.out.println();
    
            }
        }
}