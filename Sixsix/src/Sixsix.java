import javax.swing.JOptionPane;

public class Sixsix {
    
    public static void main(String[] args) {
        // Input number of rows and columns
        int r = Integer.parseInt(JOptionPane.showInputDialog("Enter the number of rows for the matrices:"));
        int c = Integer.parseInt(JOptionPane.showInputDialog("Enter the number of columns for the matrices:"));
        
        // Initialize matrices
        int[][] matrix1 = new int[r][c];
        int[][] matrix2 = new int[r][c];
        
        // Input elements for the first and second matrices
        inputMatrix(matrix1, r, c, "first");
        inputMatrix(matrix2, r, c, "second");

        // Perform matrix addition and create output
        StringBuilder result = new StringBuilder("Resulting Matrix after addition:\n");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                result.append(matrix1[i][j] + matrix2[i][j]).append(" ");
            }
            result.append("\n");
        }
        
        // Show the result matrix
        JOptionPane.showMessageDialog(null, result.toString());
    }
    
    // Method to input matrix data
    private static void inputMatrix(int[][] matrix, int r, int c, String matrixName) {
        JOptionPane.showMessageDialog(null, "Enter elements of the " + matrixName + " matrix:");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                matrix[i][j] = Integer.parseInt(JOptionPane.showInputDialog(matrixName + " matrix[" + i + "][" + j + "]:"));
            }
        }
    }
}
