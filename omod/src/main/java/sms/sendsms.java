package sms;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;


import com.google.gson.Gson;

public class sendsms
{
	private String phoneNumber="";
	private String url="http://apilayer.net/api/validate?access_key=";
	private String apikey="8553e63077cd4feb53322b71f4440f7e";
	private String Countrycode;
	private SendEmail em;
	
	public sendsms(String phn, String cc) throws Exception
	{
		phoneNumber=phn;
		Countrycode=cc;
		try {
			Connection();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	void Connection() throws Exception
	{
	url+=apikey+"&number="+phoneNumber+"&country_code="+Countrycode+"&format=1";
		URL ur=new URL(url);
		HttpURLConnection con=(HttpURLConnection)ur.openConnection();
		con.setRequestMethod("GET");
		
		System.out.println("Respose Code:" + con.getResponseCode());
		BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
		String inputLine;
		StringBuffer respose= new StringBuffer();
		while((inputLine=in.readLine())!=null)
		{
			respose.append(inputLine+"\n");
			if(inputLine.contains("\"carrier\""))
			{
				if(inputLine.contains("AT&T"))
				{
					String rec=phoneNumber+"@mms.att.net";
					em=new SendEmail(rec);
				}
				else if(inputLine.contains("Boost"))
				{
					String rec=phoneNumber+"@myboostmobile.com";
					em=new SendEmail(rec);
				}
				else if(inputLine.contains("T-Mobile"))
				{
					String rec=phoneNumber+"@tmomail.net";
					em=new SendEmail(rec);
				}
				else if(inputLine.contains("Boost"))
				{
					String rec=phoneNumber+"@mms.att.net";
					em=new SendEmail(rec);
				}
				else if(inputLine.contains("Verizon"))
				{
					String rec=phoneNumber+"@vzwpix.com";
					em=new SendEmail(rec);
				}
				
			}
		}
		in.close();
		
		System.out.println(respose.toString());
		
	}
	public static void main(String args[]) throws Exception
	{
		sendsms ne=new sendsms("5164721348","US");
	}

}
