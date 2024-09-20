set MONGODB_PATH=C:\study-mongodb\mongodb-enterprise-7.0.14
set RESOURCES_PATH=C:\study-mongodb\resources
set PATH=%MONGODB_PATH%\bin;%PATH%
mongoimport --db world --collection countries --quiet --file %RESOURCES_PATH%\countries.json --jsonArray
mongoimport --db imdb --collection movies --quiet --file %RESOURCES_PATH%\movies.json --jsonArray