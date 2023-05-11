public class Application {

  public static void main(String[] args) {
    // Git - отдельная программа реализующая функции системы контроля версий
    // назначением которой является хранение истории изменений произведённых в
    // рамках репозитория. В истории хранится информация об авторе изменений, о
    // дате и времени и самих изменениях.

    // Репозиторий - каталог относительно которого будут отслеживаться
    // изменения.

    // Git репозиторий может хранить несколько параллельно существующих веток,
    // в каждой ветке состояние проекта может отличаться от остальных веток, но
    // при этом всегда должна быть основная от которой будут идти остальные.

    // `git init` - инициализирует новый репозиторий в том каталоге из
    // которого команда выполняется.

    // `git status` - выводит информацию о состоянии репозитория на момент
    // выполнения команды.

    // `git add <files>` - добавляет файл для дальнейшей фиксации в истории
    // изменений. Файл добавляется в том состоянии в котором он был на момент
    // написания команды.

    // `git config user.name` - имя пользователя от которого будут вноситься
    // изменения в репозиторий.

    // `git config user.email` - email пользователя от которого будут вноситься
    // изменения в репозиторий.

    // `git commit -m <message>` - производит фиксацию изменений в истории по
    // файлам добавленным ранее через git add где в качестве message
    // указывается краткое описание вносимых изменений.

    // В репозитории должны находится только те ресурсы которые имеют прямое
    // отношение к проекту без привязки к локальному окружения разработчика. К
    // ресурсам которые не должны включаться в репозиторий относятся файлы и
    // папки локальной конфигурации IDEA такие, как *.iml и .idea/, помимо
    // локальных конфигураций не имеет смысла хранить в репозитории папки с
    // приложением в собранном виде (out, build, target и так далее).

    // Из репозитория можно исключить лишние ресурсы путем добавления их в
    // специальный файл под названием `.gitignore`.
    // `.gitignore` - файл хранящий ресурсы нахождение которых в репозитории
    // считается не допустимым.

    // Ветка - отдельное пространство в котором проект хранится в определенном
    // состоянии.

    // `git branch -v` - выводи информацию о всех ветках репозитория и о
    // текущей ветке в контексте которой производится работа.

    // `git branch <name>` - создаёт новую ветку с заданным именем основываясь
    // на текущей ветке.

    // `git checkout <name>` - производит переключение репозитория на ветку
    // название которой указано в команде.

    // При работе с несколькими ветками могут возникать ситуации называемые
    // конфликтами, это ситуации когда в двух разных ветках изменяется один и
    // тот же файл, данная ситуация приведет к конфликту только в том случае
    // если необходимо будет слить изменения одной ветки в другую.

    // `git merge <name>` - производит слияние ветки имя которой указана при
    // вызове команды в текущую ветку.

    // `git merge iss52` - при условии что текущая ветка main команда
    // отработает следующим образом, изменения ветки iss52 будут перенесены в
    // ветку main.

    System.out.println("Java Application");
  }
}


















