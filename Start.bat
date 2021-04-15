call mvn install -f D:\EPD\GITREPOAUTOMATIONFRAMEWORK\AutomationFrameWork\AutomationFrameWork\LSHawkEyes\pom.xml -Dmaven.compiler.failOnError=false -DProduct=%1 -DVersion=%2 -DURL=%3
echo %ERRORLEVEL%
PAUSE