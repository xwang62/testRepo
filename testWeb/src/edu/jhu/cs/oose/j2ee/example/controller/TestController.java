package edu.jhu.cs.oose.j2ee.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import edu.jhu.cs.oose.j2ee.example.form.TestBean;
import edu.jhu.cs.oose.j2ee.example.service.GuessService;
import edu.jhu.cs.oose.j2ee.example.vo.Guess;

@Controller
@RequestMapping(value = "/welcome")
public class TestController {
    @Autowired
    private GuessService guessService;

    private TestBean testBean;

    public TestController() {
        this.testBean = new TestBean();
    }

    @RequestMapping(method = RequestMethod.GET)
    public ModelAndView get() {
        ModelAndView model = new ModelAndView("test");
        model.addObject(this.testBean);
        return model;
    }

    @RequestMapping(method = RequestMethod.POST)
    public ModelAndView post(@ModelAttribute("testBean") TestBean testBean) {
        if (this.guessService.guessName(testBean.getName())) {
        	//System.out.println("-------true");
            return new ModelAndView("correct");
        } else {
            ModelAndView model = new ModelAndView("test");
            //System.out.println("---------------name: "+testBean.getName());
            model.addObject(testBean);
            testBean.setWrong(true);
            List<Guess> guessList=this.guessService.showNames();
            for (Guess guess:guessList)
            {
            	System.out.println("==============");
            	System.out.println(guess.getName());
            }
            return model;
        }
    }
}
