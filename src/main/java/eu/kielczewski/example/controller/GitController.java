package eu.kielczewski.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import pl.project13.maven.git.GitRepositoryState;

@Controller
public class GitController{

    @Autowired
    GitRepositoryState repositoryState;


    @RequestMapping(value = "/git", method = RequestMethod.GET)
    @ResponseBody
    public String getGit() {
        return repositoryState.getBranch();
    }
}
