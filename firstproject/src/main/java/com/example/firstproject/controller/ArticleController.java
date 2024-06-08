package com.example.firstproject.controller;

import com.example.firstproject.dto.ArticleForm;
import com.example.firstproject.entity.Article;
import com.example.firstproject.repository.ArticleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ArticleController {
    @Autowired // 스프링 부트가 미리 생성해 놓은 리파지터리 객체 주입 (DI, Dependency Injection)
    private ArticleRepository articleRepository;

    @GetMapping("/articles/new")
    public String newArticleForm() {
        return "articles/new";
    }

    @PostMapping("/articles/create")
    public String createArticle(ArticleForm form) { // form data를 DTO로 받기
        System.out.println("form.toString()" + form.toString()); // DTO에 폼 데이터가 잘 담겼는지 확인
        // 1. DTO를 Entity로 변환
        Article article = form.toEntity();
        System.out.println("article.toString()" + article.toString());
        // 2. Repository로 Entity를 DB에 저장
        Article saved = articleRepository.save(article);
        System.out.println("saved.toString()" + saved.toString());

        return "";
    }
}