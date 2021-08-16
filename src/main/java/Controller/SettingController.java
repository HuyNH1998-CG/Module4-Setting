package Controller;

import Model.Setting;
import Service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class SettingController {
    UserService service = new UserService();
    @GetMapping("/home")
    public ModelAndView home(){
        Setting setting = service.setting;
        ModelAndView modelAndView =new ModelAndView("/index");
        modelAndView.addObject("setting",setting);
        return modelAndView;
    }
    @PostMapping("/save")
    public ModelAndView save(@ModelAttribute("setting")Setting setting){
        service.saveSetting(setting);
        return new ModelAndView("redirect:/home");
    }
}
