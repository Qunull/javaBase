$(function () {
    $(".cot_show5_title2_click").click(function () {
        $(this).children().toggle()
    });
})
$(function(){
    var nav=$(".top_bot"); //�õ������ö��ĵ�������
    var win=$(window); //�õ����ڶ���
    var sc=$(document); //�õ�document�ĵ�����
    var bannerHeight=$(window).height(); //�õ������Աȵĸ߶�
    win.scroll(function(){
        if(sc.scrollTop()>=bannerHeight){//��������߶ȳ����ĸ߶�
            nav.css({"position":"fixed","top":"0"});//�����ö�����
        }else{
            nav.css({"position":"static"});//����ȡ���ö�����
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


