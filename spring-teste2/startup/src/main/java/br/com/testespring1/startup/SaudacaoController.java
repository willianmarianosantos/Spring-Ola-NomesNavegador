package br.com.testespring1.startup;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SaudacaoController {
    
    private static final String template = "Ola, %s!";
    private final AtomicLong counter = new AtomicLong();

    @RequestMapping("/Saudacao") // pode ser removido para abrir direto na 8080 mas nao recebe parametros depois
    public Saudacao Saudacao(@RequestParam(value="name", defaultValue = "Mundo") String name) {
        return new Saudacao(counter.incrementAndGet(), String.format(template, name));

    }
}