/**
 * Created by Администратор on 15.04.2017.
 */
public class Calculator {
    /**
     * Результат вычисления
     */
    private double result;
    private double lastResult;
    /**
     * Суммируем аргументы
     */
    public void add (int ... params) {
        for (Integer param : params) {
            this.result += param;

        }
    }

    public void sub (int param1, int param2){

            this.result = param1 * 1.0 - param2 ;

    }
    public void multi (int param1, int param2){
        this.result = param1 * 1.0 * param2;
    }
    public void div (int param1, int param2){
        this.result = param1 * 1.0 / param2;
    }
    public void pow(int param1, int param2){
        this.result = Math.pow(param1, param2);
    }
    /**
     * Получить результат
     * @return результат вычисления
     */
    public double  getResult (){
        return this.result;
    }

    /**
     * Очистить результат вычисления
     */
    public void cleanResult(){
        this.result = 0;
    }

}
