let dest = {
    id : 0,
    locId : 0,
    city : " ",
    country : " "
}


function fetchData(type,ext,sen) {

    return new Promise((resolve, reject)=>{

            const req = new XMLHttpRequest();
                    
        req.onreadystatechange = () =>{
            if (req.readyState === 4) {
                if (req.status === 200) {
                    resolve(req);
                    console.log("connected");
                } else {
                    reject("Failed");
                }
            }

        };
            
        req.open(type, "http://localhost:8080/holPlanner-1.0/api" + ext);
        req.setRequestHeader("Content-Type","application/json");
        req.send(sen);
        
    })


}

function addDest(){

    submit();
    let s = JSON.stringify(dest);
   fetchData("POST","/destination",s).then((req)=>{ 
console.log(req.responseText);
})};

function submit(){
   dest.city = document.getElementById("city").value;
    dest.country= document.getElementById("country").value;
}