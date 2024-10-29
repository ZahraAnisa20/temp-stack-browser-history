package com.github.affandes.kuliah.pm;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> history = new ArrayList<>();
        while (true) {
            System.out.println("Pilih fungsi:");
            System.out.println("1. View");
            System.out.println("2. Browse");
            System.out.println("3. Back");
            System.out.println("4. Keluar");

            int pilihan = scanner.nextInt();
            scanner.nextLine();
            switch (pilihan) {
                case 1:
                    view(history);
                    break;
                case 2:
                    System.out.print("Masukkan website: ");
                    String website = scanner.nextLine();
                    browse(history, website);
                    break;
                case 3:
                    back(history);
                    break;
                case 4:
                    System.out.println("Terima kasih!");
                    System.exit(0);
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        }
    }
    static void view(List<String> history) {
        if (history.isEmpty()) {
            System.out.println("Riwayat kosong.");
        } else {
            System.out.println("Riwayat:");
            for (int i = history.size() - 1; i >= 0; i--) {
                System.out.println((history.size() - i) + ". " + history.get(i));
            }
        }
        System.out.println();
    }
    static void browse(List<String> history, String website) {
        history.add(website);
        System.out.println("Website " + website + " ditambahkan ke riwayat.");
        System.out.println();
    }
    static void back(List<String> history) {
        if (history.isEmpty()) {
            System.out.println("Tidak ada website sebelumnya.");
        } else {
            history.remove(history.size() - 1);
            System.out.println();
        }
    }
}

    
