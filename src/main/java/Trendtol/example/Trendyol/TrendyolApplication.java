package Trendtol.example.Trendyol;

import Trendtol.example.Trendyol.core.utilities.exceptions.BusinessException;
import Trendtol.example.Trendyol.core.utilities.exceptions.ProblemDetails;
import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@SpringBootApplication
@RestControllerAdvice
public class TrendyolApplication {

	public static void main(String[] args) {
		SpringApplication.run(TrendyolApplication.class, args);
	}
	@ExceptionHandler
	@ResponseStatus(HttpStatus.BAD_REQUEST)
	public ProblemDetails handleBusinessException(BusinessException businessException){
		ProblemDetails problemDetails=new ProblemDetails();
		problemDetails.setMessage(businessException.getMessage());
		return problemDetails;
	}
	@Bean
	public ModelMapper getModelMapper(){
		return new ModelMapper();
	}
}
