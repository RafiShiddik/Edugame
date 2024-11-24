//Soal di Quis

/* Stop at This Frame
The Animate timeline will stop/pause at the frame where you insert this code.
Can also be used to stop/pause the timeline of movieclips.
*/

stop();

var nilai_1:int = 0 ;

a16.addEventListener(MouseEvent.CLICK, a16klik);
function a16klik(event:MouseEvent):void
{
	nextFrame();
}

b16.addEventListener(MouseEvent.CLICK, b16klik);
function b16klik(event:MouseEvent):void
{
	nextFrame();
}

c16.addEventListener(MouseEvent.CLICK, c16klik);
function c16klik(event:MouseEvent):void
{
	nextFrame();
}
d16.addEventListener(MouseEvent.CLICK, d16klik);
function d16klik(event:MouseEvent):void
{
	nextFrame();
}
e16.addEventListener(MouseEvent.CLICK, e16klik);
function e16klik(event:MouseEvent):void
{
	nilai_1 = nilai_1 + 10;
	nextFrame();
}

//Halaman Terakhir Soal Quis
bintang_1.visible = false;
bintang_2.visible = false;
bintang_3.visible = false;

if (nilai_101> 80)
{
	bintang_3.visible = true;
}

if (nilai_101 == 70)
{
	bintang_2.visible = true;
}

if (nilai_101< 70)
{
	bintang_1.visible = true;
}



stop();

/* Click to Go to Scene and Play
Clicking on the specified symbol instance plays the movie from the specified scene and frame.

Instructions:
1. Replace "Scene 3" with the name of the scene you would like play.
2. Replace 1 with the frame number you would like the movie to play from in the specified scene.
*/

home1.addEventListener(MouseEvent.CLICK, fl_ClickToGoToScene_97);

function fl_ClickToGoToScene_97(event:MouseEvent):void
{
	MovieClip(this.root).gotoAndPlay(149, "halaman_permainan");
}
