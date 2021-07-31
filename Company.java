package homeWork;

import jdk.nashorn.internal.ir.annotations.Ignore;

import java.util.Calendar;
import java.util.List;

public class Company {
    private int id;
    private String name;
    private String address;
    private String phoneNumber;

    private String INN;
    private Calendar founded;
    private List<Security> securities;

    public Company(int id, String name, String address, String phoneNumber, String INN, Calendar founded, List<Security> securities) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.INN = INN;
        this.founded = founded;
        this.securities = securities;
    }

    public Company(int id, String name, String address, String phoneNumber, String INN, Calendar founded) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.INN = INN;
        this.founded = founded;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getINN() {
        return INN;
    }

    public Calendar getFounded() {
        return founded;
    }

    public List<Security> getSecurities() {
        return securities;
    }
}
