package com.xmock.xmock.Entity;

import lombok.Getter;
import lombok.Setter;
import org.springframework.http.HttpStatus;

import java.util.Objects;

@Getter
@Setter
public class Response {
    String message;
    HttpStatus httpStatus;

    public Response() {
    }

    public Response(String message, HttpStatus httpStatus) {
        this.message = message;
        this.httpStatus = httpStatus;
    }

    @Override
    public String toString() {
        return "Response{" +
                "message='" + message + '\'' +
                ", httpStatus=" + httpStatus +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Response response)) return false;
        return Objects.equals(getMessage(), response.getMessage()) && getHttpStatus() == response.getHttpStatus();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getMessage(), getHttpStatus());
    }
}
