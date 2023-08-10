package com.bench.benchpractice.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.util.List;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table
@Getter
@Setter
public class Actor {
  @Column
  @Id
  private Long id;

  @Column
  private String name;

  @Column
  private String email;

  @Column
  private List<String> roles;
}
