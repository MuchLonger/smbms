$(function(){

    $(".deleteUser").click(function () {
        $.ajax({
            type:"get",
            url:"user.do",
            data:"method=deluser&userId="+this.getAttribute("userid"),
            success:function(msg){
                if(msg.delResult=="true"){
                    alert("删除成功");
                }else if(msg.delResult == "false"){
                    alert("删除失败");
                }else if (msg.delResult == "notExist"){
                    alert("用户不存在");
                }
            },
            error:function(xhr){
                alert("错误代码:"+xhr.status);
            }
        })
    });

})