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
                if (req.status >= 200 && req.status <300) {
                    resolve(req);
                    console.log("connected"); 
                } else {
                    reject("Failed");
                }
            }

        };
            
    req.open(type, "35.246.36.67/holPlanner-1.0/api" + ext);
    req.setRequestHeader("Content-Type","application/json");
    if(type == "GET" || type == "DELETE"){
            req.send();
    }
    else{
        req.send(x);
    }

        
    })
}