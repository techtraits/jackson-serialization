

import org.codehaus.jackson.map.ObjectMapper;
import java.util.Arrays;

public class Driver {
	public static void main(String[] args) {
	
		try {
			ObjectMapper oMapper = new ObjectMapper();
		
			Child1 child1 = new Child1();
			child1.SerializeMe = 10;
			child1.dontSerializeMe = 12;
			Child2 child2 = new Child2();
			
			child2.SerializeMe = Arrays.asList("1","2","3");
		
			String outputChild1 = oMapper.writeValueAsString(child1);
			String outputChild2 = oMapper.writeValueAsString(child2);
		
			System.out.println(outputChild1);
			System.out.println(outputChild2);
		
			ParentClass inputChild1 = oMapper.readValue(outputChild1, ParentClass.class);
			ParentClass inputChild2 = oMapper.readValue(outputChild2, ParentClass.class);
		
			System.out.println(inputChild1.getClass().toString());
			System.out.println(inputChild2.getClass().toString());
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

}
