/*
İlk 10 doğal sayının karelerinin toplamı,
1^2 + 2^2 + ... + 10^2 = 385
İlk 10 doğal sayının toplamlarının karesi,
(1 + 2 + ... + 10)^2 = 55^2 = 3025
İlk 10 doğal sayı için toplamların karesi ile karelerin toplamı arasındaki fark; 3025 – 385 = 2640’tır.
İlk 100 doğal sayının toplamlarının karesi ile karelerinin toplamı arasındaki farkı bulunuz.
 */

package Problem_6;

public class Problem_6 {

    public static void main(String[] args) {
        
        int i , karetoplam = 0 , toplamkare = 0;
        int sonuc = 0;
        
        for (i = 1 ; i <= 100 ; i++)
        {
            karetoplam += i * i;
            toplamkare += i;
        }
        
        toplamkare = toplamkare * toplamkare;
        sonuc = toplamkare - karetoplam;
        System.out.println("Answer :" +sonuc);

    }
    
}
