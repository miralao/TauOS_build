# StellarOS: a 1MB lightweight fork of Android
#### *For kids and for everyone!*

**StellarOS** is a flavor of Android that can run on literally anything, like the Doom of Android flavors. Everything you need to boot it is in a 1-megabyte `.jar` or `.wasm` boot file.

The **StellarBook** is a $20 pocket computer that helps kids save up for what really matters in their lives. It's made up of StellarOS, a mouse and keyboard, and then literally anything with a screen and a motherboard. Old Tamagotchi? Make it a StellarBook!

Setup is easy--as soon as it boots, the computer opens to Home, where **Kya the Friendly Crow-Demon** greets them. She offers to leave if they've got everything mastered already, but if they choose for her to stay, she will excitedly guide the user through setup and owning their very own computer.

Everything is meant **for kids**, geared towards **the things kids want to do**: have fun, and learn! And kids do want to learn, as long as they have fun while they do it.

## Pages
The desktop GUI is divided into four pages: **Home**, **Play**, **Work**, and **My Computer**. Each relies mainly on an intuitive system of icons and graphic elements to communicate what the user is supposed to do there, but also has written labels to clear things up. This will make the OS easily localizable.

### Home page
[/usrs/Rowan/Home/HOME.xml]
```
=> Play
=> Work
=> MyComputer
=> Camera
=> Web
```

### Play page
[/usrs/Rowan/Play/PLAY.xml]
```
=> Arcade
=> Radio
=> Jam Maker
=> Television
=> Movie Maker
=> Sketchbook
=> IRC
```

### Work page
[/usrs/Rowan/Work/WORK.xml]
```
=> Canvas
=> Notepad
=> StarSheets
=> StarSlides
=> Wikipedia
=> World Explorer
```

### My Computer page
[/usrs/Rowan/MyComputer/MYCOMPUTER.xml]
```
=> Settings
=> FileTree
```

## Directory structure
```
/usrs
	/Rowan
        /Home
            ../Play
			../Work
            ../MyComputer
	        HOME.xml
	        Camera.link
	        Web.link
        /Play
	        /Art
	        	Drawing.svg
	        	Drawing2.xcf
	        	Drawing3.webp
        	/CameraRoll
				IMG_0001.heic
        		IMG_0002.heic
        		IMG_0003.heic
			/Media
	        	ATownCalledPanic.mp4
	        	PumpIt.wav
	        	WALL_E.mp4
	        PLAY.xml
			Arcade.link
            Radio.link
            JamMaker.link
            Television.link
            MovieMaker.link
			Sketchbook.link
        /Work
	        /Documents
				WorkPage.svg
	            EnglishEssay.md
	            Presentation.pptx
	        WORK.xml
            Canvas.link
            Notepad.link
            StarSheets.link
            StarSlides.link
            Wikipedia.link
            WorldExplorer.link
        /MyComputer
        	MYCOMPUTER.xml
            Settings.link
            FileTree.link
	    /Trash
	    	TRASH.xml
	    	PumpIt_cover.wav
/apps
	/Arcade
		Arcade.app
		CrossyRoad.link
		Frogger.link
		Minecraft.link
		Roblox.link
		Scratch.link
	/Radio
		MP3Player.app
	/Television
		Microfiche.link
// Microfiche can display PDFs, MP4s, etc
// And will use the Vimeo API and YouTube to access movies
// And DaVinci Resolve to make movies
	/Camera
		Camera.app
// Camera also includes a photo manager and a basic photo editor
	/Notepad
		Notepad.app
	/WorldMap
		WorldMap.app
		Wikipedia.xml
	/FileTree
		FileTree.app
	/MyComputer
		Settings.app
	/Web
		Discord.link
		DuckDuckGo.link
		Firefox.app
		IRC.link
		Vimeo.link
	CrossyRoad.app
	DaVinciResolve.app
	Discord.app
	DuckDuckGo.app
	Frogger.app
	GIMP.app
	IRC.app
	Minecraft.app
	Microfiche.app
	PhotoManager.app
	Roblox.app
	Scratch.app
	Vimeo.app
	VLCPlayer.app
```

## Languages
Available in:
* Afrikaans
* American Sign Language
* Arabic
* Cantonese
* Catalan
* Chamorro
* Dansk
* Deutsch
* English
* Español
* Hand Talk
* Icelandic
* Japanese
* Korean
* Lao
* Mandarin
* Nāuhatl
* Swahili
* Tagalog
* Telugu
* Thai
* Turkish
* Vietnamesee
* Yue
