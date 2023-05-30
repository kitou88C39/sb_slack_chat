package slack_chat.app.controller;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @RequestMapping(path = "/hello", method = RequestMethod.GET)
    public String hello() {
        return "Hello, world!";
    }

}
