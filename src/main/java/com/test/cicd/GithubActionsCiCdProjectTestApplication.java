package com.test.cicd;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class GithubActionsCiCdProjectTestApplication {

//    echo "# Github-Actions-exampl" >> README.md
//    git init
//    git add README.md
//    git commit -m "first commit"
//    git branch -M main
//    git remote add origin https://github.com/AbetiouSN/Github-Actions-exampl.git
//    git push -u origin main

    public static void main(String[] args) {
        SpringApplication.run(GithubActionsCiCdProjectTestApplication.class, args);
    }

    @GetMapping("/welcome")
    public  String welcome(){
        return "Welcome to my CI/CD Project ";
    }

}
