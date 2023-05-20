package lin.japanese.controller;

import lin.japanese.dto.ResponseWrapper;

public class BaseController {
	protected ResponseWrapper defaultOk() {
		ResponseWrapper wrapper = new ResponseWrapper();
		wrapper.setMessage("ok");
		return wrapper;
	}

	protected ResponseWrapper defaultOkWithResBody(Object resBody) {
		ResponseWrapper wrapper = new ResponseWrapper();
		wrapper.setMessage("ok");
		wrapper.setResBody(resBody);
		return wrapper;
	}
}
