[![CircleCI](https://circleci.com/gh/m-namiki/springmvc4-tutorial/tree/master.svg?style=svg)](https://circleci.com/gh/m-namiki/springmvc4-tutorial/tree/master)

# springmvc4-tutorial

Spring Boot及びSpring Web MVCを利用したWebアプリケーションのサンプル実装です。

## dependencies

* spring-boot-starter-tomcat
	* deploy可能なwarファイルを作成するためのライブラリです
	* https://docs.spring.io/spring-boot/docs/current/reference/htmlsingle/#howto-create-a-deployable-war-file
* spring-boot-devtools
	* Spring Bootの開発補助ツール。 ホットデプロイなどを機能を提供します
	* https://docs.spring.io/spring-boot/docs/current/reference/html/using-boot-devtools.html
* spring-boot-starter-test
	* Spring Boot向けのテストライブラリやその他有用なライブラリが含まれます
	* https://docs.spring.io/spring-boot/docs/current/reference/html/boot-features-testing.html
	
## Circle CI

Circle CIの設定ファイルは `.circleci/config.yml`です。  build.gradle及びconfig.ymlで、`gradle test`時に`circleci/resources/application.properties`を読み込むようにしています。