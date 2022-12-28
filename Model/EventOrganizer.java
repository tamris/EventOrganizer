package Model;

import java.util.ArrayList;

public class EventOrganizer {
    private int CustId;
    private String CustNama;
    private String CustEmail;
    private String CustAddres;
    private String CustPhonne;

    public int getCustId() {
        return CustId;
    }

    public void setCustId(int custId) {
        CustId = custId;
    }

    public String getCustNama() {
        return CustNama;
    }

    public void setCustNama(String custNama) {
        CustNama = custNama;
    }

    public String getCustEmail() {
        return CustEmail;
    }

    public void setCustEmail(String custEmail) {
        CustEmail = custEmail;
    }

    public String getCustAddres() {
        return CustAddres;
    }

    public void setCustAddres(String custAddres) {
        CustAddres = custAddres;
    }

    public String getCustPhonne() {
        return CustPhonne;
    }

    public void setCustPhonne(String custPhonne) {
        CustPhonne = custPhonne;
    }

    public EventOrganizer() {}
    public EventOrganizer (int custId, String custNama, String custEmail, String custAddres, String custPhonne){
        this.CustId=custId;
        this.CustNama=custNama;
        this.CustEmail=custEmail;
        this.CustAddres=custAddres;
        this.CustPhonne=custPhonne;
    }


    public static void PrintGuests (ArrayList<EventOrganizer> guest_list){
        System.out.println("\n=====Data Guests======");
        for (EventOrganizer guest:guest_list){
            System.out.println("ID\t: "+guest.getCustId());
            System.out.println("Name\t: "+guest.getCustNama());
            System.out.println("Email\t: "+guest.getCustEmail());
            System.out.println("Address\t: "+guest.getCustAddres());
            System.out.println("Number Phone\t: "+guest.getCustPhonne()+"\n");
        }
    }
}