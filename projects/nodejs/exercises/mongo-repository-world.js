const {getCountryModel} = require("./world-domain");
const CountryModel = getCountryModel();

const getCountryByCode = (code) => {
    return CountryModel.find(
        {"_id": code},
        {"cities": false}
    );
}

const getCountriesByContinent = (continent,pageNo=0,pageSize=10) => {
    return CountryModel.find(
        {continent},
        {"cities": false},
        {skip: pageNo*pageSize, limit: pageSize}
    );
}
createNewCountry = (countryDTO) => {
   const countryDocument = new CountryModel(countryDTO);
   return countryDocument.save();
}

exports.getCountryByCode = getCountryByCode;
exports.createNewCountry = createNewCountry;
exports.getCountriesByContinent = getCountriesByContinent;
