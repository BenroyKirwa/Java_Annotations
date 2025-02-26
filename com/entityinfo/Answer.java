package com.entityinfo;

import java.util.Date;

@EntityInfo(label = "answers", entityType = EntityType.TABLE)
public class Answer {

    @EntityInfo(label = "answer id", entityType = EntityType.COLUMN, dataType = DataType.INT)
    int answer_id;
    @EntityInfo(label = "selected option id", entityType = EntityType.COLUMN, dataType = DataType.INT)
    int selected_option_id;
    @EntityInfo(label = "pupil id", entityType = EntityType.COLUMN, dataType = DataType.INT)
    int pupil_id;
    @EntityInfo(label = "date created", entityType = EntityType.COLUMN, dataType = DataType.Date)
    Date created_at;
    @EntityInfo(label = "date modified", entityType = EntityType.COLUMN, dataType = DataType.Date)
    Date modified_at;
}
