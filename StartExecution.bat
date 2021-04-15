del "%~dp0\Scripts\com\arisglobal\scripts\testdata\%1\%2\%1_testData.xlsx"
del "%~dp0\Config\SuiteConfigurationSettings.xlsx"
"C:\Program Files\TortoiseSVN\bin\TortoiseProc.exe" /command:update /path:"%~dp0" /closeonend:1
call mvn install -f %~dp0\pom.xml -Dmaven.compiler.failOnError=false -DProduct=%1 -DVersion=%2 -DURL=%3
echo %ERRORLEVEL%
PAUSE