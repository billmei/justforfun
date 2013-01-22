public class two_dimensional_arrays {
    public static void main(String[] args) {
        final int NUMBER_STUDENTS = 20;
        final int NUMBER_ASSIGNMENTS = 9;
        int[][] scores = new int[NUMBER_STUDENTS][NUMBER_ASSIGNMENTS];
        scores[0][2] = 23;
        scores[0][1] = 34;
        scores[1][5] = 65;
        scores[2][7] = 98;
        scores[6][3] = 56;
        scores[8][5] = 35;
        scores[10][7] = 45;
        scores[11][2] = 78;
        scores[11][6] = 12;
        scores[12][3] = 44;
        scores[12][9] = 10;
        System.out.println(sumEverything(scores));
    }
    public static double sumEverything(int[][] param) {
        double sum = 0;
        for (int i = 0; i < param.length; i++) {
            for (int j = 0; i < param[i].length; j++) {
                sum += param[i][j];
            }
        }
        return sum;
    }
}