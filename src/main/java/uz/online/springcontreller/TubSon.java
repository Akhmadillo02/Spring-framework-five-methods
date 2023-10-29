package uz.online.springcontreller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/tub")
public class TubSon {
    @RequestMapping("/son/{son3}")
    public String hisoblash(@RequestParam("son1") int son1, @RequestParam("son2") int son2,
                            @PathVariable("son3") int son3){
        String s="";
        if (!check(son1)){
            s=son1+" -> tub son\n";
        }else s=son1+" -> tub son emas\n";
        if (!check(son2)){
            s+=son2+" -> tub son\n";
        }else s+=son2+" -> tub son emas\n";
        if (!check(son3)){
            s+=son3+" -> tub son\n";
        }else s+=son3+" -> tub son emas\n";
        return s;
    }
    private boolean check(int num){
        for (int i = 2; i < num; i++) {
            if (num%i==0){
                return true;
            }
        }
        return false;
    }
}
