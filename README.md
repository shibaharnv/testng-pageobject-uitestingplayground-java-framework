# UiTestingPlayGround-TestNG-PageObjectModel-Java-Framework

Selenium page object automation framework using java &amp; Maven &amp; TestNG & Extent Report


## Technology Stack

- Java
- TestNG
- Maven


## Prerequisites
- Java
- Maven


**Clone the application**

```bash
git clone -b main https://github.com/shibaharnv/testng-pageobject-uitestingplayground-java-framework.git
```

### How to run the tests locally ###

```bash=
                       mvn clean test -DXML="test.xml" -DexecutionMode="Local"

```

### How to run the tests locally using groups ###

```bash

                       mvn clean test -DXML="test_group.xml" -DexecutionMode="Local"
          
```


### How to run the tests in headless mode ###

```bash
          Open the cloned project in IDE and navigate to test.xml in the root directory and run it.
                                        OR
                       mvn clean test -DXML="test.xml" -DexecutionMode="Remote"

```



###  Docker Image creation and testcase exectution inside docker container

Docker image can be created for this automation project using the below command

```bash
            docker build --no-cache -t {imagename} .

```

All the testcases present in the framework can be executed inside the docker container

####  Docker Container Creation

```bash
            docker create {imagename}
```

####  Testcases execution inside Docker Container

```bash
            docker run {imagename}
```






### How to run the test in a CI/CD pipeline

         - CI CD Pipeline in configured in Gitlab .Navigate to below url and click on run pipeline button

```bash
             https://gitlab.com/mynewgroupshibahar/testngframework/-/pipelines/new

```


### Link to the results in Calliope.pro ###



```bash
            https://app.calliope.pro/reports/150959

```


### one improvement point for Calliope.pro platform ###

While creating group and profile multiple error messages are displayed.

Selecting group  while uploading the report can be more user friendly.


![Screenshot 2022-10-07 at 12 54 24](https://user-images.githubusercontent.com/65211677/194496474-72526f94-31c4-4dc9-a264-ba9094370c02.png)


### one new feature for the Calliope.pro platform ###

          In the Login page of calliope.pro platform "forgot password" feature can be added.


### What you used to select the test scenarios, what was your approach ###

          I have selected the testcases for ui testing play ground application by considering the following approaches. i.e) User interface testing,
          and acceptance testing.
          
          Testcases are designed in such a way that we validate the end to flow to ensure the application works as expected.

### Why are testcases the most important; ###     

      These testcases ensure end to end coverage and handles different web action methods like click,entering text,mouse hover,capturing text,scroll etc
      Automation testcases are designed in such a way to capture all the error or unexpected behaviour from the application      


### What could be the next steps to your project ###

                   Configuration to send the test report through email or communication channels like slack etc.


## Sample Report

![Screenshot 2022-10-07 at 19 27 47](https://user-images.githubusercontent.com/65211677/194571163-44079bb2-f41f-4b0c-8d25-0e052ce4a33a.png)



