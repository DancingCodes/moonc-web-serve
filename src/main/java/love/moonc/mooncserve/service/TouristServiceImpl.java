package love.moonc.mooncserve.service;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import love.moonc.mooncserve.entity.Tourist;
import love.moonc.mooncserve.mapper.TouristMapper;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;


@Service
public class TouristServiceImpl extends ServiceImpl<TouristMapper, Tourist> implements ITouristService {
    // 新增
    @Override
    public Boolean addTourist(String ip) {
        // 获取当前时间
        LocalDateTime currentTime = LocalDateTime.now();
        return this.save(new Tourist(ip, currentTime));
    }
}
