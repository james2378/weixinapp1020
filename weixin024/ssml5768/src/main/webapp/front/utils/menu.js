const menu = {
    list() {
        return [{"backMenu":[{"child":[{"buttons":["新增","查看","修改","删除"],"menu":"用户","menuJump":"列表","tableName":"yonghu"}],"menu":"用户管理"},{"child":[{"buttons":["新增","查看","修改","删除","查看评论"],"menu":"门店信息","menuJump":"列表","tableName":"mendianxinxi"}],"menu":"门店信息管理"},{"child":[{"buttons":["新增","查看","修改","删除"],"menu":"员工信息","menuJump":"列表","tableName":"yuangongxinxi"}],"menu":"员工信息管理"},{"child":[{"buttons":["新增","查看","修改","删除","查看评论"],"menu":"配件信息","menuJump":"列表","tableName":"peijianxinxi"}],"menu":"配件信息管理"},{"child":[{"buttons":["新增","查看","修改","删除","查看评论"],"menu":"保养信息","menuJump":"列表","tableName":"baoyangxinxi"}],"menu":"保养信息管理"},{"child":[{"buttons":["新增","查看","修改","删除"],"menu":"管理员","tableName":"users"}],"menu":"管理员管理"},{"child":[{"buttons":["新增","查看","修改","删除"],"menu":"我的收藏管理","tableName":"storeup"}],"menu":"我的收藏管理"},{"child":[{"buttons":["新增","查看","修改","删除"],"menu":"轮播图管理","tableName":"config"}],"menu":"系统管理"},{"child":[{"buttons":["查看"],"menu":"已发货订单","tableName":"orders/已发货"},{"buttons":["查看"],"menu":"未支付订单","tableName":"orders/未支付"},{"buttons":["查看"],"menu":"已取消订单","tableName":"orders/已取消"},{"buttons":["查看","发货"],"menu":"已支付订单","tableName":"orders/已支付"},{"buttons":["查看"],"menu":"已退款订单","tableName":"orders/已退款"},{"buttons":["查看"],"menu":"已完成订单","tableName":"orders/已完成"}],"menu":"订单管理"}],"frontMenu":[{"child":[{"buttons":["查看","查看评论"],"menu":"门店信息列表","menuJump":"列表","tableName":"mendianxinxi"}],"menu":"门店信息模块"},{"child":[{"buttons":["查看","查看评论"],"menu":"配件信息列表","menuJump":"列表","tableName":"peijianxinxi"}],"menu":"配件信息模块"},{"child":[{"buttons":["查看评论","查看"],"menu":"保养信息列表","menuJump":"列表","tableName":"baoyangxinxi"}],"menu":"保养信息模块"}],"hasBackLogin":"是","hasBackRegister":"否","hasFrontLogin":"否","hasFrontRegister":"否","roleName":"管理员","tableName":"users"},{"backMenu":[{"child":[{"buttons":["查看"],"menu":"我的收藏管理","tableName":"storeup"}],"menu":"我的收藏管理"},{"child":[{"buttons":["确认收货","查看"],"menu":"已发货订单","tableName":"orders/已发货"}],"menu":"订单管理"}],"frontMenu":[{"child":[{"buttons":["查看","查看评论"],"menu":"门店信息列表","menuJump":"列表","tableName":"mendianxinxi"}],"menu":"门店信息模块"},{"child":[{"buttons":["查看","查看评论"],"menu":"配件信息列表","menuJump":"列表","tableName":"peijianxinxi"}],"menu":"配件信息模块"},{"child":[{"buttons":["查看评论","查看"],"menu":"保养信息列表","menuJump":"列表","tableName":"baoyangxinxi"}],"menu":"保养信息模块"}],"hasBackLogin":"是","hasBackRegister":"是","hasFrontLogin":"是","hasFrontRegister":"是","roleName":"用户","tableName":"yonghu"}]
    }
}
export default menu;
