package FrameSpring.ProjectSpringHW;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    @GetMapping("/user")
    public String hello() {
        return "Приветствую тебя, пользователь";
    }
}
