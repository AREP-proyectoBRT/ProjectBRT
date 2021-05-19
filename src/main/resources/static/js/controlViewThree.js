controlViewThree = (function () {

    function showStationInfo(data){
        $("#maxCap").append("<span>  "+data.maxCapacity+"</span>")
        $("#peopleInside").append("<span>  "+data.peopleInside+"</span>")
        app.getActiveBuses()
    }

    function busActive(data) {
        $("#busActive").append("<span> "+data+"%</span>");
        app.getInactiveBuses()
    }

    function busInactive(data) {
        $("#busInactive").append("<span> "+data+"%</span>");
    }

    return{
        showStationInfo:showStationInfo,
        busActive:busActive,
        busInactive:busInactive
    }
})();