import javax.swing.JOptionPane;

public class Sixthree {
    public static void main(String[] args) {
       
        String input = JOptionPane.showInputDialog("Enter the height of the triangle:");
        int n = Integer.parseInt(input);

        StringBuilder triangle = new StringBuilder();

        // Tạo tam giác cân
        for (int i = 1; i <= n; i++) {
            // In khoảng trắng trước dấu sao để tạo độ lệch
            for (int j = 0; j < n - i; j++) {
                triangle.append(" "); // Sử dụng khoảng trắng
            }
            // In các dấu sao
            for (int k = 0; k < 2 * i - 1; k++) {
                triangle.append("*");
            }
            triangle.append("\n");
        }

        // Hiển thị tam giác cân
        JOptionPane.showMessageDialog(null, triangle.toString());
        System.exit(0);
    }
}
