import Connection.MongoDBConnection;
import com.mongodb.MongoException;
import com.mongodb.MongoWriteException;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.model.IndexOptions;
import com.mongodb.client.model.Indexes;
import org.bson.Document;

import static com.mongodb.client.model.Filters.eq;

import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;

public class MyGymManager implements GymManager {

    private MongoCollection<Document> defaultMembers;
    private MongoCollection<Document> studentMembers;
    private MongoCollection<Document> over60Members;

    public MyGymManager() throws Exception{
        //getting mongo connection
        MongoDatabase mongoDatabase = MongoDBConnection.createConnection().getInstance();
        //creating collections
        defaultMembers = mongoDatabase.getCollection("default");
        studentMembers = mongoDatabase.getCollection("student");
        over60Members = mongoDatabase.getCollection("over60");

    }

    //checking if park is full
    public boolean isFull(){
        if((defaultMembers.count()+ studentMembers.count()+over60Members.count())==100){
            System.out.println("Parking slots full!");
            return true;
        }else return false;
    }

    @Override
    public boolean addDefaultMember(DefaultMember defaultMember) throws Exception{
        try {
            Document document=new Document()
                    .append("memID",defaultMember.getMembershipID())
                    .append("memName",defaultMember.getMemberName())
                    .append("memStartDate",defaultMember.getStartMembershipDate()
            );

            IndexOptions indexOptions = new IndexOptions().unique(true);
            defaultMembers.createIndex(Indexes.ascending("memID","memName","memStartDate"),indexOptions);

            defaultMembers.insertOne(document);
            System.out.println("Successfully added member");
            return true;

        }catch (MongoException e){
            throw new Exception("Member already exists");
        }
    }

    @Override
    public boolean addStudentMember(DefaultMember studentMember) {
        return false;
    }

    @Override
    public boolean addOver60Member(DefaultMember over60Member) {
        return false;
    }

    @Override
    public boolean deleteDefaultMember() {
        return false;
    }

    @Override
    public boolean deleteStudentMember() {
        return false;
    }

    @Override
    public boolean deleteOver60Member() {
        return false;
    }

    @Override
    public void sortMembers() {

    }

    @Override
    public void saveMemberList() {

    }
}
