package com.ilionx.lab.example.pglimit;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class ApplicationInitializer implements ApplicationRunner {

  private final PostRepository postRepository;

  public ApplicationInitializer(PostRepository postRepository) {
    this.postRepository = postRepository;
  }

  @Override
  public void run(ApplicationArguments args) {
    for (int postId = 0; postId < 10; ++postId) {
      Post post = Post.builder()
          .id("Post #" + postId)
          .title("Title #" + postId)
          .build();

      postRepository.save(post);
    }
  }
}
