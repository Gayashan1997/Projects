public class StudentMember extends DefaultMember {

    private String schoolName;

    public StudentMember(int membershipID,String memberName,Date startMembershipDate,String schoolName) {
        super(membershipID,memberName,startMembershipDate);
        this.schoolName = schoolName;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

}
