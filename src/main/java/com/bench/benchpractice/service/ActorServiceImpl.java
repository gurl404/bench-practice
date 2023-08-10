package com.bench.benchpractice.service;

import com.bench.benchpractice.model.Actor;
import com.bench.benchpractice.repo.ActorRepository;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ActorServiceImpl implements ActorService{
  @Autowired
  ActorRepository actorRespository;

  @Override
  public Actor getActorById(Long id){
    Optional<Actor> actor = actorRespository.findById(id);
    return actor.orElse(null);
  }
  @Override
  public List<Actor> getAllActors(){
    List<Actor> actors = new ArrayList<>();
    actorRespository.findAll().forEach(actors::add);
    return actors;
  }
  @Override
  public Actor saveActor(Actor actor){
    return actorRespository.save(actor);
  }

  @Override
  public String deleteActor(Long id){
    actorRespository.deleteById(id);
    return "id" + id + "is deleted successfully!";
  }

  @Override
  public Actor updateActor(Long id, Actor actor) {
    Optional<Actor> actorById = actorRespository.findById(id);

    if(actorById.isPresent()){
      Actor updatedActor = actorById.get();

      updatedActor.setId(actor.getId());
      updatedActor.setName(actor.getName());
      updatedActor.setEmail(actor.getEmail());
      updatedActor.setRoles(actor.getRoles());

      return actorRespository.save(updatedActor);
    }
    return null;
  }
}
