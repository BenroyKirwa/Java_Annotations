# Java_Annotations

## Create an annotation called Description, whose Retention is Runtime and Target is Field. The annotation should have a property called String info. 
## Using Task 23 above, annotate some of the ﬁelds of the class Employee and include any info describing the ﬁeld, and leave others without the annotation.
## Using reﬂection, get the ﬁelds which are annotated and print out the info they contain.


## Create an annota on ImportantMethod to mark cri cal methods in a class called PaymentProcessor. 
## Create any ﬁve methods in this class, and annotate three of them. 
## Using reﬂection, get only the critical methods and execute them.


## Create an annotation called EntityInfo, which can annotate a class or a ﬁeld. 
## Create an enum called DataType which has the following enums: VARCHAR, INT, TEXT,BIGINT
## Create another enum called EntityType, which has the following enums: TABLE, COLUMNThe EntityInfo annotation needs to have the following properties:
```
- String label
- EntityType entiyType
- DataType dataType.
```


## Create 3 classes that represent any database tables from the DB tasks you did and give them properties and methods. Annotate the class and the ﬁelds with the EntityInfo annotation, setting the appropriate properties for the annotation e.g. class is type TABLE and ﬁelds are type COLUMN. Using reﬂection, display the classes annotated and their ﬁelds.
