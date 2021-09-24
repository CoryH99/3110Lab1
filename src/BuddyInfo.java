public class BuddyInfo {
    private String phone;
    private String name;
    private String address;

    public BuddyInfo(){
        this("Cory", "address", "66666669");
    }

    public BuddyInfo(String name, String address, String phone){
        this.name = name;
        this.address = address;
        this.phone = phone;
    }

    public String getAddress() {
        return this.address;
    }

    public String getName() {
        return this.name;
    }

    public String getPhone() {
        return this.phone;
    }

    public static void main(String[] args) {
        BuddyInfo buddy = new BuddyInfo();
        System.out.println("Hello " + buddy.getName());
    }
}