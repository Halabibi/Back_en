package cigma.pfe.models;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import javax.persistence.*;
import java.util.List;

@Data
@Entity(name = "TClients")
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
@DiscriminatorColumn(name = "client_type")
@DiscriminatorValue("client")
public class Client {

    @Id
    @GeneratedValue(strategy = GenerationType.TABLE)
    private long id;

    @Column(name = "Nom")
    private String name;

    public Client(String name) {
        this.name = name;
    }


    public Client(long id, String name) {
        this.id = id;
        this.name = name;
    }

    public Client() {
    }



}
