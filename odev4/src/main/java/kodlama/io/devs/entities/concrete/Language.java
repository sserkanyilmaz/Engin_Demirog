package kodlama.io.devs.entities.concrete;

import lombok.*;

import javax.persistence.*;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name="Languages")
@Data
@Entity

public class Language {
    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
@Column(name="id")
    private int id;
    @Column(name="languageName")
    private String languageName;
    @OneToMany(mappedBy = "language",cascade = CascadeType.ALL)
    private List<LanguageTechnology> languageTechnology;
}
