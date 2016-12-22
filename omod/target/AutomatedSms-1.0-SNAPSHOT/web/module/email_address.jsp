<%@ include file="/WEB-INF/template/include.jsp"%>
<%@ include file="/WEB-INF/template/header.jsp"%>

<%@ include file="template/localHeader.jsp"%>

<form class="form-horizontal">
<fieldset>

<!-- Form Name -->
<legend>System Email Address</legend>

<!-- Text input-->
<div class="form-group">
  <label class="col-md-4 control-label" for="textinput">Email Address</label>  
  <div class="col-md-4">
  <input id="email" name="textinput" type="text" placeholder="example@gmail.com" class="form-control input-md" required="">
    
  </div>
</div>

<!-- Password input-->
<div class="form-group">
  <label class="col-md-4 control-label" for="passwordinput">Password</label>
  <div class="col-md-4">
    <input id="password" name="password" type="password" placeholder="*******" class="form-control input-md" required="">
    
  </div>
</div>

<!-- Button -->
<div class="form-group">
  <label class="col-md-4 control-label" for="singlebutton"></label>
  <div class="col-md-4">
    <INPUT TYPE="BUTTON" VALUE="Button 1" ONCLICK="button1()">
  </div>
</div>

<%
	public void button1()
	{	
		jsphandler handler=new jsphandler();
		String email= request.getParameter("email");
		String pass= request.getParameter("password");
		handler.emailsaving(email, pass);
	}

%>

</fieldset>
</form>
<%@ include file="/WEB-INF/template/footer.jsp"%>