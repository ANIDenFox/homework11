import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        int[][] array = new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        SumOfColumns(array);
        Transpose(array);
        MeanOfRows(array);
    }
    public static void SumOfColumns(int [][] array){
        ArrayList<Integer> sums = new ArrayList<>();
        for (int i = 0; i < array[0].length; i++) {
            int sum = 0;
            for (int j = 0; j < array.length; j++) {
                sum += array[j][i];
            }
            sums.add(sum);
        }
        System.out.println("Сума стовпців: " + sums);
    }
    public static void Transpose(int[][] array) {
        ArrayList<ArrayList<Integer>> transposedArray = new ArrayList<>();
        for (int i = 0; i < array[0].length; i++) {
            ArrayList<Integer> row = new ArrayList<>();
            for (int j = 0; j < array.length; j++) {
                row.add(array[j][i]);
            }
            transposedArray.add(row);
        }
        for (int i = 0; i < transposedArray.size(); i++) {
            for (int j = 0; j < transposedArray.get(i).size(); j++) {
                System.out.print(transposedArray.get(i).get(j) + "  ");
            }
            System.out.println();
        }
    }
    public static void MeanOfRows(int[][] array){
        ArrayList<Double> means = new ArrayList<>();
        for (int i = 0; i < array.length; i++) {
            double sum = 0;
            for (int j = 0; j < array[i].length; j++) {
                sum += array[i][j];
            }
            means.add(sum / array[i].length);
        }
        System.out.println("Середнє значення рядків: " + means);
    }
}