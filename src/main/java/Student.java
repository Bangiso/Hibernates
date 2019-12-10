import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "STUDENT")
public class Student {
    @Id
    @Column(name="ID")
    private long id;
    @Column(name = "Name")
    private String Name;
    public void setName(String name){
        this.Name=name;
    }
    @Column(name="Field")
    private String field;
    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id=id;
    }
    public void setField(String S){
        this.field= S;
    }
    public String getName(){
        return this.Name;
    }
    public String getField() {
        return this.field;
    }
}
