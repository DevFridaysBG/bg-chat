package bg.chat.app;

import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;
import org.springframework.web.util.HtmlUtils;

@Controller
public class ChatController {

    @MessageMapping("/hello")
    @SendTo("/topic/greetings")
    public Response greeting(Request message) throws Exception {
        String messageFormat = "%s: %s";
        return new Response(String.format(messageFormat, HtmlUtils.htmlEscape(message.getName()), message.getMessage()));
    }
}
