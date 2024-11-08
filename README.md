# Unit 3 - Data for Social Good Project 

## Introduction 

Software engineers develop programs to work with data and provide information to a user. Each user has different needs based on the information they are looking for from data. Your goal is to create a data analysis program for your user that stores and analyzes data to provide the information they need. 

## Requirements 

Use your knowledge of object-oriented programming, one-dimensional (1D) arrays, and algorithms to create your data analysis program: 
- **Write a class** – Write a class to represent your user or business and store and analyze their data with no-argument and parameterized constructors. 
- **Create at least two 1D arrays** – Create at least two 1D arrays to store the data that your user needs information about. 
- **Write a method** – Write a method that finds or manipulates the elements in a 1D array to provide the information your user needs. 
- **Implement a toString() method** – Write a toString() method that returns general information about the data (for example, number of values in the dataset). 
- **Document your code** – Use comments to explain the purpose of the methods and code segments and note any preconditions and postconditions. 

## User Story 

> As a chef prodigy, I want to analyze nutritional data so that I can know what certain fast foods have nutritional value.

## Dataset  

Dataset: https://docs.google.com/spreadsheets/d12yhGT-p1yMXXig27pvMEkC_E5a3tLRlXA1sXopHgwzI/edit?gid=1415920287#gid=1415920287
- **Name** (String) - name of the meal 
- **Calories** (int) - amount of calories in the meal
- **Fats** (double) - amount of fats in the meal
- **Proteins** (double) - amount of proteins in the meal
- **Cholesterol** (int) - amount of cholesterol in the meal

## UML Diagram 

![UML Diagram for my project](JAYDEN_HAYNES_-_(Unit_3)_UML_Diagram.png) 

## Description 

My project is about finding the nutritional value of a meal to find which are the most healthy. My dataset was found in Code.org but was imported from a Google Sheet. The sheet shows the nutritional values of all sorts of fast foods, which did meet my UserStory description. The code is about finding the item with the highest calories and fats together, and finding the item with the highest proteins and lowest cholesterol together. I made them combine into two methods so it wouldn't take longer. The Google Sheet was made into txt files of what I needed and then were made into 1-D arrays. After that, I made for-loops in each method to traverse the 1-D arrays to find my UserStory requirements and put them in an index. Then, the toString() method returns the indexes in a format. Finally, in the tester class, it prints out the information onto the console with System.out.println().