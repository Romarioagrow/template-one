package rio.templates.one.templateone.controllers;

import lombok.extern.java.Log;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Log
@Controller
@RequestMapping("/")
public class StaticContentController {

    @GetMapping("")
    public String index() {
        return "pages/index";
    }

}
