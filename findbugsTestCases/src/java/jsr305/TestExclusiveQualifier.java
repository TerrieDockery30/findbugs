package jsr305;

import edu.umd.cs.findbugs.annotations.ExpectWarning;
import javax.annotation.meta.When;

public class TestExclusiveQualifier {
	@ExclusiveQualifier(value=ExclusiveQualifier.Color.RED, when=When.ALWAYS) Object redField;
	
	@ExpectWarning("TQ")
	public void report1(@ExclusiveQualifier(value=ExclusiveQualifier.Color.BLUE, when=When.ALWAYS) Object v) {
		// always BLUE should imply never RED
		redField = v;
	}
}