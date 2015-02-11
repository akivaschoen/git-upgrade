# git-upgrade

I keep a directory of local repositories of utilities, plugins, et. al, which I find useful. It's a pain in the ass to go to each one and check if there have been updates so git-upgrade does it for me.

git-upgrade simply bounces from directory to directory, executing a `git pull` in each one and leaves a log file in its wake.

## Installation

To install git-upgrade, simply clone this repo.

## Usage

Right now, everything is hardcoded because, hey, I just wrote this thing a few hours ago. Just update core.clj and recompile.

Either use good ol' `lein run` or go large with:

    $ java -jar git-upgrade-0.5.0-standalone.jar [args]

## Options

It doesn't support any options yet although I plan on adding arguments to control whether it creates a logfile and/or overwrites it, specify a target directory, whether to not display anything to the screen, and so forth.

I'll probably throw in a config file, too. Why not.


## License

Copyright © 2015 Akiva Schoen, Esq.

Distributed under the Eclipse Public License either version 1.0 or your option) any later version.
