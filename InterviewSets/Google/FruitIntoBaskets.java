import java.util.*;

public class FruitIntoBaskets{
    public static int totalFruit(int[] tree) {
        int max = 0;
        int count = 0;
        int first = -1;
        int second = -1;
        int firstCount = 0;
        int secondCount = 0;
        for(int i = 0; i < tree.length; i++){
            if(tree[i] == first || tree[i] == second){
                count++;
                if(tree[i] == first){
                    firstCount++;
                }else{
                    secondCount++;
                }
            }else{
                if(first == -1){
                    first = tree[i];
                    firstCount++;
                    count++;
                }else if(second == -1){
                    second = tree[i];
                    secondCount++;
                    count++;
                }else{
                    if(firstCount > secondCount){
                        first = tree[i];
                        firstCount = 1;
                        secondCount = 0;
                        second = -1;
                    }else{
                        second = tree[i];
                        secondCount = 1;
                        firstCount = 0;
                        first = -1;
                    }
                    count = firstCount + secondCount;
                }
            }
            max = Math.max(max, count);
        }
        return max;
    }
    public static void main(String[] args) {
        int[] tree = {1,2,1};
        System.out.println(totalFruit(tree));
    }
}