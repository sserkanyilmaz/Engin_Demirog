package kodlama.io.devs.business.abstracts;

import kodlama.io.devs.business.requests.CreateLanguageRequest;
import kodlama.io.devs.business.responses.GetAllLanguageResponse;
import kodlama.io.devs.business.responses.GetByIdLanguageResponse;
import kodlama.io.devs.entities.concrete.Language;

import java.util.List;

public interface LanguageService {
    List<GetAllLanguageResponse> getAll();
    GetByIdLanguageResponse getById(int id);
    void Delete(int id);
    void Create(CreateLanguageRequest language);
}
