package love.moonc.mooncserve.service;

import com.baomidou.mybatisplus.extension.service.IService;
import love.moonc.mooncserve.entity.Tourist;

public interface ITouristService extends IService<Tourist> {
    // 新增
    Boolean addTourist(String ip);
}
