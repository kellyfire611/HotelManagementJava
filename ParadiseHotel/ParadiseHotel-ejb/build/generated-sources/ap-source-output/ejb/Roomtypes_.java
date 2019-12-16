package ejb;

import ejb.Rooms;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-12-17T00:01:25")
@StaticMetamodel(Roomtypes.class)
public class Roomtypes_ { 

    public static volatile CollectionAttribute<Roomtypes, Rooms> roomsCollection;
    public static volatile SingularAttribute<Roomtypes, String> roomdetails;
    public static volatile SingularAttribute<Roomtypes, Double> price;
    public static volatile SingularAttribute<Roomtypes, Integer> roomTypeId;
    public static volatile SingularAttribute<Roomtypes, String> roomtype;

}