package love.moonc.mooncserve.entity;

import lombok.AllArgsConstructor;

import java.time.LocalDateTime;


@AllArgsConstructor
public class Tourist {
    private String ip;
    private LocalDateTime time;
}