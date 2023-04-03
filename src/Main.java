public class Main {
    public static void main(String[] args) {
        int firstValue = 1;
        int secondValue = 2;
        int thirdValue = 3;
        int fourthValue = 4;
        int firstSum;
        int secondSum;
        boolean result;

        firstSum = sumValues(firstValue, secondValue);
        secondSum = sumValues(thirdValue, fourthValue);
        System.out.printf("The first sum is bigger? - %b", compareResult(firstSum, secondSum));
        System.out.println();
        firstSum += 1;
        secondSum -= 2;
        System.out.printf("After changes, the first sum is bigger? - %b", compareResult(firstSum, secondSum));
        System.out.println();
        result = sumIsMultipleOfTwo(firstSum) || sumIsMultipleOfTwo(secondSum) ? true : false;
        System.out.printf("Is any sum a multiple of 2? - %b",String.valueOf(result)); //was not specified if we should use original sum or changed one
    }

    public static int sumValues(int firstValue, int secondValue){
        return firstValue+secondValue;
    }

    public static boolean compareResult(int firstSum, int secondSum){
        return firstSum > secondSum ? true : false;
    }

    public static boolean sumIsMultipleOfTwo(int sum){
        return sum%2 == 0 ? true : false;
    }
}
