## Getting Started

project `settings.gradle`: 

```
dependencyResolutionManagement {
		repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
		repositories {
			mavenCentral()
			maven { url 'https://jitpack.io' }
		}
	}
```



app `build.gradle`: 

```
dependencies {
     implementation 'com.github.mercanbirer:DateTimeLibary:<latest-version>'
}
```


## Usage


- We add the date and format that came from or entered to us from any service(We can use the formats that work for us in the Utility).
- We parse with the 'parseDate' function in the Utility.
- In whichever format we want, we select the appropriate format from the Time Utility, Data Utility or DateTimeUtility objects and apply it.


  
```kotlin

val dateString = "2023 October 12" //any date
val date = parseDate(dateString, Utility.EXT_STANDARD_PATTERN)

val dateFormat = DateUtility.dateStandard(date)
                  
```



* "YYYY" represents the year information (for example, 2023).
* "MM" the moon represents knowledge (for example, 10 October).
* "DD" the day represents knowledge (for example, 13).
* "T" separates the date from the time information.
* "HH" represents the clock information (in 24-hour clock format).
* "MM" it represents minute information.
* "SS" it represents the information of seconds.
