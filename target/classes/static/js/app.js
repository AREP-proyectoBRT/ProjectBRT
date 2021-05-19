app = (function () {

    function queryparams() {
        var queryString = decodeURIComponent(window.location.search);
        queryString = queryString.substring(1);
        var queries = queryString.split("&");
        return queries[0].substring(5,queries[0].length);
    }

    function getAllZone(){
        var promise = $.get({
            url: "/averageByZone",
            contentType: "application/json"
        });
        promise.then(function(data){
            controlViewOne.showPercentilByZone(JSON.parse(data));
        }, function(error) {
            console.log(22);
        });
    }

    function getStationsByZone(){
        zona = queryparams()
        var promise = $.get({
            url: "/stationsByZone?zone="+zona,
            contentType: "application/json"
        });
        promise.then(function(data){
            controlViewTwo.showStationByZone(JSON.parse(data));
        }, function(error) {
            console.log(22);
        });
    }

    function getStation(){
        station= queryparams()
        var promise = $.get({
            url: "/Station?station="+station,
            contentType: "application/json"
        });
        promise.then(function(data){
            controlViewThree.showStationInfo(JSON.parse(data));
        }, function(error) {
            console.log(22);
        });
    }

    function getActiveBuses(){
        var promise = $.get({
            url: "/activeBuses",
            contentType: "application/json"
        });
        promise.then(function(data){
            controlViewThree.busActive(data);
        }, function(error) {
            console.log(22);
        });
    }

    function getInactiveBuses(){
        var promise = $.get({
            url: "/inactiveBuses",
            contentType: "application/json"
        });
        promise.then(function(data){
            controlViewThree.busInactive(data);
        }, function(error) {
            console.log(22);
        });
    }

    function getBusesOnStation(station){
        var promise = $.get({
            url: "/busesOnStation"+station,
            contentType: "application/json"
        });
        promise.then(function(data){
            console.log(data);
        }, function(error) {
            console.log(22);
        });
    }

    return{

        getStation:getStation,
        getActiveBuses:getActiveBuses,
        getInactiveBuses:getInactiveBuses,
        getBusesOnStation:getBusesOnStation,
        getStationsByZone:getStationsByZone,
        getAllZone:getAllZone
    }
})();