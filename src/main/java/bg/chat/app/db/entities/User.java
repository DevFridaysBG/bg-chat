package bg.chat.app.db.entities;

import lombok.*;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = User.TABLENAME)
public class User {

    public static final String TABLENAME = "users";

    @Id
    private String username;

    private String password;

    private boolean enabled;

    @OneToMany(mappedBy = "username")
    private Set<Authorities> authorities = new HashSet<>();
}
