package com.xmock.xmock.Entity;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.Objects;
import java.util.UUID;

@Getter
@Setter
public class HealthStatus {
    private UUID healthcode;

    private LocalDateTime datetime;

    private String status;

    public HealthStatus() {
        this.healthcode = UUID.randomUUID();
        this.datetime = LocalDateTime.now();
        status = "OK";
    }

    public HealthStatus(UUID uuid, LocalDateTime datetime, String status) {
        this.healthcode = uuid;
        this.datetime = datetime;
        this.status = status;
    }

    @Override
    public String toString() {
        return "HealthStat{" +
                "uuid=" + healthcode +
                ", datetime=" + datetime +
                ", status='" + status + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof HealthStatus that)) return false;
        return Objects.equals(getHealthcode(), that.getHealthcode()) && Objects.equals(getDatetime(), that.getDatetime()) && Objects.equals(getStatus(), that.getStatus());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getHealthcode(), getDatetime(), getStatus());
    }
}
