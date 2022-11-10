package kodlama.io.devs.webApi.controllers;


import kodlama.io.devs.business.abstracts.LanguageService;
import kodlama.io.devs.business.responses.GetAllLanguageResponse;
import kodlama.io.devs.business.responses.GetByIdLanguageResponse;
import kodlama.io.devs.entities.concrete.Language;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/language")
public class LanguageController {
    private LanguageService languageService;

    @Autowired
    public LanguageController(LanguageService languageService) {
        this.languageService = languageService;
    }

    @GetMapping("/getall")
    public List<GetAllLanguageResponse> getAll(){
        return languageService.getAll();
    }

    @GetMapping("getlanguage/{id}")
    public GetByIdLanguageResponse getCourse(@PathVariable("id") int id){
        return languageService.getById(id);
    }

    @DeleteMapping("/delete/{id}")
    public void Delete(@PathVariable("id") int Id){
        languageService.Delete(Id);
    }
}
