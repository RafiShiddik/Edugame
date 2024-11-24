//Materi

/* Stop at This Frame
The Animate timeline will stop/pause at the frame where you insert this code.
Can also be used to stop/pause the timeline of movieclips.
*/

stop();



/* Click to Go to Frame and Play
Clicking on the specified symbol instance moves the playhead to the specified frame in the timeline and continues playback from that frame.
Can be used on the main timeline or on movie clip timelines.

Instructions:
1. Replace the number 5 in the code below with the frame number you would like the playhead to move to when the symbol instance is clicked.
*/

ikon_materi_teks.addEventListener(MouseEvent.CLICK, fl_ClickToGoToAndPlayFromFrame_4);

function fl_ClickToGoToAndPlayFromFrame_4(event:MouseEvent):void
{
	gotoAndPlay(5);
}

/* Click to Go to Scene and Play
Clicking on the specified symbol instance plays the movie from the specified scene and frame.

Instructions:
1. Replace "Scene 3" with the name of the scene you would like play.
2. Replace 1 with the frame number you would like the movie to play from in the specified scene.
*/

menu_utama.addEventListener(MouseEvent.CLICK, fl_ClickToGoToScene_17);

function fl_ClickToGoToScene_17(event:MouseEvent):void
{
	MovieClip(this.root).gotoAndPlay(1, "menu_utama");
}


/* Click to Go to Web Page
Clicking on the specified symbol instance loads the URL in a new browser window.

Instructions:
1. Replace http://www.adobe.com with the desired URL address.
   Keep the quotation marks ("").
*/

ikon_materi_video.addEventListener(MouseEvent.CLICK, fl_ClickToGoToWebPage);

function fl_ClickToGoToWebPage(event:MouseEvent):void
{
	navigateToURL(new URLRequest("https://youtu.be/rE7Yx7zyBEo?feature=shared"), "_blank");
}

/* Click to Go to Scene and Play
Clicking on the specified symbol instance plays the movie from the specified scene and frame.

Instructions:
1. Replace "Scene 3" with the name of the scene you would like play.
2. Replace 1 with the frame number you would like the movie to play from in the specified scene.
*/

buku_panduan11.addEventListener(MouseEvent.CLICK, fl_ClickToGoToScene_107);

function fl_ClickToGoToScene_107(event:MouseEvent):void
{
	MovieClip(this.root).gotoAndPlay(30, "panduan");
}

/* Click to Stop All Sounds
Clicking on the symbol instance stops all sounds currently playing.
*/

ikon_materi_teks.addEventListener(MouseEvent.CLICK, fl_ClickToStopAllSounds_10);

function fl_ClickToStopAllSounds_10(event:MouseEvent):void
{
	SoundMixer.stopAll();
}

/* Click to Stop All Sounds
Clicking on the symbol instance stops all sounds currently playing.
*/

ikon_materi_video.addEventListener(MouseEvent.CLICK, fl_ClickToStopAllSounds_11);

function fl_ClickToStopAllSounds_11(event:MouseEvent):void
{
	SoundMixer.stopAll();
}

/* Click to Stop All Sounds
Clicking on the symbol instance stops all sounds currently playing.
*/

menu_utama.addEventListener(MouseEvent.CLICK, fl_ClickToStopAllSounds_12);

function fl_ClickToStopAllSounds_12(event:MouseEvent):void
{
	SoundMixer.stopAll();
}

//Materi teks
/* Stop at This Frame
The Animate timeline will stop/pause at the frame where you insert this code.
Can also be used to stop/pause the timeline of movieclips.
*/

stop();

/* Click to Go to Frame and Play
Clicking on the specified symbol instance moves the playhead to the specified frame in the timeline and continues playback from that frame.
Can be used on the main timeline or on movie clip timelines.

Instructions:
1. Replace the number 5 in the code below with the frame number you would like the playhead to move to when the symbol instance is clicked.
*/

home1.addEventListener(MouseEvent.CLICK, fl_ClickToGoToAndPlayFromFrame_3);

function fl_ClickToGoToAndPlayFromFrame_3(event:MouseEvent):void
{
	gotoAndPlay(1);
}

/* Click to Go to Frame and Play
Clicking on the specified symbol instance moves the playhead to the specified frame in the timeline and continues playback from that frame.
Can be used on the main timeline or on movie clip timelines.

Instructions:
1. Replace the number 5 in the code below with the frame number you would like the playhead to move to when the symbol instance is clicked.
*/

next_materi_1.addEventListener(MouseEvent.CLICK, fl_ClickToGoToAndPlayFromFrame_5);

function fl_ClickToGoToAndPlayFromFrame_5(event:MouseEvent):void
{
	gotoAndPlay(49);
}

//Akhir Materi Teks
/* Stop at This Frame
The Animate timeline will stop/pause at the frame where you insert this code.
Can also be used to stop/pause the timeline of movieclips.
*/

stop();
//nama_kamu.text = NamaTeks;
/* Click to Go to Frame and Play
Clicking on the specified symbol instance moves the playhead to the specified frame in the timeline and continues playback from that frame.
Can be used on the main timeline or on movie clip timelines.

Instructions:
1. Replace the number 5 in the code below with the frame number you would like the playhead to move to when the symbol instance is clicked.
*/

km1.addEventListener(MouseEvent.CLICK, fl_ClickToGoToAndPlayFromFrame_21);

function fl_ClickToGoToAndPlayFromFrame_21(event:MouseEvent):void
{
	gotoAndPlay(1);
}

/* Click to Go to Frame and Play
Clicking on the specified symbol instance moves the playhead to the specified frame in the timeline and continues playback from that frame.
Can be used on the main timeline or on movie clip timelines.

Instructions:
1. Replace the number 5 in the code below with the frame number you would like the playhead to move to when the symbol instance is clicked.
*/

back1.addEventListener(MouseEvent.CLICK, fl_ClickToGoToAndPlayFromFrame_22);

function fl_ClickToGoToAndPlayFromFrame_22(event:MouseEvent):void
{
	gotoAndPlay(136);
}

nama_kamu.text = NamaTeks;