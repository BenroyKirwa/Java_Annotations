package com.entityinfo;

import java.util.Date;

public class Subject {

//    @EntityInfo(label = "subject id", entityType = EntityType.COLUMN, dataType = DataType.INT)
    int subject_id;
    // @EntityInfo(label = "subject type", entityType = EntityType.COLUMN, dataType = DataType.VARCHAR)
    String subject_type;
    // @EntityInfo(label = "date created", entityType = EntityType.COLUMN, dataType = DataType.Date)
    Date created_at;
    // @EntityInfo(label = "date modified", entityType = EntityType.COLUMN, dataType = DataType.Date)
    Date modified_at;
}
