package com.xiaoli.feignclient.controller;

import com.xiaoli.feignclient.client.GoFeignServer;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author LiJiaQi
 * Date: 2021/11/29 11:49 上午
 * Description:
 */
@RestController("/v2")
public class FeignClientController {

	@Resource
	private GoFeignServer goFeignServer;

	@GetMapping("/getInfo")
	public String getInfo(){
		return goFeignServer.getInfo();
	}

}
