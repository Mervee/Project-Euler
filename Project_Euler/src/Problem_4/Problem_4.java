/*
İki yönden de aynı şekilde okunan sayılara palindromik sayılar denir.
2 haneli 2 sayıdan oluşturulabilecek en büyük palindrom değeri 9009'dur. (91 x 99)
3 haneli iki sayıdan oluşturulabilecek en büyük palindromik sayıyı bulunuz.
 */

package Problem_4;

public class Problem_4 {

    public static void main(String[] args) {
        
        int basamak1 = 0 , basamak2 = 0 , basamak3 = 0 , basamak4 = 0 , basamak5 = 0 , basamak6= 0;
        int i , j , sayi = 0 , sayi2 = 0 , enBuyuk = 0;
        for (i = 100 ; i <= 999 ; i++)
        {
            for (j = 100 ; j <= 999 ; j++)
            {
                sayi = i * j;
                String sayi1 = String.valueOf(sayi);
                if (sayi1.length() == 5)
                {
                    sayi = Integer.valueOf(sayi1);
                    sayi2 = sayi;
                    basamak5 = sayi % 10;
                    sayi = sayi / 10;
                    basamak4 = sayi % 10;
                    sayi = sayi / 10;
                    basamak3 = sayi % 10;
                    sayi = sayi / 10;
                    basamak2 = sayi % 10;
                    sayi = sayi / 10;
                    basamak1 = sayi % 10;
                    sayi = sayi / 10;
                    
                    if (basamak5 == basamak1 && basamak4 == basamak2 && enBuyuk < sayi2)
                    {
                        enBuyuk = sayi2;
                    }
                    
                }
                else if (sayi1.length() == 6)
                {
                    sayi = Integer.valueOf(sayi1);
                    sayi2 = sayi;
                    basamak6 = sayi % 10;
                    sayi = sayi / 10;
                    basamak5 = sayi % 10;
                    sayi = sayi / 10;
                    basamak4 = sayi % 10;
                    sayi = sayi / 10;
                    basamak3 = sayi % 10;
                    sayi = sayi / 10;
                    basamak2 = sayi % 10;
                    sayi = sayi / 10;
                    basamak1 = sayi % 10;
                    sayi = sayi / 10;
                    
                    if (basamak6 == basamak1 && basamak5 == basamak2 && basamak4 == basamak3 && enBuyuk < sayi2)
                    {
                        enBuyuk = sayi2;
                    }
                            
                }
                
            }
        }
        
        System.out.println("Answer : " +enBuyuk);

    }
    
}
