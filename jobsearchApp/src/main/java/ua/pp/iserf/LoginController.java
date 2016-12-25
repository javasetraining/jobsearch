package ua.pp.iserf;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import ua.pp.iserf.service.UserService;

import java.util.List;

@Controller
@RequestMapping("/login")
public class LoginController {

//    @RequestMapping(method = RequestMethod.GET)
//    public String index() {
//        return "login";
//    }
//

    @Autowired
    UserService userService;

    @RequestMapping( method = RequestMethod.GET)
    public ModelAndView userLogin(ModelMap modelMap) {


        List userList = userService.findAll();
        modelMap.addAttribute("title", "View users");
        modelMap.addAttribute("userList", userList);

        return new ModelAndView("login");
    }



}
