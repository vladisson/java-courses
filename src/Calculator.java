/**
 * Created by Администратор on 15.04.2017.
 */
public class Calculator {
    /**
     * Результат вычисления
     */
    private int result;

    /**
     * Суммируем аргументы
     */
    public void add (int ... params) {
        for (Integer param : params) {
            this.result += param;

        }
    }
    /**
     * Получить результат
     * @return результат вычисления
     */
    public int  getResult (){
        return this.result;
    }

    /**
     * Очистить результат вычисления
     */
    public void cleanResult(){
        this.result = 0;
    }

}
