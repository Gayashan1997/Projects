public class DefaultMember {

    private int membershipID;
    private String memberName;
    private Date startMembershipDate;

    public DefaultMember(int membershipID, String memberName, Date startMembershipDate) {
        this.membershipID = membershipID;
        this.memberName = memberName;
        this.startMembershipDate = startMembershipDate;
    }

    public int getMembershipID() {
        return membershipID;
    }

    public void setMembershipID(int membershipID) {
        this.membershipID = membershipID;
    }

    public String getMemberName() {
        return memberName;
    }

    public void setMemberName(String memberName) {
        this.memberName = memberName;
    }

    public Date getStartMembershipDate() {
        return startMembershipDate;
    }

    public void setStartMembershipDate(Date startMembershipDate) {
        this.startMembershipDate = startMembershipDate;
    }
}
