## WC Utillity

[Home](../../../../../../Readme.md)

<b>Command</b>:
```
java -cp $JAR_LOC com.coding.wcapp.Main $@
```

<b>Usage</b>:

<i>Java</i>:
```
java -cp $JAR_LOC com.coding.wcapp.Main -c -l -w -m test_file.txt
```
<i>Shell</i>:
```
ccwc.sh -c -l -w -m test_file.txt
```

<b>Result<b>:
```
size(B): 9
lines: 2
words: 2
characters: 7
```

<b>Arguments<b>:

|Argument|Description|
|---|---|
|-c| count bytes|
|-l| count lines|
|-w| count words|
|-m| count characters|