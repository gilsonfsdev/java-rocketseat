package fsdev.gilson.gestao_vagas.modules.candidate.controllers;

import fsdev.gilson.gestao_vagas.modules.candidate.CandidateEntity;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/candidate")
public class CandidateController {

  @PostMapping("/")
  public void create(@Valid @RequestBody CandidateEntity candidateEntity){
    System.out.println("Candidato");
    System.out.println(candidateEntity.getEmail());
  }
  
}
