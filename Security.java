package homeWork;

import java.util.Calendar;
import java.util.List;

public class Security {
    private String name;
    private List<String> currency;
    private String code;
    private Calendar date;
    private Company company;

    public Security(String name, List<String> currency, String code, Calendar date) {
        this.name = name;
        this.currency = currency;
        this.code = code;
        this.date = date;
    }

    public String getName() {
        return name;
    }

    public List<String> getCurrency() {
        return currency;
    }

    public String getCode() {
        return code;
    }

    public Calendar getDate() {
        return date;
    }

    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }
}
