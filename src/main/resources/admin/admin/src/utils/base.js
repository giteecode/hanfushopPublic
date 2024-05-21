const base = {
    get() {
                return {
            url : "http://localhost:8080/hanfushop/",
            name: "hanfushop",
            // 退出到首页链接
            indexUrl: 'http://localhost:8080/hanfushop/front/index.html'
        };
            },
    getProjectName(){
        return {
            projectName: "汉服文化平台网站"
        } 
    }
}
export default base
