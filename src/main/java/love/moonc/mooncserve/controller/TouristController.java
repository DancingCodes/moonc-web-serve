package love.moonc.mooncserve.controller;

import jakarta.servlet.http.HttpServletRequest;
import love.moonc.mooncserve.service.TouristServiceImpl;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TouristController {
    public TouristServiceImpl touristService;

    public TouristController(TouristServiceImpl touristService) {
        this.touristService = touristService;
    }


    // 游客访问
    @GetMapping("/touristAccess")
    public boolean touristAccess(HttpServletRequest request) {
        // 线上
        if (request.getHeader("X-Real-IP") == null) {
            return touristService.addTourist(request.getRemoteAddr());
        }else {
            // 本地
            return touristService.addTourist(request.getHeader("X-Real-IP"));
        }
    }
}
