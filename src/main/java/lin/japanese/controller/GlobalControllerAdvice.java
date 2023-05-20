package lin.japanese.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import javax.validation.ConstraintViolationException;

import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import lombok.extern.apachecommons.CommonsLog;

@RestControllerAdvice
@CommonsLog
public class GlobalControllerAdvice {
	@ExceptionHandler(value = { ConstraintViolationException.class, MethodArgumentNotValidException.class })
	public ResponseEntity<Object> bindingResult(BindingResult bindingResult) {
		Map<String, Object> resultMap = new HashMap<>();
		if (bindingResult.hasErrors()) {
			List<String> errors = bindingResult.getAllErrors().stream().map(item -> item.getDefaultMessage())
					.collect(Collectors.toList());
			resultMap.put("message", "error");
			resultMap.put("resBody", errors);
		}
		return ResponseEntity.badRequest().body(resultMap);
	}

	@ExceptionHandler(value = Exception.class)
	public ResponseEntity<Object> unknown(Exception ex) {
		log.error("Unknown errors:", ex);
		Map<String, Object> resultMap = new HashMap<>();
		resultMap.put("message", "error");
		resultMap.put("resBody", "Unknown errors occur. Please contact the customer service.");
		return ResponseEntity.badRequest().body(resultMap);
	}
}
