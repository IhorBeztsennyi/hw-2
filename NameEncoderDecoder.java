class NameEncoderDecoder {
     public String encode(String name){
       String encode1 = name.replace("e", "1");
       String encode2 = encode1.replace("u", "2");
       String encode3 = encode2.replace("i", "3");
       String encode4 = encode3.replace("o", "4");
       String encode5 = encode4.replace("a", "5");
       String encode6 = "NOTFORYOU"+encode5+"YESNOTFORYOU";
       return encode6;
     }
  
   public String decode(String name){
       String encode1 = name.replace("1", "e");
       String encode2 = encode1.replace("2", "u");
       String encode3 = encode2.replace("3", "i");
       String encode4 = encode3.replace("4", "o");
       String encode5 = encode4.replace("5", "a");
       String encode6 = encode5.replace("NOTFORYOU", "");
       String encode7 =encode6.replace("YES", "");
       return encode7;
     }

}
