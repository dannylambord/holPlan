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
        user = t;
       // console.log(t);
        sessionStorage.clear();
        sessionStorage.setItem("userLogin",t);
        let y = sessionStorage.getItem(t);
        let data = JSON.parse(y);
        let x = [];
         x.push(data);
         
         console.log(x["id"]);
    })};