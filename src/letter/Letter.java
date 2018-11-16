package letter;



public class Letter {

    private String address;
    private Boolean isStamped;

    public Letter(String address) {
        this.address = address;
    }

    public  void stamp(){
        isStamped = true;

    }

    public String getAddress() {
        return address;
    }

    public Letter(Boolean isStamped) {
        this.isStamped = isStamped;
    }
}
