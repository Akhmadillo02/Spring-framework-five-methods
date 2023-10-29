package uz.online.springcontreller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/max")
public class Max {
    @GetMapping("/son/{son4}/{son5}/{son6}")
    public String bar(@RequestParam("son1") double son1,
                      @RequestParam("son2") double son2,
                      @RequestParam("son3") double son3,
                      @PathVariable("son4") double son4,
                      @PathVariable("son5") double son5,
                      @PathVariable("son6") double son6){
       return "max number ->"+ Math.max(Math.max(Math.max(son1,son2),
               Math.max(son3,son4)),Math.max(son5,son6));
    }
}
