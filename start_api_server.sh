echo "start api server"

cd ./server/

./gradlew clean build

java -jar build/libs/server-0.0.1-SNAPSHOT.jar 

