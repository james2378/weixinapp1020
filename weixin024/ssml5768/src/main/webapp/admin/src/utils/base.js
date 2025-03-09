const base = {
    get() {
                return {
            url : "http://localhost:8080/ssml5768/",
            name: "ssml5768",
            // 退出到首页链接
            indexUrl: 'http://localhost:8080/ssml5768/front/index.html'
        };
            },
    getProjectName(){
        return {
            projectName: "汽车保养系统小程序"
        } 
    }
}
export default base
