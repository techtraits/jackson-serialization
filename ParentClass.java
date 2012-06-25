import org.codehaus.jackson.annotate.JsonSubTypes;
import org.codehaus.jackson.annotate.JsonTypeInfo;

@JsonTypeInfo(use=JsonTypeInfo.Id.NAME, include=JsonTypeInfo.As.PROPERTY, property="objectType")
@JsonSubTypes({
        @JsonSubTypes.Type(value=Child1.class),
        @JsonSubTypes.Type(value=Child2.class)
})
public class ParentClass {


}