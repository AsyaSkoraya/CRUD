package web.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import web.Service.UserService;

@Controller
public class UserController {

    private final UserService userService;

    public UserController(UserService userService){
        this.userService = userService;
    }


    @GetMapping("/list")
    //@GetMapping({"", "/", "/list"})
public String getUsers(Model model){
model.addAttribute("users",userService.getAllUser());
return "list";
    }
}
