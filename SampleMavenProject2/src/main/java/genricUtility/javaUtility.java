package genricUtility;

import java.time.LocalDateTime;

public class javaUtility {
	public String getSystemTime() {
		return LocalDateTime.now().toString().replace(":", "-");
	}
}
