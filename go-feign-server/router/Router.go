package router

import (
	"github.com/gin-gonic/gin"
	"go-feign-server/controller"
	"go-feign-server/middlewares"
	"log"
)

// InitRouter 初始化路由
func InitRouter() {
	engine := gin.Default()
	engine.Use(middlewares.Cors())
	mappingRouter(engine)
	err := engine.Run("localhost:8088")
	if err != nil {
		log.Panic("服务启动失败", err.Error())
	}
}

func mappingRouter(engine *gin.Engine) {
	v1 := engine.Group("v1")
	{
		v1.GET("/getInfo", controller.GetInfo)
	}

}
