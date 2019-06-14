function login(){
 
    let uName = document.getElementById("uName");
    let pass = document.getElementById("pass");
    fetchData("GET","/user/1",null).then((req)=> {
        t = req .responseText;
        sessionStorage.clear();
        sessionStorage.setItem("userLogin",t);
    })};
