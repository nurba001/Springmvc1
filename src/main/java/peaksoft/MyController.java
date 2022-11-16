package peaksoft;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller

public class MyController{

    @GetMapping("/home")
    public String getIndext(@RequestParam(value="name",required=false)String name,
                            @RequestParam(value = "surname",required=false) String surname,
                            Model model){

//        System.out.println("Hello  " + name +" " + surname);
        model.addAttribute("key","Hello  " + name +" " + surname);
        return "home";
    }
    @GetMapping("/indext")
    public String culk(@RequestParam("a") int a,
                       @RequestParam("b") int b,
                       Model model){
        double result=a+b;
        model.addAttribute("result"+result);
return "/indext";
    }
}
