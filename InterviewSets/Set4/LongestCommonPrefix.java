public class LongestCommonPrefix{
    static String findLongestCommonPrefix(String arr[], int n)
    {
        int index = findMinLength(arr, n);
        String prefix = "";
        for (int i = 0; i < index; i++)
        {
            char current = arr[0].charAt(i);
            for (int j = 1; j < n; j++)
            {
                if (arr[j].charAt(i) != current)
                {
                    return prefix;
                }
            }
            prefix += (current);
        }
        return prefix;
    }
    static int findMinLength(String arr[], int n)
    {
        int min = arr[0].length();
        for (int i = 1; i < n; i++)
        {
            if (arr[i].length() < min)
            {
                min = arr[i].length();
            }
        }
        return (min);
    }
    public static void main(String[] args) {
        String arr[] = { "geeksforgeeks", "geeks", "geek", "geezer"};
        int n = arr.length;
        System.out.println("The longest common prefix is " + findLongestCommonPrefix(arr, n));
    }
}