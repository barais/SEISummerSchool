Internet of Things with Intel Edison
=======

Intel Edison is a tiny computer, developed by Intel. This computer can be connected in wifi, so it's a great tool to work on the **Internet of Things** (or IoT).

![Intel Edison](http://www.seeedstudio.com/depot/images/102990161%201.jpg)


:warning:
If you get a new one, you can install your board easily following [this tutorial](INSTALL.md).

#First program in JS

###  Read an analog input ###

We're now going to see how to read an analog input of any sensor connected on the board.

First, plug your component (any sensor, really, that's not important, personally, I'm using a Rotary Angle Sensor,  [this one](https://software.intel.com/en-us/iot/hardware/sensors/grove-rotary-angle-sensor)).

Then, create a new file in the file root (**/home/root**). This will be the script.
Name it **analog.js** (This is just an example, the name isn't important at all, it just has to be a .js file).

Open it with your text editor. Now you can start programming on your board ! Exciting huh ?

So with the following script, you can display the values of the analog sensor plugged on the A0 input :

```js
    var m = require('mraa'); //require mraa
	console.log('MRAA Version: ' + m.getVersion()); //write the mraa version to the console

	var analogPin0 = new m.Aio(0); //setup access analog inpuput pin 0
	var analogValue = analogPin0.read(); //read the value of the analog pin
	var analogValueFloat = analogPin0.readFloat(); //read the pin value as a float
		console.log(analogValue); //write the value of the analog pin to the console
		console.log(analogValueFloat.toFixed(5)); //write the value in the float format
```

You can get the entire script [here](https://github.com/intel-iot-devkit/mraa/tree/master/examples/javascript), with some others too. Don't hesitate to check them.



Then, save the file and execute it via the Linux terminal :

```sh
    node analog.js
```

This will display the current value of the sensor !

> You can stop any node process by typing ctrl-c


#Publishing your data on a MQTT broker

[source](http://www.philchen.com/2015/05/04/how-to-setup-a-mosca-node-js-mqtt-broker-service-on-ubuntu-14-04)


##Install the MQTT broker

This article will cover installing Mosca Node.js MQTT standalone broker service along side Redis on Ubuntu 14.04. MQTT is a light weight publish-subscription messaging protocol for use on top of the TCP/IP. MQTT is designed for connections with remote locations where network bandwidth is limited. The Pub/Sub messaging pattern requires a message broker which is what is covered in this article. The broker distributes messages to clients subscribers based on the topic of a message.

###Step 0
Time Matters!

```sh
sudo apt-get update 
sudo ntpdate pool.ntp.org 
sudo apt-get install ntp
```

###Step 1

Install Redis

 
```sh
sudo apt-get install build-essential
 
sudo apt-get install tcl8.5
 
wget http://download.redis.io/releases/redis-3.0.0.tar.gz
 
gunzip -c redis-3.0.0.tar.gz | tar -xvf -
 
cd redis-3.0.0/
 
sudo make
 
sudo make install
```

###Step 2
Start the Redis Server

 
```sh
cd utils/
sudo ./install_server.sh
```

###Step 3
Install Mosca, and some helpful node packages

 
```sh
#If node is not installed
sudo apt-get update
sudo apt-get install nodejs
sudo ln -s /usr/bin/nodejs /usr/bin/node 
sudo apt-get install npm
 
sudo npm install debug
 
sudo npm install mosca bunyan -g
 
sudo npm install daemon
```

###Step 4
Create your Mosca Node.js MQTT Broker Service mosca-app.js

```js
console.log(process.pid);
require('daemon')();
var mosca = require('mosca')
 
var backjack = {
  type: 'redis',
  db: 12,
  port: 6379,
  return_buffers: true,
  host: "localhost"
};
 
var moscaSettings = {
  port: 1883,
  backend: backjack,
  persistence: {
    factory: mosca.persistence.Redis
  }
};
 
var server = new mosca.Server(moscaSettings);
server.on('ready', setup);
 
server.on('clientConnected', function(client) {
    console.log('client connected', client.id);     
});
 
server.on('published', function(packet, client) {
  console.log('Published', packet.payload);
});
 
function setup() {
  console.log('Mosca server is up and running')
}
console.log(process.pid);
```

###Step 5
Start the Mosca Node.js MQTT Broker Service

```sh
node mosca-app.js
```

###Step 6
Install MQTT Client For Testing

```sh
sudo npm install mqtt -g
```

###Step 7
Write a MQTT Publishing Client client-pub.js

 
```js
var mqtt    = require('mqtt');
var client  = mqtt.connect('mqtt://localhost');
 
client.on('connect', function () {
  client.publish('presence', 'Hello!', {retain: false, qa: 1});
client.end();
});
```

###Step 8
Write a MQTT Subscription Client client-sub.js

 
```js
var mqtt    = require('mqtt');
var client  = mqtt.connect('mqtt://localhost');
 
client.on('connect', function () {
  client.subscribe('presence');
 
client.on('message', function (topic, message) {
  console.log(message.toString());
client.end();
  });
});
```

###Step 9
Open a New Terminal and Execute your MQTT Subscription Client client-sub.js

 
```sh
node client-sub.js
```

###Step 10
Open a New Terminal and Execute your MQTT Publish Client client-pub.js

 
```sh
node client-pub.js
```

Successful Output From client-sub.js terminal

```txt
Hello!
```

##Put your sensor value to your MQTT broker. 
Adapt the previous examples to send data from the edison to your mqtt broker. 


#Using typescript on top of MRAA

This project provides a simple example of  Typescript program  that run on top of MRAA. This component use  MRAA to get value from Edison.

###Install typescript

```sh
npm install -f typescript
```

###Get an example from [here](https://github.com/HEADS-project/mraa)

Test your example

Copy this example and build a simple component that get data from sensors in taking information from MRAA.


#Your own Kevoree component in typescript on top of MRAA

This project provides a simple example of  Kevoree Component written in typescript. This component use  MRAA to get value from Edison.

[Source code for the component](https://github.com/barais/SEISummerSchool/blob/master/7.IotWithEdison/examples/src/headstempcomp/lib/HeadsTempEdisonComp.ts)

To build your project

```sh
npm install
grunt
```

To run your component, copy gen folder to edison using scp.

```sh
cd gen/src/headstempcomp
npm install mraa
npm install
grunt kevoree
```


Copy this example and build a simple component that get data from sensors in taking information from MRAA.
