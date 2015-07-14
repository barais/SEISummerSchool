Internet of Things with Intel Edison
=======

Intel Edison is a tiny computer, developed by Intel. This computer can be connected in wifi, so it's a great tool to work on the **Internet of Things** (or IoT).

![Intel Edison](http://www.seeedstudio.com/depot/images/102990161%201.jpg)

> This tutorial is written using Linux x64


##  Node-RED##
###  Installation###

IBM's Node-RED visual coding tools are simplifying the job of wiring up today's world of computers, sensors and online services.

Hacking the world around you to bend it to your will is getting easier and easier.

Whether it's setting up a lamp to flash when someone retweets you or a system to text you when the washing's done, work is taking place to make it simpler for machine to speak unto machine. Hooking up the wealth of computers, sensors and online services in the modern world can lead to weird and wonderful creations

[More information](http://www.techrepublic.com/article/node-red/)

NodeRed allows you to create some applications related to the web. With this, your board can do some researches on different websites, send some emails, SMS or even tweets. You can literally do everything with this library, in particularly by creating your own components.
More informations [here](http://nodered.org/).

To install Node-RED, run ;

  ```sh
    npm install -g node-red
    node-red
```

Then type :

```
    ifconfig
```

And get the IP adress of your board. You can now use node-RED in your navigator by typing this adress in the search bar, with the 1880 port. (ex : 192.168.1.147:1880 for me)

##  First flow ##
To create your first flow, 


###1. Add an Inject node

The Inject node allows you to inject messages into a flow, either by clicking the button on the node, or setting a time interval between injects.

Drag one onto the workspace from the palette.

Open the sidebar (Ctrl-Space, or via the dropdown menu) and select the Info tab.

Select the newly added Inject node to see information about its properties and a description of what it does.

###2. Add a Debug node

The Debug node causes any message to be displayed in the Debug sidebar. By default, it just displays the payload of the message, but it is possible to display the entire message object.

###3. Wire the two together

Connect the Inject and Debug nodes together by dragging between the output port of one to the input port of the other.

###4. Deploy

At this point, the nodes only exist in the editor and must be deployed to the server.

Click the Deploy button. Simple as that.

With the Debug sidebar tab selected, click the Inject button. You should see numbers appear in the sidebar. By default, the Inject node uses the number of milliseconds since January 1st, 1970 as its payload. Let’s do something more useful with that.

###5. Add a Function node

The Function node allows you to pass each message though a JavaScript function.

Wire the Function node inbetween the Inject and Debug nodes. You’ll need to delete the existing wire (select it and hit delete on the keyboard).

Double-click on the Function node to bring up the edit dialog. Copy the follow code into the function field:

```js
// Create a Date object from the payload
var date = new Date(msg.payload);
// Change the payload to be a formatted Date string
msg.payload = date.toString();
// Return the message so it can be sent on
return msg;
```


Click Ok to close the edit dialog and then click the deploy button.

Now when you click the Inject button, the messages in the sidebar will be more readable time stamps.

### Source

The flow created in this example is represented by the following json. It can be imported straight into the editor by pasting the json into the Import dialog (Ctrl-I or via the dropdown menu).

```json
[{"id":"58ffae9d.a7005","type":"debug","name":"","active":true,"complete":false,"x":640,"y":200,"wires":[]},{"id":"17626462.e89d9c","type":"inject","name":"","topic":"","payload":"","repeat":"","once":false,"x":240,"y":200,"wires":[["2921667d.d6de9a"]]},{"id":"2921667d.d6de9a","type":"function","name":"Format timestamp","func":"// Create a Date object from the payload\nvar date = new Date(msg.payload);\n// Change the payload to be a formatted Date string\nmsg.payload = date.toString();\n// Return the message so it can be sent on\nreturn msg;","outputs":1,"x":440,"y":200,"wires":[["58ffae9d.a7005"]]}]
```

##Creating your second flow

This example is slightly more complex and starts to bring in data from external sources to do something useful locally.

It will go out to an external web site, grab some information, read and convert that into a useful form output that in two formats, one as a JSON object for further use, and one as a boolean to switch things on and off

###1. Add an Inject node

In the previous example, the Inject node was used to trigger the flow when its button was clicked. For this example, the Inject node will be configured to trigger the flow at a regular interval.

Drag an Inject node onto the workspace from the palette.

Double click the node to bring up the edit dialog. Set the repeat interval to every 5 minutes on every day.

Click Ok to close the dialog.

###2. Add an HttpRequest node

The HttpRequest node can be used to retrieve a web-page when triggered.

After adding one to the workspace, edit it to set the URL property to:

http://realtimeweb-prod.nationalgrid.com/SystemData.aspx

You can optionally add a friendly name.

###3. Add a function node

Add a Function node with the following code:

```js
// does a simple text extract parse of the http output to provide an
// object containing the uk power demand, frequency and time

if (~msg.payload.indexOf('<span')) {
    var dem = msg.payload.split('Demand:')[1].split("MW")[0];
    var fre = msg.payload.split('Frequency:')[1].split("Hz")[0];

    msg.payload = {};
    msg.payload.demand = parseInt(dem.split(">")[1].split("<")[0]);
    msg.payload.frequency = parseFloat(fre.split(">")[1].split("<")[0]);

    msg2 = {};
    msg2.payload = (msg.payload.frequency >= 50) ? true : false;

    return [msg,msg2];
}
return null;
```

Set the number of outputs for the function node to 2.

### 4. Add a Debug node

Add two Debug nodes.

### 5. Wire them all together

Wire the Inject node output to the HttpRequest node input.
Wire the HttpRequest node output to the Function node input.
Wire each of the Function node outputs to a different Debug node input.
6. Deploy

At this point, the nodes only exist in the editor and must be deployed to the server.

Click the Deploy button.

With the Debug sidebar tab selected (Ctrl-Space, or via the dropdown menu, then click the Debug tab), click the Inject button. You should see an entry with some contents that looks like:

```json
(Object) { "demand": 34819, "frequency": 50.04 }
```
and another with something like:

```json
(boolean) true
```

### 7. Summary

You now have a flow that goes to the Internet - gets the live UK total electricity consumption - and converts it into a JavaScript object with demand in MW, and frequency in Hertz.

The object is emitted out of the first output of the Function node.

The frequency is an indication of overall stress - so when the frequency is under 50 HZ there may be excess load on the overall National Grid. This is indicated in the message emitted out of the second output of the Function node; if the payload is true, there is capacity in the grid.

### Source

The flow created in this example is represented by the following json. It can be imported straight into the editor by pasting the json into the Import dialog (Ctrl-I or via the dropdown menu).

```json
[{"id":"11b032a3.ee4fcd","type":"inject","name":"Tick","topic":"","payload":"","repeat":"","crontab":"*/5 * * * *","once":false,"x":161,"y":828,"z":"6480e14.f9b7f2","wires":[["a2b3542e.5d4ca8"]]},{"id":"a2b3542e.5d4ca8","type":"http request","name":"UK Power","method":"GET","url":"http://realtimeweb-prod.nationalgrid.com/SystemData.aspx","x":301,"y":828,"z":"6480e14.f9b7f2","wires":[["2631e2da.d9ce1e"]]},{"id":"2631e2da.d9ce1e","type":"function","name":"UK Power Demand","func":"// does a simple text extract parse of the http output to provide an\n// object containing the uk power demand, frequency and time\n\nif (~msg.payload.indexOf('<span')) {\n    var dem = msg.payload.split('Demand:')[1].split(\"MW\")[0];\n    var fre = msg.payload.split('Frequency:')[1].split(\"Hz\")[0];\n\n    msg.payload = {};\n    msg.payload.demand = parseInt(dem.split(\">\")[1].split(\"<\")[0]);\n    msg.payload.frequency = parseFloat(fre.split(\">\")[1].split(\"<\")[0]);\n    \n    msg2 = {};\n    msg2.payload = (msg.payload.frequency >= 50) ? true : false;\n\n    return [msg,msg2];\n}\n\nreturn null;","outputs":"2","valid":true,"x":478,"y":828,"z":"6480e14.f9b7f2","wires":[["8e56f4d3.71a908"],["cd84371b.327bc8"]]},{"id":"8e56f4d3.71a908","type":"debug","name":"","active":true,"complete":false,"x":678,"y":798,"z":"6480e14.f9b7f2","wires":[]},{"id":"cd84371b.327bc8","type":"debug","name":"","active":true,"complete":false,"x":679,"y":869,"z":"6480e14.f9b7f2","wires":[]}]
```

### Read an analog input###

We've seen how to read an analog value with the MRAA library. This is useful, but not as much as Node-RED !
With Node-RED, we can also read any analog sensor value, but we can use these values to create web applications !

> I'm now following another tutorial, you can find it [here](http://www.rs-online.com/designspark/electronics/eng/blog/wiring-the-internet-of-things-with-intel-edison-and-node-red).

First, I encourage you to learn how to use Node-RED, this shouldn't be very complicated.
You can use [this tutorial.](http://nodered.org/docs/getting-started/first-flow.html) It will show you how to create your firsts applications (or "flows") with Node-RED.

Once you've done that, we can start talking seriously ! ;-)

To read analog values with Node-RED, you need to download a now node.

Download these [two files.](https://github.com/abopen/node-red/tree/master/nodes)

Place them in the following directory : ***/usr/lib/node_modules_node-red/nodes***

Start (or restart) Node-RED.
You should now see a new node on the sidebar, named **"mraaAnalogRead"**. This node will allow you to read any analog value of any analog sensor plugged on your board.

#Using MQTT broker. 

Try to send this data to your broker using Node-Red, 

Create two flows, the first one will serve to send data to MQTT broker. The second one will be used to receive message and send an email. 

#Using azure service bus

* [Documentation to configure azure](https://azure.microsoft.com/fr-fr/documentation/articles/service-bus-nodejs-how-to-use-topics-subscriptions/)
* [Documentation to configure azure](https://azure.microsoft.com/fr-fr/documentation/articles/service-bus-nodejs-how-to-use-queues/)
* [Node-Red with Azure](https://github.com/ppatierno/azure-nodes)

