package initLearn.ifStateMent;

import java.io.IOException;

// ��������� ����� CyclesMenuFood
public class CyclesMenuFood {
    // ��������� �������� ���������� ��������� ������ ���������� argCommStr � ������
    // main(), ���������� ���������� IOException ��� ����� � ������ ������, ����������
    // ����������� ������� public, �������� ����� static, � void - ������ ��� ������
    public static void main (String[] argCommStr) throws IOException {
        // ������ ���� "����" � ������������ true
        while (true) {
            System.out.println("���� �� ������: ");
            System.out.println(" 1. ����� ��������� ");
            System.out.println(" 2. ����-����� ");
            System.out.println(" 3. ������� ��� ");
            System.out.println(" 4. ����� ������ ");
            System.out.println(" 5. ������ ��� ����� ");
            System.out.println(" 6. �������� ");
            System.out.println(" 7. ������� ���� ");
            System.out.println(" 8. ������� ");
            System.out.println(" 9. �������� ");
            System.out.println(" A. ����-��� ");
            System.out.print("B�� ����� (N - �����): ");
            // ������ ���������� choice 16-������� ���� char,
            char choice = (char)
                    // ��������� ����� � ������ System ��� ����� ������, ���������
                    // ����� read(), ����������� ����� ������ �������� ������
                    System.in.read();
            char ignore;
            // �������� ��� ��������� - ������ ����������!
            do {
                ignore = (char)
                        System.in.read();
            } while (ignore != '\n'); // ���� ignore �� ����� '\n'
            if (choice == 'N') {
                // ���������� �������� return, ��� �� ��������� ������ ����
                return;
            }
            // ������������� switch - �������� ������ case-��, ����������� ������ ����� ����
            switch (choice) {
                case '1' -> System.out.println("��������� �����: ����� ���������");
                case '2' -> System.out.println("��������� �����: ����-�����");
                case '3' -> System.out.println("��������� �����: ������� ���");
                case '4' -> System.out.println("��������� �����: ����� ������");
                case '5' -> System.out.println("��������� �����: ����� ��� �����");
                case '6' -> System.out.println("��������� �����: ��������");
                case '7' -> System.out.println("��������� �����: ������� ����");
                case '8' -> System.out.println("��������� �����: �������");
                case '9' -> System.out.println("��������� �����: ��������");
                case 'A' -> System.out.println("��������� �����: ����-���");
                }
            }
        }
    }
