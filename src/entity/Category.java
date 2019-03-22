package entity;

public class Category {
    private String IDCate;
    private String nameCate;

    public Category() {
    }

    public Category(String IDCate, String nameCate){
        this.IDCate = IDCate;
        this.nameCate = nameCate;
    }

    public String getIDCate() {
        return IDCate;
    }

    public void setIDCate(String IDCate) {
        this.IDCate = IDCate;
    }

    public String getNameCate() {
        return nameCate;
    }

    public void setNameCate(String nameCate) {
        this.nameCate = nameCate;
    }
}
