package com.virtualbook.controller;

/*import com.virtualbook.model.User;
import com.virtualbook.service.UserService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/auth")
@RequiredArgsConstructor
public class AuthController {
    private final UserService userService;

    @GetMapping("/login")
    public String login() {
        return "auth/login";
    }

    @GetMapping("/register")
    public String registerForm(Model model) {
        model.addAttribute("user", new User());
        return "auth/register";
    }

    @PostMapping("/register")
    public String register(@Valid @ModelAttribute User user,
                           BindingResult result, Model model) {
        if (result.hasErrors()) {
            return "auth/register";
        }

        if (userService.userExists(user.getUsername(), user.getEmail())) {
            model.addAttribute("error", "Usuario o email ya existen");
            return "auth/register";
        }

        userService.registerUser(user);
        return "redirect:/auth/login?success";
    }
}*/