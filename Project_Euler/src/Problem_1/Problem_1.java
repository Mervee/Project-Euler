/*
3'ün veya 5'in katı olan 10'dan küçük tüm doğal sayıları listelersek, 3, 5, 6, ve 9'u elde ederiz.
Bu katların toplamı 23'tür.
3'ün veya 5'in 1000'den küçük tüm katlarının toplamını bulunuz.
*/

package Problem_1;


public class Problem_1 {


    public static void main(String[] args) {
        
        int a , toplam = 0;
        
        for (a = 0 ; a < 1000 ; a++)
            
            if (a % 3 == 0 || a % 5 == 0)
                
                toplam += a;
        
        System.out.println("Answer : " +toplam);

    }
    
}
