package com.ceaser.jdk8lambda.rsa;

import javax.crypto.Cipher;
import java.security.*;
import java.security.spec.PKCS8EncodedKeySpec;
import java.security.spec.X509EncodedKeySpec;
import java.util.Base64;

/**
 公钥：MIGfMA0GCSqGSIb3DQEBAQUAA4GNADCBiQKBgQCiqQrLJZQiqVOW54RyG/1JJxPO6X54mhfQ8FpM/2wIj63TUx1d5BEbF/hV7DVGgScONHOiUISnhDyATKjLiP1DOU5BAbMtg0WdMTBQ9Kk0hbSM6G6PRAkI6euA5FA88ZPNstqhgWVZvlCmRCUiYUd+FSRkipanM3sc1tvFxfOhowIDAQAB
 私钥：MIICdQIBADANBgkqhkiG9w0BAQEFAASCAl8wggJbAgEAAoGBAKKpCssllCKpU5bnhHIb/UknE87pfniaF9DwWkz/bAiPrdNTHV3kERsX+FXsNUaBJw40c6JQhKeEPIBMqMuI/UM5TkEBsy2DRZ0xMFD0qTSFtIzobo9ECQjp64DkUDzxk82y2qGBZVm+UKZEJSJhR34VJGSKlqczexzW28XF86GjAgMBAAECgYAGhw4d1OY69dya47OW+LSTaPQMi6Y9pMFr6xlUmbN2LH3nSyCUkgB1u+KFYDNLHwe4NDanvt9z8YSUCX+Em3y+U3syuXdai6e7WFPdskHGiwOl1bVbuQhbYDwQemhWz3OlT5Jh3BIzu596oUpT+//Tt4IHYs9TN5mT551v6lZYAQJBANWaU6sVj0saBrtb6/Vyqni+V/EiSOD2xOdvuV+/CtBdaFsbkWBBODOLOOIRyr56yPlghqePH1jLlb8AtVEWkgECQQDC8jQi0vVWH512fZD7XvREbRJgTqqbhRXQT7aI9xaBiHmqUbXBWqjcBzQSv7OvqqqpIA55cgQppaW8a/MVDqujAkBaO6BepHPs8OipGzK5dCAJc7couSf6SKRzdCHmDYke7maYHjQyajq4o3Z7IbL49luR5THc9Lv0QcRXdJAj2hoBAkBr4G+tXaPZtsECEtYp5A+z1c+3b5DFYs4BajsOa/0OTSFWeMTlbG/I4kuUnHSonv61fEHGPqvDCCFAtVPcsTOVAkBPJb+9sUFEAEy6w7b4XTjbNbc5mf0Bpkt58p/kBTuc2IZlylGPRFWRHdaWOBlutmZ6a1tikjW4JSVMtqY3cCVU

 */
public class RSACryptography {

    public static String data="hello world";
    public static String publicKeyString="MIGfMA0GCSqGSIb3DQEBAQUAA4GNADCBiQKBgQCwKn9Crtt/o1FLQC8Q6bPcY+COu3mK0Q4QCLqlnoEtNpBwOw645BgczUuGWCx+Oa7W8S/4pQfyMbMTUMWCsqdNV32aKpxYXfK0kGy5TTglnQpQQF6RyA63fyxZQuUyNA8eZAOVbAZrfvbEFF4/0qVn7HldhrYyGcxEHCJvkg6dHwIDAQAB";
    public static String privateKeyString="MIICdgIBADANBgkqhkiG9w0BAQEFAASCAmAwggJcAgEAAoGBALAqf0Ku23+jUUtALxDps9xj4I67eYrRDhAIuqWegS02kHA7DrjkGBzNS4ZYLH45rtbxL/ilB/IxsxNQxYKyp01XfZoqnFhd8rSQbLlNOCWdClBAXpHIDrd/LFlC5TI0Dx5kA5VsBmt+9sQUXj/SpWfseV2GtjIZzEQcIm+SDp0fAgMBAAECgYBRsIMustLKDzuFP5ATsatbyVy6Eyk7O9HfkYyrfCK+iozT3i7nga3EvVYGSCDpr2np9hGepThYEL/Pdyb/gkSdja1z1N5HX7D5Nen2vrkY2CjSUgSJKSRiksMpg0lnsi7rfMqF/QwK66Z+MyoIGHxm2JoMI1tCcB+W3bfOA+9roQJBANn8gVexvoHEz1kCZFk+x/km+N7henEp6R+zibv3X+7IUyATetpm1yfR53u1lwOynHBKtInGvhXPRIKQ36/O2WkCQQDO4wUGc9K0TEfrWu1zv3sc7KMe6pdIfiw0ZQvJjb9wO5wlG0tp7hb6ykXuQoBi82gxhdcn1aTyQ6p9zEuRmqlHAkAX7M/haR/IrGo5kbqj1PEr1mwwQj0nGHt+wDzYxZDg61m8RocQW4M32qD2gfq+LCdhZ8Gi8Y5BZItXbUEv0ZspAkEAlHxxteDZQJhjIfOf62xp8yeQJ/ddXyVXmr9PR3jaBrZx6lv9s2izy4nzyP6n4N0sUibqdmerPEn+is1fC4ECrwJAYdXSJGWd9/G2GiaZRciul/toEEDBOLwtsLkRWe05ZVf1V1JH+7oIhfXRevDXJAX4V4NzPHmUzAaVuoqb4erUgw==";


