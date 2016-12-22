/**
 * The contents of this file are subject to the OpenMRS Public License
 * Version 1.0 (the "License"); you may not use this file except in
 * compliance with the License. You may obtain a copy of the License at
 * http://license.openmrs.org
 *
 * Software distributed under the License is distributed on an "AS IS"
 * basis, WITHOUT WARRANTY OF ANY KIND, either express or implied. See the
 * License for the specific language governing rights and limitations
 * under the License.
 *
 * Copyright (C) OpenMRS, LLC.  All Rights Reserved.
 */
package org.openmrs.module.AutomatedSms.web.controller;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.openmrs.Concept;
import org.openmrs.api.context.Context;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * The main controller.
 */
@Controller
public class  AutoSMSManageController {
	
	protected final Log log = LogFactory.getLog(getClass());
	
	
	//main email address
	@RequestMapping(value= "/module/AutomatedSms/email_address", method= RequestMethod.GET)
	public String setemail(ModelMap model)
	{
		return "email_address.jsp";
	}
	
	//
	
	//phone number mapping
	@RequestMapping(value = "/module/AutomatedSms/phone_Number", method = RequestMethod.GET)
	public String phone_Number(ModelMap model) 
	{
		return "phone_Number.jsp";	
	}
}
