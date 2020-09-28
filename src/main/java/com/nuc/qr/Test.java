package com.nuc.qr;

import java.io.File;

public class Test {
    public static void main(String[] args) {
        File logoFile = new File("D://j.png");
        File QrCodeFile = new File("D://jCode.png");
        String url = "https://www.baidu.com/";
        String note = "访问百度连接";
        ZXingCode.drawLogoQRCode(logoFile,QrCodeFile,url,null);
    }
}
