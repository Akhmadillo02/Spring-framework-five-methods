package uz.online.springcontreller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/first")
public class Sum {
    @RequestMapping("/sum")
    public String toNumber(@RequestParam int number){
        int son=0;
        if (!(number<=2)){
            for (int i = 0; i <= number; i++) {
                son+=i;
            }
            String string= "1+2+......+"+number +" = " +son;
            return string;
        }
        return "not minus number";
    }
}
