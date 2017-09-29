//http://www.usaco.org/index.php?page=viewproblem2&cpid=94
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class main {
    public static boolean isAllEqual(int[] a){
        for(int i=1; i<a.length; i++){
            if(a[0] != a[i]){
                return false;
            }
        }

        return true;
    }

    public static void main (String [] args) throws FileNotFoundException {
        int answer =0;
        Scanner n = new Scanner(new File("haybales.in"));
        int piles = n.nextInt();
        int[] height = new int[piles];
        for (int i=0; i<piles; i++)
            height[i] = n.nextInt();
        Arrays.sort(height);
        while (!isAllEqual(height)) {
            while(height[0]<height[piles-1]){
                height[0]++;
                height[piles-1]--;
                System.out.println(Arrays.toString(height));
                Arrays.sort(height);
                answer++;
            }
        }
        System.out.println(answer);


    }
}
