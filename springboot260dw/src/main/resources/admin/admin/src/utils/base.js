const base = {
    get() {
        return {
            url : "http://localhost:8080/springboot260dw/",
            name: "springboot260dw",
            // 退出到首页链接
            indexUrl: 'http://localhost:8080/springboot260dw/front/dist/index.html'
        };
    },
    getProjectName(){
        return {
            projectName: "基于springboot的乡村政务办公系统的设计与实现"
        } 
    }
}
export default base
