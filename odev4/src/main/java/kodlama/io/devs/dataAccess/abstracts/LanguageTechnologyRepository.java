package kodlama.io.devs.dataAccess.abstracts;

import kodlama.io.devs.entities.concrete.Language;
import kodlama.io.devs.entities.concrete.LanguageTechnology;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LanguageTechnologyRepository extends JpaRepository<LanguageTechnology,Integer> {
}
