public interface GymManager {

    boolean addDefaultMember(DefaultMember defaultMember) throws Exception;

    boolean addStudentMember(DefaultMember studentMember);

    boolean addOver60Member(DefaultMember over60Member);

    boolean deleteDefaultMember();

    boolean deleteStudentMember();

    boolean deleteOver60Member();

    void sortMembers();

    void saveMemberList();



}
