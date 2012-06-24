import org.codehaus.jackson.annotate.JsonTypeInfo;
import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.annotate.JsonIgnore;

@JsonTypeInfo(use=JsonTypeInfo.Id.NAME, include=JsonTypeInfo.As.PROPERTY, property="objectType")
public class Child1 extends ParentClass {
	
	@JsonProperty
	public int SerializeMe;
	
	@JsonIgnore
	public int dontSerializeMe;

}