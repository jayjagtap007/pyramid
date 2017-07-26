import java.util.Scanner;

class pyramid{
        void printPyramid(String str){
            int l = str.length();
            for(int i=0 ; i< l ; i++){
                for(int k = 1 ; k < str.length() - i ; k++){
                    System.out.print(" ");
                }
                for(int j = 0 ; j <= i ; j++){
                    System.out.printf("%c ",str.charAt(j));
                }
                System.out.print("\n");
            }
        }
    }


class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter string:");
        String str = sc.nextLine();
        pyramid p = new pyramid();
        p.printPyramid(str);
    }
}