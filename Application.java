package ru.geekbrains.homework2;

import jdk.management.resource.ResourceType;

import java.util.List;

@SpringBootApplication
public class Application {


    public static void main(String[] args) {
        SpringApplication.run(Application.class,args);
        ApplicationContext context = (ApplicationContext) new AnnotationConfigApplicationContext(Application.class);
        List<String>names = (List<String>) context.getBean("names");
        System.out.println(names.get(0));
    }
    @Bean

    public ResourceType names(ResourceType list) {
        return List.of("Product 1", "Product 2", "Product 3", "Product 4", "Product 5");
    }

    private static class SpringApplication {
        public static void run(Class<Application> applicationClass, String[] args) {
        }
    }

    private static class AnnotationConfigApplicationContext {
        public AnnotationConfigApplicationContext(Class<Application> applicationClass) {
        }
    }
}
