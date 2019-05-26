$(function(){

    $(".deleteUser").click(function () {
        alert("开始删除");
        $.ajax({
            type:"get",
            url:"user.do",
            data:"method=deluser&userId="+this.getAttribute("userid"),
            success:function(msg){
                var info=data.parseJSON(msg);
                alert("开始判断");
                if(info==true){
                    alert("删除成功");
                }else if(info == false){
                    alert("删除失败");
                }else if (info == "notExist"){
                    alert("用户不存在");
                }
            },
            error:function(xhr){
                alert(xhr.status);
            }
        })
    });

})