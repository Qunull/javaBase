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
function accounts(){
       /* alert((document.getElementById("price0").innerText))
        alert((document.getElementById("price1").innerText))*/
        var a = parseFloat(document.getElementById("price0").innerText)+parseFloat(document.getElementById("price1").innerText);
        document.getElementById("totalPrice").innerText = a;
}