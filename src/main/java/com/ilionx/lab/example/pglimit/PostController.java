package com.ilionx.lab.example.pglimit;

import java.util.List;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PostController {

  private final PostRepository postRepository;

  public PostController(PostRepository postRepository) {
    this.postRepository = postRepository;
  }

  @GetMapping("/posts")
  public ResponseEntity<List<Post>> getPost() {
    PageRequest pageable = PageRequest.of(1, 3);
    Page<Post> page = postRepository.findAll(pageable);
    return ResponseEntity.ok(page.getContent());
  }
}
