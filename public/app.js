console.log("app.js load");

async function getname(places){
    const response = await fetch(`/app/${places}`);
    const data = await response.json();
    // console.log(data.location.name);
    return data;

}

document.querySelector("#weather").addEventListener('click', () =>{
    const place = document.getElementById("inputPassword2").value;
    var dataget = getname(place);
    //display card
    document.querySelector(".card").classList.remove('d-none');
    // console.log(dataget);

    dataget.then(function(result){
        //console.log(result);
        document.getElementById('title').innerHTML = result.location.name;
        document.getElementById('text').innerHTML = result.location.region+", "+result.location.country;
        document.getElementById('t1').innerHTML = "Date & Time: "+result.current.last_updated;
        document.getElementById('t2').innerHTML = "Temp: "+result.current.temp_c+"C"+", "+result.current.condition.text;
        document.getElementById('t3').innerHTML = "Wind: "+result.current.wind_kph;
    });
})

