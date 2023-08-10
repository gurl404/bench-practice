package com.bench.benchpractice.controller;

import java.util.List;

import com.bench.benchpractice.model.Actor;
import com.bench.benchpractice.service.ActorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ActorController {
  @Autowired
  ActorService actorService;

  @PostMapping("/actor")
  public Actor saveStudent(@RequestBody Actor actor) {
    return actorService.saveActor(actor);
  }

  @GetMapping("/actor/{id}")
  public Actor getActor(@PathVariable("id") Long id) {
    return actorService.getActorById(id);
  }

  @GetMapping("/actor")
  public List<Actor> getAllActors(){
    return actorService.getAllActors();
  }

  @PutMapping("/actor/{id}")
  public Actor updateActor(@PathVariable("id") Long id, @RequestBody Actor actor){
    return actorService.updateActor(id, actor);
  }

  @DeleteMapping("actor/{id}")
  public String deleteActor(@PathVariable("id") Long id){
    return actorService.deleteActor(id);
  }

}
