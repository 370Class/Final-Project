<%@ include file="/WEB-INF/template/include.jsp"%>
<%@ include file="/WEB-INF/template/header.jsp"%>

<%@ include file="template/localHeader.jsp"%>

<form class="form-horizontal">
<fieldset>

<!-- Form Name -->
<legend>Phone Number</legend>

<!-- Text input-->
<div class="form-group">
  <label class="col-md-4 control-label" for="textinput">Patient ID</label>  
  <div class="col-md-4">
<<<<<<< HEAD
  <input id="textinput" name="textinput" type="text" placeholder="id" class="form-control input-md" required=""/>
=======
  <input id="id" name="textinput" type="text" placeholder="id" class="form-control input-md" required=""/>
>>>>>>> ef268b3356ec7c0d9ca35b679461ef37e0d1b693
  <span class="help-block">Enter Patient ID</span>  
  </div>
</div>

<!-- Text input-->
<div class="form-group">
  <label class="col-md-4 control-label" for="textinput">Cell Phone #:</label>  
  <div class="col-md-4">
<<<<<<< HEAD
  <input id="textinput" name="textinput" type="text" placeholder="cell number" class="form-control input-md" required="">
=======
  <input id="phonenumber" name="textinput" type="text" placeholder="cell number" class="form-control input-md" required="">
>>>>>>> ef268b3356ec7c0d9ca35b679461ef37e0d1b693
  <span class="help-block">Enter patient cell phone number</span>  
  </div>
</div>

<!-- Multiple Radios -->
<div class="form-group">
  <label class="col-md-4 control-label" for="radios">SMS Notifications</label>
  <div class="col-md-4">
  <div class="radio">
    <label for="radios-0">
      <input type="radio" name="radios" id="radios-0" value="1" checked="checked">
      Enable
    </label>
	</div>
  <div class="radio">
    <label for="radios-1">
      <input type="radio" name="radios" id="radios-1" value="0">
      Disable
    </label>
	</div>
  </div>
</div>
<!-- Button -->
<div class="form-group">
<<<<<<< HEAD
  <label class="col-md-4 control-label" for="submit_button"></label>
  <div class="col-md-4">
    <button id="submit_button" name="submit_button" class="btn btn-primary">Submit</button>
  </div>
</div>

=======
  <label class="col-md-4 control-label" for="singlebutton"></label>
  <div class="col-md-4">
    <INPUT TYPE="BUTTON" VALUE="Button 1" ONCLICK="button1()">
  </div>
</div>

<%
	public void button1()
	{
		String id= request.getParameter("id");
		String phonenumber= request.getParameter("phonenumber");
		Boolean radio=request.getParameter("radios");\
		jsphandler handler=new jsphandler();
		handler.phoneinsert(id, phonenumber, radio);
		
	}

%>

>>>>>>> ef268b3356ec7c0d9ca35b679461ef37e0d1b693
</fieldset>
</form>

<%@ include file="/WEB-INF/template/footer.jsp"%>