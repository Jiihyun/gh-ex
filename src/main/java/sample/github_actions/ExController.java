package sample.github_actions;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ExController {
    @GetMapping("/health-check")
    public String healthCheck() {
        return "ok";
    }
}
