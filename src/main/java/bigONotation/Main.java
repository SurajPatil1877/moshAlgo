package bigONotation;

public class Main {
    public void log(int[] numbers) {
        //O(1)
        System.out.println(numbers[0]);

        //O(n)
        for (int number : numbers) System.out.println(number);

        //O(n^2)
        for (int first : numbers)
            for (int second : numbers)
                System.out.println(first + " ," + second );

    }
}
