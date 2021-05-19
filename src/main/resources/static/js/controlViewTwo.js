controlViewTwo = (function () {

    header="<div class=\"row\">\n" +
        "                <div class=\"col-md-6\">\n" +
        "                    <div class=\"written_text\">\n" +
        "                        <div class=\"like_icon\"><img src=\"images/design-icon.png\"></div>\n" +
        "                        <h1 class=\"written_text\">"
    body="</h1>\n" +
        "                        <div class=\"btn_main2\">\n" +
        "                            <button type=\"button\" class=\"btn btn-dark btn-lg\"><a href='"
    body2="'>Detalle estación</a></button>\n" +
        "                        </div>\n" +
        "\n" +
        "                    </div>\n" +
        "                </div>\n" +
        "                <div class=\"col-md-6\">\n" +
        "                    <div class=\"written_text\">\n" +
        "                        <div class=\"like_icon\"><img src=\"images/writing-icon.png\"></div>\n" +
        "                        <h1 class=\"written_text\">"
    tail="</h1>\n" +
        "                        <p >%</p>\n" +
        "                    </div>\n" +
        "                </div>\n" +
        "            </div>"

    function showStationByZone(data){
        for (var dataKey in data.Stations) {
            value=data.Stations[dataKey.toString()];
            $("#stations").append(header+dataKey+body+"vista3.html?ston="+dataKey+body2+value+tail);
        }

    }

    return{
        showStationByZone:showStationByZone
    }
})();