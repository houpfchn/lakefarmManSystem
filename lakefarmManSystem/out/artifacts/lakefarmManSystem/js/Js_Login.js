/**
 * Created by Administrator on 2017/2/27.
 * @author hpf
 * @remark 登陆js
 */


function login(){
    var man_managername=$("#man_managername").val();
    var man_password=$("#man_password").val();
    var man_identity=$("#man_identity").val();
    alert(man_managername+"----"+man_password+"----"+man_identity);
    if(man_managername==null||man_managername==""){
        alert("用户名不能为空！");
        return;
    }
    if(man_password==null||man_password==""){
        alert("密码不能为空！");
        return;
    }
    if(man_identity==null||man_identity==""){
        alert("请选择用户类型！");
        return;
    }
    $("#adminlogin").submit();

}
