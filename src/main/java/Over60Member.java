public class Over60Member extends DefaultMember {

    private int age;

    public Over60Member(int membershipID,String memberName,Date startMembershipDate,int age) {
        super(membershipID,memberName,startMembershipDate);
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

}
