package slack_chat.app.controller;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/hello")
    // ↓引数を追加
    public Hello hello(@RequestParam("name") Optional<String> name) {
        // ↓引数未指定時は「world!」とする。
        String resName = name.orElse("world!");
        // ↓引数の値または「world!」を
        return new Hello("Hello, " + resName);

    }
}
