var path = require("path");
module.exports = function(webpackConfig) {
  webpackConfig.babel.plugins.push('transform-runtime');
  webpackConfig.babel.plugins.push(['import', {
    libraryName: 'antd',
    style: 'css',
  }]);
    webpackConfig.output.path = path.join(__dirname,'../src/main/resources/static');
  return webpackConfig;
};
