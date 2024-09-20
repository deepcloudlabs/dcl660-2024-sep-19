const {model, Schema} = require("mongoose");

const CitySchema = new Schema({
    "_id": {
        type: Number,
        required: true
    },
    "district": {
        type: String,
        required: true
    },
    "name": {
        type: String,
        required: true
    },
    "population": {
        type: Number
    }
});

const CountrySchema = new Schema({
    "_id": {
        type: String,
        required: true
    },
    "capital": {
        type: Number
    },
    "cities":  [ CitySchema ],
    continent: {
        type: String,
        required: true,
        enums: [  'Africa', 'Antarctica', 'Asia', 'Europe', 'North America', 'Oceania', 'South America']
    },
    gnp: {
        type: Number
    },
    governmentForm: {
        type: String
    },
    headOfState: {
        type: String
    },
    indepYear: {
        type: Number
    },
    lifeExpectancy: {
        type: Number
    },
    localName: {
        type: String
    },
    name: {
        type: String,
        minLength: 3
    },
    population: {
        type: Number,
        min: 0
    },
    region: {
        type: String
    },
    surfaceArea: {
        type: Number
    }
});

const CountryModel = model("countries", CountrySchema);

const getCountryModel = () => {
  return CountryModel;
};

exports.getCountryModel = getCountryModel;
