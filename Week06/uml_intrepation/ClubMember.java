public class ClubMember{
    private String firstName;
    private String lastName;
    private String homeAddress;
    private String workAddress;
    
    public ClubMember(){
        
    }

    public ClubMember(String firstName, String lastName, String homeAddress, String workAddress) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.homeAddress = homeAddress;
        this.workAddress = workAddress;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getHomeAddress() {
        return homeAddress;
    }

    public void setHomeAddress(String homeAddress) {
        this.homeAddress = homeAddress;
    }

    public String getWorkAddress() {
        return workAddress;
    }

    public void setWorkAddress(String workAddress) {
        this.workAddress = workAddress;
    }

    @Override
    public String toString() {
        return "ClubMember [firstName=" + firstName + ", homeAddress=" + homeAddress + ", lastName=" + lastName
                + ", workAddress=" + workAddress + "]";
    }

}
