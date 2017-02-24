package com.vequitable.web.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.logging.Level;
import java.util.logging.Logger;

@Controller
public class StoreController {

    private static final Logger LOG = Logger.getLogger(StoreController.class.getName());
    private static final String HOME_PAGE = "home";

    @RequestMapping(value = {"/","/home"}, method = RequestMethod.GET)
    public String setContent(HttpServletRequest req, HttpServletResponse resp) {

        LOG.log(Level.INFO, "/home GET request received");

        return HOME_PAGE;
    }
}
