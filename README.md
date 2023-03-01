# Project_actiTime_Ninad

- Project on actitime Automation Testing using selenium


![GitHub](https://img.shields.io/github/stars/NinadKarlekar/Project_actiTime_Ninad?label=Stars)
![GitHub last commit](https://img.shields.io/github/last-commit/NinadKarlekar/Project_actiTime_Ninad?logo=github)
[![HitCount](http://hits.dwyl.com/NinadKarlekar/Project_actiTime_Ninad.svg)](http://hits.dwyl.com/NinadKarlekar/Project_actiTime_Ninad)





![Selenium](https://img.shields.io/badge/Selenium-43B02A?style=for-the-badge&logo=Selenium&logoColor=white)
![JAVA](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=java&logoColor=white)
![TestNG](https://img.shields.io/badge/testng%20library-323330?style=for-the-badge&logo=testing-library&logoColor=red)
![Eclipse](https://img.shields.io/badge/Eclipse-2C2255?style=for-the-badge&logo=eclipse&logoColor=white)
![Chrome](https://img.shields.io/badge/Google_chrome-4285F4?style=for-the-badge&logo=Google-chrome&logoColor=white)

# Index
1.  [Prerequisite](#prerequisite)
2.  [Steps to run project](#stepstorun)
3.  [Test cases and Output(video)](#outputs)


*************************************************
# Prerequisite

1.  [Java](#prerequisite)
2.  [Eclipse](#eclipse)
3.  [Selenium](#selenium)
4.  [ChromeDriver](#chromedriver)
5.  [DataDrivenFramework](#datadrivenframework)
6.  [TestNG](#testng)


**********************

## java
To download java <a href="https://www.oracle.com/java/technologies/downloads/">click here</a>

*******************************

## Eclipse
To download Eclipse <a href="https://www.eclipse.org/downloads/">click here</a> 

******************************

## Selenium
1. To download Selenium <a href="https://www.selenium.dev/downloads/">click here</a> and click on latest stable version


<img src="actiTime/GitImages/README_SS/SS_SeleniumDownload.png" alt="SS_SeleniumDownload" width="500">

2. After downloading create a folder in java project named as **"jar"**.
3. Copy-Paste .jar file in **"jar"** folder.
4. Select .jar file -> Right click -> Go to build path -> Click on add to build path.

*****************************************

## ChromeDriver

1. To download ChromeDriver <a href="https://chromedriver.chromium.org/">click here</a> and click on latest stable version


<img src="actiTime/GitImages/README_SS/SS_ChromeDriverDownload.png" alt="SS_ChromeDriverDownload" width="500">


2. After downloading create a folder in java project named as **"driver"**.
3. Copy-Paste chromedriver.exe file in **"driver"** folder.
******************************************************

## DataDrivenFramework
### STEPS to download POI
- To download POI follow this steps:-
1. Go to Google and type POI jar file download and select first link or <a href="https://poi.apache.org/download.html"> Click Here</a>.

    ```
        https://poi.apache.org/download.html
    ```

2. Under Binary distribution click on **`.zip`** link.


<img src="actiTime/GitImages/README_SS/POM/SS_BinaryDistribution.jpg" alt="SS_BinaryDistribution" width="500">


3. Click on suggested link for download. The zip file gets downloaded automatically.


<img src="actiTime/GitImages/README_SS/POM/SS_SuggestedLink.jpg" alt="SS_SuggestedLink" width="500">


4. Extract the zip file.

5. Copy paste all jar file from folders and subfolders into jar folder of eclipse.


<img src="actiTime/GitImages/README_SS/POM/SS_jarFolderpaste.jpg" alt="SS_jarFolderpaste" width="500">


6. Select all .jar files -> Right click -> Go to build path -> Click on add to build path.


<img src="actiTime/GitImages/README_SS/POM/SS_BuildPath.jpg" alt="SS_BuildPath" width="500">


7. Create folder called **`data`** in java project and copy-paste excel sheet.


<img src="actiTime/GitImages/README_SS/POM/SS_DATAExcel.jpg" alt="SS_DATAExcel" width="500">


8. Type **USERNAME** and **PASSWORD** in excel sheet and give sheet name as `input`.


<img src="actiTime/GitImages/README_SS/POM/SS_Book1.jpg" alt="SS_Book1" width="500">


*************************************************
************************************
*********************************
## TestNG

1.  [TestNG_Installation](#TestNG_Installation)
2.  [TestNG_Configuration](#TestNG_Configuration)

## TestNG_Installation
Steps:-
1. Open Eclipse and create java project
2. Go to **Help** -> **Eclipse marketplace**


    <img src="actiTime/GitImages/README_SS/TestNG/SS_Help_Marketplace.jpg" alt="SS_Help_Marketplace" width="500">


3. Type **testNG for eclipse** in searchbox and install.

    <img src="actiTime/GitImages/README_SS/TestNG/SS_testng_for_eclipse.jpg" alt="SS_testng_for_eclipse" width="500">

4. During Midway of installation we get a popup. Click on install anyway and after installing restart eclipse.


    <img src="actiTime/GitImages/README_SS/TestNG/SS_InstallAnyway.jpg" alt="SS_InstallAnyway" width="500">

-----------------
**If this is not working try these steps:-**

1. click on Help menu -> Click on Install new software.

2. In popup click on add button. We get add repository popup.

3. Type TestNG in **name** textfield and paste following link in **location** textfield

    <img src="actiTime/GitImages/README_SS/TestNG/SS_AddrepoLINK.jpg" alt="SS_AddrepoLINK" width="500">

```
    https://testng.org/testng-eclipse-update-site
```


4. Select TestNG Checkbox and click on next and finish.

5. During Midway of installation we get a popup. Click on install anyway and after installing restart eclipse.


    <img src="actiTime/GitImages/README_SS/TestNG/SS_InstallAnyway.jpg" alt="SS_InstallAnyway" width="500">



******************************

## TestNG_Configuration

1. Right click on java project -> build path -> add libraries


    <img src="actiTime/GitImages/README_SS/TestNG/SS_AddLibraries.jpg" alt="SS_AddLibraries" width="500">

2. Select TestNG from popup click on next and finish.


    <img src="actiTime/GitImages/README_SS/TestNG/SS_TestNGPOPUP.jpg" alt="SS_TestNGPOPUP" width="500">

3. By doing this the TestNG library is added into project.

*************************************************
************************************
*********************************

# StepsToRun

1. Download and open project in **Eclipse**.
2. Go to **actitime** project -> **src** -> Right click on **actitime_testscripts** -> **TextNG** -> **Convert to TestNG**

    <img src="actiTime/GitImages/README_SS/Steps/convertToTestNG.png" alt="convertToTestNG" width="550">


3. Enter Suite name & Test name -> click on finish.
4. Right click on newly generated **.xml** file -> **Run as** -> **TestNG Suite**.

    <img src="actiTime/GitImages/README_SS/Steps/Run%20as.png" alt="runas" width="550">

5. If you want to change Order of Execution of programs then, Right click on **.xml** file -> Open with -> **Text editor**
6. Change the order of execution in .xml file (Changes should be in between `<classes>` & `</classes>` only)


    <img src="actiTime/GitImages/README_SS/Steps/XML.png" alt="XML.png" width="550">


-------------------------------------------------
----------------------------------------------
------------------------------------------------

# Outputs


<details>
<summary> <b>Tasks (Click to expand 👆)</b> </summary>

*    <details>
     <summary>Task 001</summary>

     ````md  
        Task 001

        1.Launch the browser
        2.Enter the url
        3.Enter username
        4.Enter the password
        5.Click on 'Tasks' in Menu bar
        6.Click on '+ Add New' in Tasks
        7.Click on 'New Customer' in '+ Add New' drop down list
        8.Enter customer name under 'Details' in Create New Customer page
        9.Click on 'Copy Projects from an Existing Customer:' drop downs.
        10.Select any option from the 'Copy Projects from an Existing Customer:' drop down
        11.Click on '+ Create Customer' button in Create New Customer page
        12.Logout from actiTime
        13.close Browser
     ````


     https://user-images.githubusercontent.com/88243315/197852067-fb41c3e7-96bf-4eb4-b628-f222bbf583ea.mp4     
     </details>


*    <details>
     <summary>Task 002</summary>

     ````md  
        Task 002

        1.Launch the browser
        2.Enter the url
        3.Enter username
        4.Enter the password
        5.Click on 'Tasks' in Menu bar
        6.Click on '+ Add New' in Tasks
        7.Click on 'New Task' in '+ Add New' drop down list
        8.Click on 'Select Customer' drop down under 'Details' in Create New Task page (1st Dropdown)
        9.Click on 'any customer' from drop down in Create New Task page
        10.Click on 'Select Project' drop down under 'Details' in Create New Task page (2nd Dropdown)
        11.Click on 'any project' from drop down in Create New Task page
        12.Click on 'Enter Task Name' text field in in Create New Task page
        13.Enter task name in 'Enter Task Name' text field in Create New Task page
        15.Click on 'Estimate' text field in Create New Task page
        16.Click on 'Deadline' text field in Create New Task page
        17.Click on Checkbox in Create New Task page
        18.'Click on '+ Create Task 'button in Create New Project page
     ````


     https://user-images.githubusercontent.com/88243315/197854944-a5cc530f-ee2f-4f2f-a3b8-f3783555f524.mp4     
     </details>



*    <details>
     <summary>Task 003</summary>

     ````md
        Task 003

        1.Launch the browser
        2.Enter the url
        3.Enter username
        4.Enter the password
        5.Click on 'Tasks' in Menu bar
        6.Click on '+ Add New' in Tasks
        7.Click on 'New Task' in '+ Add New' drop down list
        8.Click on 'Select Customer' drop down under 'Details' in Create New Task page (1st Dropdown)
        9.Click on 'any customer' from drop down in Create New Task page
        10.Click on 'Select Project' drop down under 'Details' in Create New Task page (2nd Dropdown)
        11.Click on 'any project' from drop down in Create New Task page
        12.Click on 'Enter Task Name' text field in in Create New Task page
        13.Enter task name in 'Enter Task Name' text field in Create New Task page
        15.Click on 'Estimate' text field in Create New Task page
        16.Click on 'Deadline' text field in Create New Task page
        17.Click on Checkbox in Create New Task page
        18.'Click on '+ Create Task 'button.in Create New Project page
     ````

     https://user-images.githubusercontent.com/88243315/197594694-76226355-d375-4461-bae7-c757b652f6fc.mp4
     </details>


</details>

<!-- ## Tasks
<details>
  </br>

  - [X] Item1
  - [ ] Item2
  - [ ] Item3

</details> -->



