package com.ilionx.lab.example.pglimit;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
public class Post {

  @Id
  @JsonProperty
  private String id;

  @JsonProperty
  private String title;
}
