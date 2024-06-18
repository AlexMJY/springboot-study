package com.example.firstproject.dto;

import com.example.firstproject.entity.Comment;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class CommentDto {
    // CommentDto는 Comment（댓글 엔티티）를 담을 그릇. 따라서 Comment의 구조와 같이
    // id（댓글의 id）, articleld（댓글의 부모 id）, nickname（댓글 작성자）, body（댓글 본문）가 필요
    private Long id;
    private Long articleId;
    private String nickname;
    private String body;

    public static CommentDto createCommentDto(Comment comment) {
        return new CommentDto(comment.getId(), comment.getArticle().getId(), comment.getNickname(), comment.getBody());
    }
}