    public static void main(String[] args) throws Exception {
        // TODO Auto-generated method stub

        //init1();
        init2();



    }

    private static void init2() throws Exception {
        //获取公钥
        PublicKey publicKey=getPublicKey(publicKeyString);

        //获取私钥
        PrivateKey privateKey=getPrivateKey(privateKeyString);

        //公钥加密
        byte[] encryptedBytes=encrypt(data.getBytes(), publicKey);
        System.out.println("加密后："+new String(encryptedBytes));

        //私钥解密
        byte[] decryptedBytes=decrypt(encryptedBytes, privateKey);
        System.out.println("解密后："+new String(decryptedBytes));
    }

    private static void init1() throws Exception {
        KeyPair keyPair=genKeyPair(1024);

        //获取公钥，并以base64格式打印出来
        PublicKey publicKey=keyPair.getPublic();
        System.out.println("公钥："+new String(Base64.getEncoder().encode(publicKey.getEncoded())));

        //获取私钥，并以base64格式打印出来
        PrivateKey privateKey=keyPair.getPrivate();
        System.out.println("私钥："+new String(Base64.getEncoder().encode(privateKey.getEncoded())));

        //公钥加密
        byte[] encryptedBytes=encrypt(data.getBytes(), publicKey);
        System.out.println("加密后："+new String(encryptedBytes));

        //私钥解密
        byte[] decryptedBytes=decrypt(encryptedBytes, privateKey);
        System.out.println("解密后："+new String(decryptedBytes));
    }

    //生成密钥对
    public static KeyPair genKeyPair(int keyLength) throws Exception{
        KeyPairGenerator keyPairGenerator= KeyPairGenerator.getInstance("RSA");
        keyPairGenerator.initialize(1024);
        return keyPairGenerator.generateKeyPair();
    }

    //公钥加密
    public static byte[] encrypt(byte[] content, PublicKey publicKey) throws Exception{
        Cipher cipher=Cipher.getInstance("RSA");//java默认"RSA"="RSA/ECB/PKCS1Padding"
        cipher.init(Cipher.ENCRYPT_MODE, publicKey);
        return cipher.doFinal(content);
    }

    //私钥解密
    public static byte[] decrypt(byte[] content, PrivateKey privateKey) throws Exception{
        Cipher cipher=Cipher.getInstance("RSA");
        cipher.init(Cipher.DECRYPT_MODE, privateKey);
        return cipher.doFinal(content);
    }

    //将base64编码后的公钥字符串转成PublicKey实例
    public static PublicKey getPublicKey(String publicKey) throws Exception{
        byte[ ] keyBytes=Base64.getDecoder().decode(publicKey.getBytes());
        X509EncodedKeySpec keySpec=new X509EncodedKeySpec(keyBytes);
        KeyFactory keyFactory= KeyFactory.getInstance("RSA");
        return keyFactory.generatePublic(keySpec);
    }

    //将base64编码后的私钥字符串转成PrivateKey实例
    public static PrivateKey getPrivateKey(String privateKey) throws Exception{
        byte[ ] keyBytes=Base64.getDecoder().decode(privateKey.getBytes());
        PKCS8EncodedKeySpec keySpec=new PKCS8EncodedKeySpec(keyBytes);
        KeyFactory keyFactory=KeyFactory.getInstance("RSA");
        return keyFactory.generatePrivate(keySpec);
    }


}
