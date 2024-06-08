package com.example.firstproject.controller;

import com.example.firstproject.dto.ArticleForm;
import com.example.firstproject.entity.Article;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ArticleController {

    @GetMapping("/articles/new")
    public String newArticleForm() {
        return "articles/new";
    }

    @PostMapping("/articles/create")
    public String createArticle(ArticleForm form) { // form data를 DTO로 받기
        System.out.println(form.toString()); // DTO에 폼 데이터가 잘 담겼는지 확인
        // 1. DTO를 Entity로 변환
        Article article = form.toEntity();
        // 2. Repository로 Entity를 DB에 저장

        return "";
    }
}
