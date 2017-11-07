package com.robot_partner.morse;

import android.util.Log;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Morse {
    Map<String, String> morseDict = new HashMap<>();

    public Morse() {
        morseDict.put("ー","01101");
        morseDict.put("\n","010100");

        morseDict.put("ぁ","11011");
        morseDict.put("ぃ","01");
        morseDict.put("ぅ","001");
        morseDict.put("ぇ","10111");
        morseDict.put("ぉ","01000");
        morseDict.put("あ","11011");
        morseDict.put("い","01");
        morseDict.put("う","001");
        morseDict.put("え","10111");
        morseDict.put("お","01000");
        morseDict.put("か","0100");
        morseDict.put("き","10100");
        morseDict.put("く","0001");
        morseDict.put("け","1011");
        morseDict.put("こ","1111");
        morseDict.put("さ","10101");
        morseDict.put("し","11010");
        morseDict.put("す","11101");
        morseDict.put("せ","01110");
        morseDict.put("そ","1110");
        morseDict.put("た","10");
        morseDict.put("ち","0010");
        morseDict.put("つ","0110");
        morseDict.put("っ","0110");
        morseDict.put("て","01011");
        morseDict.put("と","00100");
        morseDict.put("な","010");
        morseDict.put("に","1010");
        morseDict.put("ぬ","0000");
        morseDict.put("ね","1101");
        morseDict.put("の","0011");
        morseDict.put("は","1000");
        morseDict.put("ひ","11001");
        morseDict.put("ふ","1100");
        morseDict.put("へ","0");
        morseDict.put("ほ","100");
        morseDict.put("ま","1001");
        morseDict.put("み","00101");
        morseDict.put("む","1");
        morseDict.put("め","10001");
        morseDict.put("も","10010");
        morseDict.put("や","011");
        morseDict.put("ゆ","10011");
        morseDict.put("よ","11");
        morseDict.put("ゃ","011");
        morseDict.put("ゅ","10011");
        morseDict.put("ょ","11");
        morseDict.put("ら","000");
        morseDict.put("り","110");
        morseDict.put("る","10110");
        morseDict.put("れ","111");
        morseDict.put("ろ","0101");
        morseDict.put("わ","101");
        morseDict.put("を","0111");
        morseDict.put("ん","01010");

        morseDict.put("が","010000");
        morseDict.put("ぎ","1010000");
        morseDict.put("ぐ","000100");
        morseDict.put("げ","101100");
        morseDict.put("ご","111100");
        morseDict.put("ざ","1010100");
        morseDict.put("じ","1101000");
        morseDict.put("ず","1110100");
        morseDict.put("ぜ","0111000");
        morseDict.put("ぞ","111000");
        morseDict.put("だ","1000");
        morseDict.put("ぢ","001000");
        morseDict.put("づ","011000");
        morseDict.put("で","0101100");
        morseDict.put("ど","0010000");

        morseDict.put("ば","100000");
        morseDict.put("び","1100100");
        morseDict.put("ぶ","110000");
        morseDict.put("べ","000");
        morseDict.put("ぼ","10000");

        morseDict.put("ば","100000110");
        morseDict.put("び","1100100110");
        morseDict.put("ぶ","110000110");
        morseDict.put("べ","000110");
        morseDict.put("ぼ","10000110");

        morseDict.put("ア","11011");
        morseDict.put("イ","01");
        morseDict.put("ウ","001");
        morseDict.put("エ","10111");
        morseDict.put("オ","01000");
        morseDict.put("ァ","11011");
        morseDict.put("ィ","01");
        morseDict.put("ゥ","001");
        morseDict.put("ェ","10111");
        morseDict.put("ォ","01000");
        morseDict.put("カ","0100");
        morseDict.put("キ","10100");
        morseDict.put("ク","0001");
        morseDict.put("ケ","1011");
        morseDict.put("コ","1111");
        morseDict.put("サ","10101");
        morseDict.put("シ","11010");
        morseDict.put("ス","11101");
        morseDict.put("セ","01110");
        morseDict.put("ソ","1110");
        morseDict.put("タ","10");
        morseDict.put("チ","0010");
        morseDict.put("ツ","0110");
        morseDict.put("テ","01011");
        morseDict.put("ト","00100");
        morseDict.put("ナ","010");
        morseDict.put("ニ","1010");
        morseDict.put("ヌ","0000");
        morseDict.put("ネ","1101");
        morseDict.put("ノ","0011");
        morseDict.put("ハ","1000");
        morseDict.put("ヒ","11001");
        morseDict.put("フ","1100");
        morseDict.put("ヘ","0");
        morseDict.put("ホ","100");
        morseDict.put("マ","1001");
        morseDict.put("ミ","00101");
        morseDict.put("ム","1");
        morseDict.put("メ","10001");
        morseDict.put("モ","10010");
        morseDict.put("ヤ","011");
        morseDict.put("ユ","10011");
        morseDict.put("ヨ","11");
        morseDict.put("ャ","011");
        morseDict.put("ュ","10011");
        morseDict.put("ョ","11");
        morseDict.put("ラ","000");
        morseDict.put("リ","110");
        morseDict.put("ル","10110");
        morseDict.put("レ","111");
        morseDict.put("ロ","0101");
        morseDict.put("ワ","101");
        morseDict.put("ヲ","0111");
        morseDict.put("ン","01010");

        morseDict.put("ガ","010000");
        morseDict.put("ギ","1010000");
        morseDict.put("グ","000100");
        morseDict.put("ゲ","101100");
        morseDict.put("ゴ","111100");
        morseDict.put("ザ","1010100");
        morseDict.put("ジ","1101000");
        morseDict.put("ズ","1110100");
        morseDict.put("ゼ","0111000");
        morseDict.put("ゾ","111000");
        morseDict.put("ダ","1000");
        morseDict.put("ヂ","001000");
        morseDict.put("ヅ","011000");
        morseDict.put("デ","0101100");
        morseDict.put("ド","0010000");

        morseDict.put("バ","100000");
        morseDict.put("ビ","1100100");
        morseDict.put("ブ","110000");
        morseDict.put("ベ","000");
        morseDict.put("ボ","10000");

        morseDict.put("パ","100000110");
        morseDict.put("ピ","1100100110");
        morseDict.put("プ","110000110");
        morseDict.put("ペ","000110");
        morseDict.put("ポ","10000110");

    }

    public int[] getMorseList(String character) {
        String morseString =  morseDict.get(character);
        String[] morseArray = morseString.split("");
        int[] morseInt = new int[morseArray.length-1];
        for (int i=0; i < morseArray.length-1; i++) {
            morseInt[i] = Integer.parseInt(morseArray[i+1]);
        }
        return morseInt;
    }

}
