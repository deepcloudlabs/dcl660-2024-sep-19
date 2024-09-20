const {connect} = require("mongoose");
const mongo_config = require("./mongo-config.json")
const connect_mongodb = () => {
    return connect(`mongodb://${mongo_config.host}:${mongo_config.port}/${mongo_config.database}`, mongo_config.options)
}
exports.connect_mongodb = connect_mongodb;
