package lin.japanese.controller;

import java.util.HashMap;
import java.util.Map;

public class BaseController {
	protected Map<String, Object> defaultOk() {
		Map<String, Object> resultMap = new HashMap<>();
		resultMap.put("message", "Ok");
		resultMap.put("resBody", null);
		return resultMap;
	}
}
