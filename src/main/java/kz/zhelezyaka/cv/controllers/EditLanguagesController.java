package kz.zhelezyaka.cv.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class EditLanguagesController {

    @RequestMapping(value = "/edit/languages", method = RequestMethod.GET)
    public String getEditLanguages(){
        return "editLanguages";
    }
}
