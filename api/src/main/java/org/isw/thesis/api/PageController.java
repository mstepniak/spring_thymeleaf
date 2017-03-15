package org.isw.thesis.api;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Author MichalS.
 * Mail: michas1991@gmail.com
 */
@Controller
public class PageController {
    /**
     * @RequestMapping("/") public String greeting(@RequestParam(value="name", required=false, defaultValue="World") String name, Model model) {
     * model.addAttribute("name", name);
     * return "index";
     * }
     */
        @RequestMapping(value = "/", method = RequestMethod.GET)
        public String greetingForm(Model model) {
            model.addAttribute("index", new Index());
            return "index";
        }

        @RequestMapping(value = "/index", method = RequestMethod.POST)
        public String indexSubmit(@ModelAttribute Index index) {
            return "final";
        }
    }

