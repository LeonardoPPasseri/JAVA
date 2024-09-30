package Desafios.LeetCode.PalindromeNumber_Easy;

class Solution {
    /*
    Numeros palindromos são aqueles que invertidos dão o msm numero
    ex: 121  -> 121  true
    ex: -121 -> 121- false
    ex: 122  -> 221  false
    */
    public static void main(String[] args) {
        int x = 121;
        int w = -323;
        System.out.println("121 -> "+isPalindrome(x));
        System.out.println("-323 -> "+isPalindrome(w));
    }
    public static boolean isPalindrome(int x) {
        int numero = x;
        if(x < 0){
            return false;
        }else{
            int aux = 0;
            System.out.println(x);
            while(x != 0){
                aux = aux *10;
                aux = x % 10 + aux;
                x = x/10;
                //aux = 2 + 0
//                x = x/10;
                //x = 12
                //=======
//                aux = aux *10;
                //aux = 20
//                aux = (x%10) + aux; 
                //aux = 2 + 20
//                x = x/10;
                //x = 1
                //=======
//                aux = (x%10) + aux;
                //aux = 1 + 220
//                x = x/10;
                //x = 0
                //aux = 221
                System.out.println(aux);
                System.out.println(x);
                System.out.println("=====");

            }
            if(aux == numero){
                return true;
            }else{
                return false;
            }
        }
    }
}