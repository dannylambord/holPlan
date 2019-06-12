let dest = {
    id : 0,
    locId : 0,
    city : " ",
    country : " "
}


function fetchData(type,ext,sen) {
    let x = sen;

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
    req.send(x);
        
    })
}

function update(){
    dest.city = document.getElementById("city");
    dest.country = document.getElementById("country");
    let y = JSON.stringify(dest);
   fetchData("PUT","/destination/" + dest.locId, y).then((req)=>{
    console.log(req.responseText);
})};