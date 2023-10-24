package dozero.dozeroum;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class IndexController {

    @RequestMapping("/") // ModelAndView é utilizado para retornar a view que será exibida, podendo passar parâmetros
    public ModelAndView index(){ // Publico é o modificador de acesso do metodo, ModenAndView é o tipo de retorno do metodo, e Index é o nome do metodo

        ModelAndView principal = new ModelAndView(); // ModelAndView é o tipo de dado da variavel, Principal é o nome da variavel, neste caso como Principal é uma variavel de objeto
        principal.setViewName("index");
        return principal;
    }
}