/*
Fibonacci serisinde her sayı, kendisinden önce gelen iki sayının toplamıdır.
1 ve 2 ile başlayan serinin ilk 10 sayısı:
1, 2, 3, 5, 8, 13, 21, 34, 55, 89, ...
Bu serinin dört milyondan küçük tüm çift sayılarının toplamını bulunuz.
 */

package Problem_2;

public class Problem_2 {

    public static void main(String[] args) {
        
        int i = 2 , ilkSayi = 1 , ikinciSayi = 2 , toplam = 0;
        
        while(i < 4000000)
        {
            if (i % 2 == 0)
                
                toplam += i;
            
            i = ilkSayi + ikinciSayi;
            
            ilkSayi = ikinciSayi;
            
            ikinciSayi = i;
        }
        
        System.out.println("Answer : " +toplam);
        
        

    }
    
}
