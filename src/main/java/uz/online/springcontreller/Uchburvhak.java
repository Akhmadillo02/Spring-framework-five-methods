package uz.online.springcontreller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/uchburchak")
public class Uchburvhak {
    @GetMapping("/gipatenuza/{firstKatet}/{secondKatet}")
    public String hisoblash(@PathVariable int firstKatet,@PathVariable int secondKatet){

        double c=Math.sqrt(Math.pow(firstKatet, 2d) + Math.pow(secondKatet, 2d));
        return "gipatenuza = "+c;
    }
}
