//Halaman Awal Teka Teki Silang

buku_panduan1111.addEventListener(MouseEvent.CLICK, fl_ClickToGoToScene_120);

function fl_ClickToGoToScene_120(event:MouseEvent):void
{
	MovieClip(this.root).gotoAndPlay(76, "panduan");
}

home1.addEventListener(MouseEvent.CLICK, fl_ClickToGoToScene_121);

function fl_ClickToGoToScene_121(event:MouseEvent):void
{
	MovieClip(this.root).gotoAndPlay(1, "menu_utama");
}

stop();

tts.addEventListener(MouseEvent.CLICK, fl_ClickToGoToScene_157);

function fl_ClickToGoToScene_157(event:MouseEvent):void
{
	MovieClip(this.root).gotoAndPlay(1, "tts");
}

tts1.addEventListener(MouseEvent.CLICK, fl_ClickToGoToScene_158);

function fl_ClickToGoToScene_158(event:MouseEvent):void
{
	MovieClip(this.root).gotoAndPlay(1, "tts1");
}

//Halaman Akhir TTS

stop();


import flash.events.Event;

var saved:SharedObject = SharedObject.getLocal("saved");
//Load
//h1_B.text = (saved.data.h1_B);
//h1_E.text = (saved.data.h1_E);
//h1_B1.text = (saved.data.h1_B1);
//h1_A.text = (saved.data.h1_A);
//h1_S.text = (saved.data.h1_S);

//h2_L.text = (saved.data.h2_L);
//h2_I.text = (saved.data.h2_I);
//h2_M.text = (saved.data.h2_M);
//h2_I1.text = (saved.data.h2_I1);
//h2_N.text = (saved.data.h2_N);
//h2_A.text = (saved.data.h2_A);
//h2_S.text = (saved.data.h2_S);
//h2_I11.text = (saved.data.h2_I11);
	
//h3_U.text = (saved.data.h3_U);
//h3_B.text = (saved.data.h3_B);
//h3_S.text = (saved.data.h3_S);
//h3_T.text = (saved.data.h3_T);
//h3_I.text = (saved.data.h3_I);
//h3_T1.text = (saved.data.h3_T1);
//h3_U1.text = (saved.data.h3_U1);
//h3_S1.text = (saved.data.h3_S1);
//h3_I1.text = (saved.data.h3_I1);
	
//h4_I.text = (saved.data.h4_I);
//h4_G.text = (saved.data.h4_G);
//h4_A.text = (saved.data.h4_A);
	
//h5_M.text = (saved.data.h5_M);
//h5_T.text = (saved.data.h5_T);
//h5_R.text = (saved.data.h5_R);
//h5_I.text = (saved.data.h5_I);
//h5_K.text = (saved.data.h5_K);
//h5_S.text = (saved.data.h5_S);
//stage.addEventListener(Event.ENTER_FRAME, tts);

//function tts(e:Event):void {
    //Save data
    //saved.data.h1_B = h1_B.text;
	//saved.data.h1_E = h1_E.text;
	//saved.data.h1_B1 = h1_B1.text;
	//saved.data.h1_A = h1_A.text;
	//saved.data.h1_S = h1_S.text;
	
	//saved.data.h2_L = h2_L.text;
	//saved.data.h2_I = h2_I.text;
	//saved.data.h2_M = h2_M.text;
	//saved.data.h2_I1 = h2_I1.text;
	//saved.data.h2_N = h2_N.text;
	//saved.data.h2_A = h2_A.text;
	//saved.data.h2_S = h2_S.text;
	//saved.data.h2_I11 = h2_I11.text;
	
	//saved.data.h3_U = h3_U.text;
	//saved.data.h3_B = h3_B.text;
	//saved.data.h3_S = h3_S.text;
	//saved.data.h3_T = h3_T.text;
	//saved.data.h3_I = h3_I.text;
	//saved.data.h3_T1 = h3_T1.text;
	//saved.data.h3_U1 = h3_U1.text;
	//saved.data.h3_S1 = h3_S1.text;
	//saved.data.h3_I1 = h3_I1.text;
	
	//saved.data.h4_I = h4_I.text;
	//saved.data.h4_G = h4_G.text;
	//saved.data.h4_A = h4_A.text;
	
	//saved.data.h5_M = h5_M.text;
	//saved.data.h5_T = h5_T.text;
	//saved.data.h5_R = h5_R.text;
	//saved.data.h5_I = h5_I.text;
	//saved.data.h5_K = h5_K.text;
	//saved.data.h5_S = h5_S.text; 
	//saved.flush(); 
