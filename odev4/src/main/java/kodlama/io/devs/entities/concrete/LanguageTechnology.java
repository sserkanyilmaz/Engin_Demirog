package kodlama.io.devs.entities.concrete;


import lombok.*;

import javax.persistence.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name="LanguageTechnologys")
@Data
@Entity
public class LanguageTechnology {
    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    @Column(name="id")
    private int id;
    @Column(name="languageTechnologyName")
    private String technologyName;
    @ManyToOne
    @JoinColumn(name="language_id")
    private Language language;

}
