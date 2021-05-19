controlViewOne = (function () {

    function showPercentilByZone(data){

        $('#zonaA').append("<span>"+data.Zone.A+"%</span>")
        $("#zonaB").append("<span>"+data.Zone.B+"%</span>")
        $("#zonaC").append("<span>"+data.Zone.C+"%</span>")
        $("#zonaD").append("<span>"+data.Zone.D+"%</span>")
        $("#zonaE").append("<span>"+data.Zone.E+"%</span>")
        $("#zonaF").append("<span>"+data.Zone.F+"%</span>")
        $("#zonaG").append("<span>"+data.Zone.G+"%</span>")
        $("#zonaH").append("<span>"+data.Zone.H+"%</span>")
        $("#zonaI").append("<span>"+data.Zone.I+"%</span>")
    }

    return{
        showPercentilByZone:showPercentilByZone
    }
})();