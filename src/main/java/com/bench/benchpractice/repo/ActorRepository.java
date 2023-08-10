package com.bench.benchpractice.repo;

import com.bench.benchpractice.model.Actor;
import org.springframework.data.repository.CrudRepository;

public interface ActorRepository extends CrudRepository<Actor, Long> {
}
