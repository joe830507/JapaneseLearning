package lin.japanese.dto;

import lombok.Data;

@Data
public class ResponseWrapper {
	private String message;
	private Object resBody;
}
