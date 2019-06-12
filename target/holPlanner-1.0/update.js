function update(){
    dest.city = document.getElementById("city");
    dest.country = document.getElementById("country");
    let y = JSON.stringify(dest);
   fetchData("PUT","/destination/" + dest.locId, y).then((req)=>{
    console.log(req.responseText);
})};