// Demonstration of arrays in Java as pointers

public class ArrayParam {
    public static void main(String[] args) {
        int[] years = new int[3];
        years[0] = 1987;
        years[1] = 1989;
        years[2] = 1994;
        changeArray(years);
        for (int i = 0; i < years.length; i++) {
            System.out.println(years[i]);
        }
    }
    public static void changeArray(int[] numbers){
        numbers[0]++;
    }
}

/******************************************************
Main function returns:
1988
1989
1994

and NOT:

1987
1989
1994

Because the changeArray(); function gets passed a
pointer to the array (in memory) instead of a copy of the array,
so it is changing the values in the memory location itself.
********************************************************/