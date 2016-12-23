package ua.pp.iserf;

import javax.servlet.http.HttpServletRequest;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

    @RequestMapping(value = "/userhome", method = RequestMethod.GET)
    public ModelAndView index(ModelMap modelMap, HttpServletRequest request) {

        User user = (User) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        String username = user.getUsername(); //get logged in username


        modelMap.addAttribute("title", "User home ");
        modelMap.addAttribute("username", username);

        return new ModelAndView("home");
    }
}
