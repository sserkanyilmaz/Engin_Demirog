package kodlama.io.devs.webApi.controllers;

import kodlama.io.devs.business.abstracts.LanguageService;
import kodlama.io.devs.business.abstracts.LanguageTechnologyService;
import kodlama.io.devs.business.responses.GetAllLanguageTechnologyResponse;
import kodlama.io.devs.business.responses.GetByIdLanguageTechnologyResponse;
import kodlama.io.devs.entities.concrete.Language;
import kodlama.io.devs.entities.concrete.LanguageTechnology;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/language")
public class LanguageTechnologyController{
    private LanguageTechnologyService languageTechnologyService;

    @Autowired
    public LanguageTechnologyController(LanguageTechnologyService languageTechnologyService) {
        this.languageTechnologyService = languageTechnologyService;
    }

    @GetMapping("/getall")
    public List<GetAllLanguageTechnologyResponse> getAll(){
        return languageTechnologyService.getAll();
    }

    @GetMapping("getlanguage/{id}")
    public GetByIdLanguageTechnologyResponse getCourse(@PathVariable("id") int id){
        return languageTechnologyService.getById(id);
    }

    @DeleteMapping("/delete/{id}")
    public void Delete(@PathVariable("id") int Id){
        languageTechnologyService.Delete(Id);
    }

}
