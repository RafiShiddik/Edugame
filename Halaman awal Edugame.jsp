//halaman Masuk siswa
/* Stop at This Frame
The Animate timeline will stop/pause at the frame where you insert this code.
Can also be used to stop/pause the timeline of movieclips.
*/

stop();

/* Click to Go to Scene and Play
Clicking on the specified symbol instance plays the movie from the specified scene and frame.

Instructions:
1. Replace "Scene 3" with the name of the scene you would like play.
2. Replace 1 with the frame number you would like the movie to play from in the specified scene.
*/
var NamaTeks;
mulai.addEventListener(MouseEvent.CLICK, fl_ClickToGoToScene_106);

function fl_ClickToGoToScene_106(event:MouseEvent):void
{
	NamaTeks = Nama_text.text;
	MovieClip(this.root).gotoAndPlay(1, "menu_utama");
}

//Menu Utama 
nama_kamu.text = NamaTeks;


latihan_soal.addEventListener(MouseEvent.CLICK, fl_ClickToGoToScene_13);

function fl_ClickToGoToScene_13(event:MouseEvent):void
{
	MovieClip(this.root).gotoAndPlay(1, "halaman_latihan_soal");
}


materi.addEventListener(MouseEvent.CLICK, fl_ClickToGoToScene_14);

function fl_ClickToGoToScene_14(event:MouseEvent):void
{
	MovieClip(this.root).gotoAndPlay(1, "materi");
}



stop();

/* Click to Stop All Sounds
Clicking on the symbol instance stops all sounds currently playing.
*/

latihan_soal.addEventListener(MouseEvent.CLICK, fl_ClickToStopAllSounds_5);

function fl_ClickToStopAllSounds_5(event:MouseEvent):void
{
	SoundMixer.stopAll();
}

materi.addEventListener(MouseEvent.CLICK, fl_ClickToStopAllSounds_6);

function fl_ClickToStopAllSounds_6(event:MouseEvent):void
{
	SoundMixer.stopAll();
}


keluar_aplikasi.addEventListener (MouseEvent.CLICK, keluar);

function keluar (e:MouseEvent) : void 
{
	NativeApplication.nativeApplication.exit(0);
}

buku_panduan1.addEventListener(MouseEvent.CLICK, fl_ClickToGoToScene_115);

function fl_ClickToGoToScene_115(event:MouseEvent):void
{
	MovieClip(this.root).gotoAndPlay(1, "panduan");
}

kuis.addEventListener(MouseEvent.CLICK, fl_ClickToGoToScene_116);

function fl_ClickToGoToScene_116(event:MouseEvent):void
{
	MovieClip(this.root).gotoAndPlay(1, "halaman_permainan");
}


kuis.addEventListener(MouseEvent.CLICK, fl_ClickToStopAllSounds_9);

function fl_ClickToStopAllSounds_9(event:MouseEvent):void
{
	SoundMixer.stopAll();
}


/* Click to Go to Scene and Play
Clicking on the specified symbol instance plays the movie from the specified scene and frame.

Instructions:
1. Replace "Scene 3" with the name of the scene you would like play.
2. Replace 1 with the frame number you would like the movie to play from in the specified scene.
*/

permainan.addEventListener(MouseEvent.CLICK, fl_ClickToGoToScene_123);

function fl_ClickToGoToScene_123(event:MouseEvent):void
{
	MovieClip(this.root).gotoAndPlay(1, "halaman_tts");
}

