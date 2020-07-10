package world.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.INTERNAL_SERVER_ERROR, reason ="Invalid Country Code")
public class InvalidCountryCode extends RuntimeException {

}
