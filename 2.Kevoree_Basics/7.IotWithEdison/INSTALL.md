## Installation of the board ##

Before doing anything on your board, you need to install it. They are plenty of really good tutorials to install your board on the web.
I'm going to show you how you can do that, but keep in mind the facts that you can find better tutorials on that.

In this tutorial, we will focus on the [Intel Edison Expansion Board](https://software.intel.com/en-us/iot/hardware/edison).
![Intel Edison Expansion Board](http://www.intel.com/content/dam/www/public/us/en/images/product/RWD/edison-board-transparent-16x9.png/_jcr_content/renditions/intel.web.720.405.png)

### Hardware###

Unpack your board and mount it.
Make sure the trigger next to the USB ports is on the position toward the USB ports.
Then, you can plug two USB cables on the ports, and connect them to your computer.

You should see a green LED turned on. Wait a few seconds.

### Software###

Open a Terminal.

Then, if not installed, install the package  **screen** :

```sh
    sudo apt-get update
    sudo apt-get install screen
```

When installed, you'll have to run the following command to connect to the board :

```sh
    sudo screen /dev/ttyUSB0 115200
```

If promped, enter your password.

By default, the login is **root**, without password.

You should now be correctly connected !

### Configuration ###

To configure your board as you wish, you can run the following command :

```sh
configure_edison
```

> With this command, you can change the name and the password of the board.
> You can also set up a wifi connection.

You can also configure these things separately, by using these commands :

```sh
    configure_edison --name
    configure_edison --password
    configure_edison --wifi
```

> A wifi connection is necessary to continue

## Node.js and MRAA ##

The first tool you can develop on is Node.js, with the MRAA library.

###  Installation ###

Before installing any package or library, make sure the date on your board is correct !
If not, type the following command.

```sh
    date --set "YYYY-MM-DD hh:mm"
```


Node.js will allow you to create useful programs in Javascript for your board.
To install this package, run these commands :

```txt
    echo "src/gz all http://repo.opkg.net/edison/repo/all" >> /etc/opkg/base-feeds.conf  

    echo "src/gz edison http://repo.opkg.net/edison/repo/edison" >> /etc/opkg/base-feeds.conf  

    echo "src/gz core2-32 http://repo.opkg.net/edison/repo/core2-32" >> /etc/opkg/base-feeds.conf
```

Then, run

```sh
    opkg update
```

   Finally, you can install Node.js :

```sh
    opkg install nodejs
```

You can now work with Node.js on your board !

The MRAA library will allow you to interact with the IO of your board. To get more informations, visit [this page](http://iotdk.intel.com/docs/master/mraa/).

To install this package, nothing more simple, run :

```sh
    npm install -g mraa
```
