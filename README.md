# Проект по автоматизации тестовых сценариев для мобильного приложения <a href="https://www.wikipedia.org/ "> Wiki</a></h1>

<img alt="GIPHY" src="/src/media/imageswik.png">

##  Содержание:

- [Используемый стек](#используемый-стек)
- [Запуск автотестов](#запуск-автотестов)
  - [Сборка в Jenkins](#-сборка-в-jenkins)
- [Пример Allure-отчета](#-пример-allure-отчета)
- [Интеграция с Allure TestOps](#-интеграция-с-allure-testOps)
- [Интеграция с Jira](#-интеграция-с-jira)
- [Уведомления в Telegram](#-уведомления-в-telegram-с-использованием-бота)
- [Видео примера запуска тестов в BrowserStack](#-видео-примера-запуска-тестов-в-selenoid)

##  Используемый стек

<p align="center">
<img width="6%" title="IntelliJ IDEA" src="/src/media/Intelij_IDEA.svg">
<img width="6%" title="Java" src="src/media/Java.svg">
<img width="6%" title="Selenide" src="src/media/Selenide.svg">
<img width="6%" title="Selenoid" src="src/media/Selenoid.svg">
<img width="6%" title="Allure Report" src="src/media/Allure_Report.svg">
<img width="5%" title="Allure TestOps" src="src/media/AllureTestOps.svg">
<img width="6%" title="Gradle" src="src/media/Gradle.svg">
<img width="6%" title="JUnit5" src="src/media/JUnit5.svg">
<img width="6%" title="GitHub" src="src/media/GitHub.svg">
<img width="6%" title="Jenkins" src="src/media/Jenkins.svg">
<img width="6%" title="Telegram" src="src/media/Telegram.svg">
<img width="5%" title="Jira" src="src/media/Jira.svg">
<img width="5%" title="Browserstack" src="src/media/images.jpeg">
<img width="5%" title="Appium" src="src/media/appium.png">
<img width="5%" title="TestOps" src="src/media/allure_testops.png">
<img width="5%" title="AndroidStudio" src="src/media/Android_Studio_Logo_(2023).png">
</p>

Тесты в данном проекте написаны на языке <code>Java</code> с использованием фреймворка для тестирования [Selenide](https://selenide.org/), сборщик - <code>Gradle</code>. <code>JUnit 5</code> задействован в качестве фреймворка модульного тестирования.
При прогоне тестов для запуска браузеров используется [Selenoid](https://aerokube.com/selenoid/).

Для локального тестирования приложения на мобильных устройствах используется Android Studio и Appium. Для удаленного тестирования в различных платформах Browserstack.

Для удаленного запуска реализована джоба в <code>Jenkins</code> с формированием Allure-отчета и отправкой результатов в <code>Telegram</code> при помощи бота. Так же реализована интеграция с <code>Allure TestOps</code> и <code>Jira</code>.

Содержание Allure-отчета:
* Шаги теста;
* Скриншот страницы на последнем шаге;
* Page Source;
* Логи браузерной консоли;
* Видео выполнения автотеста.
## Запуск автотестов

## Локальный запуск 

Возможен локальный запуск тестов с помощью команд:

./gradlew clean Test -DdeviceHost=real

./gradlew clean Test -DdeviceHost=emulation

./gradlew clean Test -DdeviceHost=browserstack

## <img width="4%" style="vertical-align:middle" title="Jenkins" src="src/media/Jenkins.svg"> Сборка в Jenkins

Для запуска сборки необходимо нажать кнопку <code>Build Now</code>.
<p align="center">
<img title="Jenkins Build" src="src/media/jenkinsbuildnow.png">
</p>
После выполнения сборки, в блоке <code>История сборок</code> напротив номера сборки появятся значки <code>Allure Report</code> и <code>Allure TestOps</code>, при клике на которые откроется страница с сформированным html-отчетом и тестовой документацией соответственно.

## <img width="4%" style="vertical-align:middle" title="Allure Report" src="src/media/Allure_Report.svg"> Пример Allure-отчета
### Overview

<p align="center">
<img title="Allure Overview" src="src/media/alreportscreen.png">
</p>

## <img width="4%" style="vertical-align:middle" title="Allure TestOps" src="src/media/AllureTestOps.svg"> Интеграция с Allure TestOps

На *Dashboard* в <code>Allure TestOps</code> видна статистика количества тестов: сколько из них добавлены и проходятся вручную, сколько автоматизированы. Новые тесты, а так же результаты прогона приходят по интеграции при каждом запуске сборки.

<p align="center">
<img title="Allure TestOps DashBoard" src="src/media/testops.png">
</p>

### Результат выполнения автотеста

<p align="center">
<img title="Test Results in Alure TestOps" src="src/media/res1.png">
<img title="Test Results in Alure TestOps" src="src/media/res2.png">
</p>

## <img width="4%" style="vertical-align:middle" title="Jira" src="media/Jira.svg"> Интеграция с Jira

Реализована интеграция <code>Allure TestOps</code> с <code>Jira</code>, в тикете отображается, какие тест-кейсы были написаны в рамках задачи и результат их прогона.

<p align="center">
<img title="Test Results in Jira" src="src/media/jrares.png">
</p>

### <img width="4%" style="vertical-align:middle" title="Telegram" src="media/Telegram.svg"> Уведомления в Telegram с использованием бота

После завершения сборки специальный бот, созданный в <code>Telegram</code>, автоматически обрабатывает и отправляет сообщение с отчетом о прогоне тестов.

<p align="center">
<img width="70%" title="Telegram Notifications" src="src/media/telegramres.png">
</p>

## <img alt="Browserstack" height="25" src="src/media/images.jpeg" width="25"/></a> Видеопример выполнения теста Browserstack
<p align="center">
<img title="Browserstack Video" src="media/screenshots/browserstack.gif" width="350" height="350"  alt="video">   
</p>