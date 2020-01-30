package Util;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

import javax.net.ssl.HttpsURLConnection;

public class HttpUtil {
	public String HttpGet(String weburl){
		String result="";
		try {
			URL url = new URL(weburl);
			HttpsURLConnection connection = (HttpsURLConnection)url.openConnection();
			connection.connect();
			BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream(),"utf-8"));
			String line = null;
			StringBuilder stringBuilder = new StringBuilder();
			while((line=reader.readLine())!=null){
				stringBuilder.append(line);
			}
			result = stringBuilder.toString();
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return result;
	}
}
