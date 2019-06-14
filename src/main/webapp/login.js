let user = {
    id: 0,
    uName: "",
    pass:  ""
}


function login(){
 
    let uName = document.getElementById("uName");
    let pass = document.getElementById("pass");
    fetchData("GET","/user/1",null).then((req)=> {
        t = req .responseText;
        user = JSON.parse(t);
        sessionStorage.clear();
        sessionStorage.setItem("userLogin",user);
        })};
