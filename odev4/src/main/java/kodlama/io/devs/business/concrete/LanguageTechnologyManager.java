package kodlama.io.devs.business.concrete;

import kodlama.io.devs.business.abstracts.LanguageTechnologyService;
import kodlama.io.devs.business.requests.CreateLanguageTechnologyRequest;
import kodlama.io.devs.business.responses.GetAllLanguageTechnologyResponse;
import kodlama.io.devs.business.responses.GetByIdLanguageTechnologyResponse;
import kodlama.io.devs.dataAccess.abstracts.LanguageRepository;
import kodlama.io.devs.dataAccess.abstracts.LanguageTechnologyRepository;
import kodlama.io.devs.entities.concrete.LanguageTechnology;

import javax.validation.constraints.Null;
import java.util.ArrayList;
import java.util.List;

public class LanguageTechnologyManager implements LanguageTechnologyService {

    private LanguageTechnologyRepository languageTechnologyRepository;
    public LanguageTechnologyManager(LanguageTechnologyRepository languageTechnologyRepository)
    {
        this.languageTechnologyRepository=languageTechnologyRepository;
    }
    @Override
    public List<GetAllLanguageTechnologyResponse> getAll() {
        List<GetAllLanguageTechnologyResponse> getAllLanguageTechnologyResponses = new ArrayList<GetAllLanguageTechnologyResponse>();
        for (LanguageTechnology languageTechnology : languageTechnologyRepository.findAll()) {
            getAllLanguageTechnologyResponses.add(new GetAllLanguageTechnologyResponse(languageTechnology.getTechnologyName()));
        }
        return getAllLanguageTechnologyResponses;
    }

    @Override
    public GetByIdLanguageTechnologyResponse getById(int id) {
        if(id<=0){
            return new GetByIdLanguageTechnologyResponse();
        }
        return new GetByIdLanguageTechnologyResponse(languageTechnologyRepository.getOne(id).getTechnologyName());
    }

    @Override
    public void Delete(int id) {
        languageTechnologyRepository.delete(languageTechnologyRepository.getOne(id));
    }

    @Override
    public void Create(CreateLanguageTechnologyRequest languageTechnology) {
        if(languageTechnology.getLanguageTechnologyName()!=null)
        {
            LanguageTechnology languageTechnology1 = new LanguageTechnology();
            languageTechnology1.setTechnologyName(languageTechnology.getLanguageTechnologyName());
            languageTechnologyRepository.save(languageTechnology1);
        }
    }
}
