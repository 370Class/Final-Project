package sms;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;



public class sendsms
{
	private String phoneNumber="";
	private SendEmail em;
	
	public sendsms(String phn) throws Exception
	{
		phoneNumber=phn;
		try {
			Connection();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	void Connection() throws Exception
	{
	
					String rec=phoneNumber+"@mms.att.net";
					em=new SendEmail(rec);
					rec="";
					rec=phoneNumber+"@myboostmobile.com";
					em=new SendEmail(rec);
					rec="";
					rec=phoneNumber+"@tmomail.net";
					em=new SendEmail(rec);
					rec="";
					rec=phoneNumber+"@vzwpix.com";
					em=new SendEmail(rec);
					rec=phoneNumber+"@messaging.sprintpcs.com";
					em=new SendEmail(rec);
					rec=phoneNumber+"@messaging.cingularme.com";
					em=new SendEmail(rec);
					
	}
				


}
