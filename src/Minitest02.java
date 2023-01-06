public class Minitest02
{

    public static int arraySum(int[] array)
    {
        int sum = 0;
        for (int i = 0; i < array.length;i++)
        {
            sum += array[i];
        }
        return sum;
    }

    public static int maxElementOfArray(int[] array)
    {
        int max = array[0];

        for (int i = 1; i < array.length;i++)
        {
            if (array[i] > max)
            {
                max = array[i];
            }
        }
        return max;
    }


    public static void main(String[] args) {

        int[] array ={23,4,10,12,-3,10,21,11,23,-9};
        int sum = arraySum(array);
        int maxElement = maxElementOfArray(array);

        System.out.printf("Tổng phần tử trong mảng : %d \n", sum);
        System.out.printf("Phần tử lớn nhất trong mảng : %d \n", maxElement);


    }
}