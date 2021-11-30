package controller

import (
	"github.com/gin-gonic/gin"
	"net/http"
)

// GetInfo 获取信息接口
func GetInfo(c *gin.Context) {
	c.JSON(http.StatusOK, gin.H{
		"code": 1,
		"message": "success",
		"data": 1,
	})
}
