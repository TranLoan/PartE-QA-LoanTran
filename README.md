# Instruction

## Setting Browser Driver

Download Browser Driver:
- Chrome Driver: https://chromedriver.chromium.org/downloads
- Firefox Driver: https://github.com/mozilla/geckodriver/releases/

Set Environment Variables
- Set Environment Path to location of the folder that contains the drivers

## Run Test Cases
Open Command Prompt in project folder.

`mvn clean test -Dbrowser={Chrome|Firefox}`