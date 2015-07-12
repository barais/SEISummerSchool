var __extends = this.__extends || function (d, b) {
    for (var p in b) if (b.hasOwnProperty(p)) d[p] = b[p];
    function __() { this.constructor = d; }
    __.prototype = b.prototype;
    d.prototype = new __();
};
var KevoreeEntities = require('kevoree-entities');
var mraa = require('mraa');
var HeadsTempEdisonComp = (function (_super) {
    __extends(HeadsTempEdisonComp, _super);
    function HeadsTempEdisonComp() {
        _super.apply(this, arguments);
        //dic_msg: KevoreeEntities.DictionaryAttribute = {};
        this.dic_test = { datatype: KevoreeEntities.DataType.BOOLEAN };
        this.dic_period = { datatype: KevoreeEntities.DataType.INT, defaultValue: 500 };
    }
    HeadsTempEdisonComp.prototype.start = function (done) {
        var _this = this;
        this.log.info(this.toString(), 'start');
        var test = this.dictionary.getBoolean('test', true);
        var period = this.dictionary.getNumber('period', 500);
        if (!test) {
            //var mraa = require('mraa'); //require mraa
            this.log.info(this.toString(), 'MRAA Version: ' + mraa.getVersion());
            this.analogPin0 = new mraa.Aio(0);
            this.timerToken = setInterval(function () { var value = _this.analogPin0.read(); _this.log.info(_this.toString(), "" + value); _this.out_out("" + value); }, period);
        }
        else {
            this.timerToken = setInterval(function () { return _this.log.info(_this.toString(), "" + parseInt("" + ((Math.random() * 60) - 20), 10)); }, period);
        }
        done();
    };
    HeadsTempEdisonComp.prototype.stop = function (done) {
        this.log.info(this.toString(), 'stop');
        clearInterval(this.timerToken);
        done();
    };
    HeadsTempEdisonComp.prototype.update = function (done) {
        var _this = this;
        this.log.info(this.toString(), 'update');
        clearInterval(this.timerToken);
        var test = this.dictionary.getBoolean('test', true);
        var period = this.dictionary.getNumber('period');
        if (!test) {
            this.timerToken = setInterval(function () { var value = _this.analogPin0.read(); _this.log.info(_this.toString(), "" + value); _this.out_out("" + value); }, period);
        }
        else {
            this.timerToken = setInterval(function () { return _this.log.info(_this.toString(), "" + Math.random()); }, period);
        }
        done();
    };
    HeadsTempEdisonComp.prototype.in_getValue = function (msg) {
        this.log.info(this.toString(), 'incoming msg: ' + msg);
        var value = this.analogPin0.read();
        this.out_out("" + value);
    };
    HeadsTempEdisonComp.prototype.out_out = function (msg) { };
    HeadsTempEdisonComp.prototype.toString = function () {
        return 'HeadsTempEdisonComp';
    };
    return HeadsTempEdisonComp;
})(KevoreeEntities.AbstractComponent);
module.exports = HeadsTempEdisonComp;
