# Задача №3 (необязательная) - "Кредитный Калькулятор"

**Легенда**

Вам поручили написать кредитный калькулятор, который "считает как на сайте". Но формулы, естественно, не дали.

Вам нужно провести небольшой анализ и написать свой `CreditPaymentService`, который умеет рассчитывать ежемесячный платёж.

Параметры, их количество, типы, а также формулу вам необходимо определить исходя из скриншотов ниже.

Обратите внимание: на тех же данных ваш сервис должен считать так же*.

Примечание*: это очень важный момент - если Заказчик вам даёт примеры, то обязательно следите за тем, что эти примеры в вашем приложении (а позже и в тестах/авто-тестах) проверяются и работают правильно! Если вы этого не сделаете, получите от Заказчика негатив в стиле "я же вам специально примеры предоставил, вы почему не могли на них проверить?!" и общую характеристику непрофессионала.

Чтобы это продемонстрировать, в `Main` создайте объект и 3 раз вызовите его метод `calculate`. Результаты каждого вызова выводите в консоль.

Скриншоты для решения задачи (важно - это не реальный сервис!):

![](https://github.com/netology-code/javaqa-homeworks/raw/master/methods/pic/one-year.png)

![](https://github.com/netology-code/javaqa-homeworks/raw/master/methods/pic/two-years.png)

![](https://github.com/netology-code/javaqa-homeworks/raw/master/methods/pic/three-years.png)


<details>
  <summary>Подсказка</summary>
  
  Подсказки смотреть не хорошо 😈!
  
  Но раз уж вы посмотрели, то вот она подсказка: есть аннуитетные и дифференцированные платежи. Наверное, стоит посмотреть, по каким формулам они считаются.
</details>


## Готово: ##  
**Кредит на 1 год**  
![Кредит на 1 год](https://downloader.disk.yandex.ru/preview/c24d076413ff8b3c25c1c7808ebbd52edfc31350dd5f1e1da28ffd94fa57081a/5f133aae/KX7Vw8nF7e7UoYFumswvOs2WWbPd_-z1j_RfxwuKIgTZusV9o6OKC7M3rh_-JjX-f-MlhLjfC4GUbr6-N3XhsA==?uid=0&filename=2020-07-18+17-07-20+%D0%A1%D0%BA%D1%80%D0%B8%D0%BD%D1%88%D0%BE%D1%82+%D1%8D%D0%BA%D1%80%D0%B0%D0%BD%D0%B0.png&disposition=inline&hash=&limit=0&content_type=image%2Fpng&tknv=v2&owner_uid=98964145&size=2048x2048 "Кредит на 1 год")

**Кредит на  2 года**  
![Кредит на  2 года](https://downloader.disk.yandex.ru/preview/16783a508ecc8745488039447724aa576c27cf84f331243a65e45f84ddaf474d/5f133b21/xrBYvZm2iraBeWzmk9dXn9Eeu-xdJROEymR-CSIAjAgA8dVoR1xceoXVSOfuutwijIfjuC3iFsJwRTQ91XPR8Q==?uid=0&filename=2020-07-18+17-09-49+%D0%A1%D0%BA%D1%80%D0%B8%D0%BD%D1%88%D0%BE%D1%82+%D1%8D%D0%BA%D1%80%D0%B0%D0%BD%D0%B0.png&disposition=inline&hash=&limit=0&content_type=image%2Fpng&tknv=v2&owner_uid=98964145&size=2048x2048 "Кредит на  2 года")

**Кредит на  3 года**  
![Кредит на  3 года](https://downloader.disk.yandex.ru/preview/92c5c037c7f8384098a6c1e43a293ca5008ab6b140fc925f773699ba1a83671e/5f133ba2/ovVbeZ7DMKGmAEpYHs45uAUUfsFdp1X8eLQ511mK4tCOv-WIZV-qSzgZiqXZPcJes57uGDWAJlJJkRXgvDHLGg==?uid=0&filename=2020-07-18+17-12-11+%D0%A1%D0%BA%D1%80%D0%B8%D0%BD%D1%88%D0%BE%D1%82+%D1%8D%D0%BA%D1%80%D0%B0%D0%BD%D0%B0.png&disposition=inline&hash=&limit=0&content_type=image%2Fpng&tknv=v2&owner_uid=98964145&size=2048x2048 "Кредит на  3 года")
