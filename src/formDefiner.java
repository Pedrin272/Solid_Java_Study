public class formDefiner {

    private String ObjectName;

    public String getName() {
        return this.ObjectName;
    }
    private void setName(String name) {
        this.ObjectName = name;
    }
    public String Define(Integer size) {
        if (size == 4){
           this.setName( "Your object is a square");
        } else if (size ==3) {
            this.setName("Your object is a triangle");
        } else if (size == 5) {
            this.setName("Your object is a pentagon");
        } else if (size == 6) {
            this.setName("Your object is a hexagon");
        } else if (size == 7) {
            this.setName("Your object is a heptagon");
        } else if (size == 8) {
            this.setName("Your object is an octagon");
        } else if (size == 9) {
            this.setName("Your object is a nonagon");
        } else if (size == 10) {
            this.setName("Your object is a decagon");
        } else {
            this.setName("Your object is a polygon");
        }
        return this.getName();
    }
}
