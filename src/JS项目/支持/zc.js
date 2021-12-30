$(function (){
    $("#tiao .tp1").hover(function (){
        $(".tp1").css("color","white")
    },function () {
        $(".tp1").css("color","deepskyblue")
        }
    )
    $("#zy .tan ").hover(function (){
            $(".tan").css("background-color","white")
        },function () {
            $(".tan").css("background-color","#3498f1")
        }
    )
    $("#zy .huo").hover(function (){
            $(".huo").css("background-color","white")
        },function () {
            $(".huo").css("background-color","#3498f1")
        }
    )
    $("#tiao .tp2").hover(function (){
            $(".tp2").css("color","white")
        },function () {
            $(".tp2").css("color","deepskyblue")
        }
    )
    if ($("#tiao").offsetTop-$(window).scrollTop()==0){
        $("#header").css("position","relative")
        $("#tiao").css("position","fixed")
    }



    window.onscroll=
        function(){
            var oDiv = document.getElementById("tiao"),
                H = 0,
                Y = oDiv
            while (Y) {
                H += Y.offsetTop;
                Y = Y.offsetParent;
            }
            window.onscroll = function()
            {
                var s = document.body.scrollTop || document.documentElement.scrollTop;
                if(s>H) {
                    oDiv.style = "position:fixed;top:0;left:0;right:0;"
                } else {
                    oDiv.style = ""
                }
            }
        }
})