package com.example.jaxafx_practice;

import java.util.Random;

public class Choose_word {
    String [] possible_words= {"able", "acid", "aged", "also", "area", "away", "baby", "ball", "band", "bank", "base", "bath",
            "bear", "beat","been", "beer", "bell", "belt", "best", "bill", "bird", "blow", "blue", "boat", "body", "bomb", "bond", "bone",
            "book", "boom", "born", "boss", "both", "bowl", "bulk", "burn", "bush", "busy", "call", "calm", "came", "camp", "card", "care",
            "case", "cash", "cast", "cell", "chat", "chip", "city", "club", "coal", "coat", "code", "cold", "come", "cool", "cope", "copy",
            "core", "cost", "crew","crop", "dark", "data", "dawn","days", "dead", "deal", "dean", "dear", "debt", "deep", "deny",
            "desk", "dial","diet","disc","does","down","draw","drew","drop","drug","duke","dust","duty","each","earn","ease","east",
            "easy","edge","else","even","ever","evil","exit","face","fact","fail","fair","fall","farm","fast","fate","fear","feed",
            "feel","feet","fell","felt","file","fill","film","find","fine","fire","firm","fish","five","flat","flow","food","foot","ford",
            "form","fort","four","free","from","fuel","full","found","gain","game","gate","gave","gear","gift","girl","give","glad","goal",
            "goes","gold","golf","gone","good","grew","grow","gulf","hair","half","hall","hand","hang","hard","harm","hate","have","head"
            ,"hear","heat","held","help","here","hero","high","hill","hire","hold","hole","home","hope","host","hour","huge","hunt","hurt",
            "idea","inch","into","iron","item","jump","jury","just","keen","keep","kick","kind","king","knee","knew","know","lack","lady","lake",
            "land", "lane","last","late","lead","left","less","life","lift","like","list","live","load","loan","lock","logo","long","look",
            "lord","Lose","loss","lost","love","luck","made","mail","main","make","male","many","mass","meal","mean","meat","meet","menu",
            "mile","navy","near","neck","need","news","next","nice","nine","none","nose","note","okay","once","only","onto","open","over",
            "pace","pack","page","paid","pain","pair","palm","park","part","pass","path","peak", "pick","pink","plan","pull","race","rail",
            "rain","rank","rare","rate","read","real","rear", "rely","rent","rest","rice","ride","ring","rock","role","roof","safe","said",
            "sake","sale","salt","same","sand","save","seat","seed","seem","self","sell","send","sept","ship","shop","shot","show","shut",
            "sick","side","sign","soil","sole","some","song","take","tale","talk","tall","tape","task","team","tell","tend","term","test",
            "text","than","that","them","then","they","thin","this","thus","till","time","tiny","told","toll","tone","took","tree","unit",
            "upon","used","user","vary","vast","view","vote","wage","wait","wake","walk","want","ward","warm","wash","wave","ways","weak",
            "wear","week","wall","went","were","wild","will","wind","wing","wine","wise","wood","word","year","your","yard","zero","zone"};
    int upperBound = possible_words.length;


    public String getWord(){
        Random rand=new Random();
        int randomInt= rand.nextInt(0,upperBound);
        String word=possible_words[randomInt];
        return word;

    };

}

