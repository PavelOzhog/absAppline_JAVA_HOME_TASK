package homeWork;
import com.fasterxml.jackson.databind.ObjectMapper; // version 2.11.1
import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.File;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;


public class Main {

    public static void main(String[] args) {
        String filename = "file.json";
        try {
            ArrayList<Company> companies = Parser.readCompany(filename);
            SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yy");

            System.out.println("Список компаний");
            companies.forEach(t-> System.out.println(t.getName() + " - " + dateFormat.format(t.getFounded().getTime())));

            Calendar now = Calendar.getInstance();
            ArrayList<Security> securities = new ArrayList<>();


            for(Company company : companies) {
                securities.addAll(company.getSecurities().stream().filter(p -> p.getDate().after(now)).collect(Collectors.toList()));
            }

            securities.forEach(t-> System.out.println(t.getCode() + " " + t.getCompany().getName() + " " + t.getDate().getTime()));
            System.out.println(securities.size());





        } catch (IOException | ParseException e) {
            e.printStackTrace();
        }
    }
}
