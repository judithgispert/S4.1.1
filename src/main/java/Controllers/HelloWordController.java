package Controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

public class HelloWordController { 
    @GetMapping("/HelloWord")
    public String greet(@RequestParam(defaultValue = "UNKNOWN") String name){
        return "Hello, " + name + ". You're running a Maven project.";
    }

    @GetMapping({"/HelloWord2", "/HelloWord2/{name}"})
    public String greet2(@PathVariable(required = false) String name){
        if (name != null){
            return "Hello, " + name + ". You're running a Maven project.";
        } else {
            return "Name missing.";
        }
    }
}
