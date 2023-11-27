/*
Name - Arshjot Singh (100922122)
Date - 26 November 2023
FileName - Assignment_3
Description- This java class is a vaccine manager app that stores information about vaccines and allows it to manipulate it using console.
 */

// This imports necessary libraries
import java.text.SimpleDateFormat;
import java.util.Date;

// This defines the vaccine class
class Vaccine {
    private int vaccineId;
    private String vaccineName;
    private double unitCost;
    private int quantityOnHand;
    private Date expiryDate;
    // this is the constructor function for the vaccine
    public Vaccine() {
        this.vaccineId = 0;
        this.vaccineName = "Default Vaccine";
        this.unitCost = 0.0;
        this.quantityOnHand = 0;
        this.expiryDate = new Date();
    }

    public Vaccine(int vaccineId, String vaccineName, double unitCost, int quantityOnHand, Date expiryDate) {
        this.vaccineId = vaccineId;
        this.vaccineName = vaccineName;
        this.unitCost = unitCost;
        this.quantityOnHand = quantityOnHand;
        this.expiryDate = expiryDate;
    }
// This retrieves the vaccineID
    public int getVaccineId() {
        return vaccineId;
    }
// This sets  the vaccineID

    public void setVaccineId(int vaccineId) {
        this.vaccineId = vaccineId;
    }
// This retrieves the name of the vaccine

    public String getVaccineName() {
        return vaccineName;
    }
// This sets the name of the vaccine

    public void setVaccineName(String vaccineName) {
        this.vaccineName = vaccineName;
    }
// This retrieves the cost
    public double getUnitCost() {
        return unitCost;
    }
// This sets cost

    public void setUnitCost(double unitCost) {
        this.unitCost = unitCost;
    }
// This retrieves the amount left

    public int getQuantityOnHand() {
        return quantityOnHand;
    }
// This sets the amount left

    public void setQuantityOnHand(int quantityOnHand) {
        this.quantityOnHand = quantityOnHand;
    }
// This retrieves the expiry date

    public Date getExpiryDate() {
        return expiryDate;
    }
// This sets the expiry date

    public void setExpiryDate(Date expiryDate) {
        this.expiryDate = expiryDate;
    }
// This displays the the information in tabular or non-tabular format
    public void displayDetails(boolean tableFormat) {
        if (tableFormat) {
            System.out.println("ID\t| Vaccine Name\t| Unit Cost\t| Quantity\t| Expiry Date");
            System.out.println("-----\t|--------------\t|-----------\t|-----------\t|-------------");
            System.out.println(vaccineId + "\t| " + vaccineName + "\t\t| " + unitCost + "\t\t| "
                    + quantityOnHand + "\t\t| " + formatDate(expiryDate));
        } else {
            System.out.println("ID: " + vaccineId);
            System.out.println("Vaccine Name: " + vaccineName);
            System.out.println("Unit Cost: " + unitCost);
            System.out.println("Quantity on hand: " + quantityOnHand);
            System.out.println("Expiry Date: " + formatDate(expiryDate));
        }
    }
// This method formats the date
    private String formatDate(Date date) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy");
        return dateFormat.format(date);
    }
}

public class Assignment_3 {

    public static void main(String[] args) {
        // This creates a new vaccine class instance
        Vaccine defaultVaccine = new Vaccine();
        System.out.println("Default Vaccine Information:");
        defaultVaccine.displayDetails(false);
        // Vaccine information is defined here .
        defaultVaccine.setVaccineId(1);
        defaultVaccine.setVaccineName("AlphaVax");
        defaultVaccine.setUnitCost(20.5);
        defaultVaccine.setQuantityOnHand(100);
        defaultVaccine.setExpiryDate(new Date(2023 - 1900, 11, 31));

        System.out.println("\nUpdated Vaccine Information:");
        // This displays the details of the vaccination in non-tabular format
        defaultVaccine.displayDetails(false);
        // This creates 2 new instances of vaccines
        Vaccine vaccine2 = new Vaccine(2, "BetaGuard", 25.0, 50, new Date(2023 - 1900, 9, 30));
        Vaccine vaccine3 = new Vaccine(3, "GammaShield", 30.0, 75, new Date(2023 - 1900, 10, 15));
        // This list stores the created vaccines
        Vaccine[] vaccineArray = {defaultVaccine, vaccine2, vaccine3};

        System.out.println("\nAll Vaccines Information (Table Format):");
        // This displays
        for (Vaccine vaccine : vaccineArray) {
            vaccine.displayDetails(true);
        }
    }
}
