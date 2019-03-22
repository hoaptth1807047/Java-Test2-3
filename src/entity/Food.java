package entity;


public class Food {
    private String ID;
    private String name;
    private String description;
    private String price;
    private String createAt;

    public Food(){

    }

    public Food(String ID, String name, String description, String price, String createAt){
        this.ID = ID;
        this.name = name;
        this.description = description;
        this. price = price;
        this.createAt = createAt;
    }



    public String getID() {
        return ID;
    }

    @Override
    public String toString() {
        return String.format("%-10s %-10s %-10s %-10s %-10s", ID, name, description, price, createAt);
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescrition() {
        return description;
    }

    public void setDescrition(String descprition) {
        this.description = description;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getCreateAt() {
        return createAt;
    }

    public void setCreateAt(String createAt) {
        this.createAt = createAt;
    }


}
