package homeWork;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

class JSecurity{
    public String name;
    public List<String> currency;
    public String code;
    public String date;
}

class JCompany{
    public int id;
    public String name;
    public String address;
    public String phoneNumber;
    @JsonProperty("INN")
    public String iNN;
    public String founded;
    public List<JSecurity> securities;
}

class Root{
    public List<JCompany> companies;
}

public class Parser {
    public static ArrayList<Company> readCompany(String filename) throws IOException, ParseException {
        File file = new File(filename);

        ObjectMapper om = new ObjectMapper();
        Root root = om.readValue(file, Root.class);
        ArrayList<JCompany> jcompanies = (ArrayList<JCompany>) root.companies;

        ArrayList<Company> companies = new ArrayList<>();
        SimpleDateFormat sdf = new SimpleDateFormat("dd.MM.yyyy");

        for(JCompany company : jcompanies){
            ArrayList<Security> securities = new ArrayList<>();
            for(JSecurity jsecurity : company.securities){
                Calendar date = Calendar.getInstance();
                date.setTime(sdf.parse(jsecurity.date));

                Security security = new Security(jsecurity.name, jsecurity.currency, jsecurity.code, date);
                securities.add(security);
            }

            Calendar dateFounded = Calendar.getInstance();
            dateFounded.setTime(sdf.parse(company.founded));
            Company company1 = new Company(company.id, company.name, company.address, company.phoneNumber,
                    company.iNN, dateFounded, securities);
            securities.forEach(t->t.setCompany(company1));
            companies.add(company1);
        }

        return companies;
    }
}
