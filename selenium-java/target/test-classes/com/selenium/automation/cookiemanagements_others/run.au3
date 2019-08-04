$windowHandle=WinGetHandle("Open")
WinActivate($windowHandle)

ControlSetText("Open","","[CLASS:Edit; INSTANCE:1]", "xxx")

ControlClick ("Open","","[CLASS:Button; INSTANCE:1]")
