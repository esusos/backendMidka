package kz.zero.webmvc2;

public class Product {
    private String nazvanie;
    private String podrazdel;
    private int year;
    private Double price;

    public Product() {
    }

    public String getNazvanie() {
        return nazvanie;
    }

    public void setNazvanie(String nazvanie) {
        this.nazvanie = nazvanie;
    }

    public String getPodrazdel() {
        return podrazdel;
    }

    public void setPodrazdel(String podrazdel) {
        this.podrazdel = podrazdel;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "NAme of :\n{" + "subsection=\"" + nazvanie + "\", producer=" + podrazdel + ", year" + year + ", price=" + price +"KZT"+ '}';
    }
}
