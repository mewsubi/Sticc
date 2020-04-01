@echo off
cd /d %~dp0
cd .
dir /s /B *.class > sources.txt
powershell -Command "(gc sources.txt) -replace 'C:\\Users\\noldea\\Documents\\Minecraft\\Sticc\\build\\', '' | Out-File -encoding ASCII sources.txt"
jar cmf sticc.mf ../Sticc.jar plugin.yml @sources.txt
cd ..