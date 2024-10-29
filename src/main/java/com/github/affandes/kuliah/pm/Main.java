package com.github.affandes.kuliah.pm;
import java.util.Scanner;
import java.util.Stack;
public class Main {
    private Stack<String> history = new Stack<>();
    private String currentText = "";
    public static void main(String[] args) {
        // Tulis kode disini
        TextEditor editor = new TextEditor();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("-----------------------------------");
            System.out.println("Text Editor");
            System.out.println("-----------------------------------");
            System.out.println("1. Show");
            System.out.println("2. Undo");
            System.out.println("3. Redo");
            System.out.println("4. Write");
            System.out.println("5. Exit");
            System.out.print("Pilih opsi: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    editor.show();
                    break;
                case 2:
                    editor.undo();
                    break;
                case 3:
                    editor.redo();
                    break;
                case 4:
                    System.out.print("Masukkan teks: ");
                    String newText = scanner.nextLine();
                    editor.write(newText);
                    break;
                case 5:
                    System.out.println("Keluar dari Text Editor.");
                    System.exit(0);
                default:
                    System.out.println("Opsi tidak valid.");
            }
        }
    }

    private void show() {
        System.out.println("Teks saat ini: " + currentText);
    }

    private void undo() {
        if (!history.isEmpty()) {
            currentText = history.pop();
            System.out.println("Undo berhasil.");
        } else {
            System.out.println("Tidak ada undo yang tersedia.");
        }
    }

    private void redo() {
        if (!history.isEmpty()) {
            String nextText = history.peek();
            currentText = nextText;
            history.pop();
            System.out.println("Redo berhasil.");
        } else {
            System.out.println();
        }
    }
}


    }
}
