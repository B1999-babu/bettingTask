# bettingTask

First you have to paste the Json folder path in application.properties file  ( I have attached the screenshot of Json folder with red mark .That folder path you have to copy  and paste into the application.properties file   )

Property name is =  file.upload-dir







1)http://localhost:8071/bets/uploadfile   this api is for upload json file and it will store records into h2 db







2)h2 database records screenshot

3)http://localhost:8071/bets/listOfAllBets   This api will display the list of all records present in th database










4)http://localhost:8071/bets/get/roulette/2/date  This api will display the list of all bets using game name, client Id  and date parameters


5)http://localhost:8071/bets/post/message?msg=kafka message sent     This api will print the kafka message



