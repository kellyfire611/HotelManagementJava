package ejb;

import ejb.Rooms;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-12-17T00:01:25")
@StaticMetamodel(Roomstatus.class)
public class Roomstatus_ { 

    public static volatile CollectionAttribute<Roomstatus, Rooms> roomsCollection;
    public static volatile SingularAttribute<Roomstatus, Integer> statusId;
    public static volatile SingularAttribute<Roomstatus, String> status;

}