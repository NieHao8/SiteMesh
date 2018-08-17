<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>login</title>
</head>
<body>
<h3>Login with Username and Password--------------------</h3>
<!-- <form name='f' action='/ESSH1/login' method='POST'>
<table>
	<tr><td>User:</td><td><input type='text' name='username' value=''></td></tr>
	<tr><td>Password:</td><td><input type='password' name='password'/></td></tr>
	<tr><td colspan='2'><input name="submit" type="submit" value="Login"/></td></tr>
	<input name="_csrf" type="hidden" value="d2c33fba-2318-45c5-916f-f21628070b1a" />
</table>
</form> -->
 <form  method="post" action='/ESSH1/login'>
                <div class="form-group">
                    <input type="text" class="form-control" placeholder="Username" name="username" required="">
                </div>
                <div class="form-group">
                    <input type="password" class="form-control" placeholder="Password" name="password" required="">
                </div>
                <div class="form-group">
                    
                        <div class="checkbox i-checks"><label> <input type="checkbox"  name="remember-me"><i></i> Remember me </label></div>
                    
                </div>
                <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/>
                 
                <button type="submit" class="btn btn-primary block full-width m-b">Login</button>
 				
 				<!-- 
                <a href="#"><small>Forgot password?</small></a>
                <p class="text-muted text-center"><small>Do not have an account?</small></p>
                <a class="btn btn-sm btn-white btn-block" href="register.html">Create an account</a>
                 -->
            </form>
<a href="/ESSH1/logout">logout</a>

</body>
</html>