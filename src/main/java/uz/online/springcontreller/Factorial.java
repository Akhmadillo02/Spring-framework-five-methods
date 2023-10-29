package uz.online.springcontreller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/second")
public class Factorial {
    @RequestMapping("/factorial/{son}")
    public String work(@PathVariable(required = false) int son){
        long num=1;
        for (int i = 1; i <=son ; i++) {
            num *=i;
        }

        return son+" ! "+" = "+num;
    }
}
