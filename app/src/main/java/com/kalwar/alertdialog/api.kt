package com.kalwar.alertdialog
import java.io.IOException
import okhttp3.FormBody
import okhttp3.OkHttpClient
import okhttp3.Request
class api {



    val client = OkHttpClient()

    val formBody = FormBody.Builder()
        .add("mobile_phone", "9990212082")
        .add("email", "hbjjh@gmail.com")
        .add("captcha_value", "vi6ds7")
        .add("channel", "call")
        .build()

    val request = Request.Builder()
        .url("https://droom.in/send-onboard-otp")
        .post(formBody)
        .header("authority", "droom.in")
        .header("accept", "application/json, text/javascript, */*; q=0.01")
        .header("accept-language", "en-US,en;q=0.9")
        .header("content-type", "application/x-www-form-urlencoded; charset=UTF-8")
        .header("cookie", "locale=ZW4tSU4=; utfc=RnY3SjNlY2hIalNpTEJreQ==; Path=/; __AP_SESSION__=3a2109f0-61d0-493f-b778-1eb56fa8a537; _gcl_au=1.1.1575122799.1684252317; _gid=GA1.2.840685615.1684252318; _fbp=fb.1.1684252318135.79509126; moe_uuid=b0af5235-68c8-4e13-9c9c-c02c36cc9109; dcc=MA==; _ga=GA1.1.97219030.1684252318; _gt=NzU0ODRjOTllMTBiNjRlMg==; XSRF-TOKEN=eyJpdiI6ImhGZTMvSHRRaTVNcXRMTHplRTl1c0E9PSIsInZhbHVlIjoieWVONWprWnlHbm56M3lNYzhJNDdqZ1R4MGxZemxZdmVEVFFGSVVrZ014aHhnNy95bG9OcVcwa1pBeGk1dzhtQXZrdFJtcUl6VjdLczd0OGNIN25rMG92OS83VHI2SzMzdlhZN1VES0YwQXdUMnFTMmhBNFAwTm1TS3Q1cEx5dW4iLCJtYWMiOiJlYjRiMjZmZTVhNGI4NGMwMjcyZWRkMzYwZmNkYzMzZTM0YzQyZjk2MTEzZTcyYjVhYTQxY2ZjOTNjM2U3ZDY1IiwidGFnIjoiIn0%3D; laravel8_session=eyJpdiI6InJvdlJvS3BqaGYxL2QvdDZidjMrNlE9PSIsInZhbHVlIjoiR1pPdzJpV0NiZmh6U0prVU05TFF2dWFZL2NsL2xYeUw1MUNBa3lCenhJNU54MmxUVUhOREhrVHArYWtFYkpqYzlEbjZIWHZSTFF4VXlaRStQbmhKV2llNFovVVlPSm85Q2lpc055UDR5K3BLNVJ4dFk3YlFCNHFDODNBK2tEMWwiLCJtYWMiOiIyMTM5YWZlMWUxOTJlMTg1YzJhMDM4ZjljNTM5N2U3NzFhZTA0NDBlMGZiZjhiMDg5NGRjM2VkYjA1MmMwZjE2IiwidGFnIjoiIn0%3D; _ga_DX476DMQYC=GS1.1.1684252317.1.1.1684252406.0.0.0; _ga_5QNKT9FWBK=GS1.1.1684252317.1.1.1684252406.0.0.0")
        .header("origin", "https://droom.in")
        .header("referer", "https://droom.in/individual/account-signup")
        .header("sec-ch-ua", "\"Chromium\";v=\"112\", \"Google Chrome\";v=\"112\", \"Not:A-Brand\";v=\"99\"")
        .header("sec-ch-ua-mobile", "?0")
        .header("sec-ch-ua-platform", "\"Windows\"")
        .header("sec-fetch-dest", "empty")
        .header("sec-fetch-mode", "cors")
        .header("sec-fetch-site", "same-origin")
        .header("user-agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/112.0.0.0 Safari/537.36")
        .header("x-requested-with", "XMLHttpRequest")
        .build()

    client.newCall(request).execute().use { response ->
        if (!response.isSuccessful) throw IOException("Unexpected code $response")
        response.body!!.string()
    }

}