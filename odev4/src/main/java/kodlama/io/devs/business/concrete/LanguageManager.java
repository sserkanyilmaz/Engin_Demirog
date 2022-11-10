package kodlama.io.devs.business.concrete;

import kodlama.io.devs.business.abstracts.LanguageService;
import kodlama.io.devs.business.requests.CreateLanguageRequest;
import kodlama.io.devs.business.responses.GetAllLanguageResponse;
import kodlama.io.devs.business.responses.GetByIdLanguageResponse;
import kodlama.io.devs.dataAccess.abstracts.LanguageRepository;
import kodlama.io.devs.entities.concrete.Language;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class LanguageManager implements LanguageService {

    private LanguageRepository languageRepository;

    @Autowired
    public LanguageManager(LanguageRepository languageRepostory) {
        this.languageRepository = languageRepostory;
    }

    @Override
    public List<GetAllLanguageResponse> getAll() {
        List<GetAllLanguageResponse> getAllLanguageResponses = new ArrayList<GetAllLanguageResponse>();
        for (Language language: languageRepository.findAll()) {
            getAllLanguageResponses.add(new GetAllLanguageResponse(language.getLanguageName()));
        }
        return getAllLanguageResponses;
    }

    @Override
    public GetByIdLanguageResponse getById(int id) {
        Language temp = new Language();
        for (Language language:
                languageRepository.findAll()) {
            if(language.getId()==id)
                temp=language;
        }

        return new GetByIdLanguageResponse(temp.getLanguageName());
    }

    @Override
    public void Delete(int id) {
        Language temp = new Language();
        for (Language language:
                languageRepository.findAll()) {
            if(language.getId()==id)
                languageRepository.delete(language);
        }

    }

    @Override
    public void Create(CreateLanguageRequest language) {
        Language l = new Language();
        l.setLanguageName(language.getName());
        languageRepository.save(l);
    }
}
