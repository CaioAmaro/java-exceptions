package adopet.api.expection;

import org.springframework.http.HttpStatus;

import java.time.LocalDateTime;

public record ResponseError(String message, HttpStatus httpStatus, LocalDateTime time) {
}
