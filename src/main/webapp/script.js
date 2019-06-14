var t;
let x;

function getAll(){
   fetchData("GET", "/destination/",null).then((req)=>{
           t = req.responseText;
           sessionStorage.clear();
           sessionStorage.setItem("userData",t);

})};

function getAllU(){
    fetchData("GET", "/user/",null).then((req)=>{
            t = req.responseText;
            sessionStorage.clear();
            sessionStorage.setItem("userData",t);
 
 })};

    function getOne(){
        var text = document.getElementById("user").value;
        fetchData("GET", "/destination/" + text,null).then((req)=>{
         t = req.responseText;
         sessionStorage.clear();
         sessionStorage.setItem("userData",t);
         
       
     })};

   function showList() {
      document.getElementById("table").innerHTML="";
      let t = sessionStorage.getItem("userData");
      let userData = JSON.parse(t);
      console.log(userData);
      if(userData.length > 1){
         userData == userData;
      }else{
         let x = [];
         x.push(userData);
         userData = x;
      }
      let tableOne = document.getElementById("table");
      let header = tableOne.createTHead();
      let rowOne = header.insertRow(0);
      let headNum = 0;
      for (let prop in userData[0]) {
          let cell = rowOne.insertCell(headNum);
          if (headNum === 0) {
              cell.innerHTML= "id";
          }else if (headNum === 1) {
              cell.innerHTML = "locId";
          } else if (headNum === 2) {
              cell.innerHTML = "city";
          } else if (headNum === 3) {
              cell.innerHTML = "country";
          } 
          headNum = headNum + 1;
      }
   
      let rowNumber = 1;
      for (let i = 0; i < userData.length; i++) {
          let rowBody = tableOne.insertRow(rowNumber);
          let elementNumber = 0;
          for (data in userData[i]) {
              let profiles = userData[i];
              let cell = rowBody.insertCell(elementNumber);
              if (elementNumber === 0) {
                  cell.innerHTML = profiles["id"];
              } else if (elementNumber === 1) {
                  cell.innerHTML = profiles["locId"];
              } else if (elementNumber === 2) {
                  cell.innerHTML = profiles["city"];
              } else if (elementNumber === 3) {
                  cell.innerHTML = profiles["country"];
              } 
              elementNumber = elementNumber + 1;
  
          }
          rowNumber++;
  
      }
  
  }