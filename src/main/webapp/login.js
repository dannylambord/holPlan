let user = {
    id: 0,
    uName: "",
    pass:  ""
}


function login(){
    fetchData("GET","/user/1",null).then((req)=> {
        t = req .responseText;
        console.log(t);
        sessionStorage.clear();
        sessionStorage.setItem("userLogin",user);
        //getSessionInfo();
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
