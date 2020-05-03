package com.okta.developer.controller;

import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.oauth2.core.oidc.user.OidcUser;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping(value = "/api/", produces = MediaType.APPLICATION_JSON_VALUE)
@RestController
public class GreetingController {

    @GetMapping("/greeting")
    public String greet(@AuthenticationPrincipal OidcUser user) {
        return "Hello" + user.getEmail();
    }
}
