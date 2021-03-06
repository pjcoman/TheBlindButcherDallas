package comapps.com.theblindbutcherdallas.menu;

class MenuListObject {

    private String item;
    private String group;
    private String price;
    private String description;



    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }


    @Override
    public String toString() {
        return "MenuList [item=" + item + ", " + "price=" + price + "group=" + group +"description " +"]";
    }


}
