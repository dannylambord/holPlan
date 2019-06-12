    function getAll(){
       fetchData("GET", "/destination/",null).then((req)=>{
    console.log(req.responseText);
      
    })};

    function getOne(){
        var text = document.getElementById("user").value;
        fetchData("GET", "/destination/" + text,null).then((req)=>{
     console.log(req.responseText);
       
     })};