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




#Your own Kevoree component in typescript on top of MRAA

This project provides a simple example of  Kevoree Component written in typescript. This component use  MRAA to get value from Edison.

[Source code for the component](https://github.com/barais/EJCP15/blob/master/7.IotWithEdison/examples/src/headstempcomp/lib/HeadsTempEdisonComp.ts)

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
