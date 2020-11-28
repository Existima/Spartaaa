package com.freetimers.spartacus.repository;

import com.freetimers.spartacus.gamebox.EquipmentCard;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EquipmentCardsRepo extends MongoRepository<EquipmentCard, String> {
}