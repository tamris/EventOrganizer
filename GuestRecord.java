import Model.EventOrganizer;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class GuestRecord {
    static Scanner input = new Scanner(System.in);
    static BufferedReader input_data = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) {

        boolean repeat = true;
        char input_menu;

        EventOrganizer[] guestList = new EventOrganizer[2];

        while (repeat) {
            System.out.println("\n==========Program Undangan=============");
            System.out.println("Pilih menu berikut: ");
            System.out.println("a. Input data");
            System.out.println("b. Cetak Undangan");
            System.out.println("c. Exit");
            System.out.print("Pilihan : ");
            input_menu = input.next().charAt(0);

            switch (input_menu){
                case 'a':
                    InputTamuUndangan(guestList);
                    break;
                case 'b':
                    ArrayList<EventOrganizer> guest_list = new ArrayList<EventOrganizer>(Arrays.asList(guestList));
                    EventOrganizer.PrintGuests(guest_list);
                    break;
                case 'c':
                    repeat=false;
                    break;
                default:
                    System.out.println("\n Mohon pilih huruf yang ada dimenu");

            }
        }
    }


    private static void InputTamuUndangan(EventOrganizer[] daftar_tamu) {
        System.out.println("\n========Input Tamu Undangan============");
        for (int x = 0; x < daftar_tamu.length; x++) {
            try {
                EventOrganizer guest = new EventOrganizer();

                System.out.print("ID\t: ");
                guest.setCustId(Integer.parseInt(input_data.readLine()));

                System.out.print("Name\t: ");
                guest.setCustNama(input_data.readLine());

                System.out.print("Address\t: ");
                guest.setCustAddres(input_data.readLine());

                System.out.print("Email\t: ");
                guest.setCustEmail(input_data.readLine());

                System.out.print("Number Phone\t: ");
                guest.setCustPhonne(input_data.readLine());

                daftar_tamu[x]=guest;
                if(x != daftar_tamu.length){
                    System.out.println("===================================");
                }


            } catch (Exception e) {
                System.out.println("Eror : "+e.getMessage());
            }
        }
    }
}