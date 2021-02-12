This repository reproduces a bug with the new Kotlin JVM IR backend and Kotlin 1.4.30.

Run:
```
./gradlew :lib:assembleDebug -PuseIR=false
```

The build will be successful.

Run:
```
./gradlew :lib:assembleDebug -PuseIR=true
```

The build will fail.