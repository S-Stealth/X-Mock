package com.xmock.xmock.Controller;

import com.xmock.xmock.Constants.Constants;
import com.xmock.xmock.Entity.HealthStatus;
import com.xmock.xmock.Entity.Response;
import com.xmock.xmock.ObjectMapper.ObjectMapperToJSON;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/health")
public class HealthCheckController {

    @GetMapping
    public ResponseEntity<String> health() {
        HealthStatus healthStat = new HealthStatus();

        String responseString = ObjectMapperToJSON.toJSON(healthStat);
        if(responseString.equals("-1")) {
            return new ResponseEntity<>(
                    ObjectMapperToJSON.toJSON(new Response(Constants.INTERNAL_SERVER_ERROR,
                            HttpStatus.INTERNAL_SERVER_ERROR)),
                    HttpStatus.INTERNAL_SERVER_ERROR
            );
        } else {
            return new ResponseEntity<>(
                    responseString,
                    HttpStatus.OK
            );
        }
    }
}