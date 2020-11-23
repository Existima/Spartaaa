package com.freetimers.spartacus.mongodb;

import com.freetimers.spartacus.gamebox.Equip;
import com.freetimers.spartacus.gamebox.EquipType;
import org.bson.Document;
import org.springframework.core.convert.converter.Converter;

public class EquipConverter implements Converter<Document, Equip> {

    private TranslationService translationService;

    public EquipConverter (TranslationService translationService){
        this.translationService = translationService;
    }

    public Equip convert(Document value){
        return new Equip(value.getObjectId("_id").toHexString(),
                value.getString("titleKey"),
                translationService.translate(value.getString("titleKey")),
                value.getString("descriptionKey"),
                translationService.translate(value.getString("descriptionKey")),
                value.getInteger("price"),
                EquipType.valueOf(value.getString("type")));
    }
}