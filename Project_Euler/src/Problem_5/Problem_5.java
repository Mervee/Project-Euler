/*
1'den 10'a kadar bütün sayılara kalansız bölünen en küçük sayı 2520'dir.
1'den 20'ye kadar bütün sayılara kalansız bölünen en küçük pozitif sayı kaçtır?
 */

package Problem_5;

public class Problem_5 {

    public static void main(String[] args) {
        
        int i , j , tekrar;
        
        for(i = 1 ; ; i++)
        {
            tekrar = 0;
            for(j = 1 ; j <= 20 ; j++)
                if(i % j == 0)
                    tekrar++;
            if(tekrar == 20)
                break;
            
        }
        System.out.println("Answer :" +i);

    }
    
}
