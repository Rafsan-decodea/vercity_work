Dim WinScriptHost 
Set WinScriptHost = CreateObject( "WScript.Shell" ) 
WinScriptHost.Run Chr(34) & "F:\vercity_work\2021\walisir_assignment\run.bat" & Chr(34), 0 
Set WinScriptHost = Nothing 