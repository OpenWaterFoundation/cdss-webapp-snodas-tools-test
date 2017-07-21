# cdss-webapp-snodas-tools-test
Automated tests for CDSS SNODAS Tools (cdss-webapp-snodas-tools)

This repository contains functional tests for the SNODAS Web application tool for the [Colorado Decision Support Systems (CDSS)](http://cdss.state.co.us/Pages/CDSSHome.aspx) and is available from the[Open Water Foundation](http://projects.openwaterfoundation.org/owf-proj-co-cwcb-2016-snodas/prototype/index.html).

SNODAS functional tests consist of Groovy command files and test different elements used in the SNODAS Web application. The purpose of these tests is to validate the SNDOAS Web App is working properly and displays the proper information. This repository is meant to serve as an example using Spock, Groovy and Geb and should be used as a starting template for writing Groovy test cases. 

# Getting Started
A standard development folder structure is recommended, consistent with the main [CDSS SNODAS Tools software](https://github.com/OpenWaterFoundation/cdss-app-snodas-tools). The website development files can be set up as follows (Windows is assumed, but linux would be similar):

```
> C:
> cd \Users\user
> mkdir CDSS-SNODAS-Tools-Test
> cd CDSS-SNODAS-Tools-Test
> mkdir git-repos
> cd git-repos
> git clone https://github.com/OpenWaterFoundation/cdss-webapp-snodas-tools-test.git
```

This repository consists of an Eclipse Project that will be used to run the test cases on the SNODAS Web Application. 

Refer to the document below for iniital setup:
* [Spock Eclipse Doc](https://www.dropbox.com/home/OWF-admin-staff/howto/HowTo-IT-SoftwareDevelopers/HowTo-IT-Spock-Testing-Eclipse?preview=OWF-HowTo-Spock-Web-Testing.docx)