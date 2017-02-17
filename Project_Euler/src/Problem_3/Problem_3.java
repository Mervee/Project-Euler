/*
13195'in asal çarpanları 5, 7, 13 ve 29'dur.
600851475143 sayısının en büyük asal çarpanı kaçtır?
 */

package Problem_3;

public class Problem_3 {


    public static void main(String[] args) {
        
        long sayi = 600851475143L;
        int i , j ,enBuyuk = 0 , tekrar = 0;
        
        for (i = 1 ; i <= sayi ; i++)
        {
            for (j = 2 ; j <= i ; j++)
            {
                if (i % j == 0)
                    tekrar++;
            }
            if (tekrar == 1 && sayi % i == 0)
            {
                sayi = sayi / i;
                enBuyuk = i;
                i = 0;
            }
                
            tekrar = 0;
        }
        
        System.out.println("Answer : " +enBuyuk);
        

            }
    
}
