package com.bench.benchpractice.service;

import com.bench.benchpractice.model.Actor;
import java.util.List;

public interface ActorService {

  List<Actor> getAllActors();
  Actor getActorById(Long id);
  Actor saveActor(Actor actor);

  String deleteActor(Long id);
  Actor updateActor(Long id, Actor actor);
//  Add get actor by role. Can later add demographic data to build out a talent-searching component

}
