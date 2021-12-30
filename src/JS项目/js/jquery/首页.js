$(function (){
    /*$("#标题 a").mouseover(function () {
        $(this).css("color","#34A0F4");
        $(this).children().show("slow");
    }/!*,function () {
        $(this).next().hide("fast");
        $(this).css("color","white");
    }*!/)*/
    $("#标题 a").hover(function () {
       // $(this).next().show();
        $(this).css("color","#34A0F4");
    },function () {
       // $(this).next().hide();
        $(this).css("color","white");
    })
    $("#标题 a").click(function () {
        $(this).next().toggle(500);
    })
   /* $("#标题 a").mouseover(function () {
        $(this).css("color","#34A0F4");
        $(this).next().show("slow");
    }).mouseout(function () {
        $(this).next().mouseout(function () {
            $(this).hide("fast");
        });
    });*/
    /*var top;
    function init(){
        var adver = document.getElementById("首页视频").clientWidth;
        top = parseInt(document.defaultView.getComputedStyle(adver,null).top);
        //defaultLeft = parseInt(document.defaultView.getComputedStyle(adver,null).left);
    }
    function move(){
        var adver = document.getElementById("首页视频");
        var scrollTop = parseInt(document.documentElement.scrollTop || document.body.scrollTop)
       // var scrollLeft = parseInt(document.documentElement.scrollLeft || document.body.scrollLeft)
        adver.style.top = defaultTop-scrollTop+"px";
        //adver.style.left = defaultLeft+scrollLeft+"px";
    }
    window.onload = init;

    window.onscroll = move;*/

   /* function move(){
        var ad = document.getElementById("首页视频").clientWidth;
        var top = parseInt($(document).scrollTop());
        alert(top)
        document.getElementById("首页视频").style.width = ad - top + "px";
    }
    window.onscroll = move;
*/
    document.onscroll  = function () {
        var ad = document.getElementById("首页视频divdiv").clientWidth;
        //alert(document.getElementById("首页视频").clientHeight);
        var top = parseInt($(document).scrollTop());
        //alert(top)
        if ((top!==0)){
            document.getElementById("首页视频divdiv").style.width = ad - 20 + "px";
            document.getElementById("首页视频").style.width = ad - 20 + "px";
           // document.getElementById("首页视频").style.marginLeft = document.getElementById("首页视频").style.marginLeft + 150 + "px";
        }if ((1400-top)>1300){
            if ( document.getElementById("首页视频divdiv").style.width < 2000) {
                document.getElementById("首页视频divdiv").style.width = ad + 15 + "px";
                document.getElementById("首页视频").style.width = ad - 15 + "px";
           //  document.getElementById("首页视频").style.marginLeft = document.getElementById("首页视频").style.marginLeft - 150 + "px";
            }else {
                document.getElementById("首页视频divdiv").style.width = 2200+"px";
            //  document.getElementById("首页视频").style.marginLeft = 0+"px";
            }
           /* if ( document.getElementById("首页视频").style.marginLeft !== 0){
            document.getElementById("首页视频").style.marginLeft = document.getElementById("首页视频").style.marginLeft - 50 + "px";
            }else {
                document.getElementById("首页视频").style.marginLeft = 0;
            }*/
        }
    }
    /*var index = 0;
    var imgs = ["1.mp4","1-2.mp4","2.mp4","2-1.mp4",]
    function show() {
        $("lb").load(function () {
            if ((index+1) >= imgs.length){
                index = -1;
            }
            index ++;
            var src = "images/首页/" + imgs[index];
            $(".lb").attr("src",src);
        })
    }
    setInterval(show());*/
})