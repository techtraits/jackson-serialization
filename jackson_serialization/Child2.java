import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.annotate.JsonTypeInfo;
import java.util.List;

@JsonTypeInfo(use=JsonTypeInfo.Id.NAME, include=JsonTypeInfo.As.PROPERTY, property="objectType")
public class Child2 extends ParentClass {
	
	@JsonProperty
	public List<String> SerializeMe;
	
	@JsonProperty
	public int getSerializeMeToo() {
		return 53;
	}
	
	@JsonProperty
	public void setSerializeMeToo(int value) {
		//Do nothing
	}


}