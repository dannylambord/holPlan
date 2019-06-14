function login(){

    let uName = document.getElementById(uName);
    let pass = document.getElementById(pass);
    fetchData("GET","user/",null).then((req)=> {
        t = req .responseText;
        sessionStorage.clear();
        sessionStorage.setItem("userLogin",t);
    })};
