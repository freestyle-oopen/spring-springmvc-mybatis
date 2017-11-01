<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<HTML>
<HEAD>
    <title>测试标题</title>
</HEAD>
<body>
${test}测试内容
<input type="button" onclick="GearUp()" value="请求">


</body>
<script type="text/javascript">
    function GearUp(){
        alert("请求");
        $.ajax({
            type:"GET",
            contentType:"application/json",
            dataType:"json",
            url:"www.baidu.com",
            error:function(data){
                alert("Failed! ");
            },
            success:function(data){
               alert("Success! ");

            }
        });
    }
</script>
</HTML>