this.addEventListener(Event.ENTER_FRAME, nalar);

function nalar(e:Event):void {
    if (
        h1_B.text === "B" &&
        h1_E.text === "E" &&
        h1_B1.text === "B" &&
        h1_A.text === "A" &&
        h1_S.text === "S"
    ) {
        notif.gotoAndStop(4);
    } else if (
        h1_B.text === "" &&
        h1_E.text === "" &&
        h1_B1.text === "" &&
        h1_A.text === "" &&
        h1_S.text === ""
    ) {
        notif.gotoAndStop(1);
    } else {
        notif.gotoAndStop(3);
    }

    if (
        h1_E.text === "E" &&
        h2_L.text === "L" &&
        h2_I.text === "I" &&
        h2_M.text === "M" &&
        h2_I1.text === "I" &&
        h2_N.text === "N" &&
        h2_A.text === "A" &&
        h2_S.text === "S" &&
        h2_I11.text === "I"
    ) {
        notif2.gotoAndStop(3);
    } else if (
        h1_E.text === "" &&
        h2_L.text === "" &&
        h2_I.text === "" &&
        h2_M.text === "" &&
        h2_I1.text === "" &&
        h2_N.text === "" &&
        h2_A.text === "" &&
        h2_S.text === "" &&
        h2_I11.text === ""
    ) {
        notif2.gotoAndStop(1);
    } else {
        notif2.gotoAndStop(2);
    }

    if (
        h2_S.text === "S" &&
        h3_U.text === "U" &&
        h3_B.text === "B" &&
        h3_S.text === "S" &&
        h3_T.text === "T" &&
        h3_I.text === "I" &&
        h3_T.text === "T" &&
        h3_U.text === "U" &&
        h3_S1.text === "S" &&
        h2_I1.text === "I"
    ) {
        notif3.gotoAndStop(3);
    } else if (
        h2_S.text === "" &&
        h3_U.text === "" &&
        h3_B.text === "" &&
        h3_S.text === "" &&
        h3_T.text === "" &&
        h3_I.text === "" &&
        h3_T.text === "" &&
        h3_U.text === "" &&
        h3_S1.text === "" &&
        h2_I1.text === ""
    ) {
        notif3.gotoAndStop(1);
    } else {
        notif3.gotoAndStop(2);
    }

    if (
        h3_T.text === "T" &&
        h4_I.text === "I" &&
        h4_G.text === "G" &&
        h4_A.text === "A"
    ) {
        notif4.gotoAndStop(3);
    } else if (
        h3_T.text === "" &&
        h4_I.text === "" &&
        h4_G.text === "" &&
        h4_A.text === ""
    ) {
        notif4.gotoAndStop(1);
    } else {
        notif4.gotoAndStop(2);
    }

    if (
        h5_M.text === "M" &&
        h4_A.text === "A" &&
        h5_T.text === "T" &&
        h5_R.text === "R" &&
        h5_I.text === "I" &&
        h5_K.text === "K" &&
        h5_S.text === "S"
    ) {
        notif5.gotoAndStop(3);
    } else if (
        h5_M.text === "" &&
        h4_A.text === "" &&
        h5_T.text === "" &&
        h5_R.text === "" &&
        h5_I.text === "" &&
        h5_K.text === "" &&
        h5_S.text === ""
    ) {
        notif5.gotoAndStop(1);
    } else {
        notif5.gotoAndStop(2);
    }
}
