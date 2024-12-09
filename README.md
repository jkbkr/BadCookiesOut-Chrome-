# CookiesOut

## Currently solves cookie consent banners:

- Solves >>> https://www.kdomivolal.eu/
- Solves >>> https://www.mediafire.com/download/gp00z1oqvlmc4pr
- WIP >>> https://icon-icons.com/search/icons/?filtro=google+chrome

## Warning

The automatic unchecking currently works only in the default browser tab. Additionally, if the program has been launched, you will need to either restart your computer or end the task in Task Manager before you can remove or move the program.

## Overview
This is a Selenium-based Java program designed to automate the detection and management of unwanted cookies during web browsing. The program runs as a standalone Java application and uses Selenium WebDriver to interact with a web browser, identify cookie consent banners, and automatically uncheck undesirable cookie options. This helps users avoid the need to manually decline unwanted cookies that may track or advertise to them.

Users can easily execute the program from their development environment (e.g., IntelliJ IDEA) or from the command line.

## Features:
- __Selenium WebDriver Automation:__ Automates interaction with cookie consent banners in web browsers.
- __Privacy-First:__ Automatically unchecks intrusive cookies like tracking and marketing cookies, helping users preserve privacy.
- __Support for Multiple cookie consent banners:__ Initially supports automated cookie management for most common cookie consent banners, with plans to expand.

## Use Cases
#### - Avoiding Tracking and Advertisement Cookies:

Users who want to browse the web without being tracked or bombarded by targeted ads can use this program to automatically uncheck all cookies related to tracking, advertising, and analytics.
#### - Time-Saving for Frequent Visitors:

For users who visit websites with intrusive cookie banners frequently, Infinite Loop can save time by automatically managing cookie preferences every time they visit these sites, removing the need for manual intervention.

## User Story
As a privacy-conscious user, I want a tool that will automatically detect and uncheck all unwanted cookies whenever I visit certain websites, so that I can maintain my privacy without the need to manually adjust cookie settings each time I visit.

## How It Works
#### - Cookie Detection:

Infinite Loop detects a cookie consent popup on the websites you visit. This includes identifying cookie settings that offer options to accept cookies for tracking, advertising, or analytics.
#### - Automatic Unchecking:

The extension automatically identifies the checkboxes that typically relate to privacy-invasive cookies (such as analytics or marketing cookies) and unchecks them.

## Requirements
- __Browser:__ Latest version of Chrome.
- __Operating System:__ Windows, macOS, or Linux.
- __Java:__ Make sure Java is installed on your system.

## Installation
To install and run the Selenium Java Program from your development environment (e.g., IntelliJ IDEA or another Java IDE), follow these steps:

#### 1. Prerequisites:

1. __Java:__ Make sure you have Java 8 or newer installed on your machine.
You can check your Java version by running "java -version" in your terminal or command prompt.
2. __IDE (IntelliJ IDEA):__ Although you can use any IDE that supports Java, this guide assumes you're using IntelliJ IDEA.
3. __Selenium WebDriver:__ The project requires the Selenium WebDriver library. If you're using IntelliJ IDEA, Maven will automatically handle the dependencies.

#### 2. Clone the Repository:

Clone the repository to your local machine using Git.

#### 3. Import the Project in IntelliJ IDEA:

- Open IntelliJ IDEA.
- Select File > Open, and choose the directory where you cloned the repository.
- IntelliJ IDEA should automatically recognize the project as a Maven-based Java project (if you're using Maven).

#### 4. Dependencies:

Maven will automatically manage all dependencies for you. When you open the project in IntelliJ IDEA, Maven will download all required libraries, including Selenium WebDriver, based on the dependencies listed in the pom.xml file.
No need for manual configuration or downloading of libraries such as Selenium or browser drivers. The project will automatically pull them in.

#### 5. Configure WebDriver (if necessary):

If you use a tool like WebDriverManager (e.g., bonigarcia/webdrivermanager), it will automatically handle downloading and setting up the correct WebDriver for the browser on your machine (e.g., ChromeDriver for Chrome). This eliminates the need for manual configuration of WebDriver executables.
If you don't use WebDriverManager and your project works fine without explicitly specifying drivers, it's likely that your WebDriver is already configured automatically or is bundled within the project.

#### 6. Run the Program:

- Once the project is set up and dependencies are installed, you can run the program directly from your IDE by selecting the main class (the class with the __RemoveCookiesLoop__ method) and hitting Run.
- The program will automatically open the browser, navigate to the specified website(s), and perform cookie consent actions.

## Disclaimer

This application is provided for educational purposes only. It is designed to demonstrate automated browser interactions and cookie management techniques.

By using this application, you agree that you are solely responsible for ensuring compliance with all applicable laws and regulations, including but not limited to privacy and cookie consent laws such as GDPR. The author of this program assumes no liability for any misuse or legal issues arising from its use.

Use this tool responsibly.

