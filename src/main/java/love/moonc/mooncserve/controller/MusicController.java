package love.moonc.mooncserve.controller;

import love.moonc.mooncserve.utils.Paging;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;


@RestController
public class MusicController {
    WebClient webClient = WebClient.create();
    @PostMapping("getMusicList")
    public String getMusicList(@RequestBody Paging paging) {
        return webClient.post()
                .uri("https://crawlingmusic.moonc.love/getMusicList")
                .contentType(MediaType.APPLICATION_JSON)
                .bodyValue(paging)
                .retrieve()
                .bodyToMono(String.class)
                .block();
    }

    @GetMapping("getMusicLyric")
    public Mono<ResponseEntity<byte[]>> getMusicLyric(@RequestParam String lyricUrl) {
        return webClient.get()
                .uri(lyricUrl)
                .retrieve()
                .bodyToMono(byte[].class)
                .map(fileBytes -> ResponseEntity.ok().body(fileBytes));
    }
}