//Kunci Jawaban Latihan Soal

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

kl1.addEventListener(MouseEvent.CLICK, fl_ClickToGoToScene_124);

function fl_ClickToGoToScene_124(event:MouseEvent):void
{
	MovieClip(this.root).gotoAndPlay(52, "halaman_latihan_soal");
}
