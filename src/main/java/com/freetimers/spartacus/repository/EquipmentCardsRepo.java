package com.freetimers.spartacus.repository;

import com.freetimers.spartacus.gamebox.EquipmentCard;
import com.freetimers.spartacus.gamebox.GladiatorCard;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface EquipmentCardsRepo extends MongoRepository<EquipmentCard, String> {
    Optional<EquipmentCard> findFirstByTitleKey(String titleKey);
}
