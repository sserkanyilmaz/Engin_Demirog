package kodlama.io.devs.dataAccess.abstracts;

import kodlama.io.devs.entities.concrete.Language;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LanguageRepository extends JpaRepository<Language,Integer> {
}
