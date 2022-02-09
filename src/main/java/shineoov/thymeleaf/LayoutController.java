package shineoov.thymeleaf;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/layout")
public class LayoutController {

    @GetMapping("/fragment")
    public String template() {
        return "layout/fragment/main";
    }

    @GetMapping
    public String layout() {
        return "layout/main";
    }

    @GetMapping("/extend")
    public String layoutExtends() {
        return "layout/extend/main";
    }
}
