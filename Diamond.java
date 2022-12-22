public class Diamond {
    private int shapeSize;
    private int rowCenter;
    private int colCenter;
    private String matrix[][];
    private int ROW = 79;
    private int COLUMN = 25;

    Diamond(int size, int x, int y) {
        shapeSize = size;
        rowCenter = x;
        colCenter = y;
        matrix = new String[ROW][COLUMN];

        for (int i = 0; i < ROW; i++) {
            for (int j = 0; j < COLUMN; j++) {
                matrix[i][j] = "=";
            }
        }
    }

    public void printMatrix() {
        for (int i = 0; i < ROW; i++) {
            for (int j = 0; j < COLUMN; j++) {
                System.out.print(matrix[i][j]);
            }
            System.out.println();
        }
    }

    public void drawShape() {
        int centLeft = colCenter;
        int centRight = colCenter;

        for (int i = rowCenter - (shapeSize-1); i < rowCenter+shapeSize; i++) {
            // Setting the symbols
            matrix[i][centLeft] = "$";
            matrix[i][centRight] = "$";

            if (i <= rowCenter) {
                // Printing the upper part of the diamond
                centLeft -= 1;
                centRight += 1;

                if (i == rowCenter) {
                    // Printing the central diamond
                    matrix[rowCenter][colCenter] = "$";

                    // Realigning the Column positions to print the lower 
                    // part of the diamond
                    centLeft += 2;
                    centRight -= 2;
                }
            } else {
                // Printing the lower part of the diamond
                centLeft += 1;
                centRight -= 1;
            }
        }
    }
}