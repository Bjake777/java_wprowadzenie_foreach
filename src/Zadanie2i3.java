public class Zadanie2i3 {
    public static void main(String[] args) {
        int[] numbers = {5, 23, 38, 100, 1, 2, 3, 89, 10};

        for (int number:numbers) {
            if (number % 5==0){
                System.out.println(number);
            }
        }
        
        int[][] tab = {{1, 2, 3, 4, 5}, {6, 7, 8, 9, 10}};

        for (int[] element:tab) {
            for (int element1:element) {
                System.out.print(element1+" ");
            }
            System.out.println();
        }
    }
}
