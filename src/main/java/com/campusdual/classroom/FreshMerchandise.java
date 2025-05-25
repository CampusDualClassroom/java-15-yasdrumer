package com.campusdual.classroom;

import java.text.SimpleDateFormat;
import java.util.Date;

public class FreshMerchandise extends Merchandise {
    private Date expirationDate;

    public FreshMerchandise(String location, Date expirationDate) {
        super("Fresh Merchandise", "FM-" + location, "Responsible-" + location);
        this.expirationDate = expirationDate;
    }
    public FreshMerchandise(String name, String uniqueId, String responsibleId, int zone, String area, String shelf,
                            int quantity, Date expirationDate) {
        super(name, uniqueId, responsibleId, zone, area, shelf, quantity);
        this.expirationDate = expirationDate;
    }
    public Date getExpirationDate() {
        return this.expirationDate;
    }
    public String getFormattedDate(Date date) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
        return dateFormat.format(date);
    }

    @Override
    public Object getSpecificData() {
        StringBuilder builder = new StringBuilder();
        builder.append("Localización: ");
        builder.append(getLocation());
        builder.append(" | Caducidad: ");
        builder.append(getFormattedDate(this.expirationDate));
        return builder.toString();
        }

    public Object printSpecificData(){
        System.out.println(getSpecificData());
        return null;
    }
}
