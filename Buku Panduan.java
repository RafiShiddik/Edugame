//Buku Panduan 
stop();
ke_menu_utama.addEventListener(MouseEvent.CLICK, fl_ClickToGoToScene_6);

function fl_ClickToGoToScene_6(event:MouseEvent):void
{
	MovieClip(this.root).gotoAndPlay(1, "menu_utama");
}
