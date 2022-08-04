import java.util.Random;
import java.util.Scanner;

public class

Main
{
    public static void main(String[] args)
    {
        int ARRAY_SIZE = 100;

        int[] dataPoints = new int[ARRAY_SIZE];
        Random rnd = new Random();
        Scanner in = new Scanner(System.in);

        for(int e = 0; e < dataPoints.length; e++)
        {
            dataPoints[e] = rnd.nextInt(100) + 1;
        }
        for(int e = 0; e < dataPoints.length; e++)
        {
            System.out.printf("%5d|", dataPoints[e]);
            if(e % 10 == 0 && e !=0)
            {
                System.out.println("");
            }
        }

        System.out.println("\n");

        int avg = 0;
        int sum = 0;

        for(int e = 0; e < dataPoints.length; e++)
        {
            sum = sum + dataPoints[e];
        }
         avg = sum/ARRAY_SIZE;

        System.out.println("The average of the data is " + avg);

        int min = dataPoints[0];
        int max = dataPoints[0];

        for(int e = 0; e < dataPoints.length; e++)
        {
            if(dataPoints[e] < min)
            {
                min = dataPoints[e];
            }
            if(dataPoints[e] > max)
            {
                max = dataPoints[e];
            }
        }

        System.out.println("The minimum value is " + min);
        System.out.println("The maximum value is " + max);


       int searchFor = 0;

       searchFor = SafeInput.getRangedInt(in, "Enter a value you want to find in the data set", 1, 100);

        for(int e = 0; e < dataPoints.length; e++)
        {
            if(searchFor == dataPoints[e])
            {
                System.out.println(searchFor + " was found at position " + e);
            }
        }

        int searchForBroken = 0;

        searchForBroken = SafeInput.getRangedInt(in, "Enter a value you want to find in the data set", 1, 100);

        for(int e = 0; e < dataPoints.length; e++)
        {
            if(searchFor == dataPoints[e])
            {
                System.out.println(searchForBroken + " was found at position " + e);
                break;
            }
        }

        System.out.println("The average of the data set is " + getAverage(dataPoints));
    }
public static double getAverage(int values[])
{
    double sum = 0;
    double avg = 0;
    for(int e = 0; e < values.length; e++)
    {
        sum = sum + values[e];
    }
    avg = sum/values.length;

    return avg;
}

}