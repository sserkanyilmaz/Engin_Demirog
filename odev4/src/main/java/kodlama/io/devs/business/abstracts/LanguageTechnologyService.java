package kodlama.io.devs.business.abstracts;

import kodlama.io.devs.business.requests.CreateLanguageTechnologyRequest;
import kodlama.io.devs.business.responses.GetAllLanguageTechnologyResponse;
import kodlama.io.devs.business.responses.GetByIdLanguageTechnologyResponse;
import kodlama.io.devs.entities.concrete.Language;
import kodlama.io.devs.entities.concrete.LanguageTechnology;

import java.util.List;

public interface LanguageTechnologyService {
    List<GetAllLanguageTechnologyResponse> getAll();
    GetByIdLanguageTechnologyResponse getById(int id);
    void Delete(int id);
    void Create(CreateLanguageTechnologyRequest languageTechnology);
}
