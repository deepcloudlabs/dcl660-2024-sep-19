const {connect_mongodb} = require("./mongo-repository-base");
const {getCountryByCode, createNewCountry, getCountriesByContinent} = require("./mongo-repository-world");

const application = () => {
    console.log("Connected to the mongodb...");

    /*getCountryByCode("TUR").then((country) => {
        newCountry = {};
        newCountry._id = "PQR";
        newCountry.name= "Pqr";
        newCountry.population=10000;
        newCountry.gnp=324234;
        newCountry.continent="Europe";
        newCountry.cities = [];
        createNewCountry(newCountry).then((createdCountry) => {
            console.log("Country is created!");
        });
    })*/
    getCountriesByContinent("Asia",2,2).then(countries => {
        countries.forEach(country => {console.log(country)})
    })
}

connect_mongodb().then(  application )

