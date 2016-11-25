//noinspection JSUnresolvedVariable
module.exports = {
    entry:"./index.js",
    output:{
        path:__dirname,
        filename:"bundle.js"
    },
    loaders:[
        {test:/\.js$/, loader:"babel-loader"}
    ]
}