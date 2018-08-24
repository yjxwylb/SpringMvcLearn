package com.learn.springmvc.controller;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.context.EnvironmentAware;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 * @Author: xyj
 * @Description:
 * @CreateTime: 2018/8/8 10:38
 * @Version:
 */
@Controller
public class DemoControlelr implements EnvironmentAware {

    private final Log logger = LogFactory.getLog(DemoControlelr.class);
    private Environment environment;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public ModelAndView index() {
        logger.info("===========process by index===========");
        User user = new User("张三", 19);
        ModelAndView model = new ModelAndView("demo");
        model.addObject("msg", user.toString());
        return model;
    }

    @RequestMapping(value = "/demo", method = RequestMethod.GET)
    public String demo(Model model) {
        logger.info("===========process by index===========");
        model.addAttribute("msg", "今天天气不错！");
        System.out.println(environment);
        return "demo";
    }

    @Override
    public void setEnvironment(Environment environment) {
        this.environment = environment;
    }
}
