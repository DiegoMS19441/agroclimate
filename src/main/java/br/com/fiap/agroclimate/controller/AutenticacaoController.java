package br.com.fiap.agroclimate.controller;

import br.com.fiap.agroclimate.dto.agricultorDto.InformacaoAgricultorDto;
import br.com.fiap.agroclimate.dto.userDto.DadosLoginDto;
import jakarta.transaction.Transactional;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/autenticacao")
public class AutenticacaoController {

    @PostMapping("/login")
    public ResponseEntity<DadosLoginDto> post() {
        var login = new DadosLoginDto("Georgina");
        return ResponseEntity.ok(login);
    }

}
