// var exec = require('cordova/exec');

// exports.disbaleScreenshot = function (arg0, success, error) {
//     exec(success, error, 'DisableScreenShot', 'disbaleScreenshot', [arg0]);
// };



var exec = cordova.require('cordova/exec');

var DisableScreenShot = ()=>{
    console.log('DisableScreenShot instanced');
};

DisableScreenShot.prototype.disbale = (onSuccess, onError) => {
    var errorCallback = (obj)=>{
        onError(obj);
    };

    var successCallback = (obj)=>{
        onSuccess(obj);
    };

    exec(successCallback, errorCallback, 'DisableScreenShot', 'disbale');
};

if (typeof module != 'undefined' && module.exports) {
    module.exports = DisableScreenShot;
}
