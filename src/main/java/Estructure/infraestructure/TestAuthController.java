package Estructure.infraestructure;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/auth")
public class TestAuthController {

    @RequestMapping("/test")
    public String test() {
        return "Holaaaaa";
    }
}
