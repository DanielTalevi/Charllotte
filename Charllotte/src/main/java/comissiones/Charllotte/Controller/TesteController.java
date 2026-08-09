package comissiones.Charllotte.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TesteController {
    @GetMapping("/testando")
    public String loginPage() {
        return "index";
    }

    @GetMapping("/fodaissoaiviu")
    public String cadastroPage() {
        return "index";
    }

}
