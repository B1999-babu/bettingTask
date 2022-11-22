# bettingTask

1)  First you have to paste the Json folder path in application.properties file  ( I have attached the screenshot of Json folder with red mark .That folder path you have to copy  and paste into the application.properties file   )

Property name is =  file.upload-dir

Screenshot link:  https://drive.google.com/file/d/1EYF6G4xeLXieQZsypN8_5rnNZBGI72v-/view?usp=sharing

        
 2) a) using this api you can load json file without local directory
 
 http://localhost:8071/bets/loadJsonfile
 
 Screenshot : https://drive.google.com/file/d/1AMIM7HEBRApv160q17z88qXA2IDTXRE6/view?usp=sharing





b)http://localhost:8071/bets/uploadfile   this api is for upload json file and it will store records into h2 db
 Screenshot :  https://drive.google.com/file/d/1WUt1SN60-Exw777Fd7k_nyZ4Bf4Te16I/view?usp=sharing






3)h2 database records screenshot

Screenshot : https://drive.google.com/file/d/12kUxIzNNhjjrDGixrAy-hQ6NitPU9kyb/view?usp=sharing

4)http://localhost:8071/bets/listOfAllBets   This api will display the list of all records present in th database

Screenshot : https://drive.google.com/file/d/1CJq2okBNUkOhrD4t0Z1D1SnSPhuqlwaX/view?usp=sharing




5)http://localhost:8071/bets/get/roulette/2/date  This api will display the list of all bets using game name, client Id  and date parameters

Screenshot : https://drive.google.com/file/d/1FdYSolusRjDqbVkOTmxFnT2DoSD5q7uA/view?usp=sharing


6)http://localhost:8071/bets/post/message?msg=kafka message sent     This api will print the kafka message

Screenshot : https://drive.google.com/file/d/1yCHSBUe7Xl0OpMk5NARV6fcQIymPi4QD/view?usp=sharing



