import java.util.Scanner;
 
public class ex05 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("�г�� ������ �Է�: ");
        int grade = sc.nextInt();
        int score = sc.nextInt();
        
        String msg = "�߸� �Է��ϼ̽��ϴ�.";
        if (0 <= score && score <= 100) {
            if (60 <= score ) {
                if (grade != 4) {
                    // 1~3�г�, 60�� �̻�
                    msg = "�հ��Դϴ�.";
                } else if (score >= 70) {
                    // 4�г�, 70�� �̻�
                    msg = "�հ��Դϴ�.";
                } else {
                    // 4�г�, 70�� �̸� 
                    msg = "���հ��Դϴ�.";
                }
            } else {
                msg = "���հ��Դϴ�.";
            }
        }
        System.out.println(msg);
 
    }
}
