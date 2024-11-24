//Halaman Awal Latihan Soal

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

menu_utama.addEventListener(MouseEvent.CLICK, fl_ClickToGoToScene_19);

function fl_ClickToGoToScene_19(event:MouseEvent):void
{
	MovieClip(this.root).gotoAndPlay(1, "menu_utama");
}

/* Fade In Movie Clip
Fades in the symbol instance by increasing its alpha property within an ENTER_FRAME event until it is fully visible.

Instructions:
1. To change the speed at which the symbol instance fades in, change the 0.01 value below (the number must be greater than 0 and less than or equal to 1). Higher values cause faster fade in.
2. Because the animation uses an ENTER_FRAME event, it progresses only when the playhead moves to a new frame. The speed of the animation is also affected by the document frame rate.
*/

/* Click to Go to Frame and Play
Clicking on the specified symbol instance moves the playhead to the specified frame in the timeline and continues playback from that frame.
Can be used on the main timeline or on movie clip timelines.

Instructions:
1. Replace the number 5 in the code below with the frame number you would like the playhead to move to when the symbol instance is clicked.
*/
var nilai:int = 0 ;
ml.addEventListener(MouseEvent.CLICK, fl_ClickToGoToAndPlayFromFrame_23);

function fl_ClickToGoToAndPlayFromFrame_23(event:MouseEvent):void
{
	gotoAndPlay(51);
}


/* Click to Go to Scene and Play
Clicking on the specified symbol instance plays the movie from the specified scene and frame.

Instructions:
1. Replace "Scene 3" with the name of the scene you would like play.
2. Replace 1 with the frame number you would like the movie to play from in the specified scene.
*/

buku_panduan111.addEventListener(MouseEvent.CLICK, fl_ClickToGoToScene_109);

function fl_ClickToGoToScene_109(event:MouseEvent):void
{
	MovieClip(this.root).gotoAndPlay(52, "panduan");
}

/* Click to Stop All Sounds
Clicking on the symbol instance stops all sounds currently playing.
*/

ml.addEventListener(MouseEvent.CLICK, fl_ClickToStopAllSounds_13);

function fl_ClickToStopAllSounds_13(event:MouseEvent):void
{
	SoundMixer.stopAll();
}

/* Click to Stop All Sounds
Clicking on the symbol instance stops all sounds currently playing.
*/

buku_panduan111.addEventListener(MouseEvent.CLICK, fl_ClickToStopAllSounds_14);

function fl_ClickToStopAllSounds_14(event:MouseEvent):void
{
	SoundMixer.stopAll();
}

// Code Script Soal di Fitur Latihan Soal
/* Stop at This Frame
The Animate timeline will stop/pause at the frame where you insert this code.
Can also be used to stop/pause the timeline of movieclips.
*/

stop();

a2.addEventListener(MouseEvent.CLICK, a2klik);
function a2klik(event:MouseEvent):void
{
	nextFrame();
}

b2.addEventListener(MouseEvent.CLICK, b2klik);
function b2klik(event:MouseEvent):void
{
	nilai = nilai + 1;
	nextFrame();
}

c2.addEventListener(MouseEvent.CLICK, c2klik);
function c2klik(event:MouseEvent):void
{
	nextFrame();
}

d2.addEventListener(MouseEvent.CLICK, d2klik);
function d2klik(event:MouseEvent):void
{
	nextFrame();
}

e2.addEventListener(MouseEvent.CLICK, e2klik);
function e2klik(event:MouseEvent):void
{
	nextFrame();
}

//Halaman Akhir Latihan Soal
nilaiakhir.text = (nilai / 15 * 100).toString();

sisenang.visible = false;
sisedih.visible = false;
sikecewa.visible = false;

if (nilai > 75)
{
	sisenang.visible = true;
}

if (nilai == 75)
{
	sikecewa.visible = true;
}

if (nilai < 75)
{
	sisedih.visible = true;
}

/* Click to Go to Frame and Play
Clicking on the specified symbol instance moves the playhead to the specified frame in the timeline and continues playback from that frame.
Can be used on the main timeline or on movie clip timelines.

Instructions:
1. Replace the number 5 in the code below with the frame number you would like the playhead to move to when the symbol instance is clicked.
*/

menu_utama.addEventListener(MouseEvent.CLICK, fl_ClickToGoToAndPlayFromFrame_28);

function fl_ClickToGoToAndPlayFromFrame_28(event:MouseEvent):void
{
	gotoAndPlay(1);
}