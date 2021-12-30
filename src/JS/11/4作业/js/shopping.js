function minus(a) {
    var b = document.getElementsByName("amount")[a].value;
    var d = document.getElementsByName("price")[a].value;
    var c = parseInt(b);
    var e = parseFloat(d);
    var t = document.getElementsByName("amount")[a].value = c - 1;
    if (t < 0) {
        alert("数量不能小于0！")
        document.getElementsByName("amount")[a].value = 0;
    } else {
        var r = parseInt(a);
        document.getElementById("price" + r).innerText = e * (document.getElementsByName("amount")[a].value);
    }

}

function plus(a) {
    var b = document.getElementsByName("amount")[a].value;
    var d = document.getElementsByName("price")[a].value;
    var c = parseInt(b);
    var e = parseFloat(d);
    document.getElementsByName("amount")[a].value = c + 1;
    var r = parseInt(a);
    document.getElementById("price" + r).innerText = e * (document.getElementsByName("amount")[a].value);
}

function accounts() {
    /* alert((document.getElementById("price0").innerText))
     alert((document.getElementById("price1").innerText))*/
    var a = parseFloat(document.getElementById("price0").innerText) + parseFloat(document.getElementById("price1").innerText);
    document.getElementById("totalPrice").innerText = a;
}

function aaa() {

    if (document.getElementsByName("cccc")[0] != null){
        document.getElementsByName("cccc")[0].remove();
    }
   /* var a = document.getElementById("price1");
    var b = a.parentNode.parentNode.parentNode.setAttribute("id", "cccc");
    alert(b);
    var ee = document.getElementById("cccc").createElement("div");
    document.getElementById("cccc")[0].appendChild(ee);
    ee.innerHTML =" 您本次购买的商品信息如下：";*/
    var newli = document.createElement("div");
    newli.setAttribute("name","cccc");
    var a = parseFloat(document.getElementById("price0").innerText) + parseFloat(document.getElementById("price1").innerText);
    newli.innerHTML = "您本次购买的商品信息如下：</br>" +
        "白岩松：白说：￥"+
        parseFloat(document.getElementById("price0").innerText)+
        "</br>岛上书店：￥"+
        parseFloat(document.getElementById("price1").innerText)+
        "</br>商品总计：￥"+ a
    document.getElementsByClassName("content")[0].appendChild(newli)
}