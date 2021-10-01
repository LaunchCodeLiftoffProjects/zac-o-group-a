//<script th:inline="javascript">
    //ar locations = [[${locations}]];
    function initMap() {
      //const infowindow = new google.maps.InfoWindow();
      map = new google.maps.Map(document.getElementById("map"), {
        mapId: "545a8287abd16813",
        center: { lat: 42, lng: -70 },
        zoom: 8,
      });

//     addMarker(locations);
//     function addMarker(locations){
//         for (let i = 0; i < locations.length; i++) {
//             var marker = Array(locations.length);
//             marker[i] = new google.maps.Marker({
//             position: {lat: parseFloat(locations[i].latitude), lng: parseFloat(locations[i].longitude)},
//             map: map,
//             content: `<h2>Name: ${locations[i].name}</h2>  <h4>${locations[i].description}</h4>`
//         })

//         // var infowindow = Array(locations.length)
//         // var infowindow = new google.maps.InfoWindow({
//         //     content: marker[i].content,
//         //     maxWidth: 160
//         //     position: {lat: parseFloat(locations[i].latitude), lng: parseFloat(locations[i].longitude)}
//         // })
//         console.log(typeof(marker[i].content))

//         marker[i].addListener("click", function(){
//             infowindow.close();
//             infowindow.setContent(`<h2>Name: ${locations[i].name}</h2>  <h4>${locations[i].description}</h4>`);
//             infowindow.setPosition({lat: parseFloat(locations[i].latitude), lng: parseFloat(locations[i].longitude)});
//             infowindow.open(map, marker[i]);
//         });

//         }

//     }
}
