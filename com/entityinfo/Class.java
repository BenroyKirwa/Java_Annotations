package com.entityinfo;

import java.util.Date;

@EntityInfo(label = "classes", entityType = EntityType.TABLE)
public class Class {

    @EntityInfo(label = "class id", entityType = EntityType.COLUMN, dataType = DataType.INT)
    int class_id;
    @EntityInfo(label = "class name", entityType = EntityType.COLUMN, dataType = DataType.VARCHAR)
    String class_name;
    @EntityInfo(label = "teacher id", entityType = EntityType.COLUMN, dataType = DataType.INT)
    int teacher_id;
    @EntityInfo(label = "date created", entityType = EntityType.COLUMN, dataType = DataType.Date)
    Date created_at;
    @EntityInfo(label = "date modified", entityType = EntityType.COLUMN, dataType = DataType.Date)
    Date modified_at;

}
