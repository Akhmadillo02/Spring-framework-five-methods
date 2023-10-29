package uz.online.springcontreller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("tubson")
public class TubSonToNumber {
    @RequestMapping("/tonum/{son}")
    public String xisoblash(@PathVariable int son){
        String s="";
        a:for (int i = 2; i <son ; i++) {
           b: for (int j = 2; j <= i/2; j++) {
                if (i%j==0){
                   continue a;
                }
            }
            s+="\n"+i+" -> tub son";
        }
        return s;
    }
}
