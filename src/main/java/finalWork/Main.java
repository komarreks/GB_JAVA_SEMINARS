package finalWork;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        int countNotebooks = 50;

        HashSet<Notebook> bookSet = createNotebooksSet(countNotebooks);

        TreeMap<Integer, Integer> filterMap = new TreeMap<>();

        Scanner scanner = new Scanner(System.in);

        boolean finderWork = true;

        HashSet<Notebook> finderedNotebooks = new HashSet<>(bookSet);

        System.out.println(filterMessage());

        HashMap<Integer, String> filterPoints = filterPoints();

        while (finderWork){
            int filterPoint = scanner.nextInt();

            if (filterPoint == 1 || filterPoint == 2 || filterPoint == 3){
                enterFilter(filterPoints().get(filterPoint), filterPoint, filterMap);
            }else if (filterPoint == 4){
                finderWork = false;
            }else {
                System.out.println("Вы указали несуществующий фильтр");
            }
        }

        actualFilterMessage(filterMap, filterPoints);

        for (Integer filter : filterMap.keySet()){
            int value = filterMap.get(filter);
            if (filter == 1){
                finderedNotebooks = (HashSet<Notebook>) finderedNotebooks.stream().
                        filter(x -> x.getRam()>value).collect(Collectors.toSet());
            }
            if (filter == 2){
                finderedNotebooks = (HashSet<Notebook>) finderedNotebooks.stream().
                        filter(x -> x.getHdd()>value).collect(Collectors.toSet());
            }
            if (filter == 3){
                finderedNotebooks = (HashSet<Notebook>) finderedNotebooks.stream().
                        filter(x -> x.getCpuRating()>value).collect(Collectors.toSet());
            }
        }

        finderedNotebooks.forEach(notebook -> {
            System.out.println(notebook.toString());});
    }

    private static HashMap<Integer, String> filterPoints(){
        HashMap<Integer, String> points = new HashMap<>();
        points.put(1, "Минимум RAM: ");
        points.put(2, "Минимум HDD: ");
        points.put(3, "Минимум частота: ");

        return points;
    }
    private static void actualFilterMessage(TreeMap<Integer,Integer> filterMap, HashMap<Integer,String> filterPoints){
        StringBuilder sb = new StringBuilder();
        sb.append("Найдено по указанным фильтрам:\n");
        for(Integer filter : filterMap.keySet()){
            sb.append(filterPoints.get(filter));
            sb.append(filterMap.get(filter));
            sb.append("; ");
        }

        sb.append("\n==============================================\n");

        System.out.println(sb.toString());
    }
    private static void enterFilter(String message, Integer filterKey, TreeMap<Integer,Integer> filterMap){
        System.out.print(message);
        Integer minimalValue = new Scanner(System.in).nextInt();
        filterMap.put(filterKey, minimalValue);
        System.out.println("Далее...");
    }
    private static String filterMessage(){
        StringBuilder sb = new StringBuilder();
        sb.append("Введите пункт фильтра и минимальное значение:\n");
        sb.append("1 - Размер оперативной памяти в GB\n");
        sb.append("2 - Размер HDD в GB\n");
        sb.append("3 - Частота процессора в Mhz\n");
        sb.append("4 - запуск и вывод выбранных моделей");
        return sb.toString();
    }
    private static HashSet<Notebook> createNotebooksSet(int countNotebooks){
        HashSet<Notebook> set = new HashSet<>();

        Random random = new Random();

        String[] models = getModelArr();
        Integer[] rams = getRamArr();
        Integer[] hdds = getHddArr();
        String[] cpus = getCpuArr();
        Integer[] cpuRatings = getCpuPatingArr();
        String[] oss = getOsArr();
        String[] colors = getColorsArr();

        for (int i = 0; i<=countNotebooks; i++){
            String model = models[random.nextInt(0, models.length)];
            int ram = rams[random.nextInt(0, rams.length)];
            int hdd = hdds[random.nextInt(0, hdds.length)];
            String cpu = cpus[random.nextInt(0, cpus.length)];
            int cpuRating = cpuRatings[random.nextInt(0, cpuRatings.length)];
            String os = oss[random.nextInt(0, oss.length)];
            String color = colors[random.nextInt(0, colors.length)];

            Notebook notebook = new Notebook(model,ram,hdd,cpu,cpuRating,os,color);

            set.add(notebook);
        }

        return set;
    }
    private static String[] getModelArr(){
        List<String> list = new ArrayList<>();
        list.add("Lenovo");
        list.add("Xiaomi");
        list.add("HP");
        list.add("Аквариус");
        list.add("Gigabyte");
        list.add("Байкал");
        list.add("Huawei");

        return list.toArray(new String[0]);
    }
    private static Integer[] getRamArr(){
        List<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(4);
        list.add(8);
        list.add(16);
        list.add(32);
        list.add(64);

        return list.toArray(new Integer[0]);
    }
    private static Integer[] getHddArr(){
        List<Integer> list = new ArrayList<>();
        list.add(256);
        list.add(512);
        list.add(1024);
        list.add(2048);
        list.add(4196);

        return list.toArray(new Integer[0]);
    }
    private static String[] getCpuArr(){
        List<String> list = new ArrayList<>();
        list.add("INTEL Xeon");
        list.add("INTEL i5");
        list.add("INTEL i7");
        list.add("INTEL i9");
        list.add("AMD FX");
        list.add("AMD Phenom");
        list.add("AMD Ryzen 3");
        list.add("AMD Ryzen 5");
        list.add("AMD Ryzen 7");
        list.add("AMD Ryzen 9");

        return list.toArray(new String[0]);
    }
    private static Integer[] getCpuPatingArr(){
        List<Integer> list = new ArrayList<>();
        list.add(1800);
        list.add(2200);
        list.add(2800);
        list.add(3200);
        list.add(3600);
        list.add(4200);

        return list.toArray(new Integer[0]);
    }
    private static String[] getOsArr(){
        List<String> list = new ArrayList<>();
        list.add("Windows");
        list.add("Linux");
        list.add("NO OS");

        return list.toArray(new String[0]);
    }
    private static String[] getColorsArr(){
        List<String> list = new ArrayList<>();
        list.add("White");
        list.add("Black");
        list.add("Blue");
        list.add("Red");
        list.add("Green");
        list.add("Silver");

        return list.toArray(new String[0]);
    }
}
