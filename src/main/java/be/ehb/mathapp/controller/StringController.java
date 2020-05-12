package be.ehb.mathapp.controller;

import be.ehb.mathapp.utilities.StringUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class StringController {

    @RequestMapping(value = "/palindrome", method = RequestMethod.GET)
    @ResponseBody
    public boolean palindrome(@RequestParam(value = "original") String original) {
        return StringUtils.isPalindrome(original);
    }

}
