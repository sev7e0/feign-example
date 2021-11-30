package com.xiaoli.feignclient.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author LiJiaQi
 * Date: 2021/11/29 11:45 上午
 * Description:
 */
@FeignClient(value = "go-server", url = "localhost:8088/v1")
public interface GoFeignServer {

	/**
	 * 调用接口
	 * @return string
	 */
	@GetMapping(value = "/getInfo")
	String getInfo();
}
