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
        sessionStorage.clear();
        sessionStorage.setItem("userLogin",user);
        getSessionInfo();
        })};

function getSessionInfo(){

    let t = sessionStorage.getItem("userLogin");
    let userData = JSON.parse(t);
    if(userData.length > 1){
        userData == userData;
     }else{
        let x = [];
        x.push(userData);
        userData = x;
     }
     console.log(x);

}
