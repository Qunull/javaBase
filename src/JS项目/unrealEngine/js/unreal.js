$(function () {
    $(".cot_show5_title2_click").click(function () {
        $(this).children().toggle()
    });
})
$(function(){
    var nav=$(".top_bot"); //得到悬浮置顶的导航对象
    var win=$(window); //得到窗口对象
    var sc=$(document); //得到document文档对象
    var bannerHeight=$(window).height(); //得到滚动对比的高度
    win.scroll(function(){
        if(sc.scrollTop()>=bannerHeight){//如果滚动高度超过的高度
            nav.css({"position":"fixed","top":"0"});//导航置顶悬浮
        }else{
            nav.css({"position":"static"});//导航取消置顶悬浮
        }
    });
})
$(function () {
    $(".next").on("click",function () {
        $(this).parent().prev().css({"margin-left": "-833.875px"})
    });
})
$(function () {
    $(".last").on("click",function () {
        $(this).parent().prev().css({"margin-left": "0px"})
    });
})


