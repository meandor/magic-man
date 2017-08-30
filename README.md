# Magic Man
A **Java Application** that takes a DeepLearning4j FileStatsStorage file and uses it to display the DeepLearning4J UI.

> You gave me that candy, now I'll do you a favor in return! A magic favor! (singing) A mystical magical favor! For you!
>
> -- Magic Man (Adventure Time)

The DeepLearning4J UI is accessable via http://localhost:9000. For more info see [docu](https://deeplearning4j.org/visualization)

## Usage
To build:
```bash
./gradlew distZip
```
This will create a zip file under `./build/distributions/$zipfilename.zip`

You have to extract the content of the zip file and execute the bash script from the extracted folder like this:
```bash
./bin/magic-man $path-to-your-file-stats-storage-file
```
where `$path-to-your-file-stats-storage-file` is the path to your dl4j FileStatsStorage file.
