package ua.pp.iserf;

import javax.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ParserSettingController {

    @RequestMapping(value = "/parsersetting", method = RequestMethod.GET)
    public ModelAndView index(ModelMap modelMap, HttpServletRequest request) {


        return new ModelAndView("parsersetting");
    }
}
