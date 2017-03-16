package com.server;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

/**
 * Created by wojteczko on 3/16/2017.
 */
@RestController
@RequestMapping("/rest")
public class MainController {

    @RequestMapping(method = GET)
    public String test() {
        return "Kikunia";
    }
}
